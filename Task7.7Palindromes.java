//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 7
/*
 * Task 7.7 (challenge). Write isPalindrome(int n) and use it to print all palindromic numbers from 100 to 999.
 */

public class Palindromes {

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\nTotal 3-digit palindromes: " + count);
    }
}
