//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 3
//TASK 3.1
//Greeting.java

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = input.next();

        System.out.print("Enter middle name: ");
        String middle = input.next();

        System.out.print("Enter last name: ");
        String last = input.next();

        System.out.println("Welcome, " + last + ", " + first + " " + middle);

        input.close();
    }
}