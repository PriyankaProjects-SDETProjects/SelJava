package SelJava.SelJava;

public class HollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i || i==6) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
