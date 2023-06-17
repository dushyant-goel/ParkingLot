public class TwoWheelerSpot extends ParkingSpot {

    TwoWheelerSpot(Integer id) {
        super(id);
        this.spotType = ParkingSpotType.TWOWHEELER;
        this.price = 20;
    }
    
    
}
