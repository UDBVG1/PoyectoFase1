-- MySQL Script generated by MySQL Workbench
-- Wed Apr 13 17:26:39 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema POO
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema POO
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `POO` DEFAULT CHARACTER SET utf8 ;
USE `POO` ;

-- -----------------------------------------------------
-- Table `POO`.`Material`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `POO`.`Material` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `cantidad_T` INT NOT NULL,
  `cantidad_D` INT NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `POO`.`Escrito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `POO`.`Escrito` (
  `idEscrito` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(3) NULL,
  `Material_codigo` INT NOT NULL,
  PRIMARY KEY (`idEscrito`, `Material_codigo`),
  INDEX `fk_Escrito_Material1_idx` (`Material_codigo` ASC),
  CONSTRAINT `fk_Escrito_Material1`
    FOREIGN KEY (`Material_codigo`)
    REFERENCES `POO`.`Material` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `POO`.`Libros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `POO`.`Libros` (
  `id_libros` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(45) NULL,
  `autor` VARCHAR(45) NOT NULL,
  `num_pag` INT NOT NULL,
  `editorial` VARCHAR(45) NOT NULL,
  `Escrito_idEscrito` INT NOT NULL,
  `Escrito_Material_codigo` INT NOT NULL,
  PRIMARY KEY (`id_libros`, `Escrito_idEscrito`, `Escrito_Material_codigo`),
  INDEX `fk_Libros_Escrito1_idx` (`Escrito_idEscrito` ASC, `Escrito_Material_codigo` ASC),
  CONSTRAINT `fk_Libros_Escrito1`
    FOREIGN KEY (`Escrito_idEscrito` , `Escrito_Material_codigo`)
    REFERENCES `POO`.`Escrito` (`idEscrito` , `Material_codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `POO`.`Revista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `POO`.`Revista` (
  `id_revistas` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(45) NULL,
  `editorial` VARCHAR(45) NOT NULL,
  `periodicidad` VARCHAR(45) NOT NULL,
  `publicacion` YEAR(4) NOT NULL,
  `idEscrito` INT NOT NULL,
  `Material_codigo` INT NOT NULL,
  PRIMARY KEY (`id_revistas`, `idEscrito`, `Material_codigo`),
  INDEX `fk_Revista_Escrito1_idx` (`idEscrito` ASC, `Material_codigo` ASC),
  CONSTRAINT `fk_Revista_Escrito1`
    FOREIGN KEY (`idEscrito` , `Material_codigo`)
    REFERENCES `POO`.`Escrito` (`idEscrito` , `Material_codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `POO`.`AudioVisual`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `POO`.`AudioVisual` (
  `idAudioVisual` INT NOT NULL,
  `tipo` VARCHAR(3) NULL,
  `Material_codigo` INT NOT NULL,
  PRIMARY KEY (`idAudioVisual`, `Material_codigo`),
  INDEX `fk_AudioVisual_Material1_idx` (`Material_codigo` ASC),
  CONSTRAINT `fk_AudioVisual_Material1`
    FOREIGN KEY (`Material_codigo`)
    REFERENCES `POO`.`Material` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `POO`.`M_CD`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `POO`.`M_CD` (
  `id_M_CD` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(45) NULL,
  `artista` VARCHAR(45) NOT NULL,
  `genero` VARCHAR(45) NOT NULL,
  `duracion` VARCHAR(45) NOT NULL,
  `canciones` INT NOT NULL,
  `AudioVisual_idAudioVisual` INT NOT NULL,
  `AudioVisual_Material_codigo` INT NOT NULL,
  PRIMARY KEY (`id_M_CD`, `AudioVisual_idAudioVisual`, `AudioVisual_Material_codigo`),
  INDEX `fk_M_CD_AudioVisual1_idx` (`AudioVisual_idAudioVisual` ASC, `AudioVisual_Material_codigo` ASC),
  CONSTRAINT `fk_M_CD_AudioVisual1`
    FOREIGN KEY (`AudioVisual_idAudioVisual` , `AudioVisual_Material_codigo`)
    REFERENCES `POO`.`AudioVisual` (`idAudioVisual` , `Material_codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `POO`.`M_DVD`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `POO`.`M_DVD` (
  `id_M_DVD` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(45) NULL,
  `director` VARCHAR(45) NULL DEFAULT NULL,
  `duracion` VARCHAR(45) NULL DEFAULT NULL,
  `genero` VARCHAR(45) NULL DEFAULT NULL,
  `AudioVisual_idAudioVisual` INT NOT NULL,
  `AudioVisual_Material_codigo` INT NOT NULL,
  PRIMARY KEY (`id_M_DVD`, `AudioVisual_idAudioVisual`, `AudioVisual_Material_codigo`),
  INDEX `fk_M_DVD_AudioVisual1_idx` (`AudioVisual_idAudioVisual` ASC, `AudioVisual_Material_codigo` ASC),
  CONSTRAINT `fk_M_DVD_AudioVisual1`
    FOREIGN KEY (`AudioVisual_idAudioVisual` , `AudioVisual_Material_codigo`)
    REFERENCES `POO`.`AudioVisual` (`idAudioVisual` , `Material_codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `POO`.`Socio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `POO`.`Socio` (
  `idSocio` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `usuario` VARCHAR(10) NOT NULL,
  `password` VARCHAR(10) NULL,
  `nivel` INT NULL,
  PRIMARY KEY (`idSocio`),
  UNIQUE INDEX `usuario_UNIQUE` (`usuario` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `POO`.`Prestamos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `POO`.`Prestamos` (
  `Id_prestamo` INT NOT NULL AUTO_INCREMENT,
  `Socio_idSocio` INT NOT NULL,
  `Fecha_prestamo` DATE NULL,
  `Material_codigo` INT NOT NULL,
  `Tipo_mov` VARCHAR(5) NULL,
  PRIMARY KEY (`Id_prestamo`, `Socio_idSocio`, `Material_codigo`),
  INDEX `fk_Prestamos_Material1_idx` (`Material_codigo` ASC),
  CONSTRAINT `fk_Prestamos_Socio`
    FOREIGN KEY (`Socio_idSocio`)
    REFERENCES `POO`.`Socio` (`idSocio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Prestamos_Material1`
    FOREIGN KEY (`Material_codigo`)
    REFERENCES `POO`.`Material` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
