//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 2
//TASK 2.7
//Challenge sumDigit.java

public class SumDigits {
    public static void main(String[] args) {
        int number = 365;

        int hundreds = number / 100;        // 3
        int tens = (number % 100) / 10;     // 6
        int units = number % 10;            // 5

        int sum = hundreds + tens + units;

        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
    }
}