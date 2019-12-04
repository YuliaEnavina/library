drop table if exists book;
create table book (
 id serial NOT NULL PRIMARY KEY,
 author varchar(50) not null,
 title varchar(50) not null,
 genre varchar(20) not null,
 available boolean default true not null,
 deleted boolean default false not null
);
