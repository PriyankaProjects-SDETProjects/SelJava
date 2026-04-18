package SelJava.SelJava;

import java.util.Scanner;

public class NumPalindrome {

	public static void main(String[] args) {
	

		
		  
		        Scanner sc = new Scanner(System.in);

		        // Prompt user
		        System.out.print("Enter a number: ");
		        int number = sc.nextInt();

		        // Store original number
		        int original = number;
		        int reversed = 0;

		        // Reverse the number
		        while (number != 0) {
		            int digit = number % 10;       // get last digit
		            reversed = reversed * 10 + digit; // build reversed number
		            number = number / 10;          // remove last digit
		        }

		        // Check palindrome
		        if (original == reversed) {
		            System.out.println(original + " is a palindrome.");
		        } else {
		            System.out.println(original + " is not a palindrome.");
		        }

		        sc.close();
		    }
		}
