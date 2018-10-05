package observer;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new PublisherImpl();
        publisher.addSubscriber(new SubscriberImpl("Ivan"));
        publisher.addSubscriber(new SubscriberImpl("Oleg"));
        publisher.addSubscriber(new SubscriberImpl("Denis"));
        publisher.addSubscriber(new SubscriberImpl("Dima"));
        publisher.notifySubscriber(new Event("25.10.1993", "108", "party"));
    }
}
