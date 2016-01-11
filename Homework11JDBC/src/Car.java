import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Sergey on 09.01.2016.
 */
public class Car {
    private String carName;
    private String carBirthday;
    private Date TODate;
    private String licensePlate;
    private int ownerId;
    private int idCars;
    private boolean DTP;

    public Car(String carName, String carBirthday, Date TODate, String licensePlate, int ownerId, int idCars, boolean DTP) {
        this.carName = carName;
        this.carBirthday = carBirthday;
        this.TODate = TODate;
        this.licensePlate = licensePlate;
        this.ownerId = ownerId;
        this.idCars = idCars;
        this.DTP = DTP;
    }
}
