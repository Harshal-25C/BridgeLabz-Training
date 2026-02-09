CREATE TABLE book (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(150),
    author VARCHAR(100),
    available BOOLEAN
);

CREATE TABLE borrow (
    borrow_id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(100),
    book_id INT,
    borrow_date DATE,
    return_date DATE
);


mysql> SHOW TABLES;
+-------------------------+
| Tables_in_mysqlpractice |
+-------------------------+
| account                 |
| book                    |
| borrow                  |
| employee                |
| transaction_history     |
+-------------------------+
5 rows in set (0.03 sec)

mysql> SELECT * FROM book;
+---------+-----------------------+-------------------------+----------+
| book_id | title                 | author                  | quantity |
+---------+-----------------------+-------------------------+----------+
|       1 | Harry Potter          | Harshal Choudhary       |        1 |
|       2 | Java-8 features       | https_harsh             |        1 |
|       3 | JohnTheRipper         | blackhat_harshall@      |        0 |
|       4 | Psychological Facts   | Hermione                |        0 |
|       5 | Father Of Indian Navy | @harshh                 |        2 |
|       6 | The Maratha Empire    | Shrimant Peshwa Bajirao |        1 |
+---------+-----------------------+-------------------------+----------+
6 rows in set (0.02 sec)

mysql> INSERT INTO book(book_id, title, author, quantity) VALUES
    -> (101, 'Sync', 'Erich Gamma', 3);
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM borrow;
+-----------+--------------+---------+-------------+-------------+
| borrow_id | student_name | book_id | borrow_date | return_date |
+-----------+--------------+---------+-------------+-------------+
|         1 | Harshal      |       3 | 2026-02-08  | NULL        |
|         2 | Anvii        |       4 | 2026-02-08  | NULL        |
+-----------+--------------+---------+-------------+-------------+
2 rows in set (0.01 sec)

mysql> INSERT INTO borrow(borrow_id, student_name, book_id, borrow_date, return_date) VALUES
    -> (3, 'Richared Johnson', 5, '2026-02-02', '2026-02-31');
ERROR 1292 (22007): Incorrect date value: '2026-02-31' for column 'return_date' at row 1
mysql> INSERT INTO borrow(borrow_id, student_name, book_id, borrow_date, return_date) VALUES
    -> (3, 'Richared Johnson', 5, '2026-02-02', '2026-02-28');
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM borrow;
+-----------+------------------+---------+-------------+-------------+
| borrow_id | student_name     | book_id | borrow_date | return_date |
+-----------+------------------+---------+-------------+-------------+
|         1 | Harshal          |       3 | 2026-02-08  | NULL        |
|         2 | Anvii            |       4 | 2026-02-08  | NULL        |
|         3 | Richared Johnson |       5 | 2026-02-02  | 2026-02-28  |
+-----------+------------------+---------+-------------+-------------+
3 rows in set (0.00 sec)