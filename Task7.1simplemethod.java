//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 7
/*
 * Task 7.1: Simple methods. Write cube(int), isOdd(int) and maxOfThree(int, int, int). Call each from main.
 */

public class SimpleMethods {

    public static int cube(int n) {
        return n * n * n;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("cube(4) = " + cube(4));
        System.out.println("isOdd(7) = " + isOdd(7));
        System.out.println("isOdd(-4) = " + isOdd(-4));
        System.out.println("maxOfThree(12, 29, 19) = " + maxOfThree(12, 29, 19));
    }
}
