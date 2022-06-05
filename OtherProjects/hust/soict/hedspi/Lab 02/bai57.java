package Lab02;

import java.util.Random;


public class bai57 {
	
	static int[][] RandomMatrix(int[][] matrix) {
		Random rd = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = rd.nextInt(100);
			}
		}
		return matrix;
	}
	
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("%d ",matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	static int[][] sumOfMatrix(int[][] a,int[][] b){
		int[][] c = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	
	public static void main(String args[]) {
		int[][] matrixA = new int[3][3];
		int[][] matrixB = new int[3][3];
		int[][] matrixSum = new int[3][3];
		
		matrixA = RandomMatrix(matrixA);
		matrixB = RandomMatrix(matrixB);
		System.out.println("Matrix A:");
		printMatrix(matrixA);
		System.out.println("Matrix B:");
		printMatrix(matrixB);
		matrixSum = sumOfMatrix(matrixA, matrixB);
		System.out.println("Sum of A and B is :" );
		printMatrix(matrixSum);
		System.exit(0);
	}
}
