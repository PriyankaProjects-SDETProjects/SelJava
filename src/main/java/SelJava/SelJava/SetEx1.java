package SelJava.SelJava;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> batch = new HashSet<>();
		batch.add(34);
		batch.add(67);
		batch.add(23);
		batch.add(90);
		batch.add(34);
		batch.add(67);
		
		
		System.out.println(batch);
		System.out.println(batch.remove(23));
		
		for(int number : batch) {
			System.out.println(number);
		}

	}

}
