package com.Vehicle;

public class TwoWheeler extends Vehicle {
	private boolean kickStartAvailable;
	public TwoWheeler(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc,boolean kickStartAvailable)
	{
		super(make,vehicleNumber,fuelType,fuelCapacity,cc);
		this.kickStartAvailable = kickStartAvailable;
		
	}
	public void displayDetailInfo() 
	{
		if(kickStartAvailable==true)
			System.out.println("KickStartAvailable: YES");
		else
			System.out.println("KickStartAvailable: NO");
	}

}
