//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 8 
/*
 * Task 8.1: Basics. Create an array of ten integers entered by the user. 
 * Print the sum, average, maximum, minimum and the number of values above the average.
 */

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        double average = (double) sum / numbers.length;
        int aboveAverageCount = 0;
        for (int num : numbers) {
            if (num > average) {
                aboveAverageCount++;
            }
        }

        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Values above average: " + aboveAverageCount);
        
        scanner.close();
    }
}
