package PolymorphismDemo;

class parent{
	int a=10;
	int b=20;
	void display() {
		System.out.println("i am from parent Method");
	}
	parent()
	{
		System.out.println("I am a constructor pressent in parent method");
	}
	parent(int c)
	{
		System.out.println("I am a constructor pressent in parent method");
	}
	
}
class child extends parent{
	child(){
		super();  // an parent constuctor must be called inside a child constructor.
	}
	void display2() {
		super.display();
	}
	void arthimetic() {
		System.out.println("The value of a is : "+super.a);
		System.out.println("The value of b is : "+super.b);
		System.out.println("Addition is : "+(super.a+super.b));
	}
}
public class Super {

	public static void main(String[] args) {
		child obj=new child();
		obj.display2();
		obj.arthimetic();
	}

}
