//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 5
//TASK 5.4
//MultiplicationTable.java

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %2d = %d%n", num, i, num * i);
        }

        input.close();
    }
}