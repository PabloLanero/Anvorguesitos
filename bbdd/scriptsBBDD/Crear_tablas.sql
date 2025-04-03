CREATE TABLE INGREDIENTS(
    id_ingredient INT PRIMARY KEY,
    ingredientName VARCHAR2(100),
    allergen VARCHAR2(100));
	
CREATE TABLE MENUS(
    id_menu INT PRIMARY KEY,
    startDate DATE,
	id_store INT);

CREATE TABLE PRODUCTS(
  2  id_product INT PRIMARY KEY,
  3  description VARCHAR2(250),
  4  price DECIMAL(2),
  5  id_productCategory INT);
