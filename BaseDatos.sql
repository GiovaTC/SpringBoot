-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-01-2022 a las 23:03:28
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `unidad` varchar(20) DEFAULT NULL,
  `precio` double NOT NULL,
  `etiqueta` varchar(30) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  `valorcot` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `unidad`, `precio`, `etiqueta`, `descripcion`, `cantidad`, `valorcot`) VALUES
(1, '[Metro 2]', 40000, '[Tableta]', '[Tableta para piso]', 2, 80000),
(2, 'Metro 2', 30000, 'Tableta', 'Tableta para pared', 4, 120000),
(3, 'Metro', 10000, 'Tela Jean', 'Tela para jeans', 6, 60000),
(6, 'Litro', 3600, 'Leche', 'Leche de vaca', 8, 28800),
(7, 'Kilo', 4500, 'Acero HSS', 'Acero Hss para CNC', 10, 45000),
(8, 'Metro 2', 20000, 'Instalación Tableta Piso', 'Es fijo: False', 2, 40000),
(9, 'Metro 2', 20000, 'Instalación tableta pared', 'es fijo: False', 4, 80000),
(10, 'Unidad', 100000, 'Toma de medidas', 'es fijo: true\r\nSolo se permite una única cotización\r\npara un servicio fijo.', 1, 100000),
(11, 'Litro', 200, 'Pasteurización de lácteos', 'es fijo: false\r\nPasteurización de lácteos por litro.', 2, 400),
(12, 'Metro 2', 40000, 'Tableta ', 'Tableta de pared', 0, 0);

--
-- Disparadores `producto`
--
DELIMITER $$
CREATE TRIGGER `multiplica_campo` BEFORE INSERT ON `producto` FOR EACH ROW BEGIN
          SET new.valorcot = new.cantidad * new.precio;
        END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `unidades`
--

CREATE TABLE `unidades` (
  `centimetro` int(11) NOT NULL,
  `metro` int(11) NOT NULL,
  `metro2` int(11) NOT NULL,
  `gramo` int(11) NOT NULL,
  `kilogramo` int(11) NOT NULL,
  `litro` int(11) NOT NULL,
  `galón` int(11) NOT NULL,
  `Hora/día/mes` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
