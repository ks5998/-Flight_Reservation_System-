package com.upgrad.project.ims;

public class TouristTicket extends Ticket {
    String hotelAddress;

    public TouristTicket(Flight flight) {
        super(flight);
    }

    public String getHotelAddress(){
        return this.hotelAddress;

    }

}
