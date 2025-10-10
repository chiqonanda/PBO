package model;

public class Game extends Aplikasi {
    private String genre;

    // Constructor lengkap
    public Game(String nama, String developer, String versi, double rating,
                long jumlahDownload, String kategori, String deskripsi, double ukuranFile, String genre) {
        super(nama, developer, versi, rating, jumlahDownload, kategori, deskripsi, ukuranFile);
        this.genre = genre;
    }

    // Overloading constructor 
    public Game(String nama, String genre) {
        super(nama, "Unknown Dev", "1.0", 0.0, 0, "Game", "Belum ada deskripsi", 10.0);
        this.genre = genre;
    }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    // Overriding toString
    @Override
    public String toString() {
        return super.toString() + "Genre Game: " + genre + "\n";
    }

    // Overriding infoSingkat
    @Override
    public String infoSingkat() {
        return "Game: " + getNama() + " (" + genre + ")";
    }
}
