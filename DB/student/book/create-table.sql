create table author(
	author_id		int(8)			not null		auto_increment		primary key,
    name			varchar(200)	not null,
    age				int(4)			null
);

create table publisher(
	publisher_id	int(8)			not null	auto_increment		primary key,
    name			varchar(200)	not null	unique
);

create table book (
	book_id			int(8)			not null	auto_increment 		primary key,
    title			varchar(200)	not null,
    author_id		int(8)	not null,
    publisher_id	int(8)	not null
);

create table book_case(
	book_id			int(8)		not null,
    title		varchar(200)	not null,
    genre		varchar(100)	not null
);



