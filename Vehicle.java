public class Vehicle {

    Integer vehicleNum;
    VehicleType vehicleType;

    Ticket ticket;
    
    public Vehicle(Integer vehicleNum, VehicleType vehicleType) {
        this.vehicleNum = vehicleNum;
        this.vehicleType = vehicleType;
        this.ticket = null;
    }
}
