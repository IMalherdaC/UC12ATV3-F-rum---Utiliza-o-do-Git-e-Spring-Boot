CREATE DATABASE IF NOT EXISTS empregos;
USE empregos;

CREATE TABLE IF NOT EXISTS vagas (
  idvaga INT PRIMARY KEY AUTO_INCREMENT,
  descricao TEXT NOT NULL,
  requisitos_obrigatorios TEXT,
  requisitos_desejaveis TEXT,
  remuneracao VARCHAR(100),
  beneficios TEXT,
  local_trabalho VARCHAR(150)
);

