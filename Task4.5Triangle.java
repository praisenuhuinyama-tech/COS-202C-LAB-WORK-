//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 4
//TASK 4.5
//Triangle.java

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = input.nextDouble();
        System.out.print("Enter side 2: ");
        double b = input.nextDouble();
        System.out.print("Enter side 3: ");
        double c = input.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }

        input.close();
    }
}