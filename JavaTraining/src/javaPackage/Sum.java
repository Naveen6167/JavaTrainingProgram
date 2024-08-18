package javaPackage;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A value:");
		int a=sc.nextInt();
		System.out.println("Enter the B value:");
		int b=sc.nextInt();
		System.out.println("Enter the C value:");
		int c=sc.nextInt();
		System.out.println("Enter the D value");
		int d=sc.nextInt();
		int i=a+b;
		int j=c+d;
		
		if (i>j) {
			System.out.println("The sum of A & B is greater than the sum of c& D");
			
		}
		else {
			System.out.println("The sum of A & B is smaller than the sum of c& D");
		}
		
	}

}
