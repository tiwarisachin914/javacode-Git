package PracticeCode;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="{[(])}";
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='{'|| c=='['|| c=='('){
				st.push(c);
			}
			else if(c==']') {
				if(st.peek()!='[') {
					System.out.println("Not Balanced");
					return;
				}
				else {
					st.pop();
				}
			}
			else if(c=='}') {
				if(st.peek()!='{') {
					System.out.println("Not Balanced");
					return;
				}
				else {
					st.pop();
				}
			}
			else if(c==')') {
				if(st.peek()!='(') {
					System.out.println("Not Balanced");
					return;
				}
				else {
					st.pop();
				}
			}
		}
		if(st.isEmpty()) {
			System.out.println("balanced Bracket");
		}
		else {
			System.out.println("Not Balanced");
		}

	}

}
