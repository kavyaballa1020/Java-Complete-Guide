package AbstractionDemo;

interface Animalsound{
	void sound();
}
class dog implements Animalsound{
	public void sound() {
		System.out.println("Barking");
	}
}

public class PracticeInterface {

	public static void main(String[] args) {
		dog d=new dog();
		d.sound();
	}

}
