package com.company;
import java.util.Iterator;xv

import java.util.ArrayList;
public class HotelRS {
    public static void main(String[] args) {
        HotelReservationSystem hrs1 = new HotelReservationSystem(5000, "Geeta", "Taj");
        HotelReservationSystem hrs2 = new HotelReservationSystem(6000, "chitra", "Ashok");
        HotelReservationSystem hrs3 = new HotelReservationSystem(8000, "kanchan", "ShangriLa");
        ArrayList<HotelReservationSystem> HRS = new ArrayList<HotelReservationSystem>();
        HRS.add(hrs1);
        HRS.add(hrs2);
        HRS.add(hrs3);
        System.out.println("***********************");
        System.out.println("WELCOME TO OUR HOTEL");
        System.out.println("***********************");
        System.out.println("Information of CustomerName,HotelName and Rate\n");
        Iterator itr = HRS.iterator();
        while (itr.hasNext()) {
            HotelReservationSystem hs = (HotelReservationSystem) itr.next();
            System.out.println(hs.cusName + " " + hs.hotelName + " " + hs.rate);
        }
    }
}