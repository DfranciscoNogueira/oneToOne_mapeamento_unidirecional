CREATE SCHEMA `estudojpa` ;

USE estudoJPA;

create table telefone (

id bigint not null auto_increment,

numero varchar(20),

primary key (id)

);

create table pessoa (

id bigint not null auto_increment,

nome varchar(15),

id_telefone bigint not null,

primary key (id),

foreign key (id_telefone) references telefone (id)

);

-- consulta nome e numero do telefone (INNER JOIN)

-- SELECT p.nome, t.numero FROM pessoa AS p INNER JOIN telefone AS t ON p.id_telefone = t.id;