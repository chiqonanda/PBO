# Nama : Chiqo Nanda Rial Pratama
# NIM : 2409116046
# Tema : Manajemen Aplikasi/Tools (AppStore)
# Posttest 5

## Deskripsi Singkat Program
Program ini merupakan sistem manajemen aplikasi sederhana (mirip App Store) dengan operasi CRUD (Create, Read, Update, Delete) serta fitur pencarian. Pengguna dapat menambahkan aplikasi baru, melihat daftar aplikasi, mengupdate aplikasi, menghapus aplikasi, dan mencari aplikasi berdasarkan nama. Program dibuat dengan konsep Pemrograman Berorientasi Objek (OOP), menerapkan MVC (Model-View-Controller), serta dilengkapi validasi input.

## Struktur Project
<img width="424" height="482" alt="image" src="https://github.com/user-attachments/assets/47b4cc1e-311e-4ee1-81ef-91cebbd1de6a" />

Terdapat 4 Package dipemrograman ini dimana setiap packagenya mempunyai fungsi masing masing, yaitu:
- Package Main berisi Main.java sebagai entry point program dan menu interaksi user. (View)

- Package Model berisi class Aplikasi yang menyimpan struktur data, atribut, constructor, getter & setter. (Model)

- Package Service berisi class AplikasiService yang mengatur logika CRUD dan validasi input. (Controller)

- Package Database yang berfungsi sebagai menyimpan alur database

## Alur Program 
### 1. Menu Utama
<img width="456" height="306" alt="image" src="https://github.com/user-attachments/assets/b0f452d6-2c57-4ad2-9e69-dbdab195c8c8" />

Pada menu utama terdapat 6 pilihan: 1). Tambah Aplikasi 2). Tampilkan Aplikasi 3). Update Aplikasi4). Hapus Aplikasi 5). Cari Aplikasi 6). Keluar


### 2. Menu Tambah Aplikasi
<img width="394" height="278" alt="image" src="https://github.com/user-attachments/assets/f89407e8-570a-4eda-8417-09a527b3a263" />


untuk dimenu tambah Aplikasi sendiri User/Admin akan diminta mengisi nama aplikasi, developer, versi, rating, jumlah download , kategori aplikasi, deskripsi, dan ukuran file (MB) dan Input validasi programan ini menggunakan try-catch + logika if agar tidak error jika pengguna salah memasukkan data.


<img width="980" height="58" alt="image" src="https://github.com/user-attachments/assets/9ab3a284-68ae-4216-8160-0b43a8f47984" />

bukti bahwa benar tertambah


### 3. Menu Lihat Aplikasi
<img width="1161" height="285" alt="image" src="https://github.com/user-attachments/assets/e29e4edc-65b0-4371-a8f6-750239bbda70" />


Menu ini dapat menampilkan seluruh daftar aplikasi yang tersimpan di sistem. Namun jika daftar kosong, akan keluar pesan "Belum ada aplikasi."
disini terlihat sudah memakai database

### 4. Menu Update Aplikasi
<img width="667" height="648" alt="image" src="https://github.com/user-attachments/assets/80860373-1eff-40bf-97f9-1b768e15a51c" />

Menampilkan daftar aplikasi yang ingin diupdate tetapi jika tidak ada maka akan ada tulisan tidak ada. User/admin memilih aplikasi berdasarkan nomor yang ingin diupdate. User bisa mengganti semua aspek (nama, developer, versi, rating, download, kategori, deskripsi, ukuran file). Jika nomor tidak valid, keluar pesan error. 

### 5. Menu Delete Aplikasi
<img width="540" height="434" alt="image" src="https://github.com/user-attachments/assets/04a6d03e-ce50-4206-b1c2-23e9ff571926" />

Menampilkan daftar aplikasi. User memilih nomor aplikasi untuk dihapus, Jika berhasil, program menampilkan "Aplikasi berhasil dihapus." hati hati jika ingin menghapus software ataupun aplikasi dikarenakan akan terhapus secara permanenn nantinya

### 6. Menu Cari Aplikasi
<img width="756" height="583" alt="image" src="https://github.com/user-attachments/assets/09df5121-6c6e-42d8-ae30-88ccd4bd0c5c" />

Pada Menu ini User bisa memasukkan keyword nama aplikasi. Program akan mencari keyword yang telah diinput oleh user dan akan mencari semua aplikasi yang berbau keyword tersebut. Jika tidak ditemukan, muncul pesan "Aplikasi tidak ditemukan."

### 7. Menu Keluar
<img width="514" height="361" alt="image" src="https://github.com/user-attachments/assets/c75a890e-d395-448e-9fdb-c4e874f63c49" />

Saat user memasukan nilai 6 maka program akan otomatis berhenti dan akan menampilkan "terima kasih program selesai!"

### 8. JDBC
<img width="1140" height="608" alt="image" src="https://github.com/user-attachments/assets/2e9d5ff2-0a8e-4bf3-8e01-a041fdd6b228" />

Dalam program yang saya buat, JDBC (Java Database Connectivity) berfungsi sebagai penghubung antara aplikasi Java dengan database MySQL. Dengan JDBC, saya bisa melakukan berbagai operasi seperti menyimpan, menampilkan, mengubah, dan menghapus data menggunakan perintah SQL secara langsung di dalam kode Java. Misalnya, saya menggunakan Connection, PreparedStatement, dan ResultSet untuk mengatur koneksi dan eksekusi query. Meskipun cukup detail, penggunaan JDBC ini memerlukan penulisan kode yang lebih panjang karena setiap proses harus dilakukan secara manual.


### 9. ORM'
<img width="1369" height="72" alt="image" src="https://github.com/user-attachments/assets/f5cce805-4aee-4d76-b1d2-2209a6d617c0" />

-

<img width="943" height="194" alt="image" src="https://github.com/user-attachments/assets/ceeff7b5-9b38-411b-beef-e57efa5829ad" />

ORM (Object Relational Mapping) saya gunakan untuk mempermudah pengelolaan data antara objek Java dan tabel database. Dalam hal ini, setiap atribut pada kelas seperti Aplikasi otomatis terhubung dengan kolom yang ada di tabel database tanpa perlu menulis query SQL satu per satu. Dengan ORM, saya cukup memanggil metode seperti Create(), update(), read, atau delete() untuk melakukan operasi pada database.



