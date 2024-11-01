CREATE TABLE alunos (
	id int8 NOT NULL,
	endereco varchar(255) NULL,
	nome varchar(255) NULL,
	deleted_at timestamptz(6) NULL,
	cep varchar(255) NULL,
	logradouro varchar(255) NULL,
	numero varchar(255) NULL,
	turma_id int8 NULL,
	CONSTRAINT alunos_pkey PRIMARY KEY (id)
);