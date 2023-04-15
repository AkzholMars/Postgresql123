import java.sql.*;

public class Main {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "123";
    static final String QUERY = "SELECT u.login, u.fullname, u.age, u.gender, u.email, ua.currency, ua.account_number\n" +
            "FROM accounts ua\n" +
            "JOIN users u \n" +
            "ON u.id = ua.id";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);

            while (rs.next()) {


                User user = new User(rs.getString("login"), rs.getString("fullname"),
                        rs.getString("email"), rs.getInt("age"), rs.getString("gender"),
                        new User.Account(rs.getInt("account_number"), rs.getInt("currency")));
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}