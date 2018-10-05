package abstrac;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Circle();
        parent.color("green");
        parent.figure();
        System.out.println(parent);

        Parent parent1 = new Triangle();
        parent1.color("red");
        parent1.figure();
        System.out.println(parent1);

    }
}
