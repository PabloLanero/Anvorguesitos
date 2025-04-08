--tabla ingredients
INSERT INTO INGREDIENTS (id_ingredient, ingredientName, allergen) VALUES 
(1, 'Ternasco de Aragón (lamb or veal)', 'none'),
(2, 'Tronchón cheese', 'milk'),
(3, 'Tudela asparagus', 'none'),
(4, 'Truffle sauce', 'none'),
(5, 'Handmade pumpkin bread', 'wheat'),
(6, 'Piquillo peppers', 'none'),
(7, 'Belchite honey', 'none'),
(8, 'Fraga mustard', 'mustard'),
(9, 'Spelt bread', 'wheat'),
(10, 'Aragonese chicken breast', 'none'),
(11, 'Fresh cheese from Moncayo', 'milk'),
(12, 'Roasted tomato', 'none'),
(13, 'Fraga mustard sauce', 'mustard'),
(14, 'Ebro River trout', 'fish'),
(15, 'Piquillo peppers from Aragón', 'none'),
(16, 'Aragonese yogurt sauce', 'milk'),
(17, 'Seed bread', 'wheat'),
(18, 'Field lettuce', 'none'),
(19, 'Caramelized onion', 'none'),
(20, 'Extra virgin olive oil', 'none'),
(21, 'Jiloca beef', 'none'),
(22, 'Raf tomatoes (local)', 'none'),
(23, 'Albarracín lamb meat', 'none'),
(24, 'Sun-dried tomatoes', 'none'),
(25, 'Rosemary sauce', 'none'),
(26, 'Rustic village bread', 'wheat'),
(27, 'Arugula sprouts', 'none'),
(28, 'Manchego cheese', 'milk'),
(29, 'Azafrán', 'none'),
(30, 'Black olives from Aragón', 'none'),
(31, 'Ham from Teruel', 'none'),
(32, 'Gállego goat meat', 'none'),
(33, 'Sweet mustard sauce', 'mustard'),
(34, 'Rye bread', 'wheat'),
(35, 'Rabbit meat from La Muela', 'none'),
(36, 'Apple compote', 'none'),
(37, 'Wild boar meat from Sierra de Guara', 'none'),
(38, 'Spinach leaves', 'none'),
(39, 'Barbastro beef', 'none');

----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------


