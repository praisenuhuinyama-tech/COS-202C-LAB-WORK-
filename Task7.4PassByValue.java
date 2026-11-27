//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 7
/*
 * Task 7.4: Pass by value. Write a method that tries to swap two int parameters. Show that the caller's variables are unchanged, and explain why.
 */

public class PassByValue {

    public static void trySwap(int x, int y) {
        System.out.println("Inside trySwap before swap: x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Inside trySwap after swap:  x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("In main before call: a = " + a + ", b = " + b);
        trySwap(a, b);
        System.out.println("In main after call:  a = " + a + ", b = " + b);
    }
}
