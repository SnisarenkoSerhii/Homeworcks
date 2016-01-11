import java.util.Date;

/**
 * Created by Sergey on 09.01.2016.
 */
public class Person {
    private int idOwners;
    private String surname;
    private String name;
    private String middleName;
    private Date birthday;
    private String passport;
    private Date recivePassportDate;
    private String address;
    private String driverLicence;
    private int idCrime;

    public Person(int idOwners,  String surname, String name, String middleName, Date birthday, String passport, Date recivePassportDate, String address, String driverLicence, int idCrime) {
        this.idOwners = idOwners;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthday = birthday;
        this.passport = passport;
        this.recivePassportDate = recivePassportDate;
        this.address = address;
        this.driverLicence = driverLicence;
        this.idCrime = idCrime;
    }
}
