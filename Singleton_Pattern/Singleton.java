package Singleton_Pattern;

public class Singleton {
    private Singleton() {

    }

    public static Singleton a = null;

    public static Singleton instance() {
        if (a == null) {
            a = new Singleton();
        }
        return a;
    }
}
