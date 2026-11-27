//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 7
/*
 * Task 7.6: Recursion. Write recursive methods for the sum of the first n integers, the power of a number, and reversing a string (use substring).
 */

public class Recursion {

    // Sum of integers from 1 to n
    public static int sumFirstN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumFirstN(n - 1);
    }

    // Power: base^exp for exp >= 0
    public static long powerRecursive(long base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * powerRecursive(base, exp - 1);
    }

    // Reverse a string using substring
    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("sumFirstN(5) = " + sumFirstN(5));
        System.out.println("powerRecursive(2, 6) = " + powerRecursive(2, 6));
        System.out.println("reverseString(\"recursion\") = " + reverseString("recursion"));
    }
}
