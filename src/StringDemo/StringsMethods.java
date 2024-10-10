package StringDemo;

public class StringsMethods {

	public static void main(String[] args) {
		String name="Kavya";
		String surname="Balla";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(2));
		System.out.println(name.concat(surname));
		System.out.println(name.indexOf("v"));
		
		String[] names=new String[5];
		names[0]="Kavya";
		names[1]="Minnu";
		names[2]="Ankita";
		names[3]="Pavan";
		names[4]="Nanna";
		for(String name1 : names)
		System.out.println(name1);
	}
}
