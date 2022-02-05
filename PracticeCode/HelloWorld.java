package PracticeCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="my name is sherlin and my dog name is is is my "
				+ "bruno";
		HashMap<String, Integer> hm = new HashMap<>();
		String [] array = s1.split(" ");
		for(int i=0;i<array.length;i++) {
			if(hm.containsKey(array[i])) {
				hm.put(array[i], hm.get(array[i])+1);
			}
			else {
				hm.put(array[i], 1);
			}
		}
		int max_count =-1; String res ="";
		for(Entry<String, Integer> entry:hm.entrySet()) {
			if(entry.getValue()>max_count) {
				max_count=entry.getValue();
				res=entry.getKey();
			}
		}
		System.out.println(res);
		


	}

}
