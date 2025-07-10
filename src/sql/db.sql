-- Truy vấn tạo ra database
create database shoppingonline;

USE shoppingonline;

-- Truy vấn tạo bảng user
create table Users(
    ID_USER INT UNIQUE AUTO_INCREMENT PRIMARY KEY,
    email varchar(255) unique not null,
    password varchar(500) not null,
    fullname varchar(500) not null,
    status varchar(500)not null,
    role varchar(50) not null
);
INSERT INTO Users (ID_USER, email, password, fullname, status, role) VALUES
            (1, 'dat@example.com', 'encrypted123', 'Nguyễn Văn Đạt', 'active', 'customer'),
            (2, 'linh@example.com', 'encrypted456', 'Trần Thị Linh', 'active', 'customer'),
            (3, 'admin@example.com', 'adminpass', 'Admin System', 'active', 'admin'),
            (14, 'thanh@example.com', 'passA1', 'Nguyễn Hoàng Thanh', 'active', 'customer'),
            (15, 'my@example.com', 'passB2', 'Lý Thị Mỹ', 'active', 'customer'),
            (16, 'truong@example.com', 'passC3', 'Phạm Văn Trường', 'inactive', 'customer'),
            (17, 'quyen@example.com', 'passD4', 'Đặng Quỳnh Quyên', 'active', 'customer'),
            (18, 'son@example.com', 'passE5', 'Võ Minh Sơn', 'active', 'customer'),
            (19, 'chi@example.com', 'passF6', 'Phan Diệu Chi', 'active', 'customer'),
            (20, 'kiet@example.com', 'passG7', 'Lê Ngọc Kiệt', 'active', 'customer'),
            (21, 'trang@example.com', 'passH8', 'Trần Bảo Trang', 'active', 'customer'),
            (22, 'vinh@example.com', 'passI9', 'Huỳnh Thành Vinh', 'inactive', 'customer'),
            (23, 'yen@example.com', 'passJ0', 'Đỗ Hồng Yến', 'active', 'customer'),
            (24, 'manh@example.com', 'passK1', 'Lê Hoàng Mạnh', 'active', 'customer'),
            (25, 'ha@example.com', 'passK2', 'Nguyễn Thị Hà', 'active', 'customer'),
            (26, 'khoa@example.com', 'passK3', 'Phan Minh Khoa', 'inactive', 'customer'),
            (27, 'thu@example.com', 'passK4', 'Vũ Thu Hương', 'active', 'customer'),
            (28, 'hung@example.com', 'passK5', 'Đỗ Văn Hùng', 'active', 'customer'),
            (29, 'nhung@example.com', 'passK6', 'Trần Diệu Nhung', 'active', 'customer'),
            (30, 'tam@example.com', 'passK7', 'Hoàng Văn Tâm', 'inactive', 'customer'),
            (31, 'vy@example.com', 'passK8', 'Lý Thảo Vy', 'active', 'customer'),
            (32, 'duy@example.com', 'passK9', 'Nguyễn Quốc Duy', 'active', 'customer'),
            (33, 'mai@example.com', 'passK0', 'Phạm Ngọc Mai', 'active', 'customer'),
            (34, 'hien@example.com', 'passL1', 'Đặng Văn Hiền', 'active', 'customer'),
            (35, 'lan@example.com', 'passL2', 'Trần Thị Lan', 'active', 'customer'),
            (36, 'nhat@example.com', 'passL3', 'Phạm Nhật Long', 'active', 'customer'),
            (37, 'cam@example.com', 'passL4', 'Lê Thùy Cẩm', 'active', 'customer'),
            (38, 'hoai@example.com', 'passL5', 'Đỗ Hoài Nam', 'active', 'customer'),
            (39, 'phuc@example.com', 'passL6', 'Ngô Văn Phúc', 'inactive', 'customer'),
            (40, 'tien@example.com', 'passL7', 'Vũ Gia Tiến', 'active', 'customer'),
            (41, 'linhha@example.com', 'passL8', 'Trần Linh Hà', 'active', 'customer'),
            (42, 'chau@example.com', 'passL9', 'Đinh Văn Châu', 'active', 'customer'),
            (43, 'thuydung@example.com', 'passL0', 'Phạm Thùy Dung', 'active', 'customer');








