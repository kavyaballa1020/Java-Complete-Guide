package EncapsulationDemo;
//Encapusulation : Internal details of a class are hidden from outside access
//Make variables (fields) private: This restricts direct access to these variables from outside the class.
//Provide public getter and setter methods: These methods allow controlled access and modification of the private variables.
class encap{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "encap [age=" + age + ", name=" + name + "]";
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		encap obj=new encap();
		obj.setAge(20);
		obj.setName("Kavya");
		System.out.println(obj);
	}

}
