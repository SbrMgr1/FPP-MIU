package com.fpp.Lession9Ass;

import java.util.Stack;

import com.fpp.stringTest.SubStringTest;

public class SymbolBalancingAlgorithm {
	
	public boolean run(String equation) {

		if(equation != null) {
			char ch;
			Stack<Character> stack = new Stack<Character>();
			boolean result = true;
			String resultStr = "";
			for(int i=0;i<equation.length();i++) {
				ch = equation.charAt(i);
				if(ch == ']' || ch == '}' || ch == ')') {
					if(stack.isEmpty()) {
						result = false;
						resultStr += ch+" at position "+i+", ";
						break;
					}else if(ch == ']' && stack.peek() != '[') {
						result = false;
						resultStr += "no opening bracket for "+ch+" at position "+i+", ";
					}else if(ch == '}' && stack.peek() != '{') {
						result = false;
						resultStr += "no opening bracket for "+ch+" at position "+i+", ";
					}else if(ch == ')' && stack.peek() != '(') {
						result = false;
						resultStr += "no opening bracket for "+ch+" at position "+i+", ";
					}else {
						stack.pop();
					}
				}else if(ch == '[' || ch == '{' || ch == '(') {
					stack.push(ch);
				}
			}
			if(!stack.isEmpty()) {
				int cnt = 0;
				while(!stack.isEmpty()) {
					resultStr += "closing bracket for "+stack.pop()+" at position "+cnt+", ";
					cnt++;
				}
				result = false;
			}
			resultStr = resultStr.length()>2?resultStr.substring(0, resultStr.length()-2):resultStr;
			if(resultStr.length()>0) {
				System.out.println(resultStr);
			}
			
			return result;
		}else {
			return false;
		}
	
	}
	
}
