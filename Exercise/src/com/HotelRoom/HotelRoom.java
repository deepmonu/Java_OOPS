package com.HotelRoom;

class HotelRoom {
	protected String hotelName;
	protected Integer numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	public HotelRoom() {}
	public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi)
	{
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
		
	}
	int calculateTariff()
	{
		return 12;
	}
	int getRatePerSqFeet()
	{
		return 0;
	}

}

