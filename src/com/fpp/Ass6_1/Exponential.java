package com.fpp.Ass6_1;

public class Exponential {
	
public double power(int base,int n) {
	if(base == 0 && n == 0) {
		throw new ArithmeticException("Indeterminant form found.");
	}else if(n == 0) {
		return 1;
	}else if(n == 1) {
		return base;
	}	
	if(n<0) {// for negative power
		n = n*(-1);
		return 1/(base*power(base,n-1));
	}else {
		return base*power(base,n-1);
	}
	
	
}
}
