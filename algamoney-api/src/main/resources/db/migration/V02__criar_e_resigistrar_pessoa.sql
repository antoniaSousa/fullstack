CREATE TABLE pessoa (codigo BIGINT(10) PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
logradouro VARCHAR(100),
numero VARCHAR (4),
complemento VARCHAR(100),
bairro VARCHAR (50),
cep VARCHAR (9),
cidade VARCHAR (40),
estado VARCHAR(40),
ativo boolean NOT NULL)
ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, bairro, cidade, estado, ativo) values ('Ana Maria', 'Rua Amazonas','56','Novo Horizonte','Marabá','Pará', true);