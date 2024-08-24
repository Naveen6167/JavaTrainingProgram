package javaPackage;


import java.util.Scanner;

public class Palindrome {

	
	   public static void main(String[] args) {
	     Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the value");
	        String Str=sc.next();
	        String p="";
	        
	        for (int i = Str.length()-1; i >=0; i--) {
				p=p+Str.charAt(i);
			}
	        if (Str.equals(p)) {
				System.out.println("Palindrome:" +p);
			} else {
System.out.println("Not a Palindrome:"+p);
			}
	    }
	  
	}
