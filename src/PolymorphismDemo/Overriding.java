package PolymorphismDemo;

class Animal {

    public void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

	public void sound() {
        System.out.println("Cat meows");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal animal1 = new Dog();  
        Animal animal2 = new Cat(); 

        animal1.sound();  
        animal2.sound();  
    }
}
