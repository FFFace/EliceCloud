select b.book_title as "책 제목", a.author_name as "지은이", p.publisher_name as "출판사", g.genre_name as "장르" from book b
inner join author a on b.author_id = a.author_id
inner join publisher p on b.publisher_id = p.publisher_id
inner join genre g on b.genre_id = g.genre_id;