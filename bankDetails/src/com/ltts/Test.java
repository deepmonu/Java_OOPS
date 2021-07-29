package com.ltts;

public class Test {
	public static void main(String []args)
	{
		bank b1 = new bank();
		b1.insert(832345, "Deepanshu", 10000);
		b1.display();
		b1.checkBalance();
		b1.deposit(40000);
		b1.checkBalance();
		b1.withdraw(15000);
		b1.checkBalance();
	}

}
