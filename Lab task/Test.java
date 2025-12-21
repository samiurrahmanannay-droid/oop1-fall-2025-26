abstract class Shape {
    String color;
    abstract double calculateArea();
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }
    public void displayShape() {
        System.out.println("This is a shape of color: " + color);
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    public Rectangle(String color, double length, double width) {
        super(color); // calling Shape constructor
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width;
    }
    @Override
    public String toString() {
        return "Rectangle color is " + color + 
               " and area is: " + calculateArea();
    }
}
class Circle extends Shape {
    double radius;
    public Circle(String color, double radius) {
        super(color); // calling Shape constructor
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        return "Circle color is " + color + 
               " and area is: " + calculateArea();
    }
}
public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.5);
        Shape s2 = new Rectangle("Blue", 3, 4);
        s1.displayShape();
        s2.displayShape();
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}