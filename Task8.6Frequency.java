//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 8 
/*
 * Task 8.6: Frequency. Generate 60 random dice throws (values 1 to 6). 
 * Use a counting array to print how many times each face occurred.
 */

import java.util.Random;

public class Frequency {
    public static void main(String[] args) {
        Random random = new Random();
        int[] counts = new int[6]; // Index 0 = face 1, ..., Index 5 = face 6
        int totalThrows = 60;

        for (int i = 0; i < totalThrows; i++) {
            int roll = random.nextInt(6) + 1; // Generates 1 to 6
            counts[roll - 1]++;
        }

        System.out.println("Results of " + totalThrows + " dice throws:");
        for (int face = 1; face <= 6; face++) {
            System.out.println("Face " + face + ": " + counts[face - 1] + " times");
        }
    }
}
