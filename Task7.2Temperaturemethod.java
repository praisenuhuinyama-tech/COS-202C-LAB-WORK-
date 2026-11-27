//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 7
/*
 * Task 7.2: Temperature methods. Write celsiusToFahrenheit and fahrenheitToCelsius, then print a table from 0 to 100 degrees Celsius in steps of 10.
 */
public class TemperatureMethod {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        System.out.printf("%-12s %-14s %-14s%n", "Celsius", "Fahrenheit", "Back to C");
        System.out.println("------------------------------------------");

        for (int c = 0; c <= 100; c += 10) {
            double f = celsiusToFahrenheit(c);
            double backToC = fahrenheitToCelsius(f);
            System.out.printf("%-12d %-14.2f %-14.2f%n", c, f, backToC);
        }
    }
}
