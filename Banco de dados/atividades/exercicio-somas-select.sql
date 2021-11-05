
create database FutDados;

use FutDados;

create table Times (
idtime int primary key auto_increment,
nometime varchar(45),
mediaidadetime decimal (4,2),
origemtime date,
check (mediaidadetime > 22)
) auto_increment 1;

insert into Times (nometime, mediaidadetime, origemtime) values 
('Sao Paulo', 23.33, 18300510),
('Real Madrid', 25.80, 18901212),
('PSG', 27.54, 17801012);

create table Jogadores (
idjogador int primary key auto_increment,
nomejogador varchar(30),
alturajogador decimal (4,2),
nascimentojogador date,
fk_time int,
foreign key (fk_time) references Times(idtime)
) auto_increment 100;

insert into Jogadores (nomejogador, alturajogador, nascimentojogador, fk_time) values 
('Rigoni', 01.80, 19990506, 1),
('Calleri', 01.90, 19890717, 1),
('Benzema', 01.77, 20030517, 2),
('Casemiro', 01.66, 20010102, 2),
('Messi', 01.59, 20000618, 3),
('Neymar', 01.87, 19950510, 3);

create table Seguidores (
idseguidor int primary key auto_increment,
nomeseguidor varchar(30),
fk_jogador int,
foreign key (fk_jogador) references Jogadores(idjogador)
);

insert into Seguidores (nomeseguidor, fk_jogador) values
('Arthur', 100),
('Gustavo', 100),
('Jaoa', 101),
('Pedro', 101),
('Vitoria', 102),
('Agata', 102),
('Julia', 103),
('Kaike', 103),
('Nelson', 104),
('Isabela', 104),
('Cintia', 105),
('Yud', 105);

update Times set nometime = 'Barça' where idtime = 3;

update Jogadores set nomejogador = 'Kroos' where idjogador = 3;

select truncate(avg(alturajogador),2) as 'media da altura de todos jogadores' from Jogadores;

select sum(alturajogador) as 'Soma da altura dos jogadores' from jogadores;

select (avg(mediaidadetime)) as 'media da idade de todos times' from Times;

select * from Jogadores
join Seguidores on Seguidores.fk_jogador = Jogadores.idjogador;

select nometime, nomejogador from Jogadores
join Times on Jogadores.fk_time = Times.idtime where alturajogador >1.60;