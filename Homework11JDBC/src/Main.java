import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Sergey on 25.12.2015.
 */
public class Main {
    // JDBC ������� � ����� ������� ��
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/GAI";

    // ����� � ������ ��� ������� � ��
    static final String USER = "postgres";
    static final String PASS = "XAvier";

    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        List<Car> cars = new ArrayList<>();
        try {
            //шаг 2: регистрируем драйвер
            Class.forName(JDBC_DRIVER);
            //шаг 3: открываем соединение
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM \"Cars\";");
            System.out.println("Cars");
            while (rs.next()) {
                Car car = new Car(rs.getString("carName"),
                        rs.getString("carBirthday"),
                        rs.getDate("TODate"),
                        rs.getString("licensePllate"),
                        rs.getInt("ownerIdcar"),
                        rs.getInt("idCars"),
                        rs.getBoolean("DTP"));
                cars.add(car);
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<Person> persons = new ArrayList<>();
        try {
            //шаг 2: регистрируем драйвер
            Class.forName(JDBC_DRIVER);
            //шаг 3: открываем соединение
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM \"Owner\";");
            System.out.println("Cars");
            while (rs.next()) {
                Person person = new Person(rs.getInt("idOwner"),
                        rs.getString("surname"),
                        rs.getString("name"),
                        rs.getString("middleName"),
                        rs.getDate("birthday"),
                        rs.getString("passport"),
                        rs.getDate("recivePassportDate"),
                        rs.getString("address"),
                        rs.getString("driverLicence"),
                        rs.getInt("idCime"));
                persons.add(person);
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        DBCommands m = new DBCommands();

        List<String> s = m.showCarByCArOwnerName("Ivanov");
        System.out.println(s.stream().map(str -> str.trim()).collect(Collectors.joining(", ")));
        List<String> s2 = m.showLicensePlateByPartName("88");
        System.out.println(s2.stream().map(str -> str.trim()).collect(Collectors.joining(", ")));
        List<String> s3 = m.showPersonWithCrime("RedLight");
        System.out.println(s3.stream().map(str -> str.trim()).collect(Collectors.joining(", ")));
        List<String> s4 = m.showDTPCar();
        System.out.println(s4.stream().map(str -> str.trim()).collect(Collectors.joining(", ")));
        List<String> s5 = m.showCarWithExpiredTO("2008-01-02");
        System.out.println(s5.stream().map(str -> str.trim()).collect(Collectors.joining(", ")));
    }

}
