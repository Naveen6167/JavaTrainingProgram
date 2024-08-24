package javaPackage;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		int count=0;
		while (a!=0) {
			a/=10;
			count++;
			
		}
System.out.println(count);
	}

}
