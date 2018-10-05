package observer;

public interface Publisher {

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscriber(Event event);
}
