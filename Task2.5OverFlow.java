//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 2
//TASK 2.5
//Overflow.java

public class Overflow {
    public static void main(String[] args) {
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE + 1: " + (Integer.MAX_VALUE + 1));

        long big = (long) Integer.MAX_VALUE + 1;
        System.out.println("Using long: " + big);
    }
}