package PracticeCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class listprob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("cry");
		a.add("try");
		a.add("try");
		a.add("cry");
		a.add("fry");
		
		int max = -1;
		String str="";
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<a.size();i++) {
			if(map.containsKey(a.get(i))) {
				map.put(a.get(i),(map.get(a.get(i)))+1);
			}
			else {
				map.put(a.get(i), 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			if(entry.getValue()>max) {
				str = entry.getKey();
				max = entry.getValue();
				
			}
		}
		System.out.println(str);


	}

}
