package first;

public class Main {

    public static void main(String[] args) {
     Group group = new Group("stc13", "10.10.18");
     User user1 = new User("Ivan", group);
     User user2 = new User("Petr", group);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
