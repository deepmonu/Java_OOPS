package com.Customer;
import java.util.*;

public class CustomerMain {
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		Customer cs = new Customer();
		System.out.println("Enter Details");
		String str=sc.nextLine();
		String []st=str.split(",");
		cs.setName(st[0]);
		cs.setAddress(st[1]);
		cs.setMobile(st[2]);
		System.out.println("Output Details: ");
		System.out.println("Name: "+cs.getName());
		System.out.println("Address: "+cs.getAddress());
		System.out.println("Mobile: "+cs.getMobile());
		
		
	}

}
