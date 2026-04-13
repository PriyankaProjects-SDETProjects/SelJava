package SelJava.SelJava;

public class SwapArrayelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar1[] = {"priyanka", "amit", "avyan", "advait"};


		// Find indices of "avyan" and "advait"
        int indexAvyan = -1;
        int indexAdvait = -1;

        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i].equals("avyan")) {
                indexAvyan = i;
            } else if (ar1[i].equals("advait")) {
                indexAdvait = i;
            }
        }

        // Swap if both found
        if (indexAvyan != -1 && indexAdvait != -1) {
            String temp = ar1[indexAvyan];
            ar1[indexAvyan] = ar1[indexAdvait];
            ar1[indexAdvait] = temp;
        }

        // Print updated array
        System.out.println("Array after swapping:");
        for (String name : ar1) {
            System.out.print(name + " ");
        }

		
	}

}
