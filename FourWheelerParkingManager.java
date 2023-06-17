import java.util.ArrayList;
import java.util.Arrays;

public class FourWheelerParkingManager extends ParkingSpotManager {

    FourWheelerParkingManager() {
        spots = new ArrayList<>(Arrays.asList(
                new TwoWheelerSpot(1),
                new TwoWheelerSpot(2),
                new TwoWheelerSpot(3)
        ));
    }
    
}
