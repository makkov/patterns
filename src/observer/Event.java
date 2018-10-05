package observer;

public class Event {

    private String dateTime;
    private String place;
    private String name;

    public Event(String dateTime, String place, String name) {
        this.dateTime = dateTime;
        this.place = place;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Event{" +
                "dateTime='" + dateTime + '\'' +
                ", place='" + place + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
