//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 3
//TASK 3.6
//ReportFile.java

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReportFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        System.out.println("\n--- names.txt (simulated) ---");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        input.close();
    }
}