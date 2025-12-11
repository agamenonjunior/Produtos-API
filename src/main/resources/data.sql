create table produto(
    codigo varchar(255) not null primary key,
    nome varchar(255) not null,
    descricao varchar(255),
    preco numeric(18, 2)
);