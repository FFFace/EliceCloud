alter table book add constraint book_author_id_fk foreign key(author_id) references author(author_id);
alter table book add constraint publisher_id_fk foreign key(publisher_id) references publisher(publisher_id);

alter table book_case add constraint book_id_fk foreign key(book_id) references book(book_id);
