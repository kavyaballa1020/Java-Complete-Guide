package ArraysDemo;

import java.util.Scanner;

public class CharacterArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the character array");
		int n=sc.nextInt();
		char[] ch=new char[n];
		System.out.println("Enter the Elements in the array");
		for(int i=0;i<n;i++) {
			ch[i]=sc.next().charAt(0);
		}
		for(int i=0;i<n;i++) {
			System.out.print(ch[i]);
		}
	}

}
