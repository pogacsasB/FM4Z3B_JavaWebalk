-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2025. Jan 30. 16:25
-- Kiszolgáló verziója: 10.4.32-MariaDB
-- PHP verzió: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `db_webalk`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `motorbikes`
--

CREATE TABLE `motorbikes` (
  `id` int(11) NOT NULL,
  `brand` varchar(255) NOT NULL,
  `model` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `person_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- A tábla adatainak kiíratása `motorbikes`
--

INSERT INTO `motorbikes` (`id`, `brand`, `model`, `price`, `person_id`) VALUES
(1, 'Kawasaki', 'TMO', 65000, 2),
(3, 'Honda', 'WZE', 26000, 1),
(6, 'Yamaha', 'TWO', 15000, 2);

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `motorbikes`
--
ALTER TABLE `motorbikes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK8iupwddmqwt5ivpa4ghqc5911` (`person_id`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `motorbikes`
--
ALTER TABLE `motorbikes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `motorbikes`
--
ALTER TABLE `motorbikes`
  ADD CONSTRAINT `FK8iupwddmqwt5ivpa4ghqc5911` FOREIGN KEY (`person_id`) REFERENCES `people` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
