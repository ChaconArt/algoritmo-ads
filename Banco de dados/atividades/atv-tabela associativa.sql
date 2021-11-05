-- ARTHUR PEREIRA CHACON 
-- RA 01212146

create database if not exists escola;
use escola;

-- tabelas criadas de acordo com a modelagem
create table if not exists tab_aluno (
ra_aluno int primary key auto_increment,
nomealuno varchar(45) not null,
bairroaluno varchar(45) not null
) auto_increment 01; 

create table if not exists tab_curso (
id_curso int primary key auto_increment,
nomecurso varchar(45) not null,
coordenadorcurso varchar(45) not null,
mediacurso decimal(4,2)
) auto_increment 101;

create table if not exists tab_historico (
fk_aluno int not null,
foreign key (fk_aluno) references tab_aluno (ra_aluno),
fk_curso int not null,
foreign key (fk_curso) references tab_curso (id_curso),
inicio date not null,
nivelaluno decimal (4,2) not null
);

-- inserir dados nas tabelas
insert into tab_aluno (nomealuno, bairroaluno) values
('arthur', 'jd maua'),
('gustavo', 'jd barueri'),
('wesley', 'jd morumbi'),
('joao pedro', 'jd sao paulo'),
('damas', 'av paulista');

insert into tab_curso (nomecurso, coordenadorcurso, mediacurso) values 
('banco de dados', 'alex', '06.00'),
('algoritmo', 'frizza', '07.00'),
('ti', 'thiago', '06.50');

insert into tab_historico values
(1,101, 20201201, 07.00),
(1,102, 20190601, 09.00),
(2,102, 20210601, 10.00),
(3,103, 20200601, 08.00),
(4,101, 20190601, 07.50),
(5,103, 20210601, 06.50);

-- exibir os dados da tabela separadamente
select * from tab_aluno;
select * from tab_curso;
select * from tab_historico;

-- exibir os dados dos alunos e dos cursos correspondentes
select * from tab_historico 
join tab_aluno on tab_aluno.ra_aluno = tab_historico.fk_aluno
join tab_curso on tab_curso.id_curso = tab_historico.fk_curso;

-- exibir os dados dos alunos, mas somente de um curso
select * from tab_historico 
join tab_aluno on tab_aluno.ra_aluno = tab_historico.fk_aluno
join tab_curso on tab_curso.id_curso = tab_historico.fk_curso
where id_curso = 101;

-- exibir os dados de um aluno e os dados dos cursos desse aluno
select * from tab_historico 
join tab_aluno on tab_aluno.ra_aluno = tab_historico.fk_aluno
join tab_curso on tab_curso.id_curso = tab_historico.fk_curso
where ra_aluno = 1;

-- exibir a soma das médias e a média das médias
select sum(mediacurso) from tab_curso;
select avg(mediacurso) from tab_curso;

-- exibir a maior e a menor média
select max(mediacurso) from tab_curso;
select min(mediacurso) from tab_curso;

-- exibir a maior e a menor média agrupada por curso
select nomecurso, max(mediacurso) as 'maior média' from tab_curso group by mediacurso;
select nomecurso, min(mediacurso) as 'menor média' from tab_curso group by mediacurso;

-- exibir a maior e a menor média agrupada por aluno
select nomealuno, nomecurso, max(mediacurso) as 'maior média' from tab_historico 
join tab_aluno on tab_aluno.ra_aluno = tab_historico.fk_aluno
join tab_curso on tab_curso.id_curso = tab_historico.fk_curso
group by ra_aluno;

select nomealuno, nomecurso, min(mediacurso) as 'menor média' from tab_historico 
join tab_aluno on tab_aluno.ra_aluno = tab_historico.fk_aluno
join tab_curso on tab_curso.id_curso = tab_historico.fk_curso
group by ra_aluno;

-- exibir apenas as médias da tab_historico
select nivelaluno from tab_historico;

-- exibir as médias distintas da tab_historico
select distinct(nivelaluno) from tab_historico;

-- exibir a quantidade das médias da tab_historico
select count(nivelaluno) from tab_historico;

-- exibir a quantidade das médias distintas da tab_historico 
select count(distinct(nivelaluno)) from tab_historico;