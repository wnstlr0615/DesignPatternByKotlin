package part03.singleton;

public class SingletonJava {
    private static final SingletonJava SINGLETON_JAVA = new SingletonJava();
    private SingletonJava() {
    }
    public static SingletonJava getInstance() {
        return SINGLETON_JAVA;
    }
}
