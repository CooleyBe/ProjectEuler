/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;

/**
 * The problem is to find the 10001st prime number.
 *
 * @author Ben
 */
public class Problem7 implements Problem {

    private ArrayList<Long> primeList;

    @Override
    public void runProblem() {
        boolean prime = true;
        Long counter = 1L;
        Long endingPoint = 10001L;
        primeList = new ArrayList<Long>();

        do {
            prime = true;
            counter++;
            for (Long primeNum : primeList) {
                if (counter % primeNum == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primeList.add(counter);
            }
        } while (primeList.size() < endingPoint);

        System.out.println("10001st prime = " + primeList.get(primeList.size() - 1));
    }
}
