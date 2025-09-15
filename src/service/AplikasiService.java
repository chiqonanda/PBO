package service;

import model.Aplikasi;
import java.util.ArrayList;
import java.util.Scanner;

public class AplikasiService {
    private ArrayList<Aplikasi> daftarApp = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // 🔹 Method bantu validasi input String (tidak boleh kosong)
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

    // 🔹 Method bantu validasi input double
    private double inputDouble(String pesan, double min, double max) {
        double val = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(pesan);
                val = Double.parseDouble(input.nextLine());
                if (val < min || val > max) {
                    System.out.println("❌ Nilai harus antara " + min + " dan " + max);
                } else {
                    valid = true;
                }
            } catch (Exception e) {
                System.out.println("❌ Harus berupa angka!");
            }
        }
        return val;
    }

    // 🔹 Method bantu validasi input long (positif)
    private long inputLong(String pesan) {
        long val = -1;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(pesan);
                val = Long.parseLong(input.nextLine());
                if (val < 0) {
                    System.out.println("❌ Tidak boleh negatif!");
                } else {
                    valid = true;
                }
            } catch (Exception e) {
                System.out.println("❌ Harus berupa angka bulat!");
            }
        }
        return val;
    }

    // CREATE
    public void tambahAplikasi() {
        String nama = inputString("Nama Aplikasi: ");
        String dev = inputString("Developer: ");
        String versi = inputString("Versi: ");
        double rating = inputDouble("Rating (0.0 - 5.0): ", 0.0, 5.0);
        long download = inputLong("Jumlah Download: ");
        String kategori = inputString("Kategori: ");
        String deskripsi = inputString("Deskripsi: ");
        double ukuran = inputDouble("Ukuran File (MB): ", 0.1, Double.MAX_VALUE);

        daftarApp.add(new Aplikasi(nama, dev, versi, rating, download, kategori, deskripsi, ukuran));
        System.out.println("✅ Aplikasi berhasil ditambahkan!");
    }

    // READ
    public void tampilkanAplikasi() {
        if (daftarApp.isEmpty()) {
            System.out.println("❌ Belum ada aplikasi.");
        } else {
            System.out.println("\n=== DAFTAR APLIKASI ===");
            for (int i = 0; i < daftarApp.size(); i++) {
                System.out.println((i+1) + ".\n" + daftarApp.get(i));
            }
        }
    }

    // UPDATE
    public void updateAplikasi() {
        tampilkanAplikasi();
        if (!daftarApp.isEmpty()) {
            int idx = (int) inputLong("Pilih nomor aplikasi yang ingin diupdate: ") - 1;
            if (idx >= 0 && idx < daftarApp.size()) {
                String nama = inputString("Nama baru: ");
                String dev = inputString("Developer baru: ");
                String versi = inputString("Versi baru: ");
                double rating = inputDouble("Rating baru (0.0 - 5.0): ", 0.0, 5.0);
                long download = inputLong("Jumlah Download baru: ");
                String kategori = inputString("Kategori baru: ");
                String deskripsi = inputString("Deskripsi baru: ");
                double ukuran = inputDouble("Ukuran File baru (MB): ", 0.1, Double.MAX_VALUE);

                daftarApp.set(idx, new Aplikasi(nama, dev, versi, rating, download, kategori, deskripsi, ukuran));
                System.out.println("✅ Aplikasi berhasil diupdate!");
            } else {
                System.out.println("❌ Nomor tidak valid.");
            }
        }
    }

    // DELETE
    public void hapusAplikasi() {
        tampilkanAplikasi();
        if (!daftarApp.isEmpty()) {
            int idx = (int) inputLong("Pilih nomor aplikasi yang ingin dihapus: ") - 1;
            if (idx >= 0 && idx < daftarApp.size()) {
                daftarApp.remove(idx);
                System.out.println("✅ Aplikasi berhasil dihapus!");
            } else {
                System.out.println("❌ Nomor tidak valid.");
            }
        }
    }

    // SEARCH
    public void cariAplikasi() {
        String keyword = inputString("Masukkan nama aplikasi yang ingin dicari: ").toLowerCase();
        boolean found = false;
        for (Aplikasi app : daftarApp) {
            if (app.getNama().toLowerCase().contains(keyword)) {
                System.out.println("\nDitemukan:\n" + app);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ Aplikasi tidak ditemukan.");
        }
    }
}
