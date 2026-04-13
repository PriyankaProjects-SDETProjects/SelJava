package SelJava.SelJava;

class ParentXY{
	
	 void home() {
		// TODO Auto-generated method stub
System.out.println("Home");
	}
	 
	 void shop() {
		// TODO Auto-generated method stub
System.out.println("Shop");
	}
}

class ChildXY extends ParentXY{
	
	 void flat() {
		// TODO Auto-generated method stub
System.out.println("Flat");
	}
	 

}

class GrandChildXY1 extends ChildXY{
	
	 void flat1() {
		// TODO Auto-generated method stub
System.out.println("Flat1");
	}
	 

}

class GrandChildXY2 extends ChildXY{
	
	 void flat2() {
		// TODO Auto-generated method stub
System.out.println("Flat2");
	}
	 

}


public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ParentXY pxy = new ParentXY();
		ChildXY cxy = new ChildXY();
		GrandChildXY1 gxy1 = new GrandChildXY1();
		GrandChildXY2 gxy2 = new GrandChildXY2();
		pxy.home();
		cxy.home();
		gxy1.flat1();
		gxy2.flat2();
		
	}

}
