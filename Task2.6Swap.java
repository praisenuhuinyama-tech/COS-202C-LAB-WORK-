//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 2
//TASK 2.6
//Swap.java

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After: a = " + a + ", b = " + b);
    }
}