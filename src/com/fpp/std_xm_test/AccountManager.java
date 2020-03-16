package com.fpp.std_xm_test;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double sum = 0;
		for(Employee e : emps) {
			List<Account> accounts = e.getAccounts();
			for(int i = 0; i < accounts.size(); ++i) {
				Account next = accounts.get(i);
				sum += next.getBalance();
			}
			
		}
		return sum;
	}
}