create table product(
    ID_PRODUCT INT  UNIQUE AUTO_INCREMENT PRIMARY KEY,
    name varchar(500)not null,
    description text,
    price numeric(18,3) not null,
    stock int,
    original_price numeric(18,3) not null,
    category varchar(255)

);
INSERT INTO product (ID_PRODUCT, name, description, price, stock, original_price, category) VALUES
        (1, 'Tai nghe Bluetooth', NULL, 399000, 0, 499000, 'Âm thanh'),
        (2, 'Bàn phím cơ RGB', NULL, 890000, 20, 1090000, 'Thiết bị'),
        (3, 'Sạc dự phòng 10000mAh', NULL, 299000, 0, 350000, 'Phụ kiện'),
        (14, 'Chuột gaming Razer', NULL, 690000, 30, 850000, 'Thiết bị'),
        (15, 'Ống kính điện thoại', NULL, 110000, 100, 150000, 'Phụ kiện'),
        (16, 'Đồng hồ thông minh', NULL, 1850000, 25, 2090000, 'Thiết bị'),
        (17, 'Tai nghe True Wireless', NULL, 799000, 45, 999000, 'Âm thanh'),
        (18, 'Loa mini Xiaomi', NULL, 340000, 60, 420000, 'Âm thanh'),
        (19, 'Miếng dán cường lực', NULL, 50000, 150, 70000, 'Phụ kiện'),
        (20, 'Cáp sạc USB-C', NULL, 70000, 120, 90000, 'Phụ kiện'),
        (21, 'Balo thời trang', NULL, 320000, 35, 390000, 'Phụ kiện'),
        (22, 'Quạt mini USB', NULL, 150000, 80, 190000, 'Thiết bị'),
        (23, 'Sổ tay da A5', NULL, 130000, 90, 180000, 'Phụ kiện'),
        (24, 'Bàn gập học sinh', NULL, 390000, 25, 490000, 'Nội thất'),
        (25, 'Chuột không dây Apple', NULL, 1250000, 0, 1390000, 'Thiết bị'),
        (26, 'Kính chống ánh sáng xanh', NULL, 230000, 100, 290000, 'Phụ kiện'),
        (27, 'Hub chuyển USB-C to HDMI', NULL, 520000, 70, 620000, 'Phụ kiện'),
        (28, 'Máy tính cầm tay Casio', NULL, 450000, 40, 490000, 'Thiết bị'),
        (29, 'Loa di động Bose Mini', NULL, 2790000, 15, 3290000, 'Âm thanh'),
        (30, 'Cân điện tử thông minh', NULL, 880000, 0, 990000, 'Thiết bị'),
        (31, 'Sách lập trình Python', NULL, 210000, 80, 259000, 'Sách'),
        (32, 'Khăn thể thao gym', NULL, 95000, 100, 125000, 'Thể thao'),
        (33, 'Vỏ laptop 14 inch', NULL, 210000, 75, 290000, 'Phụ kiện'),
        (34, 'Túi giữ nhiệt mini', NULL, 180000, 60, 220000, 'Gia dụng'),
        (35, 'Máy tạo độ ẩm USB', NULL, 330000, 0, 410000, 'Thiết bị'),
        (36, 'Giá đỡ laptop nhôm', NULL, 430000, 50, 520000, 'Thiết bị'),
        (37, 'Bộ vệ sinh laptop 5 món', NULL, 170000, 0, 210000, 'Phụ kiện'),
        (38, 'Đèn cảm biến chuyển động', NULL, 310000, 40, 360000, 'Thiết bị'),
        (39, 'Ổ cứng SSD 512GB', NULL, 1450000, 25, 1650000, 'Thiết bị'),
        (40, 'Bình giữ nhiệt Lock&Lock', NULL, 290000, 0, 350000, 'Gia dụng'),
        (41, 'Sạc nhanh 33W Xiaomi', NULL, 390000, 50, 450000, 'Phụ kiện'),
        (42, 'Áo mưa tiện lợi', NULL, 50000, 200, 70000, 'Tiện ích'),
        (43, 'Bàn phím Bluetooth mini', NULL, 540000, 40, 650000, 'Thiết bị');






