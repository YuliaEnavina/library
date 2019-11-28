drop table if exists book;
create table book (
 id serial NOT NULL PRIMARY KEY,
 author varchar(50) not null,
 title varchar(50) not null,
 genre varchar(20) not null,
 available boolean not null,
 deleted boolean not null
);
