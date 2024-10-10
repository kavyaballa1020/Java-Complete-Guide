package Collections;
import java.util.*;
public class Arraylist {
	public static void main(String args[]) {
		List<String> names=new ArrayList<>();
		List<Integer> age=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arraylist elements");
		while(true) {
			String s=sc.nextLine();
			if(s.equalsIgnoreCase("0")) {
				break;
			}
			else {
				names.add(s);			
			}
		}
		int index=0;
		while(index<names.size()) {
			System.out.println(names.get(index));
			index++;
		}
		
	}

}
