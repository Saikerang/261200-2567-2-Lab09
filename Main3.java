public class Main3 {
    public static void main(String[] args) {
        Order order = new Order();
        OrderProcessor orderProcessor = new OrderProcessor(new EmailNotifier());
        OrderProcessor orderProcessor2 = new OrderProcessor(new SMSNotifier());

        orderProcessor.processOrder(order);
        orderProcessor2.processOrder(order);
    }

}
