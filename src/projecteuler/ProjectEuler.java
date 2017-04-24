/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // declare and initialize all variables
        int min = 1;
        int max = 0;
        String[] projectNames = null;
        int programChoice = 0;
        Problem problem = null;

        // build the list of project names to display
        projectNames = buildList();
        max = projectNames.length;

        // output list of project names to screen
        outputScreen(projectNames);

        // get user input on the project to run
        programChoice = getProgramChoice(min, max);

        // determine user selected project
        switch (programChoice) {
            case 1:
                problem = new Problem1();
                break;
            case 2:
                problem = new Problem2();
                break;
            case 3:
                problem = new Problem3();
                break;
            case 4:
                problem = new Problem4();
                break;
            case 5:
                problem = new Problem5();
                break;
            case 6:
                problem = new Problem6();
                break;
            case 7:
                problem = new Problem7();
                break;
            case 8:
                problem = new Problem8();
                break;
            case 9:
                problem = new Problem9();
                break;
            default:
                break;
        }

        // run user selected program
        if (problem != null) {
            problem.runProblem();
        } else {
            System.out.println("Invalid choice.  Program exits.");
        }
    }

    private static String[] buildList() {

        ArrayList<String> projectNames = new ArrayList<String>();
        projectNames.add("1. Multiples of 3 and 5");
        projectNames.add("2. Even Fibonacci numbers");
        projectNames.add("3. Largest prime factor");
        projectNames.add("4. Largest palindrome product");
        projectNames.add("5. Smallest multiple");
        projectNames.add("6. Sum square difference");
        projectNames.add("7. 10001st prime");
        projectNames.add("8. Largest product series");
        projectNames.add("9. Special Pythagorean triplet");
        
        return projectNames.toArray(new String[0]);
    }

    private static void outputScreen(String[] projectNames) {

        System.out.println("*****Project Euler Programs*****");
        System.out.println("");

        for (String option : projectNames) {
            System.out.println(option);
        }

        System.out.println("");
        System.out.print("Choose program number: ");
    }

    private static int getProgramChoice(int min, int max) {

        int programChoice = 0;
        if (min == max) {
            programChoice = min;
            System.out.println(programChoice);
        } else {

            Scanner userInput = new Scanner(System.in);
            do {
                if (userInput.hasNextInt()) {
                    programChoice = userInput.nextInt();
                    if ((min <= programChoice) && (programChoice <= max)) {
                        break;
                    } else {
                        System.out.println("Please choose option between " + min + " and " + max + ".");
                    }
                } else {
                    userInput.next();
                }
            } while (true);
        }

        return programChoice;
    }
}