INSERT INTO PRODUCTS (id_product, productTitle, description, price, id_productCategory) VALUES
(1, 'Queen of the Pyrenees', 'The majesty of the Pyrenees in every bite. Tender and juicy Ternasco de Aragón lamb, accompanied by creamy Tronchón cheese, roasted Tudela asparagus, and a unique truffle sauce that adds a sophisticated touch. All served on rustic handmade bread that enhances the local flavors. A tribute to the heart of the Aragonese Pyrenees.', 16.50, 1),
(2, 'Under the Skies of Belchite', 'Inspired by the lands of Belchite, this burger brings together the best of the garden and tradition. Jiloca beef with a hint of Belchite honey and Fraga mustard creates the perfect balance of sweet and tangy. Served with caramelized onions, local Raf tomatoes, and spelt bread. An explosion of flavors that takes you straight to Belchite.', 14.50, 1),
(3, 'The Shadow of Moncayo', 'The shadow cast by Moncayo inspires this burger, combining the best of the mountains with the freshness of the garden. Juicy Aragonese chicken breast, accompanied by Moncayo fresh cheese, Tudela asparagus, and a refreshing Aragonese yogurt sauce. All served on seed bread, perfectly balancing the flavors.', 15, 1),
(4, 'Ebro River', 'A tribute to the majestic Ebro River. Ebro River trout with a smoky touch, accompanied by roasted Piquillo peppers and a drizzle of extra virgin olive oil. The smoothness of Manchego cheese and the freshness of field lettuce make this burger a unique experience, all on rye bread.', 17, 1),
(5, 'Land of Biescas', 'In honor of the lands of Biescas, this burger combines the intensity of Albarracín lamb with the creamy touch of Manchego cheese and the richness of sun-dried tomatoes. A rosemary sauce and rustic village bread complete this mountain-inspired recipe. The flavor of the highlands in every bite.', 18, 1),
(6, 'The Hoya of Huesca', 'Inspired by the fertile Hoya of Huesca, this burger features Barbastro beef paired with Piquillo peppers and a mild sweet mustard sauce. Combined with Moncayo fresh cheese and a touch of caramelized onions on rustic bread, this is a blend of traditional flavors with a modern twist.', 14, 1),
(7, 'Fields of Jiloca', 'Known for its authentic flavors, the fields of Jiloca are reflected in this burger. Jiloca beef accompanied by Tronchón cheese, sun-dried tomatoes, and a fresh mix of spinach leaves, all topped with Belchite honey sauce and served on spelt bread. A tribute to Aragonese land.', 13.50, 1),
(8, 'Dawn of the Maestre', 'A dawn in the Maestre lands is reflected in this burger full of freshness and contrast. Local pork with Moncayo fresh cheese, Piquillo peppers, and a touch of Belchite honey and sweet mustard create a perfectly balanced and delicious flavor. Served on rye bread for a gourmet experience.', 16, 1),
(9, 'The Matarraña Lamb', 'The richness of Matarraña is found in this burger made with Ternasco de Aragón lamb, accompanied by Manchego cheese, caramelized onions, and a hint of Fraga mustard sauce. The seed bread and arugula leaves complement the blend of flavors, creating a unique taste of the land.', 17.50, 1),
(10, 'Wind of Teruel', 'The wind of Teruel brings the strength of tradition. This burger combines wild boar meat from the Sierra de Guara, with Manchego cheese, sun-dried tomatoes, and a touch of sweet mustard sauce. All served on rustic bread, evoking the wild flavors of Teruel in every bite.', 14.50, 1),
(11, 'Essence of the Gállego', 'The essence of the Gállego land is found in this burger of Gállego goat meat, paired with Manchego cheese, Raf tomatoes, and a mild rosemary sauce. Served on rustic bread, this is a taste of authenticity from the region.', 15, 1),
(12, 'Under the Shadow of the Muela', 'The Muela inspires this burger made with rabbit meat from La Muela, a touch of apple compote, and sweet mustard sauce. Served with spinach leaves, Raf tomatoes, and a drizzle of extra virgin olive oil, all on rye bread. A delicate and flavorful mix that takes you to the calm of the lands under the shadow of the Muela.', 13, 1),
(13, 'The Green Alfranca', 'The freshness of the Alfranca fields is reflected in this burger. Beef paired with Moncayo fresh cheese, arugula sprouts, and a touch of extra virgin olive oil on seed bread. A combination of fresh and tasty ingredients for a light yet delicious experience.', 14, 1),
(14, 'Skies of the Sierra de Guara', 'The majesty of the skies of the Sierra de Guara is reflected in this burger made with wild boar meat, Tronchón cheese, Piquillo peppers, and a mild rosemary sauce. Served on rustic bread, this burger offers robust and authentic mountain flavors.', 18, 1),
(15, 'Barbastro Estate', 'A journey to the Barbastro Estate with this burger made from local Barbastro beef, Manchego cheese, sun-dried tomatoes, and a hint of Belchite honey. The perfect combination of local flavors on rye bread, ideal for savoring the best of the land.', 15.50, 1),
(16, 'Gourmet French Fries', 'Crispy, golden fries cooked to perfection, drizzled with extra virgin olive oil and fresh rosemary. The ideal side for any burger.', 4, 2),
(17, 'Crispy Onion Rings', 'Golden, battered onion rings, seasoned with local spices, crispy on the outside and tender on the inside.', 5, 2),
(18, 'Fresh Salad', 'A fresh mix of lettuce, arugula, Raf tomatoes, and caramelized onions, dressed with extra virgin olive oil and balsamic vinegar.', 5, 2),
(19, 'Water', 'A refreshing bottle of water to accompany your meal.', 2, 3),
(20, 'Cocacola', 'A classic Coca-Cola, sweet and refreshing.', 1.50, 3),
(21, 'Orange Fanta', 'A refreshing orange soda with a sweet and tangy taste.', 1.50, 3),
(22, 'Fanta de Limón', 'A refreshing lemon soda, perfect for a hot day.', 1.50, 3),
(23, 'Cariñena Red Wine', 'A smooth red wine from the Cariñena region, perfect for pairing with any meal.', 6, 3),
(24, 'Somontano White Wine', 'A crisp and aromatic white wine from the Somontano region, ideal for seafood or chicken dishes.', 6, 3),
(25, 'Ambar Beer', 'A refreshing local beer from the Ambar brewery.', 2, 3);

























