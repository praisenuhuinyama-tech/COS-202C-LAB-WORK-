//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 9
// Task 9.6: Email check. Write isValidEmail(String) which checks that the text 
// contains exactly one @, a dot after it and no spaces.

import java.util.Scanner;

public class EmailCheck {
    public static boolean isValidEmail(String email) {
        if (email == null || email.contains(" ")) {
            return false;
        }
        
        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');
        
        // Must contain '@' and it must appear only once
        if (atIndex == -1 || atIndex != lastAtIndex) {
            return false;
        }
        
        // Check for a dot '.' after the '@' symbol
        int dotAfterAt = email.indexOf('.', atIndex);
        return dotAfterAt > atIndex + 1 && dotAfterAt < email.length() - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an email address to validate: ");
        String email = scanner.nextLine();
        
        if (isValidEmail(email)) {
            System.out.println("Valid email format.");
        } else {
            System.out.println("Invalid email format.");
        }
        
        scanner.close();
    }
}
