//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 5
//TASK 5.3
//Factorial and Power.java

import java.util.Scanner;

public class FactorialAndPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);

        long power = 1;
        for (int i = 1; i <= n; i++) {
            power *= 2;
        }
        System.out.println("2^" + n + " = " + power);

        input.close();
    }
}