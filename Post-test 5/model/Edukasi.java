    package model;

public class Edukasi extends Aplikasi {
    private String tingkatPendidikan; // contoh atribut tambahan

    public Edukasi(String nama, String developer, String versi, double rating,
                   long jumlahDownload, String kategori, String deskripsi, double ukuranFile,
                   String tingkatPendidikan) {
        super(nama, developer, versi, rating, jumlahDownload, kategori, deskripsi, ukuranFile);
        this.tingkatPendidikan = tingkatPendidikan;
    }

    public String getTingkatPendidikan() { return tingkatPendidikan; }
    public void setTingkatPendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tingkat Pendidikan: " + tingkatPendidikan + "\n";
    }
    @Override
    public String infoSingkat() {
        return "Edukasi: " + getNama() + " [Tingkat: " + tingkatPendidikan + "]";
}

}
