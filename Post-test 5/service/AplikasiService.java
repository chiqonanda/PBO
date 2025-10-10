package service;

import database.Database;
import model.Aplikasi;
import java.sql.*;
import java.util.*;
import java.util.Scanner;

public class AplikasiService {
    private Connection conn;
    private Scanner input = new Scanner(System.in);

    public AplikasiService() {
        conn = Database.getConnection();
    }

    // ✅ Validasi input String
    private String inputString(String pesan) {
        String data;
        do {
            System.out.print(pesan);
            data = input.nextLine().trim();
            if (data.isEmpty()) {
                System.out.println("❌ Input tidak boleh kosong!");
            }
        } while (data.isEmpty());
        return data;
    }

    // ✅ Validasi input double
    private double inputDouble(String pesan, double min, double max) {
        double val = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(pesan);
                val = Double.parseDouble(input.nextLine());
                if (val < min || val > max) {
                    System.out.println("Nilai harus antara " + min + " dan " + max);
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Harus berupa angka!");
            }
        }
        return val;
    }

    // ✅ Validasi input long
    private long inputLong(String pesan) {
        long val = -1;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(pesan);
                val = Long.parseLong(input.nextLine());
                if (val < 0) {
                    System.out.println("Tidak boleh negatif!");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Harus berupa angka bulat!");
            }
        }
        return val;
    }

    // === CREATE ===
    public void tambahAplikasi() {
        String nama = inputString("Nama Aplikasi: ");
        String developer = inputString("Developer: ");
        String versi = inputString("Versi: ");
        double rating = inputDouble("Rating (0.0 - 5.0): ", 0.0, 5.0);
        long download = inputLong("Jumlah Download: ");
        String kategori = inputString("Kategori: ");
        String deskripsi = inputString("Deskripsi: ");
        double ukuran = inputDouble("Ukuran File (MB): ", 0.1, Double.MAX_VALUE);

        Aplikasi app = new Aplikasi(nama, developer, versi, rating, download, kategori, deskripsi, ukuran);
        String sql = "INSERT INTO aplikasi (nama, developer, versi, rating, jumlahDownload, kategori, deskripsi, ukuranFile) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, app.getNama());
            stmt.setString(2, app.getDeveloper());
            stmt.setString(3, app.getVersi());
            stmt.setDouble(4, app.getRating());
            stmt.setLong(5, app.getJumlahDownload());
            stmt.setString(6, app.getKategori());
            stmt.setString(7, app.getDeskripsi());
            stmt.setDouble(8, app.getUkuranFile());
            stmt.executeUpdate();
            System.out.println("✅ Aplikasi berhasil ditambahkan ke database!");
        } catch (SQLException e) {
            System.err.println("❌ Gagal menambah aplikasi: " + e.getMessage());
        }
    }

    // === READ ===
    public void tampilkanAplikasi() {
        String sql = "SELECT * FROM aplikasi";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            if (!rs.isBeforeFirst()) {
                System.out.println("Belum ada data aplikasi di database.");
                return;
            }

            System.out.println("\n=== DAFTAR APLIKASI ===");
            int i = 1;
            while (rs.next()) {
                System.out.println(i++ + ". " + rs.getString("nama")
                        + " | Dev: " + rs.getString("developer")
                        + " | Versi: " + rs.getString("versi")
                        + " | Rating: " + rs.getDouble("rating")
                        + " | Download: " + rs.getLong("jumlahDownload")
                        + " | Kategori: " + rs.getString("kategori")
                        + " | Ukuran: " + rs.getDouble("ukuranFile") + " MB"
                        + "\n   Deskripsi: " + rs.getString("deskripsi"));
            }
        } catch (SQLException e) {
            System.err.println("❌ Gagal menampilkan data: " + e.getMessage());
        }
    }

    // === UPDATE ===
    public void updateAplikasi() {
        tampilkanAplikasi();
        String namaLama = inputString("Masukkan nama aplikasi yang ingin diupdate: ");

        String sqlCheck = "SELECT * FROM aplikasi WHERE nama = ?";
        try (PreparedStatement check = conn.prepareStatement(sqlCheck)) {
            check.setString(1, namaLama);
            ResultSet rs = check.executeQuery();

            if (!rs.next()) {
                System.out.println("❌ Aplikasi tidak ditemukan.");
                return;
            }

            String developer = inputString("Developer baru: ");
            String versi = inputString("Versi baru: ");
            double rating = inputDouble("Rating baru (0.0 - 5.0): ", 0.0, 5.0);
            long download = inputLong("Jumlah Download baru: ");
            String kategori = inputString("Kategori baru: ");
            String deskripsi = inputString("Deskripsi baru: ");
            double ukuran = inputDouble("Ukuran File baru (MB): ", 0.1, Double.MAX_VALUE);

            String sql = "UPDATE aplikasi SET developer=?, versi=?, rating=?, jumlahDownload=?, kategori=?, deskripsi=?, ukuranFile=? WHERE nama=?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, developer);
                stmt.setString(2, versi);
                stmt.setDouble(3, rating);
                stmt.setLong(4, download);
                stmt.setString(5, kategori);
                stmt.setString(6, deskripsi);
                stmt.setDouble(7, ukuran);
                stmt.setString(8, namaLama);
                stmt.executeUpdate();
                System.out.println("✅ Aplikasi berhasil diperbarui!");
            }

        } catch (SQLException e) {
            System.err.println("❌ Gagal update aplikasi: " + e.getMessage());
        }
    }

    // === DELETE ===
    public void hapusAplikasi() {
        tampilkanAplikasi();
        String nama = inputString("Masukkan nama aplikasi yang ingin dihapus: ");

        String sql = "DELETE FROM aplikasi WHERE nama=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nama);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Aplikasi berhasil dihapus!");
            } else {
                System.out.println("❌ Aplikasi tidak ditemukan.");
            }
        } catch (SQLException e) {
            System.err.println("❌ Gagal menghapus aplikasi: " + e.getMessage());
        }
    }

    // === SEARCH ===
    public void cariAplikasi() {
        String keyword = inputString("Masukkan nama aplikasi yang ingin dicari: ").toLowerCase();
        String sql = "SELECT * FROM aplikasi WHERE LOWER(nama) LIKE ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + keyword + "%");
            ResultSet rs = stmt.executeQuery();

            if (!rs.isBeforeFirst()) {
                System.out.println("Aplikasi tidak ditemukan.");
                return;
            }

            System.out.println("\n=== HASIL PENCARIAN ===");
            while (rs.next()) {
                System.out.println("- " + rs.getString("nama")
                        + " | Dev: " + rs.getString("developer")
                        + " | Rating: " + rs.getDouble("rating")
                        + " | Kategori: " + rs.getString("kategori"));
            }
        } catch (SQLException e) {
            System.err.println("❌ Gagal mencari aplikasi: " + e.getMessage());
        }
    }
}
