/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The problem is to find the smallest positive number that is evenly divisible
 * by all of the numbers from 1 to 20
 *
 * @author Ben
 */
public class Problem5 implements Problem {

    @Override
    public void runProblem() {
        int maxValue = 20;
        long totalValue = 1L;
        ArrayList<Long> totalFactors = new ArrayList<Long>();
        ArrayList<Long> factorList = null;

        for (int i = maxValue; i > 0; i--) {

            // determine factors of all numbers
            factorList = getFactors(new Long(i));

            // remove duplicate factors
            totalFactors = mergeLists(factorList, totalFactors);
        }

        // multiply remaining factors
        for (Long factor : totalFactors) {
            totalValue *= factor.longValue();
        }

        // display value
        System.out.println("Value = " + totalValue);
    }

    private ArrayList<Long> getFactors(Long value) {
        ArrayList<Long> factorList = new ArrayList<Long>();
        long remainder = value;
        long factor = 1L;
        do {
            factor++;
            if (remainder % factor == 0) {
                factorList.add(factor);
                remainder /= factor;
                factor = 1L;
            }
        } while (remainder != 1);

        return factorList;
    }

    private ArrayList<Long> mergeLists(ArrayList<Long> insertList, ArrayList<Long> totalList) {
        int insertIndex = 0;
        for (Long totalItem : totalList) {
            insertIndex = insertList.indexOf(totalItem);
            if (insertIndex >= 0) {
                insertList.remove(insertIndex);
            }
        }
        totalList.addAll(insertList);
        Collections.sort(totalList);
        return totalList;
    }
}
