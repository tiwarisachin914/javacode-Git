package PracticeCode;

import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Stack<Character> stack = new Stack<>();
		if(str.isEmpty()){
			System.out.println("Please enter string");
			return;
		}
		else {
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				if(c=='{' || c=='(' || c=='[') {
					stack.push(c);
				}
				else if(c =='}') {
					if(stack.isEmpty()) {
						System.out.println("Not balanced");
						return;
					}
					else if(stack.peek() != '{') {
						System.out.println("Not balanced");
						return;
					}
					else {
						stack.pop();
					}
					
				}
				else if(c==')') {
					if(stack.isEmpty()) {
						System.out.println("Not balanced");
						return;
					}
					else if(stack.peek() != '(') {
						System.out.println("Not balanced");
						return;
					}
					else {
						stack.pop();
					}
					
					
				}
				else if(c==']') {
					if(stack.isEmpty()) {
						System.out.println("Not balanced");
						return;
					}
					else if(stack.peek() != '[') {
						System.out.println("Not balanced");
						return;
					}
					else {
						stack.pop();
					}
					
				}
			}
			
		}
		
		if(stack.isEmpty()) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not balanced");
		}

	}

}
