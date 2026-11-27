//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 4
//TASK 4.3
//Largest of three.java

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: 2");
        int a = input.nextInt();
        System.out.print("Enter second number: 4");
        int b = input.nextInt();
        System.out.print("Enter third number: 6");
        int c = input.nextInt();

        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        System.out.println("Largest is: " + largest);

        input.close();
    }
}