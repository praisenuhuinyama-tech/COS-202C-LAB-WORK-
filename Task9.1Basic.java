//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 9
// Task 9.1: Basics. Read a sentence and print its length, first and last characters, 
// and the sentence in upper and lower case.

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        System.out.println("Length: " + sentence.length());
        
        if (!sentence.isEmpty()) {
            System.out.println("First character: " + sentence.charAt(0));
            System.out.println("Last character: " + sentence.charAt(sentence.length() - 1));
        } else {
            System.out.println("The sentence is empty.");
        }
        
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());
        
        scanner.close();
    }
}
