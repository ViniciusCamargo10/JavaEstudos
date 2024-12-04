import java.util.HashSet;
import java.util.Set;

public class AirCraft {
    // Singleton -> usa quando uma classe só pode ter um obj
    private static AirCraft instance;
    private final Set<String> availabSeats = new HashSet<>();

    private AirCraft(){
        availabSeats.add("1A");
        availabSeats.add("1B");
    }

    public static  AirCraft getInstance(){
        if (instance == null){
            instance = new AirCraft();
        }
        return instance;
    }


    public boolean BookSeat(String seat){
        return availabSeats.remove(seat);
    }


}
