CREATE TABLE patients2 (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    contact VARCHAR(15) UNIQUE NOT NULL,
    dob DATE,
    gender VARCHAR(10)
);


CREATE TABLE appointments (
    appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT NOT NULL,
    doctor_id INT NOT NULL,
    appointment_date DATE NOT NULL,
    appointment_time TIME NOT NULL,
    status VARCHAR(20) DEFAULT 'SCHEDULED',
    FOREIGN KEY (patient_id) REFERENCES patients2(patient_id),
    FOREIGN KEY (doctor_id) REFERENCES doctors(doctor_id)
);

CREATE INDEX idx_doctor_date ON appointments (doctor_id, appointment_date);

mysql> CREATE TABLE patients2(
    ->   patient_id INT AUTO_INCREMENT PRIMARY KEY,
    ->   name VARCHAR(100) NOT NULL,
    ->   contact VARCHAR(15) UNIQUE NOT NULL,
    ->   dob DATE,
    ->   gender VARCHAR(10)
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql>
mysql> CREATE TABLE appointments (
    ->   appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    ->   patient_id INT NOT NULL,
    ->   doctor_id INT NOT NULL,
    ->   appointment_date DATE NOT NULL,
    ->   appointment_time TIME NOT NULL,
    ->   status VARCHAR(20) DEFAULT 'SCHEDULED',
    ->   FOREIGN KEY (patient_id) REFERENCES patients2(patient_id),
    ->   FOREIGN KEY (doctor_id) REFERENCES doctors(doctor_id)
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql> CREATE INDEX idx_doctor_date ON appointments (doctor_id, appointment_date);
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> CREATE TABLE appointment_audit (
    ->   audit_id INT AUTO_INCREMENT PRIMARY KEY,
    ->   appointment_id INT,
    ->   action VARCHAR(50),
    ->   action_time DATETIME DEFAULT CURRENT_TIMESTAMP
    -> );
Query OK, 0 rows affected (0.02 sec)

mysql> INSERT INTO patients2 (patient_id, name, contact, dob, gender) VALUES
    -> (231, 'Harshal', '9483483022', '2002-09-25', 'male'),
    -> (3421, 'Lame dose', '6945024830', '2025-01-11', 'male');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM patients2;
+------------+-----------+------------+------------+--------+
| patient_id | name      | contact    | dob        | gender |
+------------+-----------+------------+------------+--------+
|        231 | Harshal   | 9483483022 | 2002-09-25 | male   |
|       3421 | Lame dose | 6945024830 | 2025-01-11 | male   |
+------------+-----------+------------+------------+--------+
2 rows in set (0.00 sec)

mysql> INSERT INTO appointments
    -> (patient_id, doctor_id, appointment_date, appointment_time, status)
    -> VALUES
    -> (231, 122, '2026-02-10', '10:30:00', 'SCHEDULED'),
    -> (3421, 121, '2026-02-10', '11:00:00', 'SCHEDULED'),
    -> (231, 121, '2026-02-11', '09:45:00', 'SCHEDULED'),
    -> (3421, 122, '2026-02-11', '14:15:00', 'SCHEDULED');
Query OK, 4 rows affected (0.00 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM appointments;
+----------------+------------+-----------+------------------+------------------+-----------+
| appointment_id | patient_id | doctor_id | appointment_date | appointment_time | status    |
+----------------+------------+-----------+------------------+------------------+-----------+
|              1 |        231 |       122 | 2026-02-10       | 10:30:00         | SCHEDULED |
|              2 |       3421 |       121 | 2026-02-10       | 11:00:00         | SCHEDULED |
|              3 |        231 |       121 | 2026-02-11       | 09:45:00         | SCHEDULED |
|              4 |       3421 |       122 | 2026-02-11       | 14:15:00         | SCHEDULED |
+----------------+------------+-----------+------------------+------------------+-----------+
4 rows in set (0.00 sec)