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