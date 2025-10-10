package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/manajemen_software"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✅ Koneksi ke database berhasil (ORM aktif).");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("❌ Gagal konek ke database: " + e.getMessage());
            }
        }
        return conn;
    }
}
