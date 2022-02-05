package PracticeCode;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class longestSubstringOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aab";
		int max = -1;
		String longest = null;
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<str1.length();i++) {
			char c = str1.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c,i);
			}
			else {
				i=map.get(c);
				map.clear();	
			}
			if(max<map.size()) {
				max = map.size();
			}
		}
		System.out.println(max);

	}

}
