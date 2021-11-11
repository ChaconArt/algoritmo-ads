create database if not exists AlunoProjeto;
use AlunoProjeto;

--  Criar as tabelas equivalentes à modelagem.

create table if not exists Projeto (
idprojeto int primary key,
nomeprojeto varchar(45),
descricao varchar(45)
); 

create table if not exists Aluno (
ra int primary key,
nomealuno varchar(45) not null,
telefone varchar(45),
fkrepresentante int,
foreign key (fkrepresentante) references Aluno(ra),
fkprojeto int,
foreign key (fkprojeto) references projeto(idprojeto)
);

create table if not exists acompanhante (
idacompanhante int,
nomeacompanhante varchar(45),
relacionamento varchar(45),
fkaluno int,
primary key (idacompanhante, fkaluno),
foreign key (fkaluno) references Aluno(ra)
); 

-- - Inserir dados nas tabelas.

insert into Projeto values 
(100, 'SustentaTec', 'Tecnologia'),
(200, 'WorldGreen', 'Sustentabilidade'),
(300, 'NiceHealth', 'Esportes');

insert into Aluno values 
(1, 'Arthur', '1212-1313', 1, 100),  
(2, 'Gustavo', '4455-9898', 1, 200),  
(3, 'Guilherme', '3131-4545', 1, 300),  
(4, 'Julia', '3333-8787', 1, 300);

insert into Acompanhante values 
(20, 'Juca', 'Irmao', 1),
(21, 'Leticia', 'Prima', 1),
(22, 'Pedro', 'Primo', 2),
(23, 'Leticia', 'Tio', 2),
(24, 'Sérgio', 'Pai', 3),
(25, 'Bruno', 'Irmã', 3);

-- Exibir todos os dados de cada tabela criada, separadamente.

select * from Projeto;
select * from Aluno;
select * from Acompanhante;

-- Exibir os dados dos alunos e dos projetos correspondentes.

select Aluno.*, Projeto.* from Aluno
join Projeto on Aluno.fkprojeto = Projeto.idprojeto;

-- Exibir os dados dos alunos e dos seus acompanhantes.

select Aluno.*, Acompanhante.* from Aluno
join Acompanhante on Aluno.ra = Acompanhante.fkaluno;

-- Exibir os dados dos alunos e dos seus representantes.

select * from Aluno as Aluno 
join Aluno as Representante on Aluno.ra = Representante.fkrepresentante;

-- Exibir os dados dos alunos e dos projetos correspondentes, mas somente de um determinado projeto (indicar o nome do projeto na consulta)

select * from Aluno
join Projeto on Aluno.fkprojeto = Projeto.idprojeto 
where nomeprojeto = 'NiceHealth'; 