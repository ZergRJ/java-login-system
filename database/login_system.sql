create database if not exists login_system;

USE login_system;

CREATE TABLE usuarios (
id INT auto_increment primary key,
nome varchar(100) not null,
senha varchar(100) not null);

INSERT INTO usuarios (nome, senha)
VALUES ('Gean','1234');

SELECT * FROM usuarios;

update usuarios 
set senha = ''
where id = '';

delete from usuarios
where id = '';