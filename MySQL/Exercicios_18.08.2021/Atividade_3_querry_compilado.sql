-- Criando a base de dados do ecommerce
create database db_registro_escola;


-- Trocando a base de dados do rh para a base do ecommerce
use db_registro_escola;


-- Criando a tabela de funcionários com os cinco atributos
create table tb_estudantes(
	registro bigint(4) auto_increment,
    nome varchar (50) not null,
    serie varchar (15) ,
    idade bigint (2) ,
    nota decimal (10,2) ,
    primary key (registro)
    );


-- Populando a tabela com cinco dados
insert into tb_estudantes (nome, serie, idade, nota) 
values ("Rogério", "6º série", 12, 4.50);
insert into tb_estudantes (nome, serie, idade, nota) 
values ("Eduardo", "1º série", 6, 9.50);
insert into tb_estudantes (nome, serie, idade, nota) 
values ("Alice", "3º série", 8, 8.60);
insert into tb_estudantes (nome, serie, idade, nota) 
values ("Amanda", "9º série", 15, 6.00);
insert into tb_estudantes (nome, serie, idade, nota) 
values ("Alberto", "8º série", 13, 7.90);
insert into tb_estudantes (nome, serie, idade, nota) 
values ("Pedro", "8º série", 13, 8.50);
insert into tb_estudantes (nome, serie, idade, nota) 
values ("Adriana", "6º série", 11, 10.00);
insert into tb_estudantes (nome, serie, idade, nota) 
values ("Marcela", "6º série", 12, 5.50);


-- Selecionando os estudantes que possuem nota igual ou maior que 7
select * from tb_estudantes where nota >= 7;


-- Selecionando os estudantes que possuem nota abaixo de 7
select * from tb_estudantes where nota < 7;


-- Atualizando um dado da tabela
update tb_estudantes set nota = 9, idade = 14 where codigo = 5;