--------------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------








--tabla product-categories
INSERT INTO PRODUCT_CATEGORIES (id_productCategory, name) VALUES
(1, 'Burger'),
(2, 'Side Dish'),
(3, 'Drink');
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------














--tabla stores
INSERT INTO STORES (id_store, modeStore, location) VALUES
(1,"Online", "Online"),
(2, "Physical", "San Ignacio de Loyola, n20");



--------------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------





--table customers
INSERT INTO CUSTOMERS (id_customer, firstName, lastName, emailCustomer, phoneCustomer, passwordCustomer, isRegistered)
VALUES
(1, 'Ana', 'García', 'ana.garcia@example.com', '5551234567', 'password123', 1),
(2, 'Carlos', 'Rodríguez', 'carlos.rodriguez@example.com', '5552345678', NULL, 0),
(3, 'Luisa', 'Martínez', 'luisa.martinez@example.com', '5553456789', 'luisa2025', 1),
(4, 'Juan', 'Pérez', 'juan.perez@example.com', '5554567890', NULL, 0),
(5, 'María', 'López', 'maria.lopez@example.com', '5555678901', 'maria2025', 1),
(6, 'Pedro', 'Sánchez', 'pedro.sanchez@example.com', '5556789012', NULL, 0),
(7, 'Elena', 'Fernández', 'elena.fernandez@example.com', '5557890123', 'elena123', 1),
(8, 'David', 'Gómez', 'david.gomez@example.com', '5558901234', NULL, 0),
(9, 'Isabel', 'Morales', 'isabel.morales@example.com', '5559012345', 'isabel2025', 1),
(10, 'Ricardo', 'Torres', 'ricardo.torres@example.com', '5550123456', NULL, 0);







--------------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------


--table payment_methods
INSERT INTO PAYMENT_METHODS (id_paymentMethod, paymentMethodName)
VALUES 
    (1, 'Credit card'),
    (2, 'Cash');




--------------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------


--table employees

INSERT INTO EMPLOYEES (
    id_employee, employeeFirstName, employeeLastName, hiringDate, 
    emailEmployee, phoneEmployee, passwordEmployee, salary, id_job, id_store
)
VALUES
    (1, 'Juan', 'Pérez', TO_DATE('2021-06-01', 'YYYY-MM-DD'), 'juan.perez@email.com', '600123456', '**********', 2200.00, 1, 1),
    (2, 'Marta', 'González', TO_DATE('2020-05-15', 'YYYY-MM-DD'), 'marta.gonzalez@email.com', '600654321', '**********', 1750.00, 2, 1),
    (3, 'Pedro', 'Martínez', TO_DATE('2022-02-10', 'YYYY-MM-DD'), 'pedro.martinez@email.com', '600789123', '**********', 2000.00, 1, 2),
    (4, 'Laura', 'Sánchez', TO_DATE('2019-08-20', 'YYYY-MM-DD'), 'laura.sanchez@email.com', '600321987', '**********', 1600.00, 2, 2),
    (5, 'Carlos', 'Rodríguez', TO_DATE('2021-11-12', 'YYYY-MM-DD'), 'carlos.rodriguez@email.com', '600654987', '**********', 1800.00, 2, 1),
    (6, 'Ana', 'López', TO_DATE('2023-01-25', 'YYYY-MM-DD'), 'ana.lopez@email.com', '600321654', '**********', 3200.00, 3, 1);









--------------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------


--table jobs

INSERT INTO JOBS (id_job, jobTitle, minSalary, maxSalary)
VALUES
    (1, 'Chef', 1500.00, 2500.00),
    (2, 'Salesperson', 1500.00, 1800.00),
    (3, 'Manager', 2500.00, 3500.00);








--------------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------







