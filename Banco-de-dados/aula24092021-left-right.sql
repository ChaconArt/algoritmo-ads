create database Spotify;

use Spotify;

create table Autor (
idautor int primary key auto_increment,
nomeautor varchar(20)
);

insert into autor (nomeautor) values
("chorao"),
("pericles"),
("mc champions"),
("ednaldo pereira");

create table musica (
idmusica int primary key auto_increment,
nomemusica varchar(30)
);

insert into musica (nomemusica) values 
("quinta-feira"),
("final de tarde"),
("copa do mundo"),
("voce vale tudo");

alter table musica add column fk_autor int;
alter table musica add foreign key (fk_autor) references autor (idautor);
update musica set fk_autor = 1 where idmusica = 1;
update musica set fk_autor = 2 where idmusica = 2;
update musica set fk_autor = 3 where idmusica = 3;
update musica set fk_autor = 4 where idmusica = 4; 

insert into musica (nomemusica) values
('nega'),
('formula magica da paz');

insert into Autor (nomeautor) values
('mc kevin'),
('matue');

select * from autor
left join musica on autor.idautor = musica.fk_autor;

select * from autor 
cross join musica on autor.idautor = musica.fk_autor;


