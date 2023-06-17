public class FourWheelerSpot extends ParkingSpot{

    FourWheelerSpot(Integer id) {
        super(id);
        this.spotType = ParkingSpotType.FOURWHEELER;
        this.price = 45;
    }
    
}
