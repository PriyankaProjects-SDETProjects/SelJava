package SelJava.SelJava;

public class MethodTypes {
	
	/*Method with parameters & return type*/
	static String intro(String name, int age) {
		System.out.println();
		System.out.println("Name is: "+name);
		System.out.println("age is: "+age);
		
		return "execution Completed";
	
	}
	
	/*Method with parameters & no return type*/
	static void intro1(String email, int sal) {
		System.out.println();
		System.out.println("Email is: "+email);
		System.out.println("salary is: "+sal);

	
	}
	/*Method with no parameters & a return type*/
	static boolean intro2() {
		System.out.println();
		System.out.println("This is from no parameter & a return type method");
		return true;

	
	}	
	
	/*Method with no parameters & no return type*/
	static void intro3() {
		System.out.println();
		System.out.println("This is from no parameter & no return type method");
	

	
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(intro("Priyanka",25));
intro("Priyanka",25);
intro1("email@email.com",4600000);
System.out.println(intro2());
intro3();
		
	}

}
