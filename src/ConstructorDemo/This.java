package ConstructorDemo;

class Addition{
	int a;
	int b;
	static int c;
	int add(int a,int b) {
		//if we do not mention these with this keyword we will get 0 as output.
		this.a=a;
		this.b=b;
		return a+b;
	}
	int mult(int a,int c) {
		this.a=a;
		this.c=c;
		return a*c;
	}
	void Display() {
		System.out.println(add(a,b)+" "+mult(a,c));
	}
}
public class This {

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(2, 8);
		obj.mult(4, 5);
		obj.Display();
	}

}
