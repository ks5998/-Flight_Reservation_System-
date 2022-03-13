package com.upgrad.project.ims;

public class Main {

    public static void main(String[] args) {
        Passenger passenger=new Passenger(598,"Kundan","1234567890","kundasin591998@outlook.com", "Jalia Para","Howrah","West Bengal");
        Flight flight=new Flight("B737","Boeing",215,85);
        RegularTicket regularTicket=new RegularTicket("591998","CCU","IGI","18-11-2022", "18-11-2022","k59", (float) 5500.0,false,flight,passenger,"Foods");
        String hotelAddress="Hpcl Guest House,46 Golf Links,Rabindra Nagar";
        String[] locations={"Hauz Khas","Akshardham","Karol Bagh","Connaught Palce"};
        TouristTicket touristTicket=new TouristTicket("171745","BLR","CBE","22-01-2023", "22-01-2023","At69", 7890.0f,false,flight,passenger,hotelAddress,locations);
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println("PNR NO:"+ticket.getPnr());
    }
}

