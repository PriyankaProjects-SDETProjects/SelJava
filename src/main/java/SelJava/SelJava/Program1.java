package SelJava.SelJava;
import java.util.Scanner;



public class Program1 {

		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();

		        System.out.println("Letter occurrences:");

		        // Outer loop for each character
		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);

		            // Only count letters
		            if (Character.isLetter(c)) {
		                boolean alreadyCounted = false;

		                // Check if this character was already counted before
		                for (int j = 0; j < i; j++) {
		                    if (input.charAt(j) == c) {
		                        alreadyCounted = true;
		                        break;
		                    }
		                }

		                // If not counted yet, count occurrences
		                if (!alreadyCounted) {
		                    int count = 0;
		                    for (int k = i; k < input.length(); k++) {
		                        if (input.charAt(k) == c) {
		                            count++;
		                        }
		                    }
		                    System.out.println("'" + c + "' : " + count);
		                }

		
		
	}
		        }
		 }
}


