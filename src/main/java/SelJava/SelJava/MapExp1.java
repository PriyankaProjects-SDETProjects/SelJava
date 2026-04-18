package SelJava.SelJava;

import java.util.HashMap;
import java.util.Map;

public class MapExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, String> batch = new HashMap<>();
		
		batch.put(1, "priyanka");
		batch.put(2, "pandey");
		batch.put(6, "amit");
		batch.put(4, "priyanka");
		
		System.out.println(batch);
		System.out.println(batch.keySet());
		System.out.println(batch.values());
		batch.remove(2);
		
		for(int key : batch.keySet()) {
			System.out.println(key + " :"+batch.get(key));
		}
		
	}

}
