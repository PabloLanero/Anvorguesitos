
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

INSERT INTO PRODUCT_CATEGORIES (id_productCategory, name) VALUES
(1, 'Burger'),
(2, 'Side Dish'),
(3, 'Drink');
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
(22, 'Lemon Fanta', 'A refreshing lemon soda, perfect for a hot day.', 1.50, 3),
(23, 'Cariñena Red Wine', 'A smooth red wine from the Cariñena region, perfect for pairing with any meal.', 6, 3),
(24, 'Somontano White Wine', 'A crisp and aromatic white wine from the Somontano region, ideal for seafood or chicken dishes.', 6, 3),
(25, 'Ambar Beer', 'A refreshing local beer from the Ambar brewery.', 2, 3);


----------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO STORES (id_store, modeStore, location) VALUES
(1,'Online', 'Online'),
(2, 'Physical', 'San Ignacio de Loyola, n20');


----------------------------------------------------------------------------------------------------------------------------------------------------------
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



----------------------------------------------------------------------------------------------------------------------------------------------------------


INSERT INTO PAYMENT_METHODS (id_paymentMethod, paymentMethodName)
VALUES 
    (1, 'Credit card'),
    (2, 'Cash');




----------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO JOBS (id_job, jobTitle, minSalary, maxSalary)
VALUES
    (1, 'Chef', 1500.00, 2500.00),
    (2, 'Salesperson', 1500.00, 1800.00),
    (3, 'Manager', 2500.00, 3500.00);


----------------------------------------------------------------------------------------------------------------------------------------------------------
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











----------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------TABLAS INTERMEDIAS------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------




INSERT INTO INGREDIENTS_PRODUCTS (id_ingredients, id_ingredient, id_product) VALUES
-- Queen of the Pyrenees
(1, 1, 1),  -- Ternasco de Aragón (lamb or veal)
(2, 2, 1),  -- Tronchón cheese
(3, 3, 1),  -- Tudela asparagus
(4, 4, 1),  -- Truffle sauce
(5, 5, 1),  -- Handmade pumpkin bread

-- Under the Skies of Belchite
(6, 6, 2),  -- Jiloca beef
(7, 7, 2),  -- Belchite honey
(8, 8, 2),  -- Fraga mustard
(9, 9, 2),  -- Caramelized onion
(10, 22, 2), -- Raf tomatoes (local)
(11, 17, 2), -- Spelt bread

-- The Shadow of Moncayo
(12, 10, 3), -- Aragonese chicken breast
(13, 11, 3), -- Fresh cheese from Moncayo
(14, 3, 3),  -- Tudela asparagus
(15, 16, 3), -- Aragonese yogurt sauce
(16, 17, 3), -- Seed bread

-- Ebro River
(17, 14, 4), -- Ebro River trout
(18, 6, 4),  -- Piquillo peppers
(19, 20, 4), -- Extra virgin olive oil
(20, 28, 4), -- Manchego cheese
(21, 18, 4), -- Field lettuce
(22, 34, 4), -- Rye bread

-- Land of Biescas
(23, 23, 5), -- Albarracín lamb meat
(24, 28, 5), -- Manchego cheese
(25, 24, 5), -- Sun-dried tomatoes
(26, 25, 5), -- Rosemary sauce
(27, 26, 5), -- Rustic village bread

-- The Hoya of Huesca
(28, 32, 6), -- Barbastro beef
(29, 6, 6),  -- Piquillo peppers
(30, 11, 6), -- Moncayo fresh cheese
(31, 19, 6), -- Caramelized onions
(32, 9, 6),  -- Rustic bread

-- Fields of Jiloca
(33, 23, 7), -- Jiloca beef
(34, 2, 7),  -- Tronchón cheese
(35, 24, 7), -- Sun-dried tomatoes
(36, 38, 7), -- Spinach leaves
(37, 7, 7),  -- Belchite honey
(38, 9, 7),  -- Spelt bread

-- Dawn of the Maestre
(39, 10, 8), -- Local pork
(40, 11, 8), -- Moncayo fresh cheese
(41, 6, 8),  -- Piquillo peppers
(42, 7, 8),  -- Belchite honey
(43, 33, 8), -- Sweet mustard sauce
(44, 34, 8), -- Rye bread

-- The Matarraña Lamb
(45, 1, 9),  -- Ternasco de Aragón (lamb or veal)
(46, 28, 9), -- Manchego cheese
(47, 19, 9), -- Caramelized onions
(48, 13, 9), -- Fraga mustard sauce
(49, 17, 9), -- Seed bread
(50, 27, 9), -- Arugula sprouts

