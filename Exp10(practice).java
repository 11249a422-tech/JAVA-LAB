
import java.sql.*;
import java.util.Scanner;

public class DeleteStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            System.out.print("Enter Register Number to delete: ");
            int regNo = sc.nextInt();

            String sql = "DELETE FROM student WHERE reg_no = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, regNo);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student record deleted successfully.");
            } else {
                System.out.println("Student record not found.");
            }

            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        sc.close();
    }
}
