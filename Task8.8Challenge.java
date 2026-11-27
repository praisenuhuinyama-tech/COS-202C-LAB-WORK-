//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 8 
/*
 * Task 8.8 (challenge). Write a program that stores marks for five students in four courses 
 * in a 2D array and prints each student's total and average, and each course's average.
 */

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int STUDENTS = 5;
        final int COURSES = 4;
        double[][] marks = new double[STUDENTS][COURSES];

        // Input marks
        for (int s = 0; s < STUDENTS; s++) {
            System.out.println("Enter marks for Student " + (s + 1) + ":");
            for (int c = 0; c < COURSES; c++) {
                System.out.print("  Course " + (c + 1) + ": ");
                marks[s][c] = scanner.nextDouble();
            }
        }

        // Calculate and print each student's total and average
        System.out.println("\n--- Student Summary ---");
        for (int s = 0; s < STUDENTS; s++) {
            double studentTotal = 0;
            for (int c = 0; c < COURSES; c++) {
                studentTotal += marks[s][c];
            }
            double studentAvg = studentTotal / COURSES;
            System.out.printf("Student %d -> Total: %.2f | Average: %.2f%n", (s + 1), studentTotal, studentAvg);
        }

        // Calculate and print each course's average
        System.out.println("\n--- Course Averages ---");
        for (int c = 0; c < COURSES; c++) {
            double courseTotal = 0;
            for (int s = 0; s < STUDENTS; s++) {
                courseTotal += marks[s][c];
            }
            double courseAvg = courseTotal / STUDENTS;
            System.out.printf("Course %d -> Average: %.2f%n", (c + 1), courseAvg);
        }

        scanner.close();
    }
}
