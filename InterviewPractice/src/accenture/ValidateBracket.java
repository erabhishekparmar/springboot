package accenture;

import java.util.Stack;

public class ValidateBracket {

	public static boolean validateString(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='}'){
				if(stack.peek()=='{')
					stack.pop();
				else
					return false;
			}
			else if(s.charAt(i)==')') {
				if(stack.peek()=='(')
					stack.pop();
				else
					return false;
			}
			else if(s.charAt(i)==']') {
				if(stack.peek()=='[')
					stack.pop();
				else
					return false;
			}
			else {
				stack.push(s.charAt(i));
			}
				
		}
		
		
		if(stack.size()==0) {
			return true;
		}
		return false;
		 
		
		
		 
	}
	
	public static void main(String[] args) {
		
		
		String s = "{}[]()";
		// valid
		System.out.println(validateString(s));
		
		
	}
	
}
