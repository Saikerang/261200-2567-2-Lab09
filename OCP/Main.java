public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(2, 10);
        Circle circle = new Circle(2);
        Ellipse ellipse = new Ellipse(4, 7);

        System.out.println("Area of Rectangle: " + calculator.calculateArea(rectangle) + " square unit");
        System.out.println("Area of Circle: " + calculator.calculateArea(circle) + " square unit");
        System.out.println("Area of Ellipse: " + calculator.calculateArea(ellipse) + " square unit");
    }
}