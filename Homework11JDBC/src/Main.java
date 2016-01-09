import java.sql.*;
import java.util.List;
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
