import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Struktur data aplikasi
    static class Aplikasi {
        String nama;
        String developer;
        String versi;
        double rating;
        long jumlahDownload;
        String kategori;
        String deskripsi;
        double ukuranFile;

        Aplikasi(String nama, String developer, String versi, double rating,
                 long jumlahDownload, String kategori, String deskripsi, double ukuranFile) {
            this.nama = nama;
            this.developer = developer;
            this.versi = versi;
            this.rating = rating;
            this.jumlahDownload = jumlahDownload;
            this.kategori = kategori;
            this.deskripsi = deskripsi;
            this.ukuranFile = ukuranFile;
        }

        public String toString() {
            return "Nama: " + nama +
                    "\nDeveloper: " + developer +
                    "\nVersi: " + versi +
                    "\nRating: " + rating +
                    "\nDownload: " + jumlahDownload +
                    "\nKategori: " + kategori +
                    "\nDeskripsi: " + deskripsi +
                    "\nUkuran File: " + ukuranFile + " MB\n";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Aplikasi> daftarApp = new ArrayList<>();

        int pilihan;
        do {
            // Menu utama
            System.out.println("\n=== APP STORE  ===");
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
                    System.out.print("Versi: ");
                    String versi = input.nextLine();
                    System.out.print("Rating (0.0 - 5.0): ");
                    double rating = input.nextDouble();
                    System.out.print("Jumlah Download: ");
                    long download = input.nextLong();
                    input.nextLine(); // buffer
                    System.out.print("Kategori: ");
                    String kategori = input.nextLine();
                    System.out.print("Deskripsi Singkat: ");
                    String deskripsi = input.nextLine();
                    System.out.print("Ukuran File (MB): ");
                    double ukuran = input.nextDouble();

                    daftarApp.add(new Aplikasi(nama, dev, versi, rating, download, kategori, deskripsi, ukuran));
                    System.out.println("Aplikasi berhasil ditambahkan!");
                    break;

                case 2:
                    // Tampilkan aplikasi
                    if (daftarApp.isEmpty()) {
                        System.out.println("Belum ada aplikasi.");
                    } else {
                        System.out.println("\n=== DAFTAR APLIKASI ===");
                        for (int i = 0; i < daftarApp.size(); i++) {
                            System.out.println((i+1) + ".\n" + daftarApp.get(i));
                        }
                    }
                    break;

                case 3:
                    // Update aplikasi
                    if (daftarApp.isEmpty()) {
                        System.out.println("Belum ada aplikasi untuk diupdate.");
                    } else {
                        System.out.println("Pilih aplikasi yang ingin diupdate: ");
                        for (int i = 0; i < daftarApp.size(); i++) {
                            System.out.println((i+1) + ". " + daftarApp.get(i).nama);
                        }
                        System.out.print("Nomor aplikasi: ");
                        int idx = input.nextInt() - 1;
                        input.nextLine();

                        if (idx >= 0 && idx < daftarApp.size()) {
                            System.out.print("Nama baru: ");
                            String namaBaru = input.nextLine();
                            System.out.print("Developer baru: ");
                            String devBaru = input.nextLine();
                            System.out.print("Versi baru: ");
                            String versiBaru = input.nextLine();
                            System.out.print("Rating baru: ");
                            double ratingBaru = input.nextDouble();
                            System.out.print("Jumlah Download baru: ");
                            long downloadBaru = input.nextLong();
                            input.nextLine();
                            System.out.print("Kategori baru: ");
                            String kategoriBaru = input.nextLine();
                            System.out.print("Deskripsi baru: ");
                            String deskripsiBaru = input.nextLine();
                            System.out.print("Ukuran File baru (MB): ");
                            double ukuranBaru = input.nextDouble();

                            daftarApp.set(idx, new Aplikasi(namaBaru, devBaru, versiBaru, ratingBaru,
                                    downloadBaru, kategoriBaru, deskripsiBaru, ukuranBaru));
                            System.out.println("Data aplikasi berhasil diupdate!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 4:
                    // Hapus aplikasi
                    if (daftarApp.isEmpty()) {
                        System.out.println("Belum ada aplikasi untuk dihapus.");
                    } else {
                        System.out.println("Pilih aplikasi yang ingin dihapus: ");
                        for (int i = 0; i < daftarApp.size(); i++) {
                            System.out.println((i+1) + ". " + daftarApp.get(i).nama);
                        }
                        System.out.print("Nomor aplikasi: ");
                        int idx = input.nextInt() - 1;
                        input.nextLine();

                        if (idx >= 0 && idx < daftarApp.size()) {
                            daftarApp.remove(idx);
                            System.out.println("Aplikasi berhasil dihapus!");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);
    }
}
