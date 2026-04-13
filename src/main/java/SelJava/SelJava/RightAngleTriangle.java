package SelJava.SelJava;

public class RightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int rows = 5;   // number of rows in the triangle
        int i = 1;      // starting row

        // outer loop for rows
        do {
            int j = 1;  // column counter

            // inner loop for printing stars
            do {
                System.out.print("* ");
                j++;
            } while (j <= i);

            // move to next line after each row
            System.out.println();
            i++;
        } while (i <= rows);

	}

}
