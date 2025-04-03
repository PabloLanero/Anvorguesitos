CREATE TABLE INGREDIENTS(
    id_ingredient INT PRIMARY KEY,
    ingredientName VARCHAR2(100),
    allergen VARCHAR2(100));
	
CREATE TABLE MENUS(
    id_menu INT PRIMARY KEY,
    startDate DATE,
	id_store INT);

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
    id_menu INT);

CREATE TABLE CUSTOMERS(
    id_customer INT PRIMARY KEY,
    firstName VARCHAR2(150),
    lastName VARCHAR2(150),
    emailCustomer VARCHAR2(150),
    phoneCustomer VARCHAR2(10),
    isRegistered BOOLEAN);