import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "123";
    static final String QUERY = "SELECT u.login, u.email, ua.currency, ua.account_number\n" +
            "FROM users_account ua\n" +
            "JOIN users u \n" +
            "ON u.id = ua.id";

    public static void main(String[] args) {
        List<UsersAccount> users = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);

            while (rs.next()) {
                System.out.print("Login: " + rs.getString("login") + " ");
                String login = rs.getString("login");
                System.out.print("Email: " + rs.getString("email") + " ");
                String email = rs.getString("email");
                System.out.print("Currency: " + rs.getString("currency") + " ");
                BigDecimal currency = rs.getBigDecimal("currency");
                System.out.println("Account Number: " + rs.getString("account_number") + " ");
                String accountnumber = rs.getString("account_number");

                users.add(new UsersAccount(login, email, accountnumber, currency));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (UsersAccount usersAccount : users) {
            hashMap.put(usersAccount.getLogin(), usersAccount.getAccountNumber());
            
        }
        System.out.println("HASHMAP " + hashMap);
    }
}