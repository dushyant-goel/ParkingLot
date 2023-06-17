package src.com.parkinglot.ticket;
import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.vehicle.Vehicle;

public class Ticket {
   
   long entryTime;
   Vehicle vehicle;
   ParkingSpot spot;

   Ticket(Vehicle vh, ParkingSpot spot) {
      this.entryTime = System.currentTimeMillis();
      this.vehicle = vh;
      this.spot = spot;
   }
   
}
