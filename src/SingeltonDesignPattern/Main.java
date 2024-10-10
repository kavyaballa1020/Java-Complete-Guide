package SingeltonDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Get the only instance of SimpleSingleton
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        singleton.showMessage();
    }
}

