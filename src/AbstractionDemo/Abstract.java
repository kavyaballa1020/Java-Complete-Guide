package AbstractionDemo;
//Abstract class contain both abstract and regular methods.
//abstract method doesn't have implementation and end with semi colon;
abstract class parents{
	abstract void display();
	void hello() {
		System.out.println("Hello World");
	}
}
class children extends parents{

	@Override
	void display() {
		System.out.println("Hello From abstract method");
	}
	
}
public class Abstract {
	public static void main(String args[]) {
		children obj=new children();
		obj.display();
		obj.hello();
	}

}
