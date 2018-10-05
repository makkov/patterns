package first;

public class User {

    private String name;
    private Group group;

    public User(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public User setName(String name) {
        return new User(name, group);
    }

    public User setGroup(Group group) {
        return new User(name, group);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}
