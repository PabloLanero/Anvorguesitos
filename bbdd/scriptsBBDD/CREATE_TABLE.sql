#--Con MYSQL--

#--Tablas principales

#--La tabla de ingredientes
#CREATE DATABASE HAMBEARGUESITOS;



CREATE TABLE INGREDIENTS(
    id_ingredient INT PRIMARY KEY AUTO_INCREMENT,
    ingredientName VARCHAR(100),
    allergen VARCHAR(100));
	
#--La tabla de productos

CREATE TABLE PRODUCTS(
    id_product INT PRIMARY KEY AUTO_INCREMENT,
    productTitle  VARCHAR(100),
    description VARCHAR(350),
    price DECIMAL(9,2),
    id_productCategory INT,
    imagePath VARCHAR(250));

#--La tabla de categoria de productos

CREATE TABLE PRODUCT_CATEGORIES(
    id_productCategory INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50));

#--La tabla de tienda (Para la online y la fisica)

CREATE TABLE STORES(
    id_store INT PRIMARY KEY AUTO_INCREMENT,
    modeStore VARCHAR(30),
    location VARCHAR(150));

#--La tabla de clientes

CREATE TABLE CUSTOMERS(
    id_customer INT PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(150),
    lastName VARCHAR(150),
    emailCustomer VARCHAR(150),
    phoneCustomer VARCHAR(10),
    passwordCustomer VARCHAR(20),
    isRegistered BOOLEAN);

#--La tabla de metodo de pagos

CREATE TABLE PAYMENT_METHODS(
    id_paymentMethod INT PRIMARY KEY AUTO_INCREMENT,
    paymentMethodName VARCHAR(32));

#--La tabla de empleados

CREATE TABLE EMPLOYEES(
    id_employee INT PRIMARY KEY AUTO_INCREMENT,
    employeeFirstName VARCHAR(64),
    employeeLastName VARCHAR(64),
    hiringDate DATE,
    emailEmployee VARCHAR(128),
    phoneEmployee VARCHAR(16),
    passwordEmployee VARCHAR(20),
    salary DECIMAL(10,2),
    id_job INT,
    id_store INT);

-- La tabla de trabajos

CREATE TABLE JOBS(
    id_job INT PRIMARY KEY AUTO_INCREMENT,
    jobTitle VARCHAR(64),
    minSalary DECIMAL(10,2),
    maxSalary DECIMAL(10,2));

#--Tablas intermedias-------------------------------------------------------------------------------------------------------------
    
CREATE TABLE INGREDIENTS_PRODUCTS(
	id_ingredients INT PRIMARY KEY AUTO_INCREMENT,
    id_ingredient INT,
    id_product INT);


CREATE TABLE ORDERS_HEADER(
	id_orderHeader INT PRIMARY KEY AUTO_INCREMENT,
	orderDate DATE,
	shippingAddress VARCHAR(128),
	isTransactionAcepted  BOOLEAN,
	orderStatus VARCHAR(128),
    id_paymentMethod INT,
    id_customer INT,
    id_employee INT);

CREATE TABLE ORDERS_LINE(
    id_orderLine INT PRIMARY KEY AUTO_INCREMENT,
    orderQuantity INT,
    id_product INT,
    id_orderHeader INT);
 
CREATE VIEW view_salesman AS
SELECT emp.id_employee, emp.employeeFirstName, emp.employeeLastName
FROM employees emp INNER JOIN JOBS job ON emp.id_job = job.id_job
WHERE job.jobTitle = 'Salesperson';
