package javaPackage;

import java.util.Scanner;

public class Scar {

	public static void main(String[] args) {
		
	Scanner n= new Scanner(System.in);
	System.out.println("Enter the Value");
	String name=n.nextLine();
	char gender=n.next().charAt(0);
	double number=n.nextDouble();
	int age=n.nextInt();
	float cgpa=n.nextFloat();
	System.out.println("Enter the Name: "+name);
			System.out.println("Gender: "+gender);
	System.out.println("Mob NO: "+number);
	System.out.println("Age: "+age);
	System.out.println("cgpa: "+ cgpa);
	}
	

}

