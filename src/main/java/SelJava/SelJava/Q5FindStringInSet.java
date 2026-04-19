package SelJava.SelJava;

import java.util.HashSet;
import java.util.Set;

public class Q5FindStringInSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 Set<String> names = new HashSet<>();
	        names.add("priyanka");
	        names.add("shekhar");
	        names.add("chandra");
	        names.add("user");

	        // Check if "chandra" exists
	        if (names.contains("chandra")) {
	            System.out.println("\"chandra\" is present in the set.");
	        } else {
	            System.out.println("\"chandra\" is NOT present in the set.");
	        }
	}

}
