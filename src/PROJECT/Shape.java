package PROJECT;
//Create an Interface 'Shape' with undefined methods as calculateArea and calculate Perimiter.
//Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
// Test your code.

public interface Shape {
    void calculateArea();

    void calculatePerimiter();
}

class Circle implements Shape {
    double radius = 5;

    @Override
    public void calculateArea() {
        System.out.println("Area of the circle: " + radius * radius * 3.14);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Perimeter of the circle: " + 3.14 * 2 * radius);
    }
}

class Square implements Shape {
    int a = 3;

    @Override
    public void calculateArea() {
        System.out.println("Area of the square : " + a * a);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Perimeter of the square : " + 4 * a);
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};
        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimiter();
        }
    }
}