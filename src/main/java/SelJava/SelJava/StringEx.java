package SelJava.SelJava;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st1 = "Priyanka Pandey";
		System.out.println(st1.length());
		
		String subst1 = st1.substring(5);
		System.out.println(subst1);
		System.out.println(st1.substring(7, 15));
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		
		for(int i=0;i<st1.length();i++) {
			System.out.println("character at index "+i+" "+st1.charAt(i));
		}
		
	}

}
