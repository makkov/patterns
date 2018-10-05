package observer;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PublisherImpl implements Publisher {

    private Set<Subscriber> subscribers;

    public PublisherImpl() {
        this.subscribers = new HashSet<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(Event event) {
        subscribers.forEach(s -> s.handleMessages(event));
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscribers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublisherImpl publisher = (PublisherImpl) o;
        return Objects.equals(subscribers, publisher.subscribers);
    }
}
