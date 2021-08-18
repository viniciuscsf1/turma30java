-- Criando a base de dados da empresa de RH
create database db_rh;


-- Criando a tabela de funcionários com os cinco atributos
create table tb_funcionarios(
	codigo bigint(4) auto_increment,
    nome varchar (50) not null,
    email varchar (50) ,
    cargo varchar (50) ,
    salario decimal (10,2) not null,
    primary key (codigo)
    );


-- Populando a tabela com cinco dados
insert into tb_funcionarios (nome, email, cargo, salario) 
values ("Ronaldo", "ronaldinho123@outook.com", "Estagiario", 1250.00);
insert into tb_funcionarios (nome, email, cargo, salario) 
values ("Armando", "Armando_robs@gmail.com", "Analista de Recursos Humanos", 2500.00);
insert into tb_funcionarios (nome, email, cargo, salario) 
values ("Amanda", "amanditatitatita@gmail.com", "Estagiária", 1250.00);
insert into tb_funcionarios (nome, email, cargo, salario) 
values ("Maria", "Mariadasdores123@outook.com", "Analista de Recrutamento e Seleção", 2200.00);
insert into tb_funcionarios (nome, email, cargo, salario) 
values ("Helena", "Helena_HGK@outook.com", "Coordenadora de RH", 5500.00);


-- Selecionando os funcionarios que recebem mais de 2000
select * from tb_funcionarios where salario > 2000;


-- Selecionando os funcionarios que recebem menos de 2000
select * from tb_funcionarios where salario < 2000;


-- Atualizando um dado da tabela
update tb_funcionarios set cargo = "Analista júnior de RH", salario = 2100 where codigo = 3;