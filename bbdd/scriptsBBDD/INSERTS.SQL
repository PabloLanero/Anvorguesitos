
INSERT INTO INGREDIENTS ( ingredientName, allergen) VALUES 
('Ternasco de Aragón (lamb or veal)', 'none'),
('Tudela asparagus', 'none'),
('Tronchón cheese', 'milk'),
('Truffle sauce', 'none'),
('Handmade pumpkin bread', 'wheat'),
('Piquillo peppers', 'none'),
('Belchite honey', 'none'),
('Fraga mustard', 'mustard'),
('Spelt bread', 'wheat'),
('Aragonese chicken breast', 'none'),
('Fresh cheese from Moncayo', 'milk'),
('Roasted tomato', 'none'),
('Fraga mustard sauce', 'mustard'),
('Ebro River trout', 'fish'),
('Piquillo peppers from Aragón', 'none'),
('Aragonese yogurt sauce', 'milk'),
('Seed bread', 'wheat'),
('Field lettuce', 'none'),
('Caramelized onion', 'none'),
('Extra virgin olive oil', 'none'),
('Raf tomatoes (local)', 'none'),
('Jiloca beef', 'none'),
('Albarracín lamb meat', 'none'),
('Sun-dried tomatoes', 'none'),
('Rosemary sauce', 'none'),
('Rustic village bread', 'wheat'),
('Arugula sprouts', 'none'),
('Manchego cheese', 'milk'),
('Azafrán', 'none'),
('Black olives from Aragón', 'none'),
('Ham from Teruel', 'none'),
('Gállego goat meat', 'none'),
('Sweet mustard sauce', 'mustard'),
('Rye bread', 'wheat'),
('Rabbit meat from La Muela', 'none'),
('Apple compote', 'none'),
('Wild boar meat from Sierra de Guara', 'none'),
('Spinach leaves', 'none'),
('Barbastro beef', 'none');

