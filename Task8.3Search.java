//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 8 
/*
 * Task 8.3: Search. Write indexOf for a linear search. 
 * Ask for a number and report its position or that it was not found.
 */

import java.util.Scanner;

public class Search {
    public static int indexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = {14, 27, 8, 42, 19, 3, 55, 11};

        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();

        int index = indexOf(data, target);
        if (index != -1) {
            System.out.println("Number " + target + " found at index " + index + " (position " + (index + 1) + ").");
        } else {
            System.out.println("Number " + target + " was not found in the array.");
        }

        scanner.close();
    }
}
