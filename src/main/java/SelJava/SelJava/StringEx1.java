package SelJava.SelJava;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String org = "i am an automation tester";

String suborg[] = org.split(" ");

for(int i=suborg.length-1;i>=0;i--) {
	System.out.println(suborg[i]);
}


	}

}
