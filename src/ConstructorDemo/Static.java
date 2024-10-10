package ConstructorDemo;
//static variable , methods and blocks are called without creating an object for it.
//static block execute as soon as the main class loads.
class keywordStatic{
	static int a=10;
	static int addition(int b,int c) {
		return b+c;
	}
	static {
		System.out.println("i am from Static block");
	}
}
public class Static {

	public static void main(String[] args) {
		System.out.println(keywordStatic.a);
		System.out.println(keywordStatic.addition(10,8));
	}

}
