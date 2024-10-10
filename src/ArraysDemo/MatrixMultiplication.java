package ArraysDemo;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows of the first matrix:");
        int m1 = sc.nextInt();
        System.out.println("Enter the number of columns of the first matrix:");
        int n1 = sc.nextInt();
        
        
        System.out.println("Enter the number of rows of the second matrix:");
        int m2 = sc.nextInt();
        System.out.println("Enter the number of columns of the second matrix:");
        int n2 = sc.nextInt();
        
        if (n1 != m2) {
            System.out.println("Matrix multiplication is not possible. Columns of the first matrix must equal the rows of the second matrix.");
            return;
        }
        
        int[][] a = new int[m1][n1];
        int[][] b = new int[m2][n2];
        int[][] mult = new int[m1][n2];  
        
        
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    mult[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
