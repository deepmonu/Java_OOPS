package com.Vehicle;

public class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected Integer fuelCapacity;
	protected Integer cc;
	public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
	{
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
		public void displayMake() 
		{
			System.out.println("make: "+make);
		}
		public void displayBasicInfo() 
		{
			System.out.println("VehicleNumber:"+vehicleNumber);
			System.out.println("FuelType: "+fuelType);
			System.out.println("CC: "+cc);
		}
		
	/*public class TwoWheeler extends Vehicle
	{
		private boolean kickStartAvailable;
		public TwoWheeler(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc,boolean kickStartAvailable)
		{
			super(make,vehicleNumber,fuelType,fuelCapacity,cc);
			this.kickStartAvailable = kickStartAvailable;
			
		}
		public void displayDetailInfo() 
		{
			System.out.println("KickStartAvailable: "+this.kickStartAvailable);
		}*/
	//}
	/*public class FourWheeler extends Vehicle
	{
		private String audioSystem;
		private Integer numberOfDoors;
		public FourWheeler(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc,String audioSystem,Integer numberOfDoors)
		{
			super(make,vehicleNumber,fuelType,fuelCapacity,cc);
			this.audioSystem = audioSystem;
			this.numberOfDoors = numberOfDoors;
		}
		public void displayDetailInfo()
		{
			System.out.println("AudioSystem :"+this.audioSystem);
			System.out.println("numberOfDoors: "+this.numberOfDoors);
		}
	}*/
	

}
