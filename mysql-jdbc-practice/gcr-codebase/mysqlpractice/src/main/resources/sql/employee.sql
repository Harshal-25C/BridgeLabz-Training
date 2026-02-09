CREATE TABLE employee (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    emp_name VARCHAR(100),
    salary DOUBLE(),
    department VARCHAR(50)
);

mysql> SELECT * FROM employee;
+--------+-------------------+-----------+------------+
| emp_id | emp_name          | salary    | department |
+--------+-------------------+-----------+------------+
|      1 | Harshal Choudhary | 130000.00 | NULL       |
|      2 | Ayush Mishra      | 120000.00 | NULL       |
|      3 | Devarshi Mishra   | 120000.00 | NULL       |
|      4 | John Doe          |  20000.00 | NULL       |
|      5 | Hermione Granger  | 150000.00 | NULL       |
+--------+-------------------+-----------+------------+
5 rows in set (0.08 sec)

mysql> INSERT INTO employee(emp_id, emp_name, salary, department) VALUES
    -> (101, 'Abhishek', 55000, 'AIML'),
    -> (102, 'Rajeev', 40000, 'EC');
Query OK, 2 rows affected (0.07 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM employee;
+--------+-------------------+-----------+------------+
| emp_id | emp_name          | salary    | department |
+--------+-------------------+-----------+------------+
|      1 | Harshal Choudhary | 130000.00 | NULL       |
|      2 | Ayush Mishra      | 120000.00 | NULL       |
|      3 | Devarshi Mishra   | 120000.00 | NULL       |
|      4 | John Doe          |  20000.00 | NULL       |
|      5 | Hermione Granger  | 150000.00 | NULL       |
|    101 | Abhishek          |  55000.00 | AIML       |
|    102 | Rajeev            |  40000.00 | EC         |
+--------+-------------------+-----------+------------+
7 rows in set (0.01 sec)