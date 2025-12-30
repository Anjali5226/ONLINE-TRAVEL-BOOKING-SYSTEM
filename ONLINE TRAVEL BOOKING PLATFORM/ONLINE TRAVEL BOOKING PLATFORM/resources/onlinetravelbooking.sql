-- Active: 1767075484460@@127.0.0.1@3306@onlinetravelbooking
-- ==========================
-- DATABASE: onlinetravelbooking
-- ==========================
CREATE DATABASE IF NOT EXISTS onlinetravelbooking;
USE onlinetravelbooking;

-- ==========================
-- TABLE: users
-- ==========================
CREATE TABLE IF NOT EXISTS users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(20) DEFAULT 'USER'
);

-- Sample data
INSERT INTO users(name,email,password,role) VALUES
('Alice','alice@example.com','password123','USER'),
('Admin','admin@example.com','admin123','ADMIN');

-- ==========================
-- TABLE: flights
-- ==========================
CREATE TABLE IF NOT EXISTS flights (
    flight_id INT AUTO_INCREMENT PRIMARY KEY,
    source VARCHAR(50),
    destination VARCHAR(50),
    departure_time VARCHAR(50),
    price DOUBLE
);

INSERT INTO flights(source,destination,departure_time,price) VALUES
('Delhi','Mumbai','2025-12-31 10:00',5000),
('Mumbai','Bangalore','2025-12-31 15:00',4000);

-- ==========================
-- TABLE: hotels
-- ==========================
CREATE TABLE IF NOT EXISTS hotels (
    hotel_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    location VARCHAR(100),
    price_per_night DOUBLE
);

INSERT INTO hotels(name,location,price_per_night) VALUES
('Taj Hotel','Mumbai',8000),
('ITC Gardenia','Bangalore',7000);

-- ==========================
-- TABLE: bookings
-- ==========================
CREATE TABLE IF NOT EXISTS bookings (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    booking_type VARCHAR(20),
    reference_id INT,
    total_amount DOUBLE,
    booking_date VARCHAR(30),
    status VARCHAR(20),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

-- ==========================
-- TABLE: payments
-- ==========================
CREATE TABLE IF NOT EXISTS payments (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    booking_id INT,
    amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(20),
    payment_date DATE,
    FOREIGN KEY (booking_id) REFERENCES bookings(booking_id)
);
