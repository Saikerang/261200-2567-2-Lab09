public class Rectangle extends Shape { // Extend Shape Abstract Class
    private double width, height;
    // getters and setters

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() { // Override calculateArea() method
        return width * height;
    }
}
