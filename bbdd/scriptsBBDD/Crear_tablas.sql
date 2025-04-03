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
    price DECIMAL(2),
    id_productCategory INT);
