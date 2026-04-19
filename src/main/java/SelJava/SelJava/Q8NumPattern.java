package SelJava.SelJava;

public class Q8NumPattern {

	public static void main(String[] args) {
		int rows = 3;   // number of rows
        int num = 1;    // starting number

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces for alignment
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print numbers for this row
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(num);
                num++;
            }
            System.out.println(); // move to next line
        }

	}

}
