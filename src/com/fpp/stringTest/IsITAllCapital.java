package com.fpp.stringTest;

public class IsITAllCapital {
	public static void main(String[] strings){
		try {
			boolean result = isITAllCapital(null);
		} catch (Exception e) {
			System.out.println("error is: "+e.getMessage());
		}
		
		
	}

	private static boolean isITAllCapital(String str) {
		
		try
        { 
			boolean result = true;

			char singleChar;
			for(int i = 0; i<str.length();i++){
				singleChar = str.charAt(i);
				if(singleChar >= 'a' && singleChar <= 'z' ){
					result = false;
					break;
				}
			}

			return result; 
        } 
        catch(ArithmeticException e) 
        { 
            throw new ArithmeticException();
        } 
		
		
	}
}
