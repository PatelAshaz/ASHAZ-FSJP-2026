-- Run this in MySQL Workbench, or via: mysql -u root -p < database_setup.sql

CREATE DATABASE IF NOT EXISTS logindb;
USE logindb;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL
);

-- Sample test user (username: admin / password: admin123)
INSERT INTO users (username, password) VALUES ('admin', 'admin123');
