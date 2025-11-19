package logics;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "[(])";
		FindValidParentheses(s);
		

	}

	private static void FindValidParentheses(String s) {
		if(s == null || s.length() == 0) {
			System.out.println("false");
			return;
		}
		
		Stack<Character> stack = new Stack<>();
		HashMap<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		
		for(char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				if(!stack.isEmpty() && stack.peek() == map.get(c)) {
					stack.pop();
				} else {
					System.out.println("false");
					return;
				}
			} else {
				stack.push(c);
			}
		}
		
		System.out.println(stack.isEmpty());
	}

}
