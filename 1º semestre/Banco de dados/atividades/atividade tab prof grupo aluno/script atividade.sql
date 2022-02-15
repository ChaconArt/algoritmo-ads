create database if not exists BandTec;
use BandTec;

-- criação das tabelas

create table if not exists grupo (
idgrupo int primary key auto_increment,
nomegrupo varchar(45),
descricao varchar(45)
)auto_increment 1;

create table if not exists aluno (
ra int primary key,
nome varchar(45),
email varchar(45),
fkgrupo int,
foreign key (fkgrupo) references grupo (idgrupo)
);

create table if not exists professor (
idprofessor int primary key auto_increment,
nomeprofessor varchar(45),
disciplina varchar(45)
) auto_increment 10000;

create table if not exists avaliacao (
fkgrupo int,
dia date,
horario time,
nota int,
fkprofessor int,
primary key (fkgrupo, fkprofessor),
foreign key (fkgrupo) references grupo (idgrupo), 
foreign key (fkprofessor) references professor (idprofessor)
);

-- inserindo dados nas tabelas

insert into grupo (nomegrupo, descricao) values
('Smart movement', 'sensor de movimento em shopping'),
('Smart temperature', 'sensor de temperatura em impressora 3d');

insert into aluno values 
('1', 'Arthur', 'arthur@bandtec.com.br', '1'),
('2', 'João Pedro', 'joaop@bandtec.com.br', '1'),
('3', 'Gustavo', 'gustavo@bandtec.com.br', '1'),
('4', 'Carlos', 'carlos@bandtec.com.br', '2'),
('5', 'Volpe', 'volpe@bandtec.com.br', '2'),
('6', 'Lura', 'lura@bandtec.com.br', '2');

insert into professor (nomeprofessor, disciplina) values 
('Alex', 'banco de dados'),
('Brandao', 'Pesquisa e inovação');

insert into avaliacao values 
('1', '20211201', '11:00:00', '9', '10000'),
('1', '20211201', '12:00:00', '8', '10001'),
('2', '20211108', '13:00:00', '10', '10000'),
('2', '20211108', '14:00:00', '7', '10001');

-- exibindo os dados das tabelas

select * from grupo;
select * from aluno;
select * from professor;
select * from avaliacao;

-- exibir os dados dos grupos e dos seus respectivos alunos

select * from grupo 
join aluno on aluno.fkgrupo = grupo.idgrupo; 

-- exibir os dados de um determinado grupo e dos seus respectivos alunos

select * from grupo
join aluno on aluno.fkgrupo = grupo.idgrupo where idgrupo = 1;

-- exibir a média das notas atribuídas aos grupos

select nomegrupo as 'nome do grupo', avg(nota) as 'média da nota' from avaliacao
join grupo on avaliacao.fkgrupo = grupo.idgrupo group by nomegrupo; 

-- exibir a nota máxima e a nota mínima que foi atribuida aos grupos em geral

select nomegrupo as 'nome do grupo', max(nota) as 'nota máxima', min(nota) as 'nota mínima' from avaliacao
join grupo on avaliacao.fkgrupo = grupo.idgrupo group by nomegrupo; 

-- exibir a soma das notas dadas aos grpos em geral

select nomegrupo as 'nome do grupo', sum(nota) as 'soma das notas' from avaliacao
join grupo on avaliacao.fkgrupo = grupo.idgrupo group by nomegrupo;

-- exibir os dados dos professores que avaliaram cada grupo, os dados dos grupos, a data e o horário da avaliação

select dia, horario, professor.* , grupo.* from avaliacao
join professor on professor.idprofessor = avaliacao.fkprofessor
join grupo on grupo.idgrupo = avaliacao.fkgrupo group by nomegrupo, nomeprofessor;

-- exibir os dados dos professores que avaliaram determinado grupo, os dados do grupo, a data e o horario da avaliação

select dia, horario, professor.*, grupo.* from avaliacao
join professor on professor.idprofessor = avaliacao.fkprofessor
join grupo on grupo.idgrupo = avaliacao.fkgrupo where idgrupo = 2 group by nomegrupo, nomeprofessor;

-- exibir os nomes dos grupos que foram avaliados por um determinado professor

select grupo.nomegrupo as 'nome grupo' from avaliacao
join professor on professor.idprofessor = avaliacao.fkprofessor
join grupo on grupo.idgrupo = avaliacao.fkgrupo where idprofessor = 10000;

-- exibir os dados dos grupos, os dados dos alunos correspondentes, os dados dos professores que avaliaram, a data e o horario da avaliação 

select grupo.*, aluno.*, professor.*, dia, horario from avaliacao
join grupo on grupo.idgrupo = avaliacao.fkgrupo
join aluno on aluno.fkgrupo = grupo.idgrupo 
join professor on professor.idprofessor = avaliacao.fkprofessor;

-- exibir a quantidade de notas distintas

select count(distinct(nota)) as 'quantidade de notas distintas' from avaliacao; 

-- exibir a identificação do professor (pode ser fk ou nome), a média das notas, e a soma das notas atribuídas, agrupadas por professor

select nomeprofessor as 'nome do professor', avg(nota) as 'média das notas', sum(nota) as 'soma das notas' from avaliacao
join professor on avaliacao.fkprofessor = professor.idprofessor group by nomeprofessor; 

-- exibir a identificação dos grupos (pode ser fk ou nome), a média das notas, e a soma das notas atribuídas, agrupadas por grupo

select nomegrupo as 'nome grupo', avg(nota) as 'média das notas', sum(nota) as 'soma das notas' from avaliacao
join grupo on avaliacao.fkgrupo = grupo.idgrupo group by nomegrupo;

-- exibir a identificação do professor (pode ser fk ou nome), a menor nota e a maior nota atribuída, agrupadas por professor

select nomeprofessor as 'nome do professor', max(nota) as 'maior nota atribuída', min(nota) as 'menor nota atribuída' from avaliacao
join professor on avaliacao.fkprofessor = professor.idprofessor group by nomeprofessor; 

-- exibir a identificação do grupo (pode ser fk ou nome), a menor nota e a maior nota atribuída, agrupadas por grupo

select nomegrupo as 'nome do grupo', max(nota) as 'maior nota atribuída', min(nota) as 'menor nota atribuída' from avaliacao
join grupo on avaliacao.fkgrupo = grupo.idgrupo group by nomegrupo; 




