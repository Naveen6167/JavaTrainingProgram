package javaPackage;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of First Number");
		int largestNumber;
		int firstNumber = sc.nextInt();
		System.out.println("Enter the Value of Second Number");
		int secondNumber = sc.nextInt();
		System.out.println("Enter the Value of Third Number");
		int thirdNumber = sc.nextInt();
		
			if (firstNumber > secondNumber && firstNumber > thirdNumber) {
				//largestNumber=firstNumber;
				System.out.println("Largest number is 1st:"+firstNumber);
			}
			else {
				if (secondNumber>thirdNumber) {
					//largestNumber=secondNumber;
					System.out.println("Largest number is 2nd:"+secondNumber);
				}
				else {
					//largestNumber=thirdNumber;
					System.out.println("Largest number is 3rd:"+thirdNumber);
				} 
			}
			
					
		}
		

	}


