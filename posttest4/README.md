# Nama : Chiqo Nanda Rial Pratama
# NIM : 2409116046
# Tema : Manajemen Aplikasi/Tools (AppStore)
# Posttest 4

## Deskripsi Singkat Program
Program ini merupakan sistem manajemen aplikasi sederhana (mirip App Store) dengan operasi CRUD (Create, Read, Update, Delete) serta fitur pencarian. Pengguna dapat menambahkan aplikasi baru, melihat daftar aplikasi, mengupdate aplikasi, menghapus aplikasi, dan mencari aplikasi berdasarkan nama. Program dibuat dengan konsep Pemrograman Berorientasi Objek (OOP), menerapkan MVC (Model-View-Controller), serta dilengkapi validasi input.

## Struktur Project
<img width="425" height="256" alt="image" src="https://github.com/user-attachments/assets/ef4011b5-80ee-421b-8a4e-88d427198888" />


Terdapat 3 Package dipemrograman ini dimana setiap packagenya mempunyai fungsi masing masing, yaitu:
- Package Main berisi Main.java sebagai entry point program dan menu interaksi user. (View)

- Package Model berisi class Aplikasi yang menyimpan struktur data, atribut, constructor, getter & setter. (Model)

- Package Service berisi class AplikasiService yang mengatur logika CRUD dan validasi input. (Controller)

Ada beberapa perubahan terbaru didalam package Model dimana penambahan DeskripsiApp sebagai Interface java lalu juga ada perubahan diAplikasi dimana sekarang berubah menjadi Abstract yang berguna untuk turunan dari aplikasi aplikasi lain




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

### Abstraction

Aplikasi dijadikan abstract class karena berfungsi sebagai kerangka dasar bagi semua jenis aplikasi yang ada di sistem. Di dalamnya terkumpul atribut umum seperti nama, developer, versi, rating, jumlah download, kategori, deskripsi, dan ukuran file, yang pasti dimiliki oleh setiap aplikasi tanpa memandang jenisnya.

<img width="661" height="234" alt="image" src="https://github.com/user-attachments/assets/5dc80021-c25e-4a8b-a55a-def82a5de645" />

Dengan adanya method abstract infoSingkat(), class ini memaksa setiap subclass untuk mendefinisikan sendiri bagaimana ringkasan aplikasinya ditampilkan, sehingga meskipun semua aplikasi memiliki struktur dasar yang sama, detail informasinya bisa berbeda sesuai konteks masing-masing. Abstraksi ini memastikan konsistensi sekaligus memberi fleksibilitas dalam pengembangan program.

<img width="511" height="76" alt="image" src="https://github.com/user-attachments/assets/0372b9ee-c5af-43e5-b792-b52057c47097" />

DeskripsiApp dibuat sebagai interface yang mendefinisikan kontrak wajib bagi setiap class yang mengimplementasikannya, yaitu menyediakan method detailDeskripsi(). Interface ini tidak berisi implementasi, melainkan hanya aturan yang harus diikuti, sehingga setiap subclass bebas menentukan bagaimana deskripsi detail aplikasinya ingin ditampilkan.

<img width="509" height="103" alt="image" src="https://github.com/user-attachments/assets/2333cefc-4ae5-4898-80d4-42ba0fdabb69" />

Misalnya, class Game bisa menampilkan detail genre.

<img width="680" height="116" alt="image" src="https://github.com/user-attachments/assets/0e22c2d4-6869-4427-a478-91f474924081" />



### Polymorphism

#### Overloading

disini saya membuat overloading walaupun sudah ada tambahaplikasi tapi saya membuat lagi karena adanya perbedaan parameter yang harus disesuaikan

<img width="882" height="110" alt="image" src="https://github.com/user-attachments/assets/75baadfd-95ad-4143-bda0-92998be73de5" />


#### Overriding

untuk override sendiri saya menggunakannya lumayan banyak untuk disetiap jenis aplikasi yang saya pakai contohnya dibawah ini, saya menggunakan override untuk menimpa template yang ada di class aplikasi

<img width="784" height="139" alt="image" src="https://github.com/user-attachments/assets/b6e3a64b-c701-4662-a949-951ef01991a5" />




### Alur Terbaru

Pada alur terbaru, program diawali dengan menampilkan menu utama yang berisi pilihan Tambah Aplikasi, Tampilkan Aplikasi, Update, Hapus, Cari, dan Keluar. Saat pengguna memilih Tambah Aplikasi, program tidak langsung membuat objek Aplikasi umum, melainkan memberikan opsi untuk memilih jenis aplikasi yang ingin ditambahkan, yaitu Game, Aplikasi Pembantu, Sosial Media, atau Edukasi. Setelah jenis dipilih, pengguna diminta mengisi data umum aplikasi (nama, developer, versi, rating, jumlah download, kategori, deskripsi, ukuran file) dan juga data khusus sesuai subclass yang dipilih misalnya genre untuk Game.

<img width="583" height="554" alt="image" src="https://github.com/user-attachments/assets/8ed6251a-28c8-45aa-917a-2e3b9c10fff1" />

