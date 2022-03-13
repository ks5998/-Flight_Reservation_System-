package com.upgrad.project.ims;

public class Main {

    public static class Address {
        public String street;
        public String city;
        public String state;

        public void updateAddressDetails(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    public static class Contact {
        String name;
        String phone;
        String email;

        public void updateContactDetails(String name,String phone,String email){
            this.name= name;
            this.phone=phone;
            this.email=email;
        }
    }

    public class Flight {
        public String flightNumber;
        public String airline;
        public int capacity;
        public int bookedSeats;

    }

    public class Passenger {
        int id;

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

        public void cancel(boolean canceled){
            this.canceled=canceled;
        }
        public boolean status(){
            return canceled;
        }
    }

    public class RegularTicket extends Ticket {
        String specialServices;

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
            // write your code here
            Address address=new Address();
            address.street="Jalia Para";
            address.city="Howrah";
            address.state="West Bengal";

            System.out.println(address.street);
            System.out.println(address.city);
            System.out.println(address.state);

            Contact contact=new Contact();
            contact.name="Kundan Singh";
            contact.email="kundasin591998@outlook.com";
            contact.phone="1234567890";


            System.out.println(contact.name);
            System.out.println(contact.email);
            System.out.println(contact.phone);
        }
}


