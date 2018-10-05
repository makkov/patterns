package observer;

public class SubscriberImpl implements Subscriber {

    private String name;

    public SubscriberImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void handleMessages(Event event) {
        System.out.println("student " + name + " come to the " + event);
    }

    @Override
    public String toString() {
        return "SubscriberImpl{" +
                "name='" + name + '\'' +
                '}';
    }


}
