package SelJava.SelJava;

class AA{
	
	void parent() {
		System.out.println("parent");
	}
	
}

class BB extends AA{
	
	void child() {
		System.out.println("child");
	}
	
	void parent() {
		System.out.println("parentFromChild");
	}
	
	void add(int a, int b) {
		System.out.println(a+b);
		System.out.println("method 1");
	}
	
	void add(double a, double b) {
		System.out.println(a+b);
		System.out.println("method 2");
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
		System.out.println("method 3");
	}
	
}

public class PolymorphismEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BB bb = new BB();
		bb.parent();
		bb.add(2, 5);
		bb.add(2.5, 1.5);
		bb.add(5, 6, 7);
		
		AA aa = new AA();
		aa.parent();
		
		
	}

}
