package SelJava.SelJava;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        // Convert to lowercase to ignore case sensitivity
        str = str.toLowerCase();

        // Reverse the string
        String reversed = "";
        int i = str.length() - 1;
        while (i >= 0) {
            reversed += str.charAt(i);
            i--;
        }

        // Check if original and reversed are the same
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        sc.close();

	}

}