----------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO PRODUCT_CATEGORIES ( name) VALUES
('Burger'),
('Side Dish'),
('Drink');
----------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO PRODUCTS (productTitle, description, price, id_productCategory) VALUES
('Queen of the Pyrenees', 'The majesty of the Pyrenees in every bite. Tender and juicy Ternasco de Aragón lamb, accompanied by creamy Tronchón cheese, roasted Tudela asparagus, and a unique truffle sauce that adds a sophisticated touch. All served on rustic handmade bread that enhances the local flavors. A tribute to the heart of the Aragonese Pyrenees.', 16.50, 1),
('Under the Skies of Belchite', 'Inspired by the lands of Belchite, this burger brings together the best of the garden and tradition. Jiloca beef with a hint of Belchite honey and Fraga mustard creates the perfect balance of sweet and tangy. Served with caramelized onions, local Raf tomatoes, and spelt bread. An explosion of flavors that takes you straight to Belchite.', 14.50, 1),
('The Shadow of Moncayo', 'The shadow cast by Moncayo inspires this burger, combining the best of the mountains with the freshness of the garden. Juicy Aragonese chicken breast, accompanied by Moncayo fresh cheese, Tudela asparagus, and a refreshing Aragonese yogurt sauce. All served on seed bread, perfectly balancing the flavors.', 15, 1),
('Ebro River', 'A tribute to the majestic Ebro River. Ebro River trout with a smoky touch, accompanied by roasted Piquillo peppers and a drizzle of extra virgin olive oil. The smoothness of Manchego cheese and the freshness of field lettuce make this burger a unique experience, all on rye bread.', 17, 1),
('Land of Biescas', 'In honor of the lands of Biescas, this burger combines the intensity of Albarracín lamb with the creamy touch of Manchego cheese and the richness of sun-dried tomatoes. A rosemary sauce and rustic village bread complete this mountain-inspired recipe. The flavor of the highlands in every bite.', 18, 1),
('The Hoya of Huesca', 'Inspired by the fertile Hoya of Huesca, this burger features Barbastro beef paired with Piquillo peppers and a mild sweet mustard sauce. Combined with Moncayo fresh cheese and a touch of caramelized onions on rustic bread, this is a blend of traditional flavors with a modern twist.', 14, 1),
('Fields of Jiloca', 'Known for its authentic flavors, the fields of Jiloca are reflected in this burger. Jiloca beef accompanied by Tronchón cheese, sun-dried tomatoes, and a fresh mix of spinach leaves, all topped with Belchite honey sauce and served on spelt bread. A tribute to Aragonese land.', 13.50, 1),
('Dawn of the Maestre', 'A dawn in the Maestre lands is reflected in this burger full of freshness and contrast. Local pork with Moncayo fresh cheese, Piquillo peppers, and a touch of Belchite honey and sweet mustard create a perfectly balanced and delicious flavor. Served on rye bread for a gourmet experience.', 16, 1),
('The Matarraña Lamb', 'The richness of Matarraña is found in this burger made with Ternasco de Aragón lamb, accompanied by Manchego cheese, caramelized onions, and a hint of Fraga mustard sauce. The seed bread and arugula leaves complement the blend of flavors, creating a unique taste of the land.', 17.50, 1),
('Wind of Teruel', 'The wind of Teruel brings the strength of tradition. This burger combines wild boar meat from the Sierra de Guara, with Manchego cheese, sun-dried tomatoes, and a touch of sweet mustard sauce. All served on rustic bread, evoking the wild flavors of Teruel in every bite.', 14.50, 1),
('Essence of the Gállego', 'The essence of the Gállego land is found in this burger of Gállego goat meat, paired with Manchego cheese, Raf tomatoes, and a mild rosemary sauce. Served on rustic bread, this is a taste of authenticity from the region.', 15, 1),
('Under the Shadow of the Muela', 'The Muela inspires this burger made with rabbit meat from La Muela, a touch of apple compote, and sweet mustard sauce. Served with spinach leaves, Raf tomatoes, and a drizzle of extra virgin olive oil, all on rye bread. A delicate and flavorful mix that takes you to the calm of the lands under the shadow of the Muela.', 13, 1),
('The Green Alfranca', 'The freshness of the Alfranca fields is reflected in this burger. Beef paired with Moncayo fresh cheese, arugula sprouts, and a touch of extra virgin olive oil on seed bread. A combination of fresh and tasty ingredients for a light yet delicious experience.', 14, 1),
('Skies of the Sierra de Guara', 'The majesty of the skies of the Sierra de Guara is reflected in this burger made with wild boar meat, Tronchón cheese, Piquillo peppers, and a mild rosemary sauce. Served on rustic bread, this burger offers robust and authentic mountain flavors.', 18, 1),
('Barbastro Estate', 'A journey to the Barbastro Estate with this burger made from local Barbastro beef, Manchego cheese, sun-dried tomatoes, and a hint of Belchite honey. The perfect combination of local flavors on rye bread, ideal for savoring the best of the land.', 15.50, 1),
('Gourmet French Fries', 'Crispy, golden fries cooked to perfection, drizzled with extra virgin olive oil and fresh rosemary. The ideal side for any burger.', 4, 2),
('Crispy Onion Rings', 'Golden, battered onion rings, seasoned with local spices, crispy on the outside and tender on the inside.', 5, 2),
('Fresh Salad', 'A fresh mix of lettuce, arugula, Raf tomatoes, and caramelized onions, dressed with extra virgin olive oil and balsamic vinegar.', 5, 2),
('Water', 'A refreshing bottle of water to accompany your meal.', 2, 3),
('Cola Soda', 'A classic Coca-Cola, sweet and refreshing.', 1.50, 3),
('Lemon Soda', 'A refreshing orange soda with a sweet and tangy taste.', 1.50, 3),
('Orange Soda', 'A refreshing lemon soda, perfect for a hot day.', 1.50, 3),
('Cariñena Red Wine', 'A smooth red wine from the Cariñena region, perfect for pairing with any meal.', 6, 3),
('Somontano White Wine', 'A crisp and aromatic white wine from the Somontano region, ideal for seafood or chicken dishes.', 6, 3),
('Beer', 'A refreshing local beer from the Ambar brewery.', 2, 3);


----------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO STORES ( modeStore, location) VALUES
('Online', 'Online'),
('Physical', 'San Ignacio de Loyola, n20');

----------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO CUSTOMERS (firstName, lastName, emailCustomer, phoneCustomer, passwordCustomer, isRegistered)
VALUES
('Ana', 'García', 'ana.garcia@example.com', '5551234567', 'password123', 1),
('Carlos', 'Rodríguez', 'carlos.rodriguez@example.com', '5552345678', NULL, 0),
('Luisa', 'Martínez', 'luisa.martinez@example.com', '5553456789', 'luisa2025', 1),
('Juan', 'Pérez', 'juan.perez@example.com', '5554567890', NULL, 0),
('María', 'López', 'maria.lopez@example.com', '5555678901', 'maria2025', 1),
('Pedro', 'Sánchez', 'pedro.sanchez@example.com', '5556789012', NULL, 0),
('Elena', 'Fernández', 'elena.fernandez@example.com', '5557890123', 'elena123', 1),
('David', 'Gómez', 'david.gomez@example.com', '5558901234', NULL, 0),
('Isabel', 'Morales', 'isabel.morales@example.com', '5559012345', 'isabel2025', 1),
('Ricardo', 'Torres', 'ricardo.torres@example.com', '5550123456', NULL, 0);



