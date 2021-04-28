-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Apr 2021 pada 14.39
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jadwal_pelajaran`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_guru`
--

CREATE TABLE `tb_guru` (
  `id_guru` int(100) NOT NULL,
  `nip` int(100) NOT NULL,
  `nama_guru` varchar(225) NOT NULL,
  `tempat_lahir` varchar(225) NOT NULL,
  `tgl_lahir` varchar(225) NOT NULL,
  `alamat` text NOT NULL,
  `no_telepon` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_guru`
--

INSERT INTO `tb_guru` (`id_guru`, `nip`, `nama_guru`, `tempat_lahir`, `tgl_lahir`, `alamat`, `no_telepon`) VALUES
(1, 2147483647, 'Ananta Wira ', 'Malang', '32 Januari 2020', 'JL. Malang 1', '082166699988'),
(2, 2147483647, 'Aldy Yuan ', 'Donomulyo', '33 Januari 2020', 'JL. Gadang 2', '082133355577'),
(3, 2147483647, 'M. Tegar', 'Malang', '34 Januari 2020', 'JL. Sawojajar 2', '082177788800'),
(5, 2147483647, 'M. Hanafi', 'Malang', '35 Januari 2020', 'JL. Sawojajar 6', '082122244478'),
(7, 123456, 'Contoh', 'Malang', '6 Maret 2020', 'Jl Sawojajar', '9879792143'),
(8, 123456, 'Bu Tyas', 'Malang', '1 Januari 2020', 'Jl. Malang', '0809823423');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_jadwal_mapel`
--

CREATE TABLE `tb_jadwal_mapel` (
  `id_jadwal_mapel` int(100) NOT NULL,
  `hari` varchar(225) NOT NULL,
  `kelas` varchar(225) NOT NULL,
  `sesi` int(100) NOT NULL,
  `kode_guru` varchar(225) NOT NULL,
  `nama_guru` varchar(225) NOT NULL,
  `mapel` varchar(225) NOT NULL,
  `ruang_kelas` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_jadwal_mapel`
--

INSERT INTO `tb_jadwal_mapel` (`id_jadwal_mapel`, `hari`, `kelas`, `sesi`, `kode_guru`, `nama_guru`, `mapel`, `ruang_kelas`) VALUES
(2, 'Senin', 'XII RPL-B', 2, 'BD-Ananta', 'Ananta Wira ', 'Basis Data', 'Ruang 1'),
(3, 'Senin', 'XII RPL-B', 3, 'BD-Ananta', 'Ananta Wira ', 'Basis Data', 'Ruang 1'),
(5, 'Senin', 'XII RPL-B', 5, 'MAT-Amir', 'Amiruddin', 'Matematika', 'Ruang 5'),
(6, 'Senin', 'XII RPL-B', 6, 'MAT-Amir', 'Amiruddin', 'Matematika', 'Ruang 5'),
(7, 'Senin', 'XII RPL-B', 8, 'BIND-Hanafi', 'M. Hanafi', 'Bhs Indonesia', 'Ruang 6'),
(16, '--Pilih Hari--', '--Pilih Jurusan--', 1, 'PBO-Aldy', 'Aldy Yuan ', 'PBO', 'Ruang 5'),
(17, 'Jumat', 'X RPL-B', 1, 'MAT-Amir', 'Amiruddin', 'Matematika', 'Ruang 1'),
(18, 'Kamis', 'X RPL-C', 1, 'BIND-Hanafi', 'M. Hanafi', 'Bhs Indonesia', 'Ruang 9 '),
(19, 'Kamis', 'X RPL-C', 2, 'MAT-Amir', 'Amiruddin', 'Matematika', 'Ruang 3'),
(22, 'Kamis', 'X RPL-C', 1, 'PBO-Aldy', 'Aldy Yuan ', 'PBO', 'Ruang 7 '),
(24, 'Rabu', 'XII RPL-A', 1, 'BIND-Hanafi', 'M. Hanafi', 'Bhs Indonesia', 'Ruang 4'),
(25, 'Senin', 'X RPL-C', 1, 'PBO-Aldy', 'Aldy Yuan ', 'PBO', 'Ruang 3'),
(26, 'Senin', 'XI RPL-C', 1, 'MAT-Amir', 'Amiruddin', 'Matematika', 'Ruang 3'),
(27, 'Senin', 'X RPL-B', 1, 'BING-Tegar', 'M. Tegar', 'Bhs Inggris', 'Ruang 2'),
(28, 'Selasa', 'XI RPL-A', 1, 'BING-Tegar', 'M. Tegar', 'Bhs Inggris', 'Ruang 4'),
(29, 'Selasa', 'X RPL-B', 1, 'BIND-Hanafi', 'M. Hanafi', 'Bhs Indonesia', 'Ruang 5'),
(31, 'Rabu', 'XII RPL-A', 1, 'MAT-Amir', 'Amiruddin', 'Matematika', 'Ruang 6'),
(32, 'Rabu', 'X RPL-B', 1, 'MAT-Amir', 'Amiruddin', 'Matematika', 'Ruang 6'),
(33, 'Rabu', 'XI RPL-C', 1, 'BING-Tegar', 'M. Tegar', 'Bhs Inggris', 'Ruang 1'),
(34, 'Kamis', 'XII RPL-A', 1, 'BD-Ananta', 'Ananta Wira ', 'Basis Data', 'Ruang 4'),
(35, 'Kamis', 'XII RPL-B', 1, 'BIND-Hanafi', 'M. Hanafi', 'Bhs Indonesia', 'Ruang 7 '),
(37, 'Jumat', 'XII RPL-C', 1, 'MAT-Amir', 'Amiruddin', 'Matematika', 'Ruang 7 '),
(38, 'Jumat', 'X LOG-B', 1, 'PKK-Contoh', 'Contoh', 'PKK', 'Ruang 30'),
(39, 'Kamis', 'XII MM-C', 1, 'PBO-BuTyas', 'Bu Tyas', 'PBO', 'Ruang 30'),
(40, 'Kamis', 'XII MM-C', 2, 'BIND-Hanafi', 'M. Hanafi', 'Bhs Indonesia', 'Ruang 50'),
(41, 'Kamis', 'XII MM-C', 1, 'PBO-BuTyas', 'Bu Tyas', 'PBO', 'Ruang 3');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_kelas`
--

CREATE TABLE `tb_kelas` (
  `id_kelas` int(11) NOT NULL,
  `ruang_kelas` varchar(225) NOT NULL,
  `jurusan` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_kelas`
--

INSERT INTO `tb_kelas` (`id_kelas`, `ruang_kelas`, `jurusan`) VALUES
(1, 'Ruang 1', 'X RPL-B'),
(2, 'Ruang 2', 'XI RPL-B'),
(3, 'Ruang 3', 'XII RPL-B'),
(4, 'Ruang 4', 'X RPL-A'),
(5, 'Ruang 5', 'XI RPL-A'),
(6, 'Ruang 6', 'XII RPL-A'),
(7, 'Ruang 7 ', 'X RPL-C'),
(8, 'Ruang 9 ', 'XII RPL-C'),
(9, 'Ruang 8', 'XI RPL-C'),
(16, 'Ruang 30', 'X LOG-B'),
(17, 'Ruang 50', 'XII MM-C');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_mapel`
--

CREATE TABLE `tb_mapel` (
  `id_mapel` int(56) NOT NULL,
  `mapel` varchar(225) NOT NULL,
  `nama_guru` varchar(225) NOT NULL,
  `kode_guru` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_mapel`
--

INSERT INTO `tb_mapel` (`id_mapel`, `mapel`, `nama_guru`, `kode_guru`) VALUES
(1, 'Basis Data', 'Ananta Wira ', 'BD-Ananta'),
(2, 'PBO', 'Aldy Yuan ', 'PBO-Aldy'),
(3, 'Bhs Inggris', 'M. Tegar', 'BING-Tegar'),
(4, 'Matematika', 'Amiruddin', 'MAT-Amir'),
(5, 'Bhs Indonesia', 'M. Hanafi', 'BIND-Hanafi'),
(7, 'PKK', 'Contoh', 'PKK-Contoh'),
(8, 'PBO', 'Bu Tyas', 'PBO-BuTyas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(225) NOT NULL,
  `nama` varchar(225) NOT NULL,
  `password` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `username`, `nama`, `password`) VALUES
(1, 'admin', 'Kurikulum', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_guru`
--
ALTER TABLE `tb_guru`
  ADD PRIMARY KEY (`id_guru`);

--
-- Indeks untuk tabel `tb_jadwal_mapel`
--
ALTER TABLE `tb_jadwal_mapel`
  ADD PRIMARY KEY (`id_jadwal_mapel`);

--
-- Indeks untuk tabel `tb_kelas`
--
ALTER TABLE `tb_kelas`
  ADD PRIMARY KEY (`id_kelas`);

--
-- Indeks untuk tabel `tb_mapel`
--
ALTER TABLE `tb_mapel`
  ADD PRIMARY KEY (`id_mapel`);

--
-- Indeks untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_guru`
--
ALTER TABLE `tb_guru`
  MODIFY `id_guru` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `tb_jadwal_mapel`
--
ALTER TABLE `tb_jadwal_mapel`
  MODIFY `id_jadwal_mapel` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT untuk tabel `tb_kelas`
--
ALTER TABLE `tb_kelas`
  MODIFY `id_kelas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT untuk tabel `tb_mapel`
--
ALTER TABLE `tb_mapel`
  MODIFY `id_mapel` int(56) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
