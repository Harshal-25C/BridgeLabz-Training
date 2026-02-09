CREATE TABLE account (
    account_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    balance DOUBLE
);

CREATE TABLE transaction_history (
    tx_id INT PRIMARY KEY AUTO_INCREMENT,
    from_account INT,
    to_account INT,
    amount DOUBLE,
    tx_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);



mysql> SELECT * FROM account;
Empty set (0.08 sec)

mysql> INSERT INTO account(account_id, name, balance) VALUES
    -> (101223, 'Harshal', 1500000),
    -> (124243, 'Anvii', 2454255);
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM account;
+------------+---------+---------+
| account_id | name    | balance |
+------------+---------+---------+
|     101223 | Harshal | 1500000 |
|     124243 | Anvii   | 2454255 |
+------------+---------+---------+
2 rows in set (0.01 sec)

mysql> SELECT * FROM transaction_history;
+-------+--------------+------------+--------+---------------------+
| tx_id | from_account | to_account | amount | tx_date             |
+-------+--------------+------------+--------+---------------------+
|     1 |         2500 |       1200 |    200 | 2026-02-07 23:59:52 |
|     2 |        34532 |       2105 |    500 | 2026-02-08 00:01:24 |
|     3 |        44242 |      34223 |   4500 | 2026-02-08 00:02:36 |
|     4 |        45232 |      67675 |  67000 | 2026-02-08 00:02:50 |
|     5 |        35532 |      77450 |  90000 | 2026-02-08 00:03:13 |
|     6 |       535353 |     775743 |    110 | 2026-02-08 00:03:28 |
+-------+--------------+------------+--------+---------------------+
6 rows in set (0.02 sec)

mysql> INSERT INTO transaction_history(tx_id, from_account, to_account, amount, tx_date) VALUES
    -> (10, 34244, 24234, 50000, '2026-02-09 03:03:55'),
    -> (11, 23444, 56734, 97428, '2026-01-10 02:45:23');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM transaction_history;
+-------+--------------+------------+--------+---------------------+
| tx_id | from_account | to_account | amount | tx_date             |
+-------+--------------+------------+--------+---------------------+
|     1 |         2500 |       1200 |    200 | 2026-02-07 23:59:52 |
|     2 |        34532 |       2105 |    500 | 2026-02-08 00:01:24 |
|     3 |        44242 |      34223 |   4500 | 2026-02-08 00:02:36 |
|     4 |        45232 |      67675 |  67000 | 2026-02-08 00:02:50 |
|     5 |        35532 |      77450 |  90000 | 2026-02-08 00:03:13 |
|     6 |       535353 |     775743 |    110 | 2026-02-08 00:03:28 |
|    10 |        34244 |      24234 |  50000 | 2026-02-09 03:03:55 |
|    11 |        23444 |      56734 |  97428 | 2026-01-10 02:45:23 |
+-------+--------------+------------+--------+---------------------+
8 rows in set (0.00 sec)