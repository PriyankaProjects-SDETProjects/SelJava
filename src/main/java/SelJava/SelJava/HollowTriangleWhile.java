package SelJava.SelJava;

public class HollowTriangleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;

		while(i<=6) {
			int j = 1;
			while(j<=i) {
				if(j == 1 || j == i || i == 6) {
					System.out.print("*");
				}
				else {
                    System.out.print(" ");
                }
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
