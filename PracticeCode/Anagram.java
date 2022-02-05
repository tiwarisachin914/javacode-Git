package PracticeCode;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="silent";
		boolean flag = false;
		int [] count = new int[256];
		if(s1.length() != s2.length()) {
			flag = false;
		}
		for(int i=0;i<s1.length();i++) {
			int c1 =(int)s1.charAt(i);
			int c2=(int)s2.charAt(i);
			count[c1]++;
			count[c2]--;
		}
		for(int j=0;j<count.length;j++) {
			if(count[j]!=0) {
				flag = false;
				break;
			}
			else {
				flag = true;
			}
		}
		if(flag = true) {
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagrams");
	}

}
