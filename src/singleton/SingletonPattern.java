package singleton;

public class SingletonPattern {

    private static SingletonPattern ourInstance = null;

    public static SingletonPattern getInstance() {
        synchronized (SingletonPattern.class) {
            if (ourInstance == null) {
                ourInstance = new SingletonPattern();
            }
        }
        return ourInstance;
    }

    private SingletonPattern() {
    }
}
