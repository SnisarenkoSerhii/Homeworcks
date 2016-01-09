import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey on 25.12.2015.
 */
public class DBCommands {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/GAI";

    // логин и пороль для доступа к БД
    static final String USER = "postgres";
    static final String PASS = "XAvier";

    public List<String> showCarByCArOwnerName(String name) throws SQLException {
        Connection conn = null;
        List<String> cars = new ArrayList<>();
        try {
            //шаг 2: регистрируем драйвер
            Class.forName(JDBC_DRIVER);
            //шаг 3: открываем соединение
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT \"Owner\".surname,  \"Cars\".\"carName\"\n" +
                    "FROM \"Owner\"\n" +
                    "INNER JOIN \"Cars\"\n" +
                    "ON \"Cars\".\"ownerIdcar\"=\"Owner\".\"idOwner\"\n" +
                    "WHERE \"Owner\".\"surname\" LIKE " + "'%" + name + "%'" + ";");
            System.out.println(name + " has next cars:");
            while (rs.next()) {
                cars.add(rs.getString("carName"));
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public List<String> showLicensePlateByPartName(String name) throws SQLException {
        Connection conn = null;
        List<String> person = new ArrayList<>();
        try {
            //шаг 2: регистрируем драйвер
            Class.forName(JDBC_DRIVER);
            //шаг 3: открываем соединение
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT \"Owner\".* , \"Cars\".\"licensePllate\", \"Cars\".\"carName\"\n" +
                    "FROM \"Owner\"\n" +
                    "INNER JOIN \"Cars\"\n" +
                    "ON \"Cars\".\"ownerIdcar\"=\"Owner\".\"idOwner\"\n" +
                    "WHERE \"Cars\".\"licensePllate\" LIKE " + "'%" + name + "%'" + ";");
            System.out.println("licensePllate with part" + name + " has next cars and owner:");
            while (rs.next()) {
                person.add(rs.getString("carName"));
                person.add(rs.getString("surname"));
                person.add(rs.getString("licensePllate"));
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }

    public List<String> showPersonWithCrime(String name) throws SQLException {
        Connection conn = null;
        List<String> person = new ArrayList<>();
        try {
            //шаг 2: регистрируем драйвер
            Class.forName(JDBC_DRIVER);
            //шаг 3: открываем соединение
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT \"Owner\".* , \"Cars\".\"licensePllate\", \"Cars\".\"carName\", \"Crimes\".\"crime\"\n" +
                    "FROM \"Owner\" \n" +
                    "INNER JOIN \"Crimes\" ON \"Crimes\".id = \"Owner\".\"idCime\"\n" +
                    "INNER JOIN \"Cars\" ON \"Cars\".\"ownerIdcar\"=\"Owner\".\"idOwner\"\n" +
                    "WHERE \"Crimes\".\"crime\" LIKE " + "'%" + name + "%'" + ";");
            System.out.println("The man with crime " + name + " is: ");
            while (rs.next()) {
                person.add(rs.getString("carName"));
                person.add(rs.getString("surname"));
                person.add(rs.getString("licensePllate"));
                person.add(rs.getString("passport"));
                person.add(rs.getString("driverLicence"));
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }
    public List<String> showDTPCar() throws SQLException {
        Connection conn = null;
        List<String> person = new ArrayList<>();
        try {
            //шаг 2: регистрируем драйвер
            Class.forName(JDBC_DRIVER);
            //шаг 3: открываем соединение
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT \"Cars\".*\n" +
                    "FROM \"Owner\" \n" +
                    "INNER JOIN \"Cars\"\n" +
                    "ON \"Cars\".\"ownerIdcar\"=\"Owner\".\"idOwner\"\n" +
                    "WHERE \"Cars\".\"DTP\" = TRUE;");
            System.out.println("Cars who were in DTP is: ");
            while (rs.next()) {
                person.add(rs.getString("carName"));
                person.add(rs.getString("licensePllate"));
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }
    public List<String> showCarWithExpiredTO(String date) throws SQLException {
        Connection conn = null;
        List<String> person = new ArrayList<>();
        try {
            //шаг 2: регистрируем драйвер
            Class.forName(JDBC_DRIVER);
            //шаг 3: открываем соединение
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT \"Cars\".*\n" +
                    "FROM \"Owner\" \n" +
                    "INNER JOIN \"Cars\"\n" +
                    "ON \"Cars\".\"ownerIdcar\"=\"Owner\".\"idOwner\"\n" +
                    "WHERE \"Cars\".\"TODate\" < " +  "'" + date + "'" + ";");
            System.out.println("Cars with expired TO: ");
            while (rs.next()) {
                person.add(rs.getString("carName"));
                person.add(rs.getString("licensePllate"));
                person.add(rs.getString("TODate"));
                person.add("|");
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }
}