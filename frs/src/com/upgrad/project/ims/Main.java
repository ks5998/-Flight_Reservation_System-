package com.upgrad.project.ims;

public class Main {

    public static class Flight {
        private String flightNumber;
        private String airline;
        private int capacity;
        private int bookedSeats;
        private Ticket ticket;

        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getAirline() {
            return airline;
        }

        public void setAirline(String airline) {
            this.airline = airline;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public int getBookedSeats() {
            return bookedSeats;
        }

        public void setBookedSeats(int bookedSeats) {
            this.bookedSeats = bookedSeats;
        }

        public Ticket getTicket() {
            return ticket;
        }

        public void setTicket(Ticket ticket) {
            this.ticket = ticket;
        }

    }

    public class Passenger {
        int id;
        private static int idCounter;
        Contact passengerContact;
        Address passengerAddress;

        public Passenger(int id, String name,String phone,String email,String street,String city,String state) {
            idCounter++;
            this.id = idCounter;
            this.passengerContact = new Contact(name,phone,email);
            this.passengerAddress = new Address(street,city,state);
        }

        int getPassengerCount(){
            return idCounter;
        }

        private static class Contact{
            String name;
            String phone;
            String email;

            public Contact(String name, String phone, String email) {
                this.name = name;
                this.phone = phone;
                this.email = email;
            }

            public void updateContactDetails(String name, String phone, String email){
                this.name= name;
                this.phone=phone;
                this.email=email;
            }
        }
        private static class Address{ public String street;
            public String city;
            public String state;

            public Address(String street, String city, String state) {
                this.street = street;
                this.city = city;
                this.state = state;
            }

            public void updateAddressDetails(String street, String city, String state){
                this.street=street;
                this.city=city;
                this.state=state;
            }

        }
    }
    public class Ticket {
        String pnr;
        String from;
        String to;
        String departureDateTime;
        String ArrivalDateTime;
        String seatNumber;
        float price;
        boolean canceled;
        private Flight flight;
        private Passenger passenger;

        public Passenger getPassenger() {
            return passenger;
        }

        public void setPassenger(Passenger passenger) {
            this.passenger = passenger;
        }

        public Ticket(Flight flight) {
            this.flight = flight;
        }

        public Flight getFlight() {
            return flight;
        }

        public void setFlight(Flight flight) {
            this.flight = flight;
        }

        public void cancel(boolean canceled){
            this.canceled=canceled;
        }
        public boolean status(){
            return canceled;
        }
    }

    public class RegularTicket extends Ticket {
        String specialServices;

        public RegularTicket(Flight flight) {
            super(flight);
        }

        public void updateSpecialServices(String specialServices){
            this.specialServices=specialServices;
        }
    }

    public class TouristTicket {
        String hotelAddress;

        public String getHotelAddress(){
            return this.hotelAddress;

        }

    }



        public static void main(String[] args) {
            Flight flight=new Flight();
            flight.setAirline("Airbus1213");
            System.out.println(flight.getAirline());
        }
}


