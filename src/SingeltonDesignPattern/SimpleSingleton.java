package SingeltonDesignPattern;

//Instance means copy of a class.
//Object is an instance of the class.
//The Singleton design pattern is a creational design pattern that ensures a class has only one instance and provides a global point of access to it. This is useful when exactly one object is needed to coordinate actions across the system, such as in configuration settings or connection pools.
public class SimpleSingleton {
	
    private static SimpleSingleton instance;

    private SimpleSingleton() {}

    public static synchronized SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello from Simple Singleton!");
    }
}
