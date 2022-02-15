create database ChaconMusic;

use ChaconMusic;

create table País (
idpais int primary key auto_increment,
nomepais varchar(40)
);

create table Banda (
idbanda int primary key auto_increment,
nomebanda varchar(40),
fk_pais int,
foreign key (fk_pais) references País (idpais)
)
auto_increment = 200;

create table Autor (
idautor int primary key auto_increment,
nomeautor varchar(40),
fk_banda int,
foreign key (fk_banda) references Banda (idbanda)
);

create table Música (
idmusica int primary key auto_increment,
nomemusica varchar(40),
genero varchar(40),
fk_autor int,
foreign key (fk_autor) references Autor (idautor)
); 

insert into País (nomepais) values
('Brasil'),
('EUA'),
('Inglaterra');

select * from País;

insert into Banda (nomebanda, fk_pais) values 
('Imagine Dragons', 2),
('Foo Fighters', 2),
('Charlie Brown Jr.', 1),
('Queens', 3),
('Racionais', 1);

select * from Banda;

insert into Autor (nomeautor, fk_banda) values
('David Smith', 200),
('Chorão', 202),
('Mano Brown', 204),
('Adam Smith', 203),
('John Shelby', 201);

select * from Autor;  

insert into Música (nomemusica, genero, fk_autor) values
('até mais', 'MPB', 2),
('bye bye', 'rock', 1),
('jesus chorou', 'rap', 3),
('Flowers','rock', 4),
('Peaky Music', 'rock', 5);

select Banda.*, Autor.*, Música.* 
from Banda
join Autor on autor.fk_banda = banda.idbanda
join Música on Música.fk_autor= autor.idautor;
