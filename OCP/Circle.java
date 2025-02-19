public class Circle extends Shape { // Extend Shape Abstract Class
    private double radius;
    // getters and setters

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}