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
    ('The Teahouse of the August Moon', 'Casa de Chá do Luar de Agosto', 'Daniel Mann', 1956, '0049830'),
    ('The Holy Mountain', 'A Montanha Sagrada', 'Alejandro Jodorowsky', 1973, '0071615'),
    ('One Flew Over the Cuckoo''s Nest', 'Um Estranho no Ninho', 'Milos Forman', 1975, '0073486'),
    ('The Gods Must Be Crazy', 'Os Deuses Devem Estar Loucos', 'Jamie Uys', 1980, '0080801'),
    ('Enemy Mine', 'Inimigo Meu', 'Wolfgang Petersen', 1985, '0089092'),
    ('Highlander', 'Highlander: O Guerreiro Imortal', 'Russell Mulcahy', 1986, '0091203'),
    ('Na Srebrnym Globie', 'Globo de Prata', 'Andrzej Zulawski', 1988, '0093593'),
    ('Dances with Wolves', 'Dança com Lobos', 'Kevin Costner', 1990, '0099348'),
    ('Wong Fei Hung', 'Era Uma Vez na China', 'Hark Tsui', 1991, '0401445'),
    ('Jurassic Park', 'Parque dos Dinossauros', 'Steven Spielberg', 1993, '0107290'),
    ('The Secret Of Roan Inish', 'O Mistério da Ilha', 'John Sayles', 1994, '0111112'),
    ('Bom yeoreum gaeul gyeoul geurigo bom', 'Primavera, Verão, Outono, Inverno... e Primavera', 'Kim Ki-duk', 2003, '0374546'),
    ('A Good Year', 'Um Bom Ano', 'Ridley Scott', 2006, '0401445'),
    ('Stardust', 'Stardust: O Mistério da Estrela', 'Matthew Vaughn', 2007, '0486655'),
    ('The Man from Earth', 'O Homem da Terra', 'Richard Schenkman', 2007, '0756683'),
    ('Kimssi pyoryugi', 'Náufrago da Lua', 'Lee Hae-jun', 2009, '1499666'),
    ('La grande bellezza', 'A Grande Beleza', 'Paolo Sorrentino', 2013, '2358891'),
    ('Fehér isten', 'Deus Branco', 'Kornél Mundruczó', 2014, '2844798'),
    ('Ritoru foresuto: Natsu/Aki', 'Pequena Floresta: Verão/Outono', 'Jun''ichi Mori', 2014, '3474600');