create table carts(
    ID_CART INT AUTO_INCREMENT PRIMARY KEY,
    ID_USER INT,
    FOREIGN KEY (ID_USER) REFERENCES Users(ID_USER)
);



INSERT INTO carts (ID_CART, ID_USER) VALUES
                                    (1, 1),
                                    (2, 2),
                                    (13, 14),
                                    (14, 15),
                                    (15, 16),
                                    (16, 17),
                                    (17, 18),
                                    (18, 19),
                                    (19, 20),
                                    (20, 21),
                                    (21, 22),
                                    (22, 23),
                                    (23, 24),
                                    (24, 25),
                                    (25, 26),
                                    (26, 27),
                                    (27, 28),
                                    (28, 29),
                                    (29, 30),
                                    (30, 31),
                                    (31, 32),
                                    (32, 33),
                                    (33, 34),
                                    (34, 35),
                                    (35, 36),
                                    (36, 37),
                                    (37, 38),
                                    (38, 39),
                                    (39, 40),
                                    (40, 41),
                                    (41, 42),
                                    (42, 43);





create table cart_items
(
    ID          INT AUTO_INCREMENT PRIMARY KEY,
    ID_PRODUCT INT,
    QUANTITY    INT,
    ID_CART     INT,
    FOREIGN KEY (ID_PRODUCT) REFERENCES product(ID_PRODUCT),
    FOREIGN KEY (ID_CART) REFERENCES carts(ID_CART)


);

INSERT INTO cart_items (id,ID_PRODUCT, quantity, ID_CART) VALUES
            (1, 1, 2, 1),
            (2, 2, 1, 1),
            (3, 3, 3, 2),
            (14, 14, 1, 13),
            (15, 15, 2, 14),
            (16, 16, 1, 15),
            (17, 17, 1, 16),
            (18, 19, 3, 17),
            (19, 21, 1, 18),
            (20, 18, 2, 19),
            (21, 20, 1, 20),
            (22, 22, 1, 21),
            (23, 23, 4, 22),
            (24, 24, 1, 23),
            (25, 25, 2, 24),
            (26, 26, 1, 25),
            (27, 28, 1, 26),
            (28, 30, 2, 27),
            (29, 33, 1, 28),
            (30, 36, 1, 29),
            (31, 35, 2, 30),
            (32, 29, 1, 31),
            (33, 34, 3, 32),
            (34, 31, 1, 33),
            (35, 37, 1, 34),
            (36, 38, 1, 35),
            (37, 39, 2, 36),
            (38, 41, 2, 37),
            (39, 40, 1, 38),
            (40, 43, 1, 39),
            (41, 27, 1, 40),
            (42, 42, 1, 41),
            (43, 32, 3, 42);






create table orders(
    ID_ORDER INT AUTO_INCREMENT PRIMARY KEY,
    DESCRIPTION VARCHAR(150),
    STATUS VARCHAR(150),
    TOTAL_AMOUNT NUMERIC(19,6),
    USER_ID INT

);

