package com.example.project.Airport;
import java.util.ArrayList;

public class Airport  {
    /** A list of the flights into and out of this airport
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private ArrayList<Flight> allFlights;

    public Airport(ArrayList<Flight> flights) {
        allFlights = flights;
    }

    public ArrayList<Flight> getAllFlights() {
        return allFlights;
    }

    /** Returns the revenue generated by all flights at the airport,
     *  as described in part (a)
     */
    public double getTotalRevenue() {
        /* to be implemented in part (a) */
        double revenue = 0.0;
        for (int i = 0; i < allFlights.size(); i ++) {
            if (allFlights.get(i).getNumPassengers() > allFlights.get(i).getCapacity()) {
                revenue += allFlights.get(i).getCapacity() * allFlights.get(i).getPrice();
            }
            else {
                revenue += allFlights.get(i).getNumPassengers() * allFlights.get(i).getPrice();
            }
        }
        return revenue;
    }

    /** Updates the list of flights by removing certain flights and
     *  returns the total number of passengers whose flights were removed,
     *  as described in part (b)
     */
    public int updateFlights() {
        /* to be implemented in part (b) */
        int passengers = 0;
        for (int i = 0; i < allFlights.size(); i ++) {
            if ((double) allFlights.get(i).getNumPassengers() / allFlights.get(i).getCapacity() < 0.2) {
                passengers += allFlights.get(i).getNumPassengers();
                allFlights.remove(i);
                i --;
            }
        }
        return passengers;
    }
}