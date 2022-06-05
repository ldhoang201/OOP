package Lab02;

import java.util.Scanner;

public class bai54 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap N: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.printf(" ");
			}
			for(int k = 0; k < 2 * i + 1;k ++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
