CREATE TABLE specialties (
    specialty_id INT AUTO_INCREMENT PRIMARY KEY,
    specialty_name VARCHAR(100) UNIQUE NOT NULL,
    is_active BOOLEAN DEFAULT TRUE
);

CREATE TABLE doctors (
    doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    contact VARCHAR(15) UNIQUE NOT NULL,
    consultation_fee DECIMAL(10,2) NOT NULL,
    specialty_id INT,
    is_active BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (specialty_id) REFERENCES specialties(specialty_id)
);

ALTER TABLE doctors
ADD INDEX idx_doctor_specialty (specialty_id);

mysql> CREATE TABLE specialties (
    -> specialty_id INT AUTO_INCREMENT PRIMARY KEY,
    -> specialty_name VARCHAR(100) UNIQUE NOT NULL,
    -> is_active BOOLEAN DEFAULT TRUE
    -> );
Query OK, 0 rows affected (0.10 sec)

mysql> CREATE TABLE doctors (
    -> doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    -> name VARCHAR(100) NOT NULL,
    -> contact VARCHAR(15) UNIQUE NOT NULL,
    -> consultation_fee DECIMAL(10,2) NOT NULL,
    -> specialty_id INT,
    -> is_active BOOLEAN DEFAULT TRUE,
    -> FOREIGN KEY (specialty_id) REFERENCES specialties(specialty_id)
    -> );
Query OK, 0 rows affected (0.07 sec)

mysql> SHOW TABLES;
+---------------------------------+
| Tables_in_mysqlscenariopractice |
+---------------------------------+
| doctors                         |
| patients                        |
| specialties                     |
+---------------------------------+
3 rows in set (0.00 sec)
 
mysql> INSERT INTO specialties (specialty_name) VALUES
    -> ('Cardiology'),
    -> ('Neurology');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> INSERT INTO doctors (doctor_id, name, contact, consultation_fee, specialty_id, is_active)
    -> VALUES
    -> (122, 'Harshal', '9123984534', 500, 1, TRUE),
    -> (121, 'Johnson', '9144246278', 1000, 2, TRUE);
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM doctors;
+-----------+---------+------------+------------------+--------------+-----------+
| doctor_id | name    | contact    | consultation_fee | specialty_id | is_active |
+-----------+---------+------------+------------------+--------------+-----------+
|       121 | Johnson | 9144246278 |          1000.00 |            2 |         1 |
|       122 | Harshal | 9123984534 |           500.00 |            1 |         1 |
+-----------+---------+------------+------------------+--------------+-----------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM specialties;
+--------------+----------------+-----------+
| specialty_id | specialty_name | is_active |
+--------------+----------------+-----------+
|            1 | Cardiology     |         1 |
|            2 | Neurology      |         1 |
+--------------+----------------+-----------+
2 rows in set (0.00 sec)
