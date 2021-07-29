package com.Employee;
import java.util.*;
public class EmploeeMain {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Sample Input:\nEnter Name: ");
		emp.setName(sc.next());
		System.out.println("Enter Address: ");
		emp.setAddress(sc.next());
		System.out.println("Enter Mobile number: ");
		emp.setMobile(sc.next());
		System.out.println("Sample Output:");
		System.out.println("Name: "+emp.getName());
		System.out.println("Address: "+emp.getAddress());
		System.out.println("Mobile: "+emp.getMobile());
		System.out.println("Verify and Update the details:");
		while(true)
		{
		System.out.println("Menu:");
		System.out.println("1.Update Employee name\n2.Update Employee Address\n3.Update Employee mobile\n4.All information correct/Exit");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Current name is: "+emp.getName());
			System.out.println("Enter New name: ");
			emp.setName(sc.next());
		}
		else if(choice==2)
		{
			System.out.println("Current Address is: "+emp.getAddress());
			System.out.println("Enter New name: ");
			emp.setAddress(sc.next());
		}
		else if(choice==3)
		{
			System.out.println("Current Mobile is: "+emp.getMobile());
			System.out.println("Enter New name: ");
			emp.setMobile(sc.next());
		}
		else if(choice==4)
		{
			System.out.println("Sample Output:");
			System.out.println("Name: "+emp.getName());
			System.out.println("Address: "+emp.getAddress());
			System.out.println("Mobile: "+emp.getMobile());
			System.exit(1);
			
		}
		else
		{
			System.out.println("*******Invalid Input\n Enter Valid input:******");
			
		}
		}
		
	}

}
