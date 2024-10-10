package EncapsulationDemo;

class modifiers{
	public int a=10;
	int b=20;
	private int c=30;
	protected int d=40;
	void display() {
		System.out.println(a+b+c+d);
	}
}
public class AccessModifiers {

	public static void main(String[] args) {
		modifiers obj=new modifiers();
		obj.display();
		System.out.println(obj.a);
		System.out.println(obj.b);
//		System.out.println(obj.c); // private
		System.out.println(obj.d);
	}
}
