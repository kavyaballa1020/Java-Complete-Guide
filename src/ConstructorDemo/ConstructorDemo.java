//A default constructor is a constructor that takes no parameters.
//If you don't create any constructor in your class, Java provides a 
//default constructor automatically.
package ConstructorDemo;

class constructor{
	constructor(){
		System.out.println("i am from Default Constructor");
	}
	constructor(int a,int b){
		System.out.println("I am from parametrized Constructor \nAddition is "+a+b);
	}
}
public class ConstructorDemo{

	public static void main(String[] args) {
		constructor obj=new constructor(4,5);  //Parameterized Constructor 
		constructor obj1=new constructor();	  //Default Constructor

	}

}
