CREATE SCHEMA pae;

CREATE TABLE pae.users (
	id SERIAL PRIMARY KEY,
	login VARCHAR(256),
	password VARCHAR(256)
);

INSERT INTO pae.users VALUES (DEFAULT, 'toto', '$2a$10$qjfGbyx94o94kGw2Jyh7BuF7p.03tw3UvdM68wcZD8TDc8k.CEgEm');
