package PracticeCode;

public class longestPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="bb";
		int start =0;
		int end=0;
//		int max=1;
//        String longest = null;
//        boolean flag = false;
//        for(int i=0;i<s.length();i++){
//            for(int j=i;j<s.length();j++){
//                flag = true;
//                for(int k=0;k<(j-i+1)/2;k++){
//                    if(s.charAt(i+k)!=s.charAt(j-k)){
//                        flag = false;
//                        break;
//                    }
//                }
//                if(flag== true && j-i+1>max){
//                    max = j-i+1;
//                    longest = s.substring(i,j+1);
//                }
//            }
//        }
//        System.out.println(longest); babbad
 
		if(s.length()<2) {
			System.out.println(s);
			return;
		}
		for(int i=0;i<s.length();i++) {
			int odd =checkPallindrome(s,i,i);
			int even =checkPallindrome(s,i,i+1);
			int len=Math.max(odd, even);
			
			if(len>end-start) {
				start = i-(len-1)/2;
				end = i+len/2;
			}
	
		}
		
		System.out.println(s.substring(start,end+1));
	}
	
	public static int checkPallindrome(String s,int left, int right) {
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}

}
