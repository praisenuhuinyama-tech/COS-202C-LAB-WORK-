//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 4
//TASK 4.6
//Login.java

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "1234";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        input.close();
    }
}