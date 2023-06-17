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
