package SelJava.SelJava;

import java.util.Scanner;

public class PalandromeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); //121
        
        int original = num;
        int reversed = 0;

        // Use for loop to reverse the number
        for (int i = num; i > 0; i = i / 10) { 
            int digit = i % 10;  //            // get last digit 12, 1
            reversed = reversed * 10 + digit;  // build reversed number 1,12,121 i=12, 1
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
