package javaPackage;

import java.util.Scanner;

public class GradeOfMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mark:");
		int Mark = sc.nextInt();
		char grade = 0;

		if (Mark <= 100) {
			if (Mark == 100) {

				System.out.println("Excellent! Your grade is S:- " + Mark);
			} else if (Mark > 89 && Mark <= 99) {

				System.out.println("Very Good! Your grade is A:- " + Mark);

			} else if (Mark > 79 && Mark <= 89) {
				System.out.println("Good! Your grade is B:- " + Mark);
			} else if (Mark <= 79 && Mark > 69) {
				System.out.println("Average! Your grade is C:- " + Mark);
			} else if (Mark > 59 && Mark <= 69) {
				System.out.println("Average! Your grade is D:- " + Mark);
			} else if (Mark <= 59 && Mark > 49) {
				System.out.println("Pass! Your grade is E:- " + Mark);
			} else if (Mark <= 49) {
				System.out.println("Fail! Your grade is F:- " + Mark);
			}
		} else {
			System.out.println("Invalid Input");
		}

	}

}
