package com.ltts;

public class bank {
	private int accNo;
	private String name;
	private float amount;
	public void insert(int a,String n,float amt)
	{
		accNo=a;
		name=n;
		amount=amt;
		
	}
	public void deposit(float amt)
	{
		amount+=amt;
		System.out.println(amt+" Deposited");
	}
	public void withdraw(float amt)
	{
		if(amount<amt)
			System.out.println("Insufficient amount");
		else
		{
			amount-=amt;
			System.out.println(amt+" Withdraw");
		}
	}
	public void checkBalance()
	{
		System.out.println("Balance is: "+amount);
	}
	public void display()
	{
		System.out.println(accNo+" "+amount+" "+name);
	}

}
