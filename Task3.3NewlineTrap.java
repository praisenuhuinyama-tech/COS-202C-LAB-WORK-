//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 3
//TASK 3.3
//NewlineTrap.java

import java.util.Scanner;

public class NewlineTrap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter full name: ");
        String name = input.nextLine(); // Skipped! Reads the leftover newline
        System.out.println("Age: " + age + ", Name: [" + name + "]");
        input.close();
    }
}

//NewlineFixed
import java.util.Scanner;

public class NewlineFixed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine(); // consume the leftover newline

        System.out.print("Enter full name: ");
        String name = input.nextLine();

        System.out.println("Age: " + age + ", Name: " + name);

        input.close();
    }
}