package observer;

public interface Subscriber {

    void handleMessages(Event event);
}
