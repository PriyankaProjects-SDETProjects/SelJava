package SelJava.SelJava;


class One1{
	
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}


public class EnumarationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One1 obj1 = new One1();
		
		obj1.setSalary(500000);
		System.out.println(obj1.getSalary());
	
		

	}

}
