public class Main2 {

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        Ostrich ostrich = new Ostrich();
        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();

        penguin.move();
        ostrich.move();
        sparrow.move();
        eagle.move();
        //penguin.fly() compile error Penguin is not Flyable
        //ostrich.fly() complie error Ostrich is not Flyable

        sparrow.fly();
        eagle.fly();
    }


}
