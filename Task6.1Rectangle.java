//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 6
//TASK 6.1
//Rectangle.java

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(10, 4);

        System.out.println("Rectangle 1 - Length: " + r1.getLength() + ", Width: " + r1.getWidth());
        System.out.println("Area: " + r1.area() + ", Perimeter: " + r1.perimeter());

        System.out.println("Rectangle 2 - Length: " + r2.getLength() + ", Width: " + r2.getWidth());
        System.out.println("Area: " + r2.area() + ", Perimeter: " + r2.perimeter());
    }
}
