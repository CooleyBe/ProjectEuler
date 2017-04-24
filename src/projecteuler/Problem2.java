/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 * The problem is to find the sum of all even-valued terms in the Fibonacci
 * starting with the values 1 and 2.
 *
 * @author Ben
 */
public class Problem2 implements Problem {

    @Override
    public void runProblem() {
        int fib1 = 1;
        int fib2 = 2;
        int fib = 0;
        int total = 2; // we start the total at 2 because the second fib number is 2

        do {
            fib = fib1 + fib2;
            if (fib % 2 == 0) {
                total += fib;
            }
            fib1 = fib2;
            fib2 = fib;
        } while (fib2 < 4000000);
        
        System.out.println("Total = "+total);
    }
}
