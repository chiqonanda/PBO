package model;

public class AplikasiPembantu extends Aplikasi {
    private boolean membutuhkanInternet;

    public AplikasiPembantu(String nama, String developer, String versi, double rating,
                      long jumlahDownload, String kategori, String deskripsi, double ukuranFile,
                      boolean membutuhkanInternet) {
        super(nama, developer, versi, rating, jumlahDownload, kategori, deskripsi, ukuranFile);
        this.membutuhkanInternet = membutuhkanInternet;
    }

    public boolean isMembutuhkanInternet() { return membutuhkanInternet; }
    public void setMembutuhkanInternet(boolean membutuhkanInternet) {
        this.membutuhkanInternet = membutuhkanInternet;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Membutuhkan Internet: " + (membutuhkanInternet ? "Ya" : "Tidak") + "\n";
    }
    
    @Override
    public String infoSingkat() {
        return "Utility: " + getNama() + " [Internet: " + (membutuhkanInternet ? "Ya" : "Tidak") + "]";
}   

}
