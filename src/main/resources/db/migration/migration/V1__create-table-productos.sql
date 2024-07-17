create table productos(

    id bigserial not null,
    titulo varchar(100) not null unique,
    mensaje varchar(100) not null unique,
    autor varchar(100) not null ,
    curso varchar(100) not null,

    primary key(id)

);