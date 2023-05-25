-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Tempo de geração: 11-Maio-2023 às 02:50
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `cd_baby`
--

CREATE DATABASE cd_baby;
USE cd_baby;
-- --------------------------------------------------------

--
-- Estrutura da tabela `albuns`
--

CREATE TABLE `albuns` (
  `cod_album` int(11) NOT NULL,
  `lancamento` int(5) DEFAULT NULL,
  `nome` text DEFAULT NULL,
  `gravadora` varchar(20) DEFAULT NULL,
  `faixas` int(11) DEFAULT NULL,
  `cod_artista` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `artistas`
--

CREATE TABLE `artistas` (
  `cod_artista` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `cod_genero` int(11) DEFAULT NULL,
  `nacionalidade` varchar(30) DEFAULT NULL,
  `solo` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `artistas`
--

INSERT INTO `artistas` (`cod_artista`, `nome`, `cod_genero`, `nacionalidade`, `solo`) VALUES
(1, 'Rouge', 6, 'Chinês', 0),
(2, 'Roberto Carlos', 1, 'Chinês', 1),
(3, 'Zezé di Camargo e Luciano', 3, 'Chinês', 0),
(6, 'Tiririca', 6, 'Mexicano', 1),
(7, 'Oficina G3', 8, 'Chinês', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `genero`
--

CREATE TABLE `genero` (
  `cod_genero` int(11) NOT NULL,
  `genero` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `genero`
--

INSERT INTO `genero` (`cod_genero`, `genero`) VALUES
(1, 'I\'m Hacker!'),
(2, 'I\'m Hacker!'),
(3, 'I\'m Hacker!'),
(4, 'I\'m Hacker!'),
(5, 'I\'m Hacker!'),
(6, 'I\'m Hacker!'),
(7, 'I\'m Hacker!'),
(8, 'I\'m Hacker!');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `albuns`
--
ALTER TABLE `albuns`
  ADD PRIMARY KEY (`cod_album`),
  ADD KEY `FK_Albuns_2` (`cod_artista`);

--
-- Índices para tabela `artistas`
--
ALTER TABLE `artistas`
  ADD PRIMARY KEY (`cod_artista`),
  ADD KEY `FK_Artistas_2` (`cod_genero`);

--
-- Índices para tabela `genero`
--
ALTER TABLE `genero`
  ADD PRIMARY KEY (`cod_genero`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `albuns`
--
ALTER TABLE `albuns`
  MODIFY `cod_album` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `artistas`
--
ALTER TABLE `artistas`
  MODIFY `cod_artista` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `genero`
--
ALTER TABLE `genero`
  MODIFY `cod_genero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `albuns`
--
ALTER TABLE `albuns`
  ADD CONSTRAINT `FK_Albuns_2` FOREIGN KEY (`cod_artista`) REFERENCES `artistas` (`cod_artista`);

--
-- Limitadores para a tabela `artistas`
--
ALTER TABLE `artistas`
  ADD CONSTRAINT `FK_Artistas_2` FOREIGN KEY (`cod_genero`) REFERENCES `genero` (`cod_genero`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
