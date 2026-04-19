package SelJava.SelJava;

import java.util.HashMap;
import java.util.Map;

public class Q4MapValReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map<Integer, String> batch = new HashMap<>();
		
		batch.put(1, "chandra");
		batch.put(2, "kumar");
		batch.put(6, "java");
		batch.put(4, "trainer");
		
//		System.out.println(batch);
//		System.out.println(batch.keySet());
//		System.out.println(batch.values());
		
		System.out.println("---Before Update---");
		for(int key : batch.keySet()) {
			
			System.out.println(key + " :"+batch.get(key));

		}
		batch.replace(1, "chandra", "shekhar");
		
		System.out.println("---After Update---");
		for(int key : batch.keySet()) {
			
			System.out.println(key + " :"+batch.get(key));

		}

	}

}
