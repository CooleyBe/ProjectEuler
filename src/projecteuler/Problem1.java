/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 * The problem is to find the sum of all the multiples of 3 or 5 below 1000.
 * @author Ben
 */
public class Problem1 implements Problem{
    
    @Override
    public void runProblem(){
        int total = 0;
        for(int i = 0; i < 1000; i++) {
            if ((i%3 == 0) || (i%5 == 0)) {
                total += i;
            }
        }
        System.out.println("Total = "+total);
    }
}
