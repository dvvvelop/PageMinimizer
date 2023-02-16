package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class PageMinimizerImplementation implements PageMinimizer {

    @Override
    public String string1tostring2(String n1) {


        Scanner scanner = new Scanner(System.in);

        // Read a string of numbers from the console
        System.out.print("Enter a string of numbers: ");
        String numberString = scanner.nextLine();

        // Convert the string to an array of integers
        String[] numberStrings = numberString.split("\\s*,\\s*");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Add a dash between more than two consecutive numbers, and a comma between other numbers
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1 && numbers[i + 1] == numbers[i] + 1) {
                count++;
            } else {
                if (count > 2) {
                    sb.append(numbers[i - count + 1]).append("-").append(numbers[i]).append(",");
                } else if (count == 2) {
                    sb.append(numbers[i - 1]).append(",").append(numbers[i]).append(",");
                } else {
                    sb.append(numbers[i]).append(",");
                }
                count = 1;
            }
        }

        // Print the final string with dashes and commas
        String result = sb.toString();
        if (result.endsWith(",")) {
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result);
        return "";
    }
        }






