package model;

public class SosialMedia extends Aplikasi {
    private int jumlahPenggunaAktif; // contoh atribut tambahan

    public SosialMedia(String nama, String developer, String versi, double rating,
                       long jumlahDownload, String kategori, String deskripsi, double ukuranFile,
                       int jumlahPenggunaAktif) {
        super(nama, developer, versi, rating, jumlahDownload, kategori, deskripsi, ukuranFile);
        this.jumlahPenggunaAktif = jumlahPenggunaAktif;
    }

    public int getJumlahPenggunaAktif() { return jumlahPenggunaAktif; }
    public void setJumlahPenggunaAktif(int jumlahPenggunaAktif) {
        this.jumlahPenggunaAktif = jumlahPenggunaAktif;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Jumlah Pengguna Aktif: " + jumlahPenggunaAktif + " orang\n";
    }
}
