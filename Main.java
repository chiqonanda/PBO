//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Struktur data aplikasi
    static class Aplikasi {
        String nama;
        String developer;
        double rating;

        Aplikasi(String nama, String developer, double rating) {
            this.nama = nama;
            this.developer = developer;
            this.rating = rating;
        }


        public String toString() {
            return "Nama: " + nama + ", Developer: " + developer + ", Rating: " + rating;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Aplikasi> daftarApp = new ArrayList<>();

        int pilihan;
        do {
            // Menu utama
            System.out.println("\n=== APP STORE / PLAY STORE MANAGEMENT ===");
            System.out.println("1. Tambah Aplikasi");
            System.out.println("2. Tampilkan Aplikasi");
            System.out.println("3. Update Aplikasi");
            System.out.println("4. Hapus Aplikasi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    // Tambah aplikasi
                    System.out.print("Nama Aplikasi: ");
                    String nama = input.nextLine();
                    System.out.print("Developer: ");
                    String dev = input.nextLine();
                    System.out.print("Rating: ");
                    double rating = input.nextDouble();
                    input.nextLine();
                    daftarApp.add(new Aplikasi(nama, dev, rating));
                    System.out.println("✅ Aplikasi berhasil ditambahkan!");
                    break;

                case 2:
                    // Tampilkan aplikasi
                    if (daftarApp.isEmpty()) {
                        System.out.println("❌ Belum ada aplikasi.");
                    } else {
                        System.out.println("\n=== DAFTAR APLIKASI ===");
                        for (int i = 0; i < daftarApp.size(); i++) {
                            System.out.println((i+1) + ". " + daftarApp.get(i));
                        }
                    }
                    break;

                case 3:
                    // Update aplikasi
                    if (daftarApp.isEmpty()) {
                        System.out.println("❌ Belum ada aplikasi untuk diupdate.");
                    } else {
                        System.out.println("Pilih aplikasi yang ingin diupdate: ");
                        for (int i = 0; i < daftarApp.size(); i++) {
                            System.out.println((i+1) + ". " + daftarApp.get(i));
                        }
                        System.out.print("Nomor aplikasi: ");
                        int idx = input.nextInt() - 1;
                        input.nextLine();

                        if (idx >= 0 && idx < daftarApp.size()) {
                            System.out.print("Nama baru: ");
                            String namaBaru = input.nextLine();
                            System.out.print("Developer baru: ");
                            String devBaru = input.nextLine();
                            System.out.print("Rating baru: ");
                            double ratingBaru = input.nextDouble();
                            input.nextLine();

                            daftarApp.set(idx, new Aplikasi(namaBaru, devBaru, ratingBaru));
                            System.out.println("✅ Data aplikasi berhasil diupdate!");
                        } else {
                            System.out.println("❌ Nomor tidak valid.");
                        }
                    }
                    break;

                case 4:
                    // Hapus aplikasi
                    if (daftarApp.isEmpty()) {
                        System.out.println("❌ Belum ada aplikasi untuk dihapus.");
                    } else {
                        System.out.println("Pilih aplikasi yang ingin dihapus: ");
                        for (int i = 0; i < daftarApp.size(); i++) {
                            System.out.println((i+1) + ". " + daftarApp.get(i));
                        }
                        System.out.print("Nomor aplikasi: ");
                        int idx = input.nextInt() - 1;
                        input.nextLine();

                        if (idx >= 0 && idx < daftarApp.size()) {
                            daftarApp.remove(idx);
                            System.out.println("✅ Aplikasi berhasil dihapus!");
                        } else {
                            System.out.println("❌ Nomor tidak valid.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("❌ Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);
    }
}