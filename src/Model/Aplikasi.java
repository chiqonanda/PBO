package model;

public class Aplikasi {
    // Properties 
    private String nama;
    private String developer;
    private String versi;
    private double rating;
    private long jumlahDownload;
    private String kategori;
    private String deskripsi;
    private double ukuranFile;

    // Constructor
    public Aplikasi(String nama, String developer, String versi, double rating,
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

    // Getter & Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getDeveloper() { return developer; }
    public void setDeveloper(String developer) { this.developer = developer; }

    public String getVersi() { return versi; }
    public void setVersi(String versi) { this.versi = versi; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public long getJumlahDownload() { return jumlahDownload; }
    public void setJumlahDownload(long jumlahDownload) { this.jumlahDownload = jumlahDownload; }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }

    public double getUkuranFile() { return ukuranFile; }
    public void setUkuranFile(double ukuranFile) { this.ukuranFile = ukuranFile; }

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

