package first;

public class Group {

    private String name;
    private String date;

    public Group(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getDate(String name) {
        return new Group(name, date);
    }

    public Group setDate(String date) {
        return new Group(name, date);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
