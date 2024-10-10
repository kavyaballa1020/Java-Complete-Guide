package EnumDemo;

public enum Color {
	
	RED("red"),GREEN("green"),BLUE("blue");
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private Color(String value) {
		this.value = value;
	}
	
public static void main(String args[]) {
	Color c=Color.BLUE;
	
	System.out.println("Enum data type : "+c+" Enum value : "+c.getValue()); 
	
	for(Color c1:Color.values()) {
		System.out.println(c1.getValue());
		System.out.println(c1);
	}
	
}
}