----------------------------------------------------------------------------------------------------------------------------------------------------------


INSERT INTO PAYMENT_METHODS ( paymentMethodName)
VALUES 
    ('Credit card'),
    ('Cash');




----------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO JOBS ( jobTitle, minSalary, maxSalary)
VALUES
    ('Chef', 1500.00, 2500.00),
    ('Salesperson', 1500.00, 1800.00),
    ('Manager', 2500.00, 3500.00);


----------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO EMPLOYEES (
    employeeFirstName, employeeLastName, hiringDate, 
    emailEmployee, phoneEmployee, passwordEmployee, salary, id_job, id_store
)
VALUES
    ('Juan', 'Pérez', TO_DATE('2021-06-01', 'YYYY-MM-DD'), 'juan.perez@email.com', '600123456', '**********', 2200.00, 1, 1),
    ('Marta', 'González', TO_DATE('2020-05-15', 'YYYY-MM-DD'), 'marta.gonzalez@email.com', '600654321', '**********', 1750.00, 2, 1),
    ('Pedro', 'Martínez', TO_DATE('2022-02-10', 'YYYY-MM-DD'), 'pedro.martinez@email.com', '600789123', '**********', 2000.00, 1, 2),
    ('Laura', 'Sánchez', TO_DATE('2019-08-20', 'YYYY-MM-DD'), 'laura.sanchez@email.com', '600321987', '**********', 1600.00, 2, 2),
    ('Carlos', 'Rodríguez', TO_DATE('2021-11-12', 'YYYY-MM-DD'), 'carlos.rodriguez@email.com', '600654987', '**********', 1800.00, 2, 1),
    ('Ana', 'López', TO_DATE('2023-01-25', 'YYYY-MM-DD'), 'ana.lopez@email.com', '600321654', '**********', 3200.00, 3, 1);











----------------------------------------------------------------------------------------------------------------------------------------------------------
------------------------TABLAS INTERMEDIAS------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------




INSERT INTO INGREDIENTS_PRODUCTS ( id_ingredient, id_product) VALUES
-- Queen of the Pyrenees
(1, 1),  -- Ternasco de Aragón (lamb or veal)
(2, 1),  -- Tronchón cheese
(3, 1),  -- Tudela asparagus
(4, 1),  -- Truffle sauce
(5, 1),  -- Handmade pumpkin bread

-- Under the Skies of Belchite
(6, 2),  -- Jiloca beef
(7, 2),  -- Belchite honey
(8, 2),  -- Fraga mustard
(9, 2),  -- Caramelized onion
(22, 2), -- Raf tomatoes (local)
(17, 2), -- Spelt bread

-- The Shadow of Moncayo
(10, 3), -- Aragonese chicken breast
(11, 3), -- Fresh cheese from Moncayo
(3, 3),  -- Tudela asparagus
(16, 3), -- Aragonese yogurt sauce
(17, 3), -- Seed bread

-- Ebro River
(14, 4), -- Ebro River trout
(6, 4),  -- Piquillo peppers
(20, 4), -- Extra virgin olive oil
(28, 4), -- Manchego cheese
(18, 4), -- Field lettuce
(34, 4), -- Rye bread

-- Land of Biescas
(23, 5), -- Albarracín lamb meat
(28, 5), -- Manchego cheese
(24, 5), -- Sun-dried tomatoes
(25, 5), -- Rosemary sauce
(26, 5), -- Rustic village bread

-- The Hoya of Huesca
(32, 6), -- Barbastro beef
(6, 6),  -- Piquillo peppers
(11, 6), -- Moncayo fresh cheese
(19, 6), -- Caramelized onions
(9, 6),  -- Rustic bread

-- Fields of Jiloca
(23, 7), -- Jiloca beef
(2, 7),  -- Tronchón cheese
(24, 7), -- Sun-dried tomatoes
(38, 7), -- Spinach leaves
(7, 7),  -- Belchite honey
(9, 7),  -- Spelt bread

-- Dawn of the Maestre
(10, 8), -- Local pork
(11, 8), -- Moncayo fresh cheese
(6, 8),  -- Piquillo peppers
(7, 8),  -- Belchite honey
(33, 8), -- Sweet mustard sauce
(34, 8), -- Rye bread

