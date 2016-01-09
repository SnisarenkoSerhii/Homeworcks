import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 09.01.2016.
 */
public class Car {
    private String carName;
    private String carBirthday;
    private String TODate;
    private String licensePlate;
    private int ownerId;
    List<String> cars = new ArrayList<>();

    public Car(String carName, String carBirthday, String TODate, String licensePlate, int ownerId, List<String> cars) {
        this.carName = carName;
        this.carBirthday = carBirthday;
        this.TODate = TODate;
        this.licensePlate = licensePlate;
        this.ownerId = ownerId;
        this.cars = cars;
    }
}
