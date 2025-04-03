CREATE TABLE INGREDIENTS(
    id_ingredient INT PRIMARY KEY,
    ingredientName VARCHAR2(100),
    allergen VARCHAR2(100));
	

CREATE TABLE PRODUCTS(
    id_product INT PRIMARY KEY,
    description VARCHAR2(250),
    price DECIMAL(9,2),
    id_productCategory INT);

CREATE TABLE PRODUCT_CATEGORIES(
    id_productCategory INT PRIMARY KEY,
    name VARCHAR2(50));

CREATE TABLE STORES(
    id_store INT PRIMARY KEY,
    modeStore VARCHAR2(30),
    location VARCHAR2(150),
    id_product INT);

CREATE TABLE CUSTOMERS(
    id_customer INT PRIMARY KEY,
    firstName VARCHAR2(150),
    lastName VARCHAR2(150),
    emailCustomer VARCHAR2(150),
    phoneCustomer VARCHAR2(10),
    isRegistered NUMBER(1) CHECK (isAvailable IN (1, 0)));

CREATE TABLE PAYMENT_METHODS(
    id_paymentMethod INT PRIMARY KEY,
    paymentMethodName VARCHAR2(32));

CREATE TABLE EMPLOYEES(
    id_employee INT PRIMARY KEY,
    employeeFirstName VARCHAR2(64),
    employeeLastName VARCHAR2(64),
    hiringDate DATE,
    emailEmployee VARCHAR2(128),
    phoneEmployee VARCHAR2(16),
    salary DECIMAL(10,2),
    id_job INT,
    id_store INT);

CREATE TABLE JOBS(
    id_job INT PRIMARY KEY,
    jobTitle VARCHAR2(64),
    minSalary DECIMAL(10,2),
    maxSalary DECIMAL(10,2));