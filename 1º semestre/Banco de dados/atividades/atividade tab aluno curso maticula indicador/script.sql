create database if not exists AlunosCursos;
use AlunosCursos;

-- criação das tabelas

create table if not exists Curso (
idCurso int primary key auto_increment,
nomeCurso varchar(45)
)auto_increment = 1;

create table if not exists ResponsavelFinanceiro (
idResponsavelFinanceiro int primary key auto_increment,
nomeResponsavel varchar(45),
relacaoResponsavel varchar(45)
)auto_increment = 50;

create table if not exists Aluno (
idAluno int primary key,
nome varchar(45),
fkindicacao int,
fkResponsavel int,
foreign key (fkindicacao) references Aluno (idAluno),
foreign key (fkResponsavel) references ResponsavelFinanceiro (idResponsavelFinanceiro)
); 

create table if not exists Matricula (
fkAluno int,
fkCurso int,
primary key (fkAluno, fkCurso),
dataMatricula date,
foreign key (fkAluno) references Aluno (idAluno),
foreign key (fkCurso) references Curso (idCurso)
);

-- inserindo dados nas tabelas 

insert into Curso values 
(null, 'CSS'),
(null, 'Java');

insert into ResponsavelFinanceiro values 
(null, 'marcelo', 'pai'),
(null, 'Jaque', 'mae'),
(null, 'Julio', 'tio');

insert into Aluno values 
(100, 'Arthur', null, 50),
(101, 'Victor', null , 51),
(102, 'Pedro', 100 , 52);

insert into Matricula values
(100, 1, 20210601), 
(100, 2, 20210101),
(101, 1, 20200601), 
(102, 2, 20211201); 

-- incrementando campo na tab matricula

alter table Matricula add column precomatricula decimal(5,2);

update Matricula set precomatricula = 800.00 where fkcurso = 1;
update Matricula set precomatricula = 900.00 where fkcurso = 2;

select * from Matricula;

-- brincando de select

-- nome e preco de matricula de um determinado
select nome, precomatricula from matricula
join aluno on matricula.fkaluno = aluno.idaluno where idaluno = 100;

-- soma das matriculas que ocorreram no ano de 2021
select sum(precomatricula) from matricula where year(datamatricula) = '2021';

-- select com nome de quem indicou e quem foi indicado
select al.nome as indicador, ind.nome as indicado from aluno al
join aluno ind on al.idaluno = ind.fkindicacao; 

