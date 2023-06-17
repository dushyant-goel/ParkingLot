import java.util.ArrayList;
import java.util.Arrays;

public class TwoWheelerParkingManager extends ParkingSpotManager {

    TwoWheelerParkingManager() {
        spots = new ArrayList<>(Arrays.asList(
                new TwoWheelerSpot(6),
                new TwoWheelerSpot(5),
                new TwoWheelerSpot(4)));
    }

}
