create database  springboot_jdbc;

use springboot_jdbc;

CREATE TABLE TB_USER (
	id bigint AUTO_INCREMENT,
	nome VARCHAR(80),
	email VARCHAR (50),
	cidade VARCHAR(20),
	uf CHAR (2),
	dataNascimento DATE,
	primary key(id)
)

INSERT INTO TB_USER (nome, email, cidade, uf, dataNascimento) 
VALUES ('Jeremias Joao', 'misonyjoao@gmail.com', 'Carapicuiba', 'SP', '2009-02-11');

UPDATE TB_USER SET nome = ?, email = ?, cidade = ?,  uf = ?, dataNascimento = ? WHERE id = ?

SELECT * FROM .TB_USER;

SELECT * FROM TB_USER WHERE id = 1;

DELETE FROM TB_USER WHERE id = 1;

