package ArraysDemo;

import java.util.Scanner;

public class MatrixSubstraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m=sc.nextInt();
		System.out.println("Enter the number of columns");
		int n=sc.nextInt();
		int[][] a=new int[m][n];
		int[][] b=new int[m][n];
		int[][] sub=new int[m][n];
		System.out.println("Enter the elements in the first Array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements in the second Array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Second Array");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				sub[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Substraction");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
	}

}
