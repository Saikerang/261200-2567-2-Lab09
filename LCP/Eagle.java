public class Eagle implements Flyable {
    @Override
    public void move() {
        System.out.println("Eagle is moving by hopping and flying.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying in the sky.");
    }
}