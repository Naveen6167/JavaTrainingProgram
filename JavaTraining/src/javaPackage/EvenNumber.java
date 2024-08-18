package javaPackage;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value:");
	int even=sc.nextInt();
	if (even%2==0) {
		System.out.println("The even number is:"+even);
	}
	else {
		System.out.println("Not a even number:"+even);
	}
	}

}
