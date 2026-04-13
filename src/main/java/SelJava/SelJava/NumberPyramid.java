package SelJava.SelJava;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 4;  // number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int s = rows; s > i; s--) {
                System.out.print(" ");  // space for alignment
            }

            // Print descending numbers from i down to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print ascending numbers from 2 up to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next line
            System.out.println();
        }

		}
		
	}


