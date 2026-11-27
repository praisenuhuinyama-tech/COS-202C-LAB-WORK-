//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 9
// Task 9.3: Character counts. Count the vowels, consonants, digits and spaces in a line of text.

import java.util.Scanner;

public class CharaterCounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();
        
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        String lowerLine = line.toLowerCase();
        
        for (int i = 0; i < lowerLine.length(); i++) {
            char ch = lowerLine.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        
        scanner.close();
    }
}
