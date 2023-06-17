package src.com.parkinglot.parkingspot;
public class FourWheelerSpot extends ParkingSpot{

    public FourWheelerSpot(Integer id) {
        super(id);
        this.spotType = ParkingSpotType.FOURWHEELER;
        this.price = 45;
    }
    
}