-- The Matarraña Lamb
(1, 9),  -- Ternasco de Aragón (lamb or veal)
(28, 9), -- Manchego cheese
(19, 9), -- Caramelized onions
(13, 9), -- Fraga mustard sauce
(17, 9), -- Seed bread
(27, 9), -- Arugula sprouts

-- Wind of Teruel
(37, 10), -- Wild boar meat from Sierra de Guara
(28, 10), -- Manchego cheese
(24, 10), -- Sun-dried tomatoes
(33, 10), -- Sweet mustard sauce
(26, 10), -- Rustic village bread

-- Essence of the Gállego
(32, 11), -- Gállego goat meat
(28, 11), -- Manchego cheese
(22, 11), -- Raf tomatoes
(25, 11), -- Rosemary sauce
(26, 11), -- Rustic village bread

-- Under the Shadow of the Muela
(35, 12), -- Rabbit meat from La Muela
(36, 12), -- Apple compote
(33, 12), -- Sweet mustard sauce
(38, 12), -- Spinach leaves
(22, 12), -- Raf tomatoes
(20, 12), -- Extra virgin olive oil
(34, 12), -- Rye bread

-- The Green Alfranca
(32, 13), -- Beef
(11, 13), -- Moncayo fresh cheese
(27, 13), -- Arugula sprouts
(20, 13), -- Extra virgin olive oil
(17, 13), -- Seed bread

-- Skies of the Sierra de Guara
(37, 14), -- Wild boar meat
(2, 14),  -- Tronchón cheese
(6, 14),  -- Piquillo peppers
(25, 14), -- Rosemary sauce
(26, 14), -- Rustic village bread

-- Barbastro Estate
(32, 15), -- Barbastro beef
(28, 15), -- Manchego cheese
(24, 15), -- Sun-dried tomatoes
(7, 15),  -- Belchite honey
(34, 15), -- Rye bread

-- Bebidas (sin ingredientes asignados)
(NULL, 16), -- Gourmet French Fries (sin ingredientes relacionados)
(5, 17),  -- Crispy Onion Rings (wheat)
(NULL, 18), -- Fresh Salad (sin ingredientes relacionados)
(NULL, 19), -- Water (sin ingredientes)
(NULL, 20), -- Cocacola (sin ingredientes)
(NULL, 21), -- Orange Fanta (sin ingredientes)
(NULL, 22), -- Lemon Fanta (sin ingredientes)
(NULL, 23), -- Cariñena Red Wine (sin ingredientes)
(NULL, 24), -- Somontano White Wine (sin ingredientes)
(NULL, 25); -- Ambar Beer (sin ingredientes)



---------------------------------------------PEDIDOS DE MUESTRA----------------------------------------------------------------------------------------------------------------------



INSERT INTO ORDERS_HEADER (orderDate, shippingAddress, isTransactionAcepted, orderStatus, id_paymentMethod, id_customer, id_employee) VALUES
(TO_DATE('2025-04-01', 'YYYY-MM-DD'), 'Calle Mayor 123, Zaragoza', 1, 'Delivered', 1, 1, 2),
(TO_DATE('2025-04-02', 'YYYY-MM-DD'), 'Av. Goya 45, Zaragoza', 1, 'Shipped', 2, 3, 3),
(TO_DATE('2025-04-03', 'YYYY-MM-DD'), 'Calle del Sol 78, Huesca', 0, 'Cancelled', 1, 5, 1),
(TO_DATE('2025-04-04', 'YYYY-MM-DD'), 'Paseo Independencia 89, Zaragoza', 1, 'Processing', 1, 7, 4),
(TO_DATE('2025-04-05', 'YYYY-MM-DD'), 'Calle Luna 22, Teruel', 1, 'Delivered', 2, 9, 2);

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO ORDERS_LINE ( orderQuantity, id_product, id_orderHeader) VALUES
(2, 1, 1),   -- 2x Queen of the Pyrenees
(1, 16, 1),  -- 1x Gourmet French Fries

(1, 3, 2),   -- 1x The Shadow of Moncayo
(2, 19, 2),  -- 2x Water

(1, 6, 3),   -- 1x The Hoya of Huesca

(1, 11, 4),  -- 1x Essence of the Gállego
(1, 23, 4),  -- 1x Cariñena Red Wine

(2, 2, 5),   -- 2x Under the Skies of Belchite
(1, 17, 5);  -- 1x Crispy Onion Rings

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