INSERT INTO orders (ID_ORDER, description, status, total_amount, user_id) VALUES
          (1, 'Đơn hàng tháng 7', 'delivered', 1688000, 1),
          (2, NULL, 'processing', 897000, 2),
          (13, 'Đơn hàng Flash Sale', 'delivered', 890000, 14),
          (14, NULL, 'processing', 220000, 15),
          (15, 'Đơn combo phụ kiện', 'pending', 190000, 16),
          (16, NULL, 'delivered', 799000, 17),
          (17, NULL, 'shipped', 150000, 18),
          (18, 'Ưu đãi sinh viên', 'delivered', 320000, 19),
          (19, NULL, 'processing', 680000, 20),
          (20, NULL, 'shipped', 70000, 21),
          (21, NULL, 'delivered', 150000, 22),
          (22, 'Tặng phẩm', 'processing', 520000, 23),
          (23, 'Thanh toán học cụ', 'delivered', 450000, 24),
          (24, NULL, 'processing', 1250000, 25),
          (25, 'Giao dịch phụ kiện', 'pending', 710000, 26),
          (26, NULL, 'delivered', 450000, 27),
          (27, 'Thiết bị gia dụng', 'shipped', 880000, 28),
          (28, 'Flash sale mùa hè', 'delivered', 330000, 29),
          (29, NULL, 'processing', 210000, 30),
          (30, NULL, 'shipped', 2790000, 31),
          (31, NULL, 'delivered', 290000, 32),
          (32, 'Đơn hàng thể thao', 'processing', 95000, 33),
          (33, NULL, 'shipped', 1450000, 34),
          (34, NULL, 'processing', 210000, 35),
          (35, NULL, 'delivered', 540000, 36),
          (36, NULL, 'processing', 390000, 37),
          (37, NULL, 'shipped', 170000, 38),
          (38, NULL, 'pending', 50000, 39),
          (39, NULL, 'delivered', 430000, 40),
          (40, NULL, 'delivered', 990000, 41),
          (41, NULL, 'shipped', 390000, 42),
          (42, NULL, 'delivered', 220000, 43);





create table oders_items(
    id INT AUTO_INCREMENT PRIMARY KEY,
    ID_PRODUCT INT,
    ID_ORDER INT,
    ORIGINAL_PRICE NUMERIC(19,3),
    PRICE NUMERIC(19,3),
    FOREIGN KEY (ID_PRODUCT) REFERENCES product (ID_PRODUCT),
    FOREIGN KEY (ID_ORDER) REFERENCES orders(ID_ORDER)
);

INSERT INTO oders_items (id, ID_PRODUCT, ID_ORDER, original_price, price) VALUES
            (1, 1, 1, 499000, 399000),
            (2, 2, 1, 1090000, 890000),
            (3, 3, 2, 350000, 299000),
            (14, 14, 13, 850000, 690000),
            (15, 15, 14, 150000, 110000),
            (16, 19, 15, 70000, 50000),
            (17, 17, 16, 999000, 799000),
            (18, 22, 17, 190000, 150000),
            (19, 21, 18, 390000, 320000),
            (20, 16, 19, 2090000, 1850000),
            (21, 20, 20, 90000, 70000),
            (22, 18, 21, 420000, 340000),
            (23, 23, 22, 180000, 130000),
            (24, 20, 23, 300000, 250000),
            (25, 21, 24, 1200000, 950000),
            (26, 22, 25, 250000, 180000),
            (27, 23, 26, 499000, 399000),
            (28, 24, 27, 129000, 99000),
            (29, 25, 28, 590000, 490000),
            (30, 26, 29, 390000, 320000),
            (31, 27, 30, 1090000, 890000),
            (32, 28, 31, 180000, 120000),
            (33, 29, 32, 299000, 220000),
            (34, 17, 33, 999000, 799000),
            (35, 16, 34, 2090000, 1850000),
            (36, 15, 35, 150000, 110000),
            (37, 14, 36, 850000, 690000),
            (38, 19, 37, 70000, 50000),
            (39, 20, 38, 90000, 70000),
            (40, 18, 39, 420000, 340000),
            (41, 21, 40, 390000, 320000),
            (42, 22, 41, 190000, 150000),
            (43, 23, 42, 180000, 130000);




#alter table oders_items  add column id INT;

DROP TABLE product ;
TRUNCATE TABLE carts;
DROP TABLE carts;






