CREATE TABLE INGREDIENTS(
    id_ingredient INT PRIMARY KEY,
    ingredientName VARCHAR2(100),
    allergen VARCHAR2(100));
	
CREATE TABLE MENUS(
    id_menu INT PRIMARY KEY,
    startDate DATE,
	id_store INT);
