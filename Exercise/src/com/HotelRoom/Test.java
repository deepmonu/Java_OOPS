package com.HotelRoom;
import java.util.*;
public class Test {
	public static void main(String []args)
	{
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room");
		Scanner sc = new Scanner(System.in);
		int choice;
		choice = sc.nextInt();
		String str1="";
		int n1;
		System.out.println("Hotel Name:");
		str1=sc.next();
		System.out.println("Room Square Feet Area:");
		n1=sc.nextInt();
		System.out.println("Room has TV (yes/no):");
		boolean b1=true;
		String temp;
		temp = sc.next();
		if(temp=="yes")b1=true;
		else b1=false;
		System.out.println("Room has Wifi (yes/no):");
		boolean b2=true;
		//String temp;
		temp = sc.next();
		if(temp=="yes")b2=true;
		else b2=false;
		if(choice==1)
		{
			DeluxeRoom d1 = new DeluxeRoom(str1,n1,b1,b2);
		}
		if(choice==2)
		{
			DeluxeACRoom d2 = new DeluxeACRoom(str1,n1,b1,b2);
		}
		if(choice==3)
		{
			SuiteACRoom d33 = new SuiteACRoom();
			SuiteACRoom d3 = new SuiteACRoom(str1,n1,b1,b2);
			int p=d33.getRatePerSqFeet();
			System.out.println(p);
		}
		else System.out.println("Wrong Choice:");
	}

}
