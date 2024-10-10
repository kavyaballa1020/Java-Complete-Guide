package ArraysDemo;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		String[] str=new String[n];
		System.out.println("Enter the elements the in the array");
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			System.out.println(str[i]);
		}
	}

}
