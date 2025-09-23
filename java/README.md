# Nama : Chiqo Nanda Rial Pratama
# NIM : 2409116046
# Tema : Manajemen Aplikasi/Tools (AppStore)
# Posttest 3

## Deskripsi Singkat Program
Program ini merupakan sistem manajemen aplikasi sederhana (mirip App Store) dengan operasi CRUD (Create, Read, Update, Delete) serta fitur pencarian. Pengguna dapat menambahkan aplikasi baru, melihat daftar aplikasi, mengupdate aplikasi, menghapus aplikasi, dan mencari aplikasi berdasarkan nama. Program dibuat dengan konsep Pemrograman Berorientasi Objek (OOP), menerapkan MVC (Model-View-Controller), serta dilengkapi validasi input.
## Struktur Packages

<img width="439" height="273" alt="image" src="https://github.com/user-attachments/assets/e0553766-7980-4614-a252-e08a51d7fd61" />

- dalam package model berisi class Aplikasi (superclass) dan 4 subclass (Game, UtilityApp, SosialMedia, Edukasi)
- dalam package service berisi class AplikasiService untuk menjalankan CRUD aplikasi
- dalam package main berisi Main.java sebagai entry point program

  
## Dokumentasi Program
Program ini menggunakan pewarisan dengan menjadikan Aplikasi sebagai superclass yang menyimpan atribut umum aplikasi (nama, developer, versi, rating, jumlah download, kategori, deskripsi, ukuran file).
### Encapsulation
Encapsulation diterapkan dengan menjadikan semua atribut di Aplikasi bersifat private.
Untuk mengakses atau mengubah nilai atribut, digunakan getter dan setter.

<img width="632" height="224" alt="image" src="https://github.com/user-attachments/assets/6e715b8b-3d4d-4b0e-8b82-e315eae49886" />


<img width="995" height="542" alt="image" src="https://github.com/user-attachments/assets/55a84dc9-20ba-4c66-b715-9e01adfbd990" />

### Inheritance

Inheritance diterapkan dengan membuat Aplikasi sebagai superclass yang berisi atribut umum (nama, developer, versi, rating, download, kategori, deskripsi, ukuran file).

<img width="966" height="248" alt="image" src="https://github.com/user-attachments/assets/c60ff451-8ddb-4fb7-83aa-c334c0921ec9" />

Aplikasi adalah class induk (superclass) yang menyimpan atribut umum sebuah aplikasi, seperti nama, developer, versi, rating, jumlahDownload, kategori, deskripsi, dan ukuranFile. Semua aplikasi, baik itu game, sosial media, edukasi, atau utility, pasti punya atribut dasar ini. Dengan adanya superclass ini, atribut yang sama tidak perlu ditulis berulang di setiap class turunan.

<img width="695" height="63" alt="image" src="https://github.com/user-attachments/assets/6cb907f3-45a1-4ce9-90ba-ea0c4a71f566" />

SosialMedia mewarisi semua atribut dari Aplikasi, kemudian menambahkan atribut khusus yaitu jumlahPenggunaAktif untuk menyimpan jumlah user yang menggunakan aplikasi tersebut secara aktif. Contoh penerapan subclass ini adalah Instagram, Twitter, atau Facebook.

<img width="779" height="66" alt="image" src="https://github.com/user-attachments/assets/ffe7b07c-351f-4bec-b8ed-64e13d1e5763" />

Edukasi juga mewarisi atribut umum dari Aplikasi dan menambahkan atribut tingkatPendidikan untuk membedakan level pendidikan pengguna yang dituju, misalnya aplikasi untuk SD, SMP, SMA, atau perguruan tinggi. Contoh aplikasinya seperti Duolingo atau Ruangguru.

<img width="616" height="65" alt="image" src="https://github.com/user-attachments/assets/a1d52fac-812d-40e1-9e35-ebbd12d9d901" />

Game adalah subclass dari Aplikasi yang menambahkan atribut genre untuk membedakan jenis permainan, misalnya Action, RPG, Puzzle, atau MOBA. Dengan atribut tambahan ini, aplikasi game dapat dikategorikan lebih detail sesuai gaya permainannya.

<img width="559" height="63" alt="image" src="https://github.com/user-attachments/assets/59dcd820-ff11-4cd2-b8cf-8885b6e4f608" />

AplikasiPembantu mewarisi atribut dari Aplikasi dan menambahkan atribut membutuhkanInternet berupa nilai boolean (true/false) untuk menandakan apakah aplikasi utility tersebut harus terhubung ke internet atau bisa berjalan secara offline. Contoh aplikasinya adalah antivirus, cleaner, atau file manager.


### Overriding
Overriding digunakan pada method toString().
Superclass Aplikasi sudah memiliki toString() untuk menampilkan data umum, lalu setiap subclass menimpa (override) method ini untuk menambahkan informasi khusus.
bisa dilihat dibawah ini jika semua menjadi string lagi karena di timpa dengna override

<img width="696" height="86" alt="image" src="https://github.com/user-attachments/assets/3af49910-5686-4059-bc4b-81326aabfd94" />


### Alur Terbaru

Pada alur terbaru, program diawali dengan menampilkan menu utama yang berisi pilihan Tambah Aplikasi, Tampilkan Aplikasi, Update, Hapus, Cari, dan Keluar. Saat pengguna memilih Tambah Aplikasi, program tidak langsung membuat objek Aplikasi umum, melainkan memberikan opsi untuk memilih jenis aplikasi yang ingin ditambahkan, yaitu Game, Aplikasi Pembantu, Sosial Media, atau Edukasi. Setelah jenis dipilih, pengguna diminta mengisi data umum aplikasi (nama, developer, versi, rating, jumlah download, kategori, deskripsi, ukuran file) dan juga data khusus sesuai subclass yang dipilih misalnya genre untuk Game.

<img width="583" height="554" alt="image" src="https://github.com/user-attachments/assets/8ed6251a-28c8-45aa-917a-2e3b9c10fff1" />



