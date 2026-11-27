//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 9
// Task 9.8 (challenge). Write a program that reads a paragraph and prints a 
// frequency table of the 26 letters, using an int[26] array.

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine().toLowerCase();
        
        int[] frequencies = new int[26];
        
        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                frequencies[ch - 'a']++;
            }
        }
        
        System.out.println("\nLetter Frequency Table:");
        System.out.println("-----------------------");
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('A' + i);
            System.out.printf("%c : %d%n", letter, frequencies[i]);
        }
        
        scanner.close();
    }
}
