package SelJava.SelJava;

public class FindSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numAr[] = {10,20,30,40,50,5};
		
		// Assume first element is the smallest
        int min = numAr[0];

        // Loop through the array
        for (int i = 1; i < numAr.length; i++) {
            if (numAr[i] < min) {
                min = numAr[i];
            }
        }

        System.out.println("The smallest number is: " + min);


	}

}
