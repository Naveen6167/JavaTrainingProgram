package javaPackage;

import java.util.Scanner;

public class PatternWithNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value:");
		int a = sc.nextInt();
		int pattern = 1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pattern + " ");
				pattern++;
							}
			System.out.println();
			
		}

	}

}
