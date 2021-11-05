create database Musicas;

use Musicas;

create table Musicas (
idmusica int primary key auto_increment,
titulo varchar(40),
artista varchar(40),
genero varchar(40)
);

insert into Musicas (titulo, artista, genero) values
('recairei', 'barões da pisadinha', 'forró'),
('milionarios', 'mc hariel', 'funk'),
('505', 'artic monkeys', 'rock'),
('stressed out', 'twenty one pilots', 'rock'),
('longe de voce', 'cbjr', 'mpb'),
('opção', 'mc kevin', 'funk'),
('quinta-feira', 'cbjr', 'mpb'),
('capitulo 4 versiculo 3','racionais', 'rap');

select * from musicas;

select titulo, artista from musicas; 

select * from musicas where genero = 'rock';

select * from musicas where artista = 'cbjr';

select * from musicas order by titulo;

select * from musicas order by artista desc;

select * from musicas where titulo like 'q%';

select * from musicas where artista like '%l';

select * from musicas where genero like '_u%';

select * from musicas where titulo like '%c_';

delete from musicas;