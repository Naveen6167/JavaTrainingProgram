package javaPackage;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to find the factorial");
		int a=sc.nextInt();
		int fact=1, i=1;
		while (i<=a) {
			fact=fact*i; 
			i++;
		System.out.println(fact);
			
		}
		/*for (int i =(a- 1); i>1; i--) {
			fact=fact*i;
			
			
		}*/
		//System.out.println();
		
		System.out.println("The fact is:"+ fact);
	}

}
