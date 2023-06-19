package src;

import src.com.parkinglot.entranceexit.EntraceGate;
import src.com.parkinglot.entranceexit.ExitGate;
import src.com.parkinglot.parkinglot.ParkingLot;
import src.com.parkinglot.parkingspot.ParkingSpot;
import src.com.parkinglot.ticket.Ticket;
import src.com.parkinglot.vehicle.Vehicle;
import src.com.parkinglot.vehicle.VehicleType;

public class Main {
    public static void main(String[] args) {
        
        /*
         * Parking Lot
         * 3 x FourWheelerSpots
         * 3 x TwoWheelerSpots
         */

       // ParkingLot
        ParkingLot parkingLot = new ParkingLot();
        EntraceGate entrance = parkingLot.entrace;
        ExitGate exit = parkingLot.exit;

        // Vehicles
        Vehicle car1 = new Vehicle(9211, VehicleType.FOURWHEELER);
        Vehicle car2 = new Vehicle(3444, VehicleType.FOURWHEELER);
        Vehicle car3 = new Vehicle(5542, VehicleType.FOURWHEELER);
        Vehicle car4 = new Vehicle(2836, VehicleType.FOURWHEELER);
        Vehicle car5 = new Vehicle(7816, VehicleType.FOURWHEELER);
        Vehicle bike1 = new Vehicle(8852, VehicleType.TWOWHEELER);
        ParkingSpot ps; 
        Integer cost;

        // Progression of Day
        /*
         * 1. Car1 arrives : Ticket1
         * 2. Car2 arrives : Ticket2
         * 3. Bike1 arrives : Ticket3
         * 4. Car3 arrives : Ticket4
         * 5. Car4 arrives -- 4 Wheeler parking full
         * 6. Car2 leaves -Ticket2
         * 7. Car5 arrives : Ticket5
         * 8. Bike1 leaves -Ticket3
         * 9. Car1 leaves -Ticket1
         * 10. Car3 leave -Ticket4
         * 11. Car4 arrives : Ticket6
         * 12. Bike1 arrives : Ticket7
         */
        
        //1
        ps = entrance.findParkingSpot(car1);
        System.out.println(ps.id);
        Ticket ticket1 = entrance.generateTicket(car1, ps);
        entrance.updateParkingSpot(ticket1);
        //2
        ps = entrance.findParkingSpot(car2);
        System.out.println(ps.id);
        Ticket ticket2 = entrance.generateTicket(car2, ps);
        entrance.updateParkingSpot(ticket2);
        //3
        ps = entrance.findParkingSpot(bike1);
        System.out.println(ps.id);
        Ticket ticket3 = entrance.generateTicket(bike1, ps);
        entrance.updateParkingSpot(ticket3);
        //4
        ps = entrance.findParkingSpot(car3);
        System.out.println(ps.id);
        Ticket ticket4 = entrance.generateTicket(car3, ps);
        entrance.updateParkingSpot(ticket4);
        //5
        ps = entrance.findParkingSpot(car4);
        System.out.println("null");
        // Ticket ticket5 = entrance.generateTicket(car4, ps5);
        // entrance.updateParkingSpot(ticket5);
        // 6
        cost = exit.calculateCost(ticket2);
        exit.collectPayment(cost);
        exit.updateParkingSpot(ticket2);
        // 7
        ps = entrance.findParkingSpot(car5);
        System.out.println(ps.id);
        Ticket ticket5 = entrance.generateTicket(car5, ps);
        entrance.updateParkingSpot(ticket5);
        // 8
        cost = exit.calculateCost(ticket3);
        exit.collectPayment(cost);
        exit.updateParkingSpot(ticket3);
        // 9
        cost = exit.calculateCost(ticket1);
        exit.collectPayment(cost);
        exit.updateParkingSpot(ticket1);
        // 10
        cost = exit.calculateCost(ticket4);
        exit.collectPayment(cost);
        exit.updateParkingSpot(ticket4);
        // 11
        ps = entrance.findParkingSpot(car4);
        System.out.println(ps.id);
        Ticket ticket6 = entrance.generateTicket(car4, ps);
        entrance.updateParkingSpot(ticket6);
        // 12
        ps = entrance.findParkingSpot(bike1);
        System.out.println(ps.id);
        Ticket ticket7 = entrance.generateTicket(bike1, ps);
        entrance.updateParkingSpot(ticket7);

    }
}