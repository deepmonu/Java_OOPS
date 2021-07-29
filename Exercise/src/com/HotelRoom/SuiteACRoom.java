package com.HotelRoom;

public class SuiteACRoom extends HotelRoom {
	private Integer ratePerSqFeet;
	public SuiteACRoom()
	{
		ratePerSqFeet=15;
		
	}
	public SuiteACRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
	{
		super(hotelName,numberOfSqFeet,hasTV,hasWifi);
		
	}
	public int getRatePerSqFeet()
	{
		if(hasWifi==true)return (numberOfSqFeet+ratePerSqFeet+2);
		else return (numberOfSqFeet+ratePerSqFeet);
	}

}
