/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 * The problem is to find the difference between the sum of squares of a list of numbers and the square of sums of the same list of numbers
 * @author Ben
 */
public class Problem6 implements Problem{

    @Override
    public void runProblem() {
        long sumOfSquares = 0;
        long squareOfSums = 0;
        long difference = 0;
        long value = 100;
        
        sumOfSquares = getSumOfSquares(value);
        squareOfSums = getSquareOfSums(value);
        difference = squareOfSums - sumOfSquares;
        
        System.out.println("Difference = "+difference);
    }
    
    private long getSumOfSquares(long value) {
        long sum = 0;
        for(int i = 1; i <= value; i++) {
            sum += Math.pow(i, 2);
        }
        
        return sum;
    }

    private long getSquareOfSums(long value) {
        long sum = 0;
        for(int i = 1; i <= value; i++) {
            sum += i;
        }
        sum = (long)Math.pow(sum, 2);
        
        return sum;
    }
}
