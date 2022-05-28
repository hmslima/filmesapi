CREATE TABLE movie (
	id SERIAL PRIMARY KEY,
	name VARCHAR(512),
	brname VARCHAR(512),
	director VARCHAR(512),
	year INT,
	imdb VARCHAR(16)
);
	

INSERT INTO
    movie (name, brname, director, year, imdb)
VALUES
    ('The Man from Earth', 'O Homem da Terra', 'Richard Schenkman', 2007, '0756683'),
    ('The Holy Mountain', 'A Montanha Sagrada', 'Alejandro Jodorowsky', 1973, '0071615'),
    ('Jurassic Park', 'Parque dos Dinossauros', 'Steven Spielberg', 1993, '0107290'),
    ('The Secret Of Roan Inish', 'O Mistério da Ilha', 'John Sayles', 1994, '0111112'),
    ('Enemy Mine', 'Inimigo Meu', 'Wolfgang Petersen', 1985, '0089092'),
    ('A Good Year', 'Um Bom Ano', 'Ridley Scott', 2006, '0401445');