public class Ellipse extends Shape { // Extend Shape Abstract Class
    private double a; // แกนหลักกึ่งกลาง
    private double b; // แกนรองกึ่งกลาง

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB () {
        return b;
    }

    @Override
    public double calculateArea() {
        return Math.PI * a * b; // สูตรพื้นที่วงรี: π * a * b
    }
}