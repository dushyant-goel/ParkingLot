package src.com.parkinglot.vehicle;

import src.com.parkinglot.ticket.Ticket;

public class Vehicle {

    Integer vehicleNum;
    public VehicleType vehicleType;

    Ticket ticket;
    
    public Vehicle(Integer vehicleNum, VehicleType vehicleType) {
        this.vehicleNum = vehicleNum;
        this.vehicleType = vehicleType;
        this.ticket = null;
    }
}
