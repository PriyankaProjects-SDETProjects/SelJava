package SelJava.SelJava;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("You Entered the name as :"+name);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("You Entered the age as :"+age);
		sc.nextLine();
		System.out.println("Enter your address : ");
		String address = sc.nextLine();
		System.out.println("You Entered the address as :"+address);
		System.out.println("Enter your salary : ");
		int sal = sc.nextInt();
		System.out.println("You Entered the salary as :"+sal);
		
	}

}
