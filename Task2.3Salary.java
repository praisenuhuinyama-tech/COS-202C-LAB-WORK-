//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 2
//TASK 2.3
//Salary.java

public class Salary {
    public static void main(String[] args) {
        double grossSalary = 250000;
        final double TAX_RATE = 0.10; // 10%
        double deduction = 15000;

        double tax = grossSalary * TAX_RATE;
        double netSalary = grossSalary - tax - deduction;

        System.out.println("Gross Salary: " + String.format("%.2f", grossSalary));
        System.out.println("Tax: " + String.format("%.2f", tax));
        System.out.println("Deduction: " + String.format("%.2f", deduction));
        System.out.println("Net Salary: " + String.format("%.2f", netSalary));
    }
}