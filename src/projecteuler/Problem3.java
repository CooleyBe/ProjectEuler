/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;

/**
 * The problem is to find the largest prime factor of 600851475143.
 * @author Ben
 */
public class Problem3 implements Problem{

    
    @Override
    public void runProblem() {
        ArrayList<Long> primeList = new ArrayList<Long>();
        ArrayList<Long> factorList = new ArrayList<Long>();
        long startingValue = 600851475143L;
        long largestPrime = 0L;
        factorList = getFactors(startingValue);
        primeList = getPrimes(factorList);
        largestPrime = primeList.get(primeList.size() - 1);
        System.out.println("Largest prime = "+largestPrime);
    }
    
    private ArrayList<Long> getFactors(long value) {
        ArrayList<Long> factorList = new ArrayList<Long>();
        long remainder = value;
        long factor = 1L;
        do {
            factor++;
            if(remainder%factor == 0) {
                factorList.add(factor);
                remainder /= factor;
                factor = 1L;
            }
        } while (remainder != 1);
        
        return factorList;
    }
    
    private ArrayList<Long> getPrimes(ArrayList<Long> factorList) {
        ArrayList<Long> primeFactors = new ArrayList<Long>();
                
        for(Long factor: factorList) {
            if(isPrime(factor)) {
                primeFactors.add(factor);
            }
        }
        
        return primeFactors;
    }
    
    private boolean isPrime(long value) {
        boolean prime = true;
        for(long i = 2L; i < value; i++) {
            
            // if the value passed in is divisible by other primes, it is not a prime
            if(value%i == 0) {
                prime = false;
                break;
            }
        }
            
        return prime;
    }
}
