create database Filmes;

use Filmes;

create table Filme (
IdFilme int primary key,
Titulo char(50),
Genero char (50),
Diretor char (50)
);

insert into Filme (IdFilme, Titulo, Genero, Diretor) values
(1, "Senhor dos Aneis", "Fantasia", "Peter Jackson");

insert into Filme (IdFilme, Titulo) values
(2, "Harry Potter");

insert into Filme (Titulo, IdFilme) values 
("Vingadores", 3);

insert into Filme (IdFilme, Titulo) values
(4, "Mega Tubarão"),
(5, "Piranha");

insert into Filme (IdFilme, Titulo) values
(6, "Guerra Mundial Z"),
(7, "Tropa de Elite"),
(8, "Velozes e Furiosos"),
(9, "Fragmentado"),
(10, "Cidade de Deus"),
(11, "Toy Story");

update Filme set Diretor = 'James Cameron' where IdFilme = 5;

update Filme set Diretor = 'Marc Forster' where IdFilme = 6;

update Filme set Diretor = 'John Lasseter' where IdFilme = 11;

update Filme set Genero = 'Ação', Diretor = 'John Turteltaub' where IdFilme = 4;

update Filme set Genero = 'Terror psicológico', Diretor = 'M. Night Shyamalan' where IdFilme = 9;

update Filme set Genero = 'Terror' where IdFilme = 5; 

update Filme set Genero = 'Ficção pós-apocalíptica' where IdFilme = 6;

select * from Filme;

update Filme set Genero = 'Fantasia' where IdFilme = 2;

update Filme set Genero = 'Infantil' where IdFilme = 11;

update Filme set Diretor = 'David Yates' where IdFilme = 2;

update Filme set Genero = 'Ação', Diretor = 'Anthony Russo' where IdFilme = 3;

update Filme set Genero = 'Ação', Diretor = 'José Padilha' where IdFilme = 7;

update Filme set Genero = 'Ação', Diretor = 'Justin Lin' where IdFilme = 8;

update Filme set Genero = 'Ação' where IdFilme = 10;

select * from Filme;

delete from Filme where IdFilme = 6;

delete from Filme where IdFilme = 11;

delete from Filme where IdFilme = 5;

alter table Filme add column Ano char(50);

select * from Filme; 

alter table Filme modify Titulo char(50);

desc Filme;

alter table Filme drop column ano;

select * from Filme order by Titulo;

select * from Filme order by Diretor;

select * from Filme order by Diretor desc, Titulo desc;