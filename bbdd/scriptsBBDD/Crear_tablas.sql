--Tablas principales

--La tabla de ingredientes

CREATE TABLE INGREDIENTS(
    id_ingredient INT PRIMARY KEY,
    ingredientName VARCHAR2(100),
    allergen VARCHAR2(100));
	
--La tabla de productos

CREATE TABLE PRODUCTS(
    id_product INT PRIMARY KEY,
    description VARCHAR2(250),
    price DECIMAL(9,2),
    id_productCategory INT);

--La tabla de categoria de productos

CREATE TABLE PRODUCT_CATEGORIES(
    id_productCategory INT PRIMARY KEY,
    name VARCHAR2(50));

--La tabla de tienda (Para la online y la fisica)

CREATE TABLE STORES(
    id_store INT PRIMARY KEY,
    modeStore VARCHAR2(30),
    location VARCHAR2(150));

--La tabla de clientes

CREATE TABLE CUSTOMERS(
    id_customer INT PRIMARY KEY,
    firstName VARCHAR2(150),
    lastName VARCHAR2(150),
    emailCustomer VARCHAR2(150),
    phoneCustomer VARCHAR2(10),
    passwordCustomer VARCHAR2(20),
    isRegistered NUMBER(1) CHECK (isRegistered IN (1, 0)));

--La tabla de metodo de pagos

CREATE TABLE PAYMENT_METHODS(
    id_paymentMethod INT PRIMARY KEY,
    paymentMethodName VARCHAR2(32));

--La tabla de empleados

CREATE TABLE EMPLOYEES(
    id_employee INT PRIMARY KEY,
    employeeFirstName VARCHAR2(64),
    employeeLastName VARCHAR2(64),
    hiringDate DATE,
    emailEmployee VARCHAR2(128),
    phoneEmployee VARCHAR2(16),
    passwordEmployee VARCHAR2(20),
    salary DECIMAL(10,2),
    id_job INT,
    id_store INT);

-- La tabla de trabajos

CREATE TABLE JOBS(
    id_job INT PRIMARY KEY,
    jobTitle VARCHAR2(64),
    minSalary DECIMAL(10,2),
    maxSalary DECIMAL(10,2));

--Tablas intermedias
    
CREATE TABLE INGREDIENTS_PRODUCTS(
	id_ingredients INT PRIMARY KEY,
    id_ingredient INT,
    id_product INT);


CREATE TABLE ORDERS_HEADER(
	id_orderHeader INT PRIMARY KEY,
	orderDate DATE,
	shippingAddress VARCHAR2(128),
	isTransactionAcepted  NUMBER(1) CHECK (isTransactionAcepted IN (1,0)),
	orderStatus VARCHAR2(128),
    id_paymentMethod INT,
    id_customer INT,
    id_store INT);

CREATE TABLE ORDERS_LINE(
    id_orderLine INT PRIMARY KEY,
    orderQuantity INT,
    id_product INT,
    id_orderHeader INT);

CREATE TABLE PRODUCTS_STORE(
    id_productStore INT PRIMARY KEY,
    id_product INT,
    id_store INT);   
	
