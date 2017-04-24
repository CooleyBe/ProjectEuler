/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 * The problem is to find the largest palindrome number of a product of two
 * 3-digit numbers
 *
 * @author Ben
 */
public class Problem4 implements Problem {

    @Override
    public void runProblem() {

        String value = new String();
        int maxPalindrome = 0;
        int startingValue = 999;

        for (int i = startingValue; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                value = Integer.toString(i * j);
                if (isPalindrome(value)) {
                    break;
                }
            }
            if (Integer.parseInt(value) > maxPalindrome) {
                maxPalindrome = Integer.parseInt(value);
            }
        }

        System.out.println("Max Palindrome = " + maxPalindrome);
    }

    private boolean isPalindrome(String value) {
        boolean palindrome = true;
        int checkValue = 0;
        for (int i = 0; i < value.length(); i++) {

            // determine the position of the character that will need to match the index
            checkValue = value.length() - (i + 1);
            if (value.charAt(i) != value.charAt(checkValue)) {
                palindrome = false;
                break;
            }
        }

        return palindrome;
    }
}
