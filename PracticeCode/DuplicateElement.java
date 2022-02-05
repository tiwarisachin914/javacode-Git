package PracticeCode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "aabscddfeeincdkeso";
		//HashMap<Character,Integer> map = new HashMap<>();
		TreeMap<Character,Integer> map = new TreeMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(" "+entry.getKey());
			}
		}

	}

}
