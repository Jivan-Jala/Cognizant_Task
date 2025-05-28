// File: TransactionExample.java
import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:bank.db");

        try {
            conn.setAutoCommit(false);

            PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
            PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");

            debit.setDouble(1, 100);
            debit.setInt(2, 1); // Sender

            credit.setDouble(1, 100);
            credit.setInt(2, 2); // Receiver

            debit.executeUpdate();
            credit.executeUpdate();

            conn.commit();
            System.out.println("Transfer successful.");
        } catch (SQLException e) {
            conn.rollback();
            System.out.println("Transfer failed. Transaction rolled back.");
        } finally {
            conn.setAutoCommit(true);
            conn.close();
        }
    }
}
