package com.constructor.level1;

public class HotelBookingMain {

	public static void main(String[] args) {
		
		// Default booking
        HotelBooking b1 = new HotelBooking();
        b1.displayBooking();

        // User-defined booking
        HotelBooking b2 = new HotelBooking("Sanya", "Deluxe", 3);
        b2.displayBooking();

        // Copy booking
        HotelBooking b3 = new HotelBooking(b2);
        b3.displayBooking();

	}

}
