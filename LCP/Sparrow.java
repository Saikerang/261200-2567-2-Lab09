public class Sparrow implements Flyable {
    @Override
    public void move() {
        System.out.println("Sparrow is moving by hopping and flying.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying in the sky.");
    }
}