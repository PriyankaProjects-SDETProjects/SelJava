package SelJava.SelJava;

public class ArraySortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numAr[] = {10,20,30,40,50,5};

		for (int i = 0; i < numAr.length - 1; i++) {
            int minIndex = i;  // assume current index is smallest

            // Find index of smallest element in remaining array
            for (int j = i + 1; j < numAr.length; j++) {
                if (numAr[j] < numAr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap smallest element with current element
            int temp = numAr[minIndex];
            numAr[minIndex] = numAr[i];
            numAr[i] = temp;
        }

        // Print sorted array
        System.out.println("Array in ascending order:");
        for (int i = 0; i < numAr.length; i++) {
            System.out.print(numAr[i] + " ");
        }

	}

}
