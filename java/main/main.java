package main;

import service.AplikasiService;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AplikasiService service = new AplikasiService();

        int pilihan;
        do {
            System.out.println("\n===  MANAJEMEN TOOLS/APLIKASI  ===");
            System.out.println("Selamat Datang Pencarian Aplikasi ");
            System.out.println("1. Tambah Aplikasi");
            System.out.println("2. Tampilkan Aplikasi");
            System.out.println("3. Update Aplikasi");
            System.out.println("4. Hapus Aplikasi");
            System.out.println("5. Cari Aplikasi");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            while (!input.hasNextInt()) { // validasi menu
                System.out.println("Harus angka!");
                input.next();
                System.out.print("Pilih menu: ");
            }
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> service.tambahAplikasi();
                case 2 -> service.tampilkanAplikasi();
                case 3 -> service.updateAplikasi();
                case 4 -> service.hapusAplikasi();
                case 5 -> service.cariAplikasi();
                case 6 -> System.out.println("Terima kasih! Program selesai.");
                default -> System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 6);
    }
}
