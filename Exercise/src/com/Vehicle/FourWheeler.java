package com.Vehicle;

public class FourWheeler extends Vehicle{
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
		System.out.println("AudioSystem :"+audioSystem);
		System.out.println("numberOfDoors: "+numberOfDoors);
	}

}
