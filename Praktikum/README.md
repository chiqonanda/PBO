# Deskripsi Singkat
Program ini terinspirasi dari Aplikasi bawaan Handphone pada masa ini yaitu AppStore dan Playstore, Program ini memiliki sistem CRUD (Create, Read, Update, Delete), Program ini memungkinkan pengguna untuk menambahkan aplikasi baru, melihat daftar aplikasi, mengupdate aplikasi sesuai dengan kebutuhan, menghapus aplikasi dan keluar dari program, kode ini masih dalam tahap pengembangan untuk kedepannya kemungkinan akan ditambahkan fitur Admin dan Pengguna dan Error Handling
# Alur Program 
Untuk Alur Program program ini tidak terlalu kompleks yang pertama itu ada 
### 1. Tampilan Menu Utama
User diberikan 5 pilihan yaitu Menambahkan Aplikasi, Menampilkan Aplikasi, Mengupdate Aplikasi, Menghapus Aplikasi dan keluar dari program, untuk codenya sendiri menggunakan Switch Case 
### 2. Tambah Aplikasi
Jika masuk ke 1 atau Menambah aplikasi pengguna diharusnya memasukan: Nama Aplikasi, Nama Developer, Versi Aplikasi, Rating dari aplikasi, Jumlah yang mendownload , Kategori aplikasi tersebut , deskripsi dari aplikasi tersebut dan ukuran filenya dan data yang ditambah tersebut akan tersimpan di array listnya
### 3. Melihat Aplikasi
Jika masuk ke 2 atau Melihat aplikasi akan tertampil nama nama aplikasi beserta atribut lainnya, tetapi jika aplikasi belum terisi maka akan tampil pesan "Belum ada aplikasi"
### 4. Update Aplikasi
Jika masuk ke 3 atau Menambah update pengguna diharusnya memasukan: Nama Aplikasi, Nama Developer, Versi Aplikasi, Rating dari aplikasi, Jumlah yang mendownload , Kategori aplikasi tersebut , deskripsi dari aplikasi yang baru dan filenya dan data yang diupdate  akan terganti menjadi yang paling baru sesuai dengan inputan sebelumnya
### 5. Delete Aplikasi 
Jika masuk ke 4 atau hapus maka user nanti bisa memilih mana aplikasi yang ingin dihapus, jika valid maka aplikasi akan terhapus dari ArrayList
### 6. Keluar Program
Program akan terhenti jika user memilih nomor 5
