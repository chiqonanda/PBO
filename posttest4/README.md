# Nama : Chiqo Nanda Rial Pratama
# NIM : 2409116046
# Tema : Manajemen Aplikasi/Tools (AppStore)
# Posttest 4

## Deskripsi Singkat Program
Program ini merupakan sistem manajemen aplikasi sederhana (mirip App Store) dengan operasi CRUD (Create, Read, Update, Delete) serta fitur pencarian. Pengguna dapat menambahkan aplikasi baru, melihat daftar aplikasi, mengupdate aplikasi, menghapus aplikasi, dan mencari aplikasi berdasarkan nama. Program dibuat dengan konsep Pemrograman Berorientasi Objek (OOP), menerapkan MVC (Model-View-Controller), serta dilengkapi validasi input.

## Struktur Project (MVC)
<img width="388" height="224" alt="image" src="https://github.com/user-attachments/assets/82d00d5f-22f5-4aa0-ae6c-ad810e10f7ec" />

Terdapat 3 Package dipemrograman ini dimana setiap packagenya mempunyai fungsi masing masing, yaitu:
- Package Main berisi Main.java sebagai entry point program dan menu interaksi user. (View)

- Package Model berisi class Aplikasi yang menyimpan struktur data, atribut, constructor, getter & setter. (Model)

- Package Service berisi class AplikasiService yang mengatur logika CRUD dan validasi input. (Controller)

## Validasi Input
Validasi input adalah proses memeriksa apakah data yang dimasukkan oleh user sesuai dengan aturan yang sudah ditentukan.

<img width="788" height="296" alt="image" src="https://github.com/user-attachments/assets/8f6693af-0bbb-48bf-a03b-1e2dd354682c" />

berikut adalah code penggunaan validasi input yaitu dengan try dan catch, namun validasi error ataupun input tidak hanya menggunakan try catch bisa juga dengan logika pemrograman


<img width="469" height="253" alt="image" src="https://github.com/user-attachments/assets/db616f9b-ece5-48d8-a4a0-1bdc3165600d" />





## Alur Program 
### 1. Menu Utama
<img width="456" height="306" alt="image" src="https://github.com/user-attachments/assets/b0f452d6-2c57-4ad2-9e69-dbdab195c8c8" />

Pada menu utama terdapat 6 pilihan: 1). Tambah Aplikasi 2). Tampilkan Aplikasi 3). Update Aplikasi4). Hapus Aplikasi 5). Cari Aplikasi 6). Keluar

### 2. Menu Tambah Aplikasi
<img width="627" height="516" alt="image" src="https://github.com/user-attachments/assets/2a7607b6-8fbc-4c4d-85d8-f30da19ffa72" />

untuk dimenu tambah Aplikasi sendiri User/Admin akan diminta mengisi nama aplikasi, developer, versi, rating, jumlah download , kategori aplikasi, deskripsi, dan ukuran file (MB) dan Input validasi programan ini menggunakan try-catch + logika if agar tidak error jika pengguna salah memasukkan data.

### 3. Menu Lihat Aplikasi
<img width="678" height="566" alt="image" src="https://github.com/user-attachments/assets/2ec43b16-9540-487e-8769-24b28e618d33" />

Menu ini dapat menampilkan seluruh daftar aplikasi yang tersimpan di sistem. Namun jika daftar kosong, akan keluar pesan "Belum ada aplikasi."

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
