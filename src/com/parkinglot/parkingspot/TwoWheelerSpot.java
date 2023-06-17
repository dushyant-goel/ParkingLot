package src.com.parkinglot.parkingspot;
public class TwoWheelerSpot extends ParkingSpot {

    public TwoWheelerSpot(Integer id) {
        super(id);
        this.spotType = ParkingSpotType.TWOWHEELER;
        this.price = 20;
    }
    
    
}
