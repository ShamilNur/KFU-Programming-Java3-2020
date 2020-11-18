CREATE TABLE book
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE author
(
    id      SERIAL PRIMARY KEY,
    name    VARCHAR(100),
    book_id INTEGER REFERENCES book (id)
);

INSERT INTO book
VALUES (1, 'Война и Мир'),
       (2, 'Анна Каренина'),
       (3, 'Жизнь взаймы'),
       (4, 'Чёрный обелиск'),
       (5, 'В дороге');

INSERT INTO author
VALUES (1, 'Л. Н. Толстой', 1),
       (2, 'Л. Н. Толстой', 2),
       (3, 'Э. М. Ремарк', 3),
       (4, 'Э. М. Ремарк', 4),
       (5, 'Д. Керуак', 5);
