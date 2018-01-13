-- MySQL Workbench Forward Engineering

USE sistema_alocacao_bd;
DROP DATABASE sistema_alocacao_bd;

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema sistema_alocacao_bd
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema sistema_alocacao_bd
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sistema_alocacao_bd` DEFAULT CHARACTER SET utf8 ;
USE `sistema_alocacao_bd` ;

-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`professor` (
  `professor_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `professor_nome` VARCHAR(40) NOT NULL,
  `professor_titulo` VARCHAR(20) NOT NULL,
  `professor_carga_horaria` SMALLINT(3) UNSIGNED NOT NULL,
  `professor_especializacao` TINYTEXT NOT NULL,
  `professor_status` TINYINT(1) NOT NULL,
  PRIMARY KEY (`professor_id`),
  UNIQUE INDEX `idProfessor_UNIQUE` (`professor_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`disciplina`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`disciplina` (
  `disciplina_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `disciplina_nome` VARCHAR(40) NOT NULL,
  `disciplina_carga_horaria` SMALLINT(3) NOT NULL,
  `disciplina_semestre` TINYINT(2) UNSIGNED NOT NULL,
  `disciplina_sub_turma` TINYINT(1) NOT NULL,
  `disciplina_num_aluno` SMALLINT(3) NOT NULL,
  `disciplina_status` TINYINT(1) NOT NULL,
  `disciplina_codigo` TINYTEXT NOT NULL,
  PRIMARY KEY (`disciplina_id`),
  UNIQUE INDEX `idDisciplina_UNIQUE` (`disciplina_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`sala`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`sala` (
  `sala_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `sala_codigo` TINYTEXT NOT NULL,
  `sala_num_aluno` SMALLINT(3) UNSIGNED NOT NULL,
  `sala_localizacao` TINYTEXT NOT NULL,
  `sala_observacao` TINYTEXT NULL,
  PRIMARY KEY (`sala_id`),
  UNIQUE INDEX `idSala_UNIQUE` (`sala_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`horario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`horario` (
  `horario_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `horario_inicial` TIME(2) NOT NULL,
  `horario_final` TIME(2) NOT NULL,
  PRIMARY KEY (`horario_id`),
  UNIQUE INDEX `idHorario_UNIQUE` (`horario_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`turma`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`turma` (
  `turma_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `turma_codigo` TINYTEXT NOT NULL,
  `turma_num_aluno` SMALLINT(3) UNSIGNED NOT NULL,
  `turma_status` TINYINT(1) NOT NULL,
  `turma_turno` TINYTEXT NOT NULL,
  `turma_semestre` SMALLINT(3) NOT NULL,
  PRIMARY KEY (`turma_id`),
  UNIQUE INDEX `semestre_UNIQUE` (`turma_id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`disciplina_turma`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`disciplina_turma` (
  `turma_id` INT UNSIGNED NOT NULL,
  `disciplina_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`turma_id`, `disciplina_id`),
  INDEX `fk_turma_has_disciplina_disciplina1_idx` (`disciplina_id` ASC),
  INDEX `fk_turma_has_disciplina_turma1_idx` (`turma_id` ASC),
  CONSTRAINT `fk_turma_has_disciplina_turma1`
    FOREIGN KEY (`turma_id`)
    REFERENCES `sistema_alocacao_bd`.`turma` (`turma_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_turma_has_disciplina_disciplina1`
    FOREIGN KEY (`disciplina_id`)
    REFERENCES `sistema_alocacao_bd`.`disciplina` (`disciplina_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`disciplina_professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`disciplina_professor` (
  `disciplina_id` INT UNSIGNED NOT NULL,
  `professor_id` INT UNSIGNED NOT NULL,
  `afinidade` SMALLINT(3) NULL,
  PRIMARY KEY (`disciplina_id`, `professor_id`),
  INDEX `fk_disciplina_has_professor_professor1_idx` (`professor_id` ASC),
  INDEX `fk_disciplina_has_professor_disciplina1_idx` (`disciplina_id` ASC),
  CONSTRAINT `fk_disciplina_has_professor_disciplina1`
    FOREIGN KEY (`disciplina_id`)
    REFERENCES `sistema_alocacao_bd`.`disciplina` (`disciplina_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_disciplina_has_professor_professor1`
    FOREIGN KEY (`professor_id`)
    REFERENCES `sistema_alocacao_bd`.`professor` (`professor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`disciplina_sala`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`disciplina_sala` (
  `disciplina_id` INT UNSIGNED NOT NULL,
  `sala_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`disciplina_id`, `sala_id`),
  INDEX `fk_disciplina_has_sala_sala1_idx` (`sala_id` ASC),
  INDEX `fk_disciplina_has_sala_disciplina1_idx` (`disciplina_id` ASC),
  CONSTRAINT `fk_disciplina_has_sala_disciplina1`
    FOREIGN KEY (`disciplina_id`)
    REFERENCES `sistema_alocacao_bd`.`disciplina` (`disciplina_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_disciplina_has_sala_sala1`
    FOREIGN KEY (`sala_id`)
    REFERENCES `sistema_alocacao_bd`.`sala` (`sala_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`professor_horario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`professor_horario` (
  `professor_id` INT UNSIGNED NOT NULL,
  `horario_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`professor_id`, `horario_id`),
  INDEX `fk_professor_has_horario_horario1_idx` (`horario_id` ASC),
  INDEX `fk_professor_has_horario_professor1_idx` (`professor_id` ASC),
  CONSTRAINT `fk_professor_has_horario_professor1`
    FOREIGN KEY (`professor_id`)
    REFERENCES `sistema_alocacao_bd`.`professor` (`professor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_professor_has_horario_horario1`
    FOREIGN KEY (`horario_id`)
    REFERENCES `sistema_alocacao_bd`.`horario` (`horario_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`sala_horario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`sala_horario` (
  `sala_id` INT UNSIGNED NOT NULL,
  `horario_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`sala_id`, `horario_id`),
  INDEX `fk_sala_has_horario_horario1_idx` (`horario_id` ASC),
  INDEX `fk_sala_has_horario_sala1_idx` (`sala_id` ASC),
  CONSTRAINT `fk_sala_has_horario_sala1`
    FOREIGN KEY (`sala_id`)
    REFERENCES `sistema_alocacao_bd`.`sala` (`sala_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_sala_has_horario_horario1`
    FOREIGN KEY (`horario_id`)
    REFERENCES `sistema_alocacao_bd`.`horario` (`horario_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_alocacao_bd`.`disciplina_horario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_alocacao_bd`.`disciplina_horario` (
  `disciplina_id` INT UNSIGNED NOT NULL,
  `horario_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`disciplina_id`, `horario_id`),
  INDEX `fk_disciplina_has_horario_horario1_idx` (`horario_id` ASC),
  INDEX `fk_disciplina_has_horario_disciplina1_idx` (`disciplina_id` ASC),
  CONSTRAINT `fk_disciplina_has_horario_disciplina1`
    FOREIGN KEY (`disciplina_id`)
    REFERENCES `sistema_alocacao_bd`.`disciplina` (`disciplina_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_disciplina_has_horario_horario1`
    FOREIGN KEY (`horario_id`)
    REFERENCES `sistema_alocacao_bd`.`horario` (`horario_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


-- Realiza inserção de informações no banco.
INSERT INTO disciplina VALUES (1, 'Estrutura de Dados', 60, 2, 1, 45, 0, 'Est01');
INSERT INTO disciplina VALUES (2, 'Cálculo 1', 90, 1, 0, 60, 0, 'Calc01');
INSERT INTO disciplina VALUES (3, 'Cálculo 2', 90, 2, 0, 60, 0, 'Calc02');

INSERT INTO professor VALUES (1, 'Fulano Ciclano', '', 100, 'mic', 0);
INSERT INTO professor VALUES (2, 'Chefe Thiago', 'Chefão', 40, 'Tudo', 0);

INSERT INTO sala VALUES (1, 'Sala01', 45, 'Bloco A', '');
INSERT INTO sala VALUES (2, 'Sala02', 30, 'Bloco A', 'Ar condicionado com problemas');
INSERT INTO sala VALUES (3, 'Sala03', 30, 'Bloco B', 'Ar condicionado com problemas, sem cadeiras, ninguém limpa, sala completamente parada');

INSERT INTO turma VALUES (1, 'turm01', 45, 0, 'Matutino', 01);
INSERT INTO turma VALUES (2, 'turm02', 60, 0, 'Vespertino', 01);

INSERT INTO horario VALUES (1, '08:00', '09:30');
INSERT INTO horario VALUES (2, '09:45', '11:15');
