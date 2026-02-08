## 📅 MySQL Database & JDBC(Java-Database-Connectivity)

---

### 📅 Day 1 – MySQL & JDBC Fundamentals  
**(Date: 06-Jan-2026)**         
**Branch:** `mysql-jdbc-practice`

#### 📁Project Structure

```
BridgeLabz-Training/
|
├── 📁 mysql-jdbc-practice/
│   ├── 📁 gcr-codebase/
│   │   └── 📁 mysqlpractice/
│   │       └── 📁 src/
│   │           |── 📁 main/
│   │           |   ├── 📁 java/
|   |           |   |   └── 📁 com/
|   |           |   |       └── 📁 mysqlpractice/
|   |           |   |                   
|   |           |   └── 📁 resources/
|   |           |       └── 📁 sql/
|   |           |
|   |           └── 📁 test/
│   │               ├── 📁 java/
|   |               └── 📁 resources/
|   |            
|   └── 📁 scenario-based-codebase/
|
└── README.md
```

#### 📁 gcr-codebse structure(Maven Project)

```
mysqlpractice/
│
├── pom.xml
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── mysqlpractice/
│   │   │           | 
│   │   │           ├── util/
│   │   │           │   └── DBConnection.java
│   │   │           │
│   │   │           ├── employeeManagementSystem/
│   │   │           │   ├── Employee.java
│   │   │           │   ├── EmployeeDAO.java
│   │   │           │   └── EmployeeApp.java
│   │   │           │
│   │   │           ├── bankingTransactionManagement/
│   │   │           │   ├── Account.java
│   │   │           │   ├── BankingDAO.java
│   │   │           │   └── BankingApp.java
│   │   │           │
│   │   │           └── libraryManagementSystem/
│   │   │               ├── Book.java
│   │   │               ├── Student.java
│   │   │               ├── LibraryDAO.java
│   │   │               └── LibraryApp.java
│   │   │
│   │   └── resources/
│   │       └── sql/
│   │           ├── employee.sql
│   │           ├── banking.sql
│   │           └── library.sql
│   │
│   └── test/
│       |── java/
|       └── resources/
│           └── (optional later)
│
└── .gitignore

```

#### 🔹 Topics Covered
- Overview of **MySQL as an RDBMS** and real-world database usage
- **Database design principles**: normalization (1NF to BCNF), primary & foreign keys
- **Constraints**: NOT NULL, UNIQUE, CHECK, DEFAULT, AUTO_INCREMENT
- **SQL command categories**: DDL, DML, DQL, DCL, TCL
- **Joins** (INNER, LEFT, RIGHT), subqueries, CTEs, and window functions
- **Transactions & ACID properties** for data consistency
- **Indexing concepts** in MySQL & SQL Server
- Query performance tuning using `EXPLAIN`

#### 🔹 Hands-On Practice
- Practiced SQL queries on real-world scenarios:
  - **Employee Management System** – CRUD operations, search & updates
  - **Banking System** – balance handling with transactions
  - **Library Management System** – book inventory, issue/return, user tracking

✔ Strengthened understanding of **data integrity, performance optimization, and JDBC-ready SQL design**

👉 [Day 1 - MySQL Practice](https://github.com/Harshal-25C/BridgeLabz-Training/tree/mysql-jdbc-practice/mysql-jdbc-practice/gcr-codebase/mysqlpractice/src/main/java/com/mysqlpractice)

---

### 📅 Day 2 – MySQL + JDBC Scenario Practice & PowerSkill Training  
**(Date: 07-Jan-2026)**    
**Branch:** `mysql-jdbc-practice`

#### 🔹 Technical Practice (Scenario-Based)
Worked on **6 real-world JDBC + MySQL scenarios** based on a **Hospital Management System**, covering:
- **Patient Management:** registration, update, search, visit history (CRUD, LIKE, JOINs)
- **Doctor Management:** add/update specialty, view by specialty, soft delete
- **Appointment Scheduling:** book, cancel, reschedule, availability check (transactions)
- **Medical Records:** visits, prescriptions, patient history (one-to-many, batch inserts)
- **Billing & Payments:** bill generation, payments, outstanding bills, revenue reports
- **System Admin:** specialty lookup, audit logs, backup concepts

#### 🔹 Key Concepts Applied
- Primary & Foreign Keys, Auto-Increment  
- INNER / LEFT JOINs, Subqueries  
- Transactions (COMMIT / ROLLBACK)  
- PreparedStatement (SQL injection prevention)  
- Aggregate functions (COUNT, SUM, AVG)  
- Batch operations, ResultSet handling, indexing & triggers  

#### 🔹 PowerSkill Training
- Attended **PowerSkill session on Communication Skills**
- Learned importance of **clear speaking, active listening, confidence, and professional interaction**

✔ Strengthened both **backend database skills** and **communication abilities** for real-world development

👉 [Day 2 - MySQL Scenario-Based Practice](https://github.com/Harshal-25C/BridgeLabz-Training/tree/mysql-jdbc-practice/mysql-jdbc-practice/scenario-based-codebase/mysqlScenarioPractice/src/main/java/com/mysqlScenarioPractice)

---