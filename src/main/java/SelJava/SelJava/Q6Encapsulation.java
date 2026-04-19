package SelJava.SelJava;
class Student {
 private String name;
 private int age;

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     if (age > 0) { // validation logic
         this.age = age;
     } else {
         System.out.println("Age must be positive!");
     }
 }
}
//Main class to test encapsulation
public class Q6Encapsulation {
	public static void main(String[] args) {
		Student student = new Student();

        // Using setters to assign values
        student.setName("Priyanka");
        student.setAge(25);

        // Using getters to access values
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Trying invalid age
        student.setAge(-5); // will trigger validation

	}

}
