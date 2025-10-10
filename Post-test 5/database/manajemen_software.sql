-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2025 at 04:13 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `manajemen_software`
--

-- --------------------------------------------------------

--
-- Table structure for table `aplikasi`
--

CREATE TABLE `aplikasi` (
  `nama` varchar(100) NOT NULL,
  `developer` varchar(100) NOT NULL,
  `versi` varchar(20) DEFAULT NULL,
  `rating` double DEFAULT NULL,
  `jumlahDownload` bigint(20) DEFAULT NULL,
  `kategori` varchar(50) DEFAULT NULL,
  `deskripsi` text DEFAULT NULL,
  `ukuranFile` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `aplikasi`
--

INSERT INTO `aplikasi` (`nama`, `developer`, `versi`, `rating`, `jumlahDownload`, `kategori`, `deskripsi`, `ukuranFile`) VALUES
('Canva', 'Canva Pty Ltd.', '3.205.1', 4.7, 500000000, 'Desain Grafis', 'Aplikasi desain visual dengan template untuk poster, logo, dan media sosial.', 120.7),
('Duolingo', 'Duolingo Inc.', '5.210.4', 4.8, 100000000, 'Pendidikan', 'Aplikasi belajar bahasa interaktif dengan sistem level dan poin.', 56.9),
('Gojek', 'PT Aplikasi Karya Anak Bangsa', '5.77.1', 4.5, 100000000, 'Transportasi', 'Aplikasi superapp Indonesia untuk ojek online, pesan makanan, dan keuangan.', 145.9),
('Google Maps', 'Google LLC', '11.130.1', 4.2, 10000000000, 'Navigasi', 'Aplikasi peta dan navigasi dengan panduan arah, lalu lintas, dan tempat.', 72.3),
('Google Meet', 'Google LLC', '250.0.627', 4.2, 1000000000, 'Produktivitas', 'Aplikasi rapat online dengan integrasi Google Workspace.', 80.6),
('Grab', 'Grab Holdings', '5.310.0', 4.4, 500000000, 'Transportasi', 'Aplikasi layanan transportasi, pengiriman, dan pembayaran digital.', 138.2),
('Instagram', 'Meta Platforms', '320.0.0.18.109', 4.4, 1000000000, 'Media Sosial', 'Aplikasi berbagi foto dan video dengan fitur story dan reels.', 95.3),
('Microsoft Teams', 'Microsoft Corporation', '1416/1.0.0.202420380', 4.1, 100000000, 'Produktivitas', 'Platform kolaborasi tim dengan chat, rapat, dan file sharing.', 130.3),
('Netflix', 'Netflix Inc.', '8.124.0', 4.4, 1000000000, 'Hiburan', 'Layanan streaming film dan serial dengan berbagai genre populer.', 175.4),
('Shopee', 'Shopee', '3.21.16', 4.5, 500000000, 'Belanja Online', 'Marketplace online dengan berbagai produk dan promo gratis ongkir.', 135.8),
('ShopeePay', 'Shopee', '2.10.3', 4.5, 500000000, 'Keuangan', 'Dompet digital untuk transaksi cepat dan aman di Shopee dan merchant lainnya.', 64.8),
('Spotify', 'Spotify AB', '9.2.5', 4.4, 1000000000, 'Musik & Audio', 'Layanan streaming musik dengan playlist dan rekomendasi personal.', 85.4),
('Telegram', 'Telegram FZ-LLC', '10.7.2', 4.5, 1000000000, 'Komunikasi', 'Aplikasi pesan cepat dengan keamanan tinggi dan cloud-based.', 65.4),
('TikTok', 'ByteDance Ltd.', '35.1.4', 4.5, 1000000000, 'Hiburan', 'Platform video pendek dengan berbagai fitur kreatif dan musik populer.', 98.6),
('Tokopedia', 'PT Tokopedia', '3.22.2', 4.5, 100000000, 'Belanja Online', 'Marketplace Indonesia dengan fitur cicilan, promo, dan pengiriman cepat.', 128.6),
('Traveloka', 'Traveloka', '3.107.1', 4.6, 100000000, 'Gaya Hidup', 'Aplikasi pemesanan tiket pesawat, hotel, dan aktivitas wisata.', 115.2),
('Twitter', 'X Corp.', '10.38.0', 4.1, 1000000000, 'Media Sosial', 'Platform microblogging untuk berbagi pesan singkat dan berita terkini.', 92.7),
('WhatsApp', 'Meta Platforms', '2.24.18.12', 4.3, 5000000000, 'Komunikasi', 'Aplikasi pesan instan dengan fitur panggilan suara, video, dan berbagi media.', 55.2),
('YouTube', 'Google LLC', '19.34.3', 4.6, 10000000000, 'Hiburan', 'Platform streaming video terbesar di dunia untuk hiburan dan edukasi.', 110.8),
('Zoom', 'Zoom Video Communications', '6.1.5', 4.3, 500000000, 'Produktivitas', 'Aplikasi konferensi video untuk rapat online dan pembelajaran jarak jauh.', 120.5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aplikasi`
--
ALTER TABLE `aplikasi`
  ADD PRIMARY KEY (`nama`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
