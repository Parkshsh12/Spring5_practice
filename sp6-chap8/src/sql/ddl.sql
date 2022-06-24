create database spring5fs character set=utf8;

create table spring5fs.MEMBER(
	ID int auto_increment primary key,
	EMAIL varchar(255),
	PASSWORD varchar(100),
	NAME varchar(100),
	REGDATE datetime,
	unique key(EMAIL)
) engine=InnoDB character set = utf8;

insert into MEMBER(EMAIL, PASSWORD, NAME, REGDATE) values('madvirus@madvirus.net', '1234', 'pah', now());