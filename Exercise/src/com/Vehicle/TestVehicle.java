package com.Vehicle;
import java.util.*;
public class TestVehicle {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("SAmple Input:");
		System.out.println("Enter 1. Two Wheeler\nEnter 2. Four Wheeler");
		int choice;
		choice = sc.nextInt();
		String a,b;
		System.out.println("Vehicle make:");
		a=sc.next();
		System.out.println("Vehicle Number: ");
		b=sc.next();
		int type;
		String str="";
		System.out.println("Fuel Type:\n1. Petrol\n2.Disel ");
		type=sc.nextInt();
		if(type==1)str="Petrol";
		else if(type==2)str="Disel";
		int cap;
		System.out.println("Fuel capacity:");
		cap=sc.nextInt();
		int cc;
		System.out.println("Engine CC:");
		cc=sc.nextInt();
		if(choice==1)
		{
			
			boolean kick=true;
			String value;
			System.out.println("kick Start:(yes/no");
			value=sc.next();
			if(value=="yes")kick=true;
			else if(value=="no")kick=false;
			
			
			
			TwoWheeler tt = new TwoWheeler(a,b,str,cap,cc,kick);
			System.out.println("***"+tt.make+"***");
			System.out.println("---Basic Information---");
			tt.displayBasicInfo();
			tt.displayDetailInfo();
			
		}
		if(choice==2)
		{
			
			String audio="";
			int door;
			System.out.println("Audio System:");
			audio=sc.next();
			System.out.println("Number of Doors:");
			door=sc.nextInt();
			
			FourWheeler tt1 = new FourWheeler(a,b,str,cap,cc,audio,door);
			System.out.println("***"+tt1.make+"***");
			System.out.println("---Basic Information---");
			tt1.displayBasicInfo();
			tt1.displayDetailInfo();
			
		}
		
		
	}

}
