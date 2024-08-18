package javaPackage;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user1 value:");
		int user1=sc.nextInt();
		System.out.println("Enter the user2 value:");
		int user2= sc.nextInt();
		int a=user1;
		user1=user2;
		user2=a;
		System.out.println("The value of user1:"+user1);
		System.out.println("The  value of user2:"+user2);
	}

}
