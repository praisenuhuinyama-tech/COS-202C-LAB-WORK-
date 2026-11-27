//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 9
// Task 9.7: Cipher. Implement the Caesar cipher with a user-chosen shift. 
// Encrypt a message, then decrypt it.

import java.util.Scanner;

public class Cipher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        shift = ((shift % 26) + 26) % 26; // Normalize negative or large shifts
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                char encryptedChar = (char) (((ch - 'A' + shift) % 26) + 'A');
                result.append(encryptedChar);
            } else if (Character.isLowerCase(ch)) {
                char encryptedChar = (char) (((ch - 'a' + shift) % 26) + 'a');
                result.append(encryptedChar);
            } else {
                result.append(ch); // Keep spaces and punctuation unchanged
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        
        System.out.print("Enter shift value: ");
        int shift = scanner.nextInt();
        
        String encrypted = encrypt(message, shift);
        String decrypted = decrypt(encrypted, shift);
        
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        
        scanner.close();
    }
}
