-- MySQL Script generated by MySQL Workbench
-- Sun May  8 19:11:12 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema poo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `poo` DEFAULT CHARACTER SET utf8 ;
USE `poo` ;

-- -----------------------------------------------------
-- Table `poo`.`escrito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`escrito` (
  `idescrito` INT(11) NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(3) NULL DEFAULT NULL,
  PRIMARY KEY (`idescrito`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `poo`.`revista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`revista` (
  `idrevistas` INT(11) NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NULL DEFAULT NULL,
  `editorial` VARCHAR(45) NOT NULL,
  `periodicidad` VARCHAR(45) NOT NULL,
  `publicacion` YEAR(4) NOT NULL,
  `idEscrito` INT(11) NOT NULL,
  PRIMARY KEY (`idrevistas`, `idEscrito`),
  INDEX `fk_revista_escrito1_idx` (`idEscrito` ASC),
  CONSTRAINT `fk_revista_escrito1`
    FOREIGN KEY (`idEscrito`)
    REFERENCES `poo`.`escrito` (`idescrito`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `poo`.`libros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`libros` (
  `idlibros` INT(11) NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `autor` VARCHAR(45) NOT NULL,
  `num_pag` INT(11) NOT NULL,
  `editorial` VARCHAR(45) NOT NULL,
  `isbn` VARCHAR(16) NOT NULL,
  `idescrito` INT(11) NOT NULL,
  PRIMARY KEY (`idlibros`, `idescrito`),
  INDEX `fk_libros_escrito1_idx` (`idescrito` ASC),
  CONSTRAINT `fk_libros_escrito1`
    FOREIGN KEY (`idescrito`)
    REFERENCES `poo`.`escrito` (`idescrito`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `poo`.`audiovisual`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`audiovisual` (
  `idaudioVisual` INT(11) NOT NULL,
  `tipo` VARCHAR(3) NULL DEFAULT NULL,
  PRIMARY KEY (`idaudioVisual`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `poo`.`m_cd`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`m_cd` (
  `idm_cd` INT(11) NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NULL DEFAULT NULL,
  `artista` VARCHAR(45) NOT NULL,
  `genero` VARCHAR(45) NOT NULL,
  `duracion` VARCHAR(45) NOT NULL,
  `canciones` INT(11) NOT NULL,
  `idaudioVisual` INT(11) NOT NULL,
  PRIMARY KEY (`idm_cd`, `idaudioVisual`),
  INDEX `fk_m_cd_audiovisual1_idx` (`idaudioVisual` ASC),
  CONSTRAINT `fk_m_cd_audiovisual1`
    FOREIGN KEY (`idaudioVisual`)
    REFERENCES `poo`.`audiovisual` (`idaudioVisual`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `poo`.`m_dvd`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`m_dvd` (
  `idm_dvd` INT(11) NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NULL DEFAULT NULL,
  `director` VARCHAR(45) NULL DEFAULT NULL,
  `duracion` VARCHAR(45) NULL DEFAULT NULL,
  `genero` VARCHAR(45) NULL DEFAULT NULL,
  `idAudioVisual` INT(11) NOT NULL,
  PRIMARY KEY (`idm_dvd`, `idAudioVisual`),
  INDEX `fk_m_dvd_audiovisual1_idx` (`idAudioVisual` ASC),
  CONSTRAINT `fk_m_dvd_audiovisual1`
    FOREIGN KEY (`idAudioVisual`)
    REFERENCES `poo`.`audiovisual` (`idaudioVisual`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `poo`.`material`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`material` (
  `codigo` VARCHAR(8) NOT NULL,
  `catalogacion` VARCHAR(45) NOT NULL,
  `cantidad_total` INT(11) NOT NULL,
  `cantidad_disponible` INT(11) NOT NULL,
  `tiempo` INT NOT NULL,
  `idrevistas` INT(11) NULL DEFAULT NULL,
  `idlibros` INT(11) NULL DEFAULT NULL,
  `idm_cd` INT(11) NULL DEFAULT NULL,
  `idm_dvd` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo` ASC) ,
  INDEX `fk_Detalles_revista1_idx` (`idrevistas` ASC) ,
  INDEX `fk_Detalles_libros1_idx` (`idlibros` ASC) ,
  INDEX `fk_Detalles_m_cd1_idx` (`idm_cd` ASC),
  INDEX `fk_Detalles_m_dvd1_idx` (`idm_dvd` ASC) ,
  UNIQUE INDEX `id_revistas_UNIQUE` (`idrevistas` ASC),
  UNIQUE INDEX `id_libros_UNIQUE` (`idlibros` ASC),
  UNIQUE INDEX `id_M_CD_UNIQUE` (`idm_cd` ASC),
  UNIQUE INDEX `id_M_DVD_UNIQUE` (`idm_dvd` ASC),
  CONSTRAINT `fk_Detalles_revista1`
    FOREIGN KEY (`idrevistas`)
    REFERENCES `poo`.`revista` (`idrevistas`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Detalles_libros1`
    FOREIGN KEY (`idlibros`)
    REFERENCES `poo`.`libros` (`idlibros`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Detalles_m_cd1`
    FOREIGN KEY (`idm_cd`)
    REFERENCES `poo`.`m_cd` (`idm_cd`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Detalles_m_dvd1`
    FOREIGN KEY (`idm_dvd`)
    REFERENCES `poo`.`m_dvd` (`idm_dvd`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`reserva`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`reserva` (
  `idreserva` INT NOT NULL AUTO_INCREMENT,
  `fechareserva` DATE NULL,
  `estado` VARCHAR(45) NULL,
  `codigo` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`idreserva`, `codigo`),
  INDEX `fk_reserva_material_idx` (`codigo` ASC) ,
  CONSTRAINT `fk_reserva_material`
    FOREIGN KEY (`codigo`)
    REFERENCES `poo`.`material` (`codigo`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`config`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`config` (
  `idconfig` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(50) NOT NULL,
  `valor` INT NOT NULL,
  `estado` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`idconfig`))
ENGINE = InnoDB;

USE `poo` ;

-- -----------------------------------------------------
-- Table `poo`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`usuario` (
  `idusuario` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `identificacion` VARCHAR(11) NULL,
  `usuario` VARCHAR(10) NOT NULL,
  `password` VARCHAR(10) NULL DEFAULT NULL,
  `nivel` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE INDEX `usuario_UNIQUE` (`usuario` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `poo`.`prestamos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`prestamos` (
  `idprestamo` INT(11) NOT NULL AUTO_INCREMENT,
  `fechaprestamo` DATE NULL DEFAULT NULL,
  `fechaentrega` DATE NOT NULL,
  `mora` DECIMAL(4) NULL,
  `codigo` VARCHAR(8) NOT NULL,
  `idsocio` INT(11) NOT NULL,
  `idreserva` INT NULL,
  PRIMARY KEY (`idprestamo`, `codigo`, `idsocio`),
  INDEX `fk_Prestamos_Socio` (`idsocio` ASC) ,
  INDEX `fk_prestamos_Material1_idx` (`codigo` ASC) ,
  INDEX `fk_prestamos_reserva1_idx` (`idreserva` ASC),
  CONSTRAINT `fk_Prestamos_Socio`
    FOREIGN KEY (`idsocio`)
    REFERENCES `poo`.`usuario` (`idusuario`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_prestamos_Material1`
    FOREIGN KEY (`codigo`)
    REFERENCES `poo`.`material` (`codigo`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_prestamos_reserva1`
    FOREIGN KEY (`idreserva`)
    REFERENCES `mydb`.`reserva` (`idreserva`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
