package SelJava.SelJava;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String org = "Priyanka,Pandey";
String rev = "";
for(int i=org.length()-1;i>=0;i--) {
	rev = rev+org.charAt(i);
	
}

System.out.println("original :"+org);
System.out.println("reversed String :"+rev);
System.out.println(org+" "+rev);
System.out.println(org.equals(rev));
System.out.println(org.equalsIgnoreCase(rev));
System.out.println(org==rev);
System.out.println(org.replace('p', 'z'));

String a[]= org.split(",");
for(int i =0;i<a.length;i++) {

System.out.println(a[i]);
	}
	
	

}
}
