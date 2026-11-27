//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 5
//TASK 5.2
//Sum and average.java

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        System.out.println("Enter marks (-1 to stop):");

        while (true) {
            int mark = input.nextInt();

            if (mark == -1) {
                break;
            }

            count++;
            sum += mark;

            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }
        }

        if (count == 0) {
            System.out.println("No marks entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Count: " + count);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + String.format("%.2f", average));
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);
        }

        input.close();
    }
}