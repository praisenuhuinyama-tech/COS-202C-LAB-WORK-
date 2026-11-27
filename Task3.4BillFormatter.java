//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 3
//TASK 3.4
//BillFormatter.java

import java.util.Scanner;

public class BillFormatter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item 1 name: ");
        String item1 = input.nextLine();
        System.out.print("Enter item 1 price: ");
        double price1 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter item 2 name: ");
        String item2 = input.nextLine();
        System.out.print("Enter item 2 price: ");
        double price2 = input.nextDouble();
        input.nextLine();

        System.out.print("Enter item 3 name: ");
        String item3 = input.nextLine();
        System.out.print("Enter item 3 price: ");
        double price3 = input.nextDouble();

        double total = price1 + price2 + price3;

        System.out.println("\n---------------- RECEIPT ----------------");
        System.out.printf("%-20s %10s%n", "Item", "Price");
        System.out.println("-----------------------------------------");
        System.out.printf("%-20s %10.2f%n", item1, price1);
        System.out.printf("%-20s %10.2f%n", item2, price2);
        System.out.printf("%-20s %10.2f%n", item3, price3);
        System.out.println("-----------------------------------------");
        System.out.printf("%-20s %10.2f%n", "TOTAL", total);

        input.close();
    }
}