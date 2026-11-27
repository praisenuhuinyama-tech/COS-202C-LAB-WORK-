//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 9
// Task 9.5: Words. Read a sentence and print the number of words, 
// the longest word and each word on its own line.

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();
        
        if (sentence.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            // Split by one or more whitespace characters
            String[] words = sentence.split("\\s+");
            String longestWord = "";
            
            System.out.println("Number of words: " + words.length);
            System.out.println("\nWords:");
            
            for (String word : words) {
                System.out.println(word);
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            
            System.out.println("\nLongest word: " + longestWord);
        }
        
        scanner.close();
    }
}
