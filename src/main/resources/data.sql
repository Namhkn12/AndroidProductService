-- Insert data cho bảng category
SET IDENTITY_INSERT category ON;
INSERT INTO category (category_id, category_name) VALUES (1, 'Furniture');
INSERT INTO category (category_id, category_name) VALUES (2, 'Electronics');
INSERT INTO category (category_id, category_name) VALUES (3, 'Kitchenware');
INSERT INTO category (category_id, category_name) VALUES (4, 'Outdoor');
SET IDENTITY_INSERT category OFF;

-- Insert data cho bảng products
SET IDENTITY_INSERT products ON;
INSERT INTO products (product_id, product_name, product_category, product_description, product_cost)
VALUES
  (1, 'Chair', 'Furniture', 'Comfortable wooden chair', 120.0),
  (2, 'Laptop', 'Electronics', 'High-performance gaming laptop', 1500.0),
  (3, 'Knife Set', 'Kitchenware', 'Stainless steel knife set', 80.5),
  (4, 'Tent', 'Outdoor', '2-person camping tent', 200.0);
SET IDENTITY_INSERT products OFF;

-- Insert data cho bảng shop
SET IDENTITY_INSERT shop ON;
INSERT INTO shop (shop_id, shop_name, shop_location)
VALUES
  (1, 'HomePlus', N'Hà Nội'),
  (2, 'TechZone', N'TP.HCM'),
  (3, 'CookMaster', N'Đà Nẵng');
SET IDENTITY_INSERT shop OFF;

-- Insert data cho bảng selling
SET IDENTITY_INSERT selling ON;
INSERT INTO selling (selling_id, shop_id, product_id, amount)
VALUES
  (1, 1, 1, 10),  -- HomePlus bán Chair
  (2, 2, 2, 5),   -- TechZone bán Laptop
  (3, 3, 3, 20),  -- CookMaster bán Knife Set
  (4, 1, 4, 7);   -- HomePlus bán Tent
SET IDENTITY_INSERT selling OFF;
