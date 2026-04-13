package SelJava.SelJava;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[][]= {{4,5,6,7},{10,30,406}};
		System.out.println(num.length);
		System.out.println(num[1].length);
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}
