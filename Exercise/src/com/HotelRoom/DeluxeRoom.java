package com.HotelRoom;

public class DeluxeRoom extends HotelRoom {
	public Integer ratePerSqFeet;
	
	public DeluxeRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
	{
		super(hotelName,numberOfSqFeet,hasTV,hasWifi);
		
	}
	public DeluxeRoom()
	{
		super();
		ratePerSqFeet =10;
	}
	int getRatePerSqFeet()
	{
		if(hasWifi==true)return ratePerSqFeet+2;
		else return ratePerSqFeet;
	}
	

}
