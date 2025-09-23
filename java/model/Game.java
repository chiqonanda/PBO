package model;

public class Game extends Aplikasi {
    private String genre; // contoh atribut tambahan

    public Game(String nama, String developer, String versi, double rating,
                long jumlahDownload, String kategori, String deskripsi, double ukuranFile, String genre) {
        super(nama, developer, versi, rating, jumlahDownload, kategori, deskripsi, ukuranFile);
        this.genre = genre;
    }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    @Override
    public String toString() {
        return super.toString() + "Genre Game: " + genre + "\n";
    }
}
