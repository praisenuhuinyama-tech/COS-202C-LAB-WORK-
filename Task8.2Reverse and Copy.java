//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 8 
/*
 * Task 8.2: Reverse and copy. Print the array in reverse order, 
 * then create a reversed copy without changing the original.
 */

import java.util.Arrays;

public class ReserveCopy {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        // 1. Print in reverse order without creating a new array
        System.out.print("Printed in reverse: ");
        for (int i = original.length - 1; i >= 0; i--) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // 2. Create a reversed copy without modifying original
        int[] reversedCopy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversedCopy[i] = original[original.length - 1 - i];
        }

        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Reversed copy:  " + Arrays.toString(reversedCopy));
    }
}
