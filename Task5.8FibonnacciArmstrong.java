//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 5
//TASK 5.8
//Fibonacci Armstrong.java

public class FibonacciArmstrong {
    public static void main(String[] args) {
        System.out.println("First 20 Fibonacci numbers:");

        long a = 0, b = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println("\n");

        System.out.println("Armstrong numbers between 100 and 999:");
        for (int num = 100; num <= 999; num++) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int ones = num % 10;

            int sum = hundreds * hundreds * hundreds + tens * tens * tens + ones * ones * ones;

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}