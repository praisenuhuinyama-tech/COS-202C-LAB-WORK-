//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 9
// Task 9.2: Comparison. Read two words. Print whether they are equal, 
// equal ignoring case, and which comes first alphabetically.

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first word: ");
        String word1 = scanner.next();
        
        System.out.print("Enter second word: ");
        String word2 = scanner.next();
        
        System.out.println("Equal (exact): " + word1.equals(word2));
        System.out.println("Equal (ignoring case): " + word1.equalsIgnoreCase(word2));
        
        int comparison = word1.compareToIgnoreCase(word2);
        if (comparison < 0) {
            System.out.println("'" + word1 + "' comes first alphabetically.");
        } else if (comparison > 0) {
            System.out.println("'" + word2 + "' comes first alphabetically.");
        } else {
            System.out.println("Both words are in the same alphabetical position.");
        }
        
        scanner.close();
    }
}
