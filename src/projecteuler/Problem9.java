/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 * The problem is to find the pythagorean triplet that adds up to a total of 1000.
 * @author Ben
 */
public class Problem9 implements Problem {

    @Override
    public void runProblem() {
        
    }
    
    private boolean isSquare(double checkValue) {
        boolean squareFlag = true;
        double sqrtValue = Math.sqrt(checkValue);
        if (Math.round(sqrtValue) != sqrtValue) {
            squareFlag = false;
        }
        
        return squareFlag;
    }
}
