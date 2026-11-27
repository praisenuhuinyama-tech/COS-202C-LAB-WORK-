//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 2
//TASK 2.1
//Temperature.java

public class Temperature {
    public static void main(String[] args) {
        double celsius = 36.6;
        double fahrenheit = celsius * 9.0 / 5 + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        // What happens with 9/5 ?
        double wrong = celsius * 9 / 5 + 32;
        System.out.println("Using 9/5 (integer division): " + wrong);
    }
}
    