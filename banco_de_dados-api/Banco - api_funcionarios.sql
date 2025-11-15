CREATE DATABASE api_funcionarios;
USE api_funcionarios;

-- Cria a tabela funcionarios
CREATE TABLE funcionarios (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cargo VARCHAR(255),
    salario DOUBLE,
    idade INT,
    PRIMARY KEY (id)
);

insert into funcionarios (nome, cargo, salario, idade) values
("Maria", "Promotora", 25.478, 25);

select * from funcionarios;