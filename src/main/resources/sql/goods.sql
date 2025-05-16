/** For Section 24: Sample Batch to insert data from CSV file to DB*/
CREATE TABLE goods (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL
);