-- Wind of Teruel
(51, 37, 10), -- Wild boar meat from Sierra de Guara
(52, 28, 10), -- Manchego cheese
(53, 24, 10), -- Sun-dried tomatoes
(54, 33, 10), -- Sweet mustard sauce
(55, 26, 10), -- Rustic village bread

-- Essence of the Gállego
(56, 32, 11), -- Gállego goat meat
(57, 28, 11), -- Manchego cheese
(58, 22, 11), -- Raf tomatoes
(59, 25, 11), -- Rosemary sauce
(60, 26, 11), -- Rustic village bread

-- Under the Shadow of the Muela
(61, 35, 12), -- Rabbit meat from La Muela
(62, 36, 12), -- Apple compote
(63, 33, 12), -- Sweet mustard sauce
(64, 38, 12), -- Spinach leaves
(65, 22, 12), -- Raf tomatoes
(66, 20, 12), -- Extra virgin olive oil
(67, 34, 12), -- Rye bread

-- The Green Alfranca
(68, 32, 13), -- Beef
(69, 11, 13), -- Moncayo fresh cheese
(70, 27, 13), -- Arugula sprouts
(71, 20, 13), -- Extra virgin olive oil
(72, 17, 13), -- Seed bread

-- Skies of the Sierra de Guara
(73, 37, 14), -- Wild boar meat
(74, 2, 14),  -- Tronchón cheese
(75, 6, 14),  -- Piquillo peppers
(76, 25, 14), -- Rosemary sauce
(77, 26, 14), -- Rustic village bread

-- Barbastro Estate
(78, 32, 15), -- Barbastro beef
(79, 28, 15), -- Manchego cheese
(80, 24, 15), -- Sun-dried tomatoes
(81, 7, 15),  -- Belchite honey
(82, 34, 15), -- Rye bread

-- Bebidas (sin ingredientes asignados)
(83, NULL, 16), -- Gourmet French Fries (sin ingredientes relacionados)
(84, 5, 17),  -- Crispy Onion Rings (wheat)
(85, NULL, 18), -- Fresh Salad (sin ingredientes relacionados)
(86, NULL, 19), -- Water (sin ingredientes)
(87, NULL, 20), -- Cocacola (sin ingredientes)
(88, NULL, 21), -- Orange Fanta (sin ingredientes)
(89, NULL, 22), -- Lemon Fanta (sin ingredientes)
(90, NULL, 23), -- Cariñena Red Wine (sin ingredientes)
(91, NULL, 24), -- Somontano White Wine (sin ingredientes)
(92, NULL, 25); -- Ambar Beer (sin ingredientes)



--------------------------------------------------------------------------------------------------------------------------------------------------------------------



INSERT INTO ORDERS_HEADER (id_orderHeader, orderDate, shippingAddress, isTransactionAcepted, orderStatus, id_paymentMethod, id_customer, id_employee) VALUES
(1, TO_DATE('2025-04-01', 'YYYY-MM-DD'), 'Calle Mayor 123, Zaragoza', 1, 'Delivered', 1, 1, 2),
(2, TO_DATE('2025-04-02', 'YYYY-MM-DD'), 'Av. Goya 45, Zaragoza', 1, 'Shipped', 2, 3, 3),
(3, TO_DATE('2025-04-03', 'YYYY-MM-DD'), 'Calle del Sol 78, Huesca', 0, 'Cancelled', 1, 5, 1),
(4, TO_DATE('2025-04-04', 'YYYY-MM-DD'), 'Paseo Independencia 89, Zaragoza', 1, 'Processing', 1, 7, 4),
(5, TO_DATE('2025-04-05', 'YYYY-MM-DD'), 'Calle Luna 22, Teruel', 1, 'Delivered', 2, 9, 2);

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO ORDERS_LINE (id_orderLine, orderQuantity, id_product, id_orderHeader) VALUES
(1, 2, 1, 1),   -- 2x Queen of the Pyrenees
(2, 1, 16, 1),  -- 1x Gourmet French Fries

(3, 1, 3, 2),   -- 1x The Shadow of Moncayo
(4, 2, 19, 2),  -- 2x Water

(5, 1, 6, 3),   -- 1x The Hoya of Huesca

(6, 1, 11, 4),  -- 1x Essence of the Gállego
(7, 1, 23, 4),  -- 1x Cariñena Red Wine

(8, 2, 2, 5),   -- 2x Under the Skies of Belchite
(9, 1, 17, 5);  -- 1x Crispy Onion Rings

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
