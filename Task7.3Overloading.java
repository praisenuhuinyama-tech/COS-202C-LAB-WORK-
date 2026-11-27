//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 7
/*
 * Task 7.3: Overloading. Write three overloaded area methods for a square, rectangle and circle.
 */

public class Overloading {

    // Area of a square (side length)
    public static double area(double side) {
        return side * side;
    }

    // Area of a rectangle (width and height)
    public static double area(double width, double height) {
        return width * height;
    }

    // Area of a circle (radius, distinguished with a boolean or second parameter/type)
    public static double area(double radius, boolean isCircle) {
        if (!isCircle) {
            throw new IllegalArgumentException("Expected true for circle area.");
        }
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.printf("Square area (side 5): %.2f%n", area(5.0));
        System.out.printf("Rectangle area (4 x 6): %.2f%n", area(4.0, 6.0));
        System.out.printf("Circle area (radius 3): %.2f%n", area(3.0, true));
    }
}
