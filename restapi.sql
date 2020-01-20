-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2019 at 03:36 PM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restapi`
--

-- --------------------------------------------------------

--
-- Table structure for table `blog`
--

CREATE TABLE `blog` (
  `id` int(6) UNSIGNED NOT NULL,
  `title` varchar(500) COLLATE utf8mb4_unicode_ci NOT NULL,
  `content` varchar(5000) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `blog`
--

INSERT INTO `blog` (`id`, `title`, `content`) VALUES
(1, 'updated ke2 title', 'updated ke2 content'),
(2, 'updated title', 'updated content');

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE `user_info` (
  `id` int(6) UNSIGNED NOT NULL,
  `username` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(500) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fullname` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`id`, `username`, `password`, `fullname`) VALUES
(1, 'coba@gmail.com', '$2a$10$qxAzcllXAErRI/XlHYDiROwbBUmaUeN3PKrAOk6U2ESXCBwxmv3.m', 'Donald Cuong'),
(2, 'pertama@gmail.com', '$2a$10$n7QRkWXVA7TogZD4VL9FxeWY5lJ1QNjCovS/X9PQXhmuJBXF5BJjO', 'Pertama tama'),
(3, 'kedua', '$2a$10$X3WZtBZDrE7FkkeX5hnVB.saPcYT6zHyYMy6JfSMFsTWt/lQGddFC', 'Kedua dua'),
(4, 'ketiga', '$2a$10$Q2akybg8pCSWz0IUR/o2luq3W.makm12ptgenqKCFauiwfQfMAuri', 'Ketiga tiga'),
(5, 'kelima', '$2a$10$VRq8Wy9021zF37TpuaZHbuziRBkmpKkTJrlRjQgn3W6TdbUIW0nSW', 'Kelima lma'),
(6, 'keenam', '$2a$10$8gLTdlG6Sxiwb2XoC9SWPO3LI9HRLLcjrbi4SJ4osQBIMv.E5OSBG', 'Keenam enam'),
(7, 'kedel', '$2a$10$VFVKvFn8otM17uUJ8EtLle.S.pTiOFKmVu1wbpewGDxwq20Z3LSqG', 'Kedel del'),
(8, 'baru', '$2a$10$7X8.y8ft8Vvf89RmFQiQaeIZnQ0iISu5vo3JgAHg424FVPfGIUJd.', 'Baru del'),
(9, 'user', '$2a$10$Zh0H2BrOgisOQyovz8vcgOnP5I3u9R57URzvx3nksqmKbdOpcyOz.', 'Coba maping user'),
(10, 'mencoba', '$2a$10$JY3mlwiFE5nNFIRo2uW4rOl6IJ2Zl9GfUo9rUzpHjrzNC1qLQC2ES', 'Mencoba kembali'),
(11, 'mencobalagi', '$2a$10$ViYqKzH3LZI9gfscjhLZAuIt8cxxIgZqCha.J2ezvXyeRaFp7shhW', 'fullnamenya'),
(12, 'teruscoba', '$2a$10$s.D/FeKjSLDt1SxKwRSuTOv5zImnnjnYOgMDEvvJsqHGiiHXBA0k6', 'namanya juga nyoba'),
(13, 'cobalagidong', '$2a$10$azw1oF/kYF/vlIJROHA/jOzSiTDJ2vTiwk2e/QDQ3TKegy1Zp8P/m', 'coba aja'),
(14, 'makindicoba', '$2a$10$vpyEPD2oP6ugopcmXsAGiOM7EXQhFQ5eX5WfCD1Q5X0pZ9cpnf36e', 'Makin dicoba'),
(15, 'cobaaa', '$2a$10$biJVFvvrU/xFtBT6/JnQwe.IiKvhpPK4rWWhO58z2gr948pHLyG5y', 'Makin dicobaaaa'),
(17, 'xxxxxx', '$2a$10$Z5k4/Esra58pxsxRE7jVHepzUa/56ASo3EdTe6FCB0ZWz2oINhdOa', 'xxxx xxxxx'),
(18, 'harikedua', '$2a$10$fRrcYrZ6wbSB7YZrCuIl6eY1dn6PPKJtzG7wu0fR3OAFRdJh8S4aG', 'Percobaan hari kedua'),
(19, 'endpointregister', '$2a$10$UxSDkz1bBncc60aJq2Vp5OICdEP0eVEyC47TXH4AMFbhlBTYMOWgO', 'Endpoint diganti register'),
(20, 'registertotall', '$2a$10$WVUrpwnocaPlm7OVeBH23OH1E0r.g/m1QKX1CoSTVku9JkSxRY/7a', 'Register totall'),
(21, 'finaltest', '$2a$10$aNqlxf3HgtMwrcTAicqFIOl8N6e6XLVl1704O3QOqrssVQ8UdJsl2', 'Final test');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `blog`
--
ALTER TABLE `blog`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_info`
--
ALTER TABLE `user_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `blog`
--
ALTER TABLE `blog`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user_info`
--
ALTER TABLE `user_info`
  MODIFY `id` int(6) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
