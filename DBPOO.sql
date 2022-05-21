--
-- Base de datos: `poo`
--
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema poo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `poo` DEFAULT CHARACTER SET utf8 ;
USE `poo` ;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `audiovisual`
--

CREATE TABLE `audiovisual` (
  `idaudiovisual` int(11) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `tipo` varchar(3) NOT NULL,
  `artista` varchar(45) DEFAULT NULL,
  `genero` varchar(45) DEFAULT NULL,
  `duracion` varchar(45) DEFAULT NULL,
  `canciones` int(11) DEFAULT NULL,
  `director` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `config`
--

CREATE TABLE `config` (
  `idconfig` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `valor` int(11) NOT NULL,
  `estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `escrito`
--

CREATE TABLE `escrito` (
  `idescrito` int(11) NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `tipo` varchar(3) NOT NULL,
  `autor` varchar(45) DEFAULT NULL,
  `num_pag` int(11) DEFAULT NULL,
  `editorial` varchar(45) DEFAULT NULL,
  `isbn` varchar(16) DEFAULT NULL,
  `periodicidad` varchar(25) DEFAULT NULL,
  `publicacion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `material`
--

CREATE TABLE `material` (
  `codigo` varchar(8) NOT NULL,
  `catalogacion` varchar(45) NOT NULL,
  `cantidad_total` int(11) NOT NULL,
  `cantidad_disponible` int(11) NOT NULL,
  `tiempo` int(11) NOT NULL,
  `idescrito` int(11) DEFAULT NULL,
  `idaudiovisual` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `materiales_vista`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `materiales_vista` (
`codigo` varchar(8)
,`idescrito` int(11)
,`idaudiovisual` int(11)
,`autor` varchar(45)
,`num_pag` int(11)
,`editorial` varchar(45)
,`isbn` varchar(16)
,`periodicidad` varchar(25)
,`publicacion` int(11)
,`artista` varchar(45)
,`genero` varchar(45)
,`duracion` varchar(45)
,`canciones` int(11)
,`director` varchar(45)
,`titulo` varchar(45)
,`catalogacion` varchar(45)
,`tiempo` int(11)
,`cantidad_total` int(11)
,`cantidad_disponible` int(11)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `idprestamo` int(11) NOT NULL,
  `fechaprestamo` date DEFAULT NULL,
  `fechaentrega` date DEFAULT NULL,
  `mora` decimal(4,0) DEFAULT NULL,
  `codigo` varchar(8) NOT NULL,
  `idsocio` int(11) NOT NULL,
  `idreserva` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idreserva` int(11) NOT NULL,
  `fechareserva` date DEFAULT NULL,
  `estado` varchar(11) DEFAULT NULL,
  `codigo` varchar(8) NOT NULL,
  `idusuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `identificacion` varchar(11) DEFAULT NULL,
  `usuario` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `nivel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura para la vista `materiales_vista`
--
DROP TABLE IF EXISTS `materiales_vista`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `materiales_vista`  AS SELECT `m`.`codigo` AS `codigo`, `m`.`idescrito` AS `idescrito`, `m`.`idaudiovisual` AS `idaudiovisual`, `l`.`autor` AS `autor`, `l`.`num_pag` AS `num_pag`, `l`.`editorial` AS `editorial`, `l`.`isbn` AS `isbn`, `l`.`periodicidad` AS `periodicidad`, `l`.`publicacion` AS `publicacion`, `r`.`artista` AS `artista`, `r`.`genero` AS `genero`, `r`.`duracion` AS `duracion`, `r`.`canciones` AS `canciones`, `r`.`director` AS `director`, CASE WHEN `m`.`idescrito` is not null THEN `l`.`titulo` WHEN `m`.`idaudiovisual` is not null THEN `r`.`titulo` ELSE NULL END AS `titulo`, `m`.`catalogacion` AS `catalogacion`, `m`.`tiempo` AS `tiempo`, `m`.`cantidad_total` AS `cantidad_total`, `m`.`cantidad_disponible` AS `cantidad_disponible` FROM ((`material` `m` left join `escrito` `l` on(`m`.`idescrito` = `l`.`idescrito`)) left join `audiovisual` `r` on(`m`.`idaudiovisual` = `r`.`idaudiovisual`))  ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `audiovisual`
--
ALTER TABLE `audiovisual`
  ADD PRIMARY KEY (`idaudiovisual`);

--
-- Indices de la tabla `config`
--
ALTER TABLE `config`
  ADD PRIMARY KEY (`idconfig`);

--
-- Indices de la tabla `escrito`
--
ALTER TABLE `escrito`
  ADD PRIMARY KEY (`idescrito`);

--
-- Indices de la tabla `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`codigo`),
  ADD UNIQUE KEY `codigo_UNIQUE` (`codigo`),
  ADD UNIQUE KEY `idescrito_UNIQUE` (`idescrito`),
  ADD UNIQUE KEY `idaudiovisual_UNIQUE` (`idaudiovisual`),
  ADD KEY `fk_material_escrito1_idx` (`idescrito`),
  ADD KEY `fk_material_audiovisual1_idx` (`idaudiovisual`);

--
-- Indices de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD PRIMARY KEY (`idprestamo`,`codigo`,`idsocio`),
  ADD KEY `fk_Prestamos_Socio` (`idsocio`),
  ADD KEY `fk_prestamos_Material1_idx` (`codigo`),
  ADD KEY `fk_prestamos_reserva2_idx` (`idreserva`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idreserva`,`codigo`,`idusuario`),
  ADD KEY `fk_reserva_material1_idx` (`codigo`),
  ADD KEY `fk_reserva_usuario1_idx` (`idusuario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`),
  ADD UNIQUE KEY `usuario_UNIQUE` (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `audiovisual`
--
ALTER TABLE `audiovisual`
  MODIFY `idaudiovisual` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `config`
--
ALTER TABLE `config`
  MODIFY `idconfig` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `escrito`
--
ALTER TABLE `escrito`
  MODIFY `idescrito` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `prestamos`
--
ALTER TABLE `prestamos`
  MODIFY `idprestamo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `material`
--
ALTER TABLE `material`
  ADD CONSTRAINT `fk_material_audiovisual1` FOREIGN KEY (`idaudiovisual`) REFERENCES `audiovisual` (`idaudiovisual`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_material_escrito1` FOREIGN KEY (`idescrito`) REFERENCES `escrito` (`idescrito`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD CONSTRAINT `fk_Prestamos_Socio` FOREIGN KEY (`idsocio`) REFERENCES `usuario` (`idusuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_prestamos_Material1` FOREIGN KEY (`codigo`) REFERENCES `material` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_prestamos_reserva1` FOREIGN KEY (`idreserva`) REFERENCES `reserva` (`idreserva`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `fk_reserva_material1` FOREIGN KEY (`codigo`) REFERENCES `material` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_reserva_usuario1` FOREIGN KEY (`idusuario`) REFERENCES `usuario` (`idusuario`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
