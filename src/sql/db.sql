-- Truy vấn tạo ra database
create database shoppingonline;

USE shoppingonline;

-- Truy vấn tạo bảng user
create table Urses(
    id INT AUTO_INCREMENT PRIMARY KEY,
    email varchar(255) unique not null,
    password varchar(500) not null,
    fullname varchar(500) not null,
    status varchar(500)not null,
    role varchar(50) not null
);

insert into Urses (email, password, fullname, status, role)value
('user1@example.com', 'password123', 'Nguyen Van A', 'active', 'user'),
 ('user2@example.com', 'password123', 'Tran Thi B', 'inactive', 'user'),
 ('user3@example.com', 'password123', 'Le Van C', 'active', 'moderator'),
 ('user4@example.com', 'password123', 'Pham Thi D', 'active', 'admin'),
 ('user5@example.com', 'password123', 'Hoang Van E', 'inactive', 'user'),
 ('user6@example.com', 'password123', 'Nguyen Van F', 'active', 'user'),
 ('user7@example.com', 'password123', 'Tran Thi G', 'active', 'moderator'),
 ('user8@example.com', 'password123', 'Le Van H', 'inactive', 'user'),
 ('user9@example.com', 'password123', 'Pham Thi I', 'active', 'admin'),
 ('user10@example.com', 'password123', 'Hoang Van J', 'active', 'user'),
    ('user11@example.com', 'password123', 'Nguyen Van K', 'active', 'user'),
    ('user12@example.com', 'password123', 'Tran Thi L', 'inactive', 'user'),
    ('user13@example.com', 'password123', 'Le Van M', 'active', 'moderator'),
    ('user14@example.com', 'password123', 'Pham Thi N', 'active', 'admin'),
    ('user15@example.com', 'password123', 'Hoang Van O', 'inactive', 'user'),
    ('user16@example.com', 'password123', 'Nguyen Van P', 'active', 'user'),
    ('user17@example.com', 'password123', 'Tran Thi Q', 'active', 'moderator'),
    ('user18@example.com', 'password123', 'Le Van R', 'inactive', 'user'),
    ('user19@example.com', 'password123', 'Pham Thi S', 'active', 'admin'),
    ('user20@example.com', 'password123', 'Hoang Van T', 'active', 'user'),
    ('user21@example.com', 'password123', 'Nguyen Van U', 'active', 'user'),
    ('user22@example.com', 'password123', 'Tran Thi V', 'inactive', 'user'),
    ('user23@example.com', 'password123', 'Le Van W', 'active', 'moderator'),
    ('user24@example.com', 'password123', 'Pham Thi X', 'active', 'admin'),
    ('user25@example.com', 'password123', 'Hoang Van Y', 'inactive', 'user'),
    ('user26@example.com', 'password123', 'Nguyen Van Z', 'active', 'user'),
    ('user27@example.com', 'password123', 'Tran Thi AA', 'active', 'moderator'),
    ('user28@example.com', 'password123', 'Le Van BB', 'inactive', 'user'),
    ('user29@example.com', 'password123', 'Pham Thi CC', 'active', 'admin'),
    ('user30@example.com', 'password123', 'Hoang Van DD', 'active', 'user'),
    ('user31@example.com', 'password123', 'Nguyen Van EE', 'active', 'user'),
    ('user32@example.com', 'password123', 'Tran Thi FF', 'inactive', 'user'),
    ('user33@example.com', 'password123', 'Le Van GG', 'active', 'moderator'),
    ('user34@example.com', 'password123', 'Pham Thi HH', 'active', 'admin'),
    ('user35@example.com', 'password123', 'Hoang Van II', 'inactive', 'user'),
    ('user36@example.com', 'password123', 'Nguyen Van JJ', 'active', 'user'),
    ('user37@example.com', 'password123', 'Tran Thi KK', 'active', 'moderator'),
    ('user38@example.com', 'password123', 'Le Van LL', 'inactive', 'user'),
    ('user39@example.com', 'password123', 'Pham Thi MM', 'active', 'admin'),
    ('user40@example.com', 'password123', 'Hoang Van NN', 'active', 'user'),
    ('user41@example.com', 'password123', 'Nguyen Van OO', 'active', 'user'),
    ('user42@example.com', 'password123', 'Tran Thi PP', 'inactive', 'user'),
    ('user43@example.com', 'password123', 'Le Van QQ', 'active', 'moderator'),
    ('user44@example.com', 'password123', 'Pham Thi RR', 'active', 'admin'),
    ('user45@example.com', 'password123', 'Hoang Van SS', 'inactive', 'user'),
    ('user46@example.com', 'password123', 'Nguyen Van TT', 'active', 'user'),
    ('user47@example.com', 'password123', 'Tran Thi UU', 'active', 'moderator'),
    ('user48@example.com', 'password123', 'Le Van VV', 'inactive', 'user'),
    ('user49@example.com', 'password123', 'Pham Thi WW', 'active', 'admin'),
    ('user50@example.com', 'password123', 'Hoang Van XX', 'active', 'user');

create table product(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name varchar(500)not null,
    description text,
    price numeric(18,3) not null,
    stock int,
    original_price numeric(18,3) not null,
    category varchar(255)

);

insert into product(id, name, description, price, stock, original_price, category) value

                                                                                         (1, 'Laptop A', 'Laptop hiệu suất cao cho công việc', 1500.00, 20, 1800.00, 'Electronics'),
                                                                                         (2, 'Smartphone B', 'Điện thoại thông minh với camera sắc nét', 700.00, 50, 900.00, 'Electronics'),
                                                                                         (3, 'Headphones C', 'Tai nghe chống ồn chất lượng cao', 200.00, 35, 250.00, 'Accessories'),
                                                                                         (4, 'Gaming Chair D', 'Ghế gaming thoải mái, hỗ trợ lưng', 300.00, 15, 400.00, 'Furniture'),
                                                                                         (5, 'Keyboard E', 'Bàn phím cơ RGB dành cho game thủ', 120.00, 40, 150.00, 'Accessories'),
                                                                                         (6, 'Monitor F', 'Màn hình 27 inch Full HD', 250.00, 25, 300.00, 'Electronics'),
                                                                                         (7, 'Smartwatch G', 'Đồng hồ thông minh theo dõi sức khỏe', 180.00, 30, 220.00, 'Wearable'),
                                                                                         (8, 'Backpack H', 'Balo chống nước tiện dụng', 75.00, 60, 90.00, 'Accessories'),
                                                                                         (9, 'Camera I', 'Máy ảnh DSLR chuyên nghiệp', 1200.00, 10, 1500.00, 'Electronics'),
                                                                                         (10, 'Tablet J', 'Máy tính bảng màn hình lớn', 500.00, 20, 600.00, 'Electronics'),
                                                                                         (11, 'Smart TV K', 'TV thông minh độ phân giải 4K', 900.00, 15, 1100.00, 'Electronics'),
                                                                                         (12, 'Wireless Earbuds L', 'Tai nghe không dây chống ồn', 150.00, 40, 200.00, 'Accessories'),
                                                                                         (13, 'Gaming Laptop M', 'Laptop gaming hiệu suất cao', 2200.00, 12, 2500.00, 'Electronics'),
                                                                                         (14, 'Office Chair N', 'Ghế văn phòng ergonomic thoải mái', 350.00, 30, 400.00, 'Furniture'),
                                                                                         (15, 'Mechanical Keyboard O', 'Bàn phím cơ với switch chất lượng', 180.00, 25, 210.00, 'Accessories'),
                                                                                         (16, 'Curved Monitor P', 'Màn hình cong 32 inch cho game thủ', 550.00, 20, 600.00, 'Electronics'),
                                                                                         (17, 'Smartphone Q', 'Điện thoại flagship mới nhất', 1200.00, 35, 1300.00, 'Electronics'),
                                                                                         (18, 'Fitness Tracker R', 'Thiết bị theo dõi sức khỏe', 80.00, 50, 100.00, 'Wearable'),
                                                                                         (19, 'Wireless Router S', 'Router tốc độ cao với WiFi 6', 250.00, 22, 300.00, 'Electronics'),
                                                                                         (20, 'Portable Speaker T', 'Loa Bluetooth âm thanh sống động', 130.00, 45, 160.00, 'Accessories'),
                                                                                         (21, 'Gaming Mouse U', 'Chuột gaming với tốc độ phản hồi nhanh', 70.00, 60, 90.00, 'Accessories'),
                                                                                         (22, 'Noise Cancelling Headphones V', 'Tai nghe chống ồn chủ động chất lượng cao', 250.00, 30, 300.00, 'Accessories'),
                                                                                         (23, 'Smart Thermostat W', 'Điều chỉnh nhiệt độ thông minh, tiết kiệm điện', 180.00, 40, 220.00, 'Electronics'),
                                                                                         (24, 'Portable Power Bank X', 'Pin sạc dự phòng dung lượng lớn', 50.00, 80, 70.00, 'Accessories'),
                                                                                         (25, 'Mechanical Watch Y', 'Đồng hồ cơ cổ điển, thiết kế sang trọng', 500.00, 20, 600.00, 'Wearable'),
                                                                                         (26, 'Adjustable Standing Desk Z', 'Bàn làm việc có thể điều chỉnh độ cao', 700.00, 15, 850.00, 'Furniture'),
                                                                                         (27, 'Wireless Charging Pad AA', 'Bộ sạc không dây tiện lợi', 90.00, 50, 110.00, 'Accessories'),
                                                                                         (28, 'Laptop Cooling Pad BB', 'Đế tản nhiệt laptop giúp giảm nhiệt độ', 45.00, 70, 55.00, 'Accessories'),
                                                                                         (29, 'Digital Drawing Tablet CC', 'Bảng vẽ điện tử dành cho designer', 350.00, 25, 400.00, 'Electronics'),
                                                                                         (30, 'External SSD DD', 'Ổ cứng SSD ngoài dung lượng 1TB', 220.00, 40, 250.00, 'Electronics'),
                                                                                         (31, 'Smart Home Hub EE', 'Trung tâm điều khiển thiết bị thông minh', 250.00, 20, 300.00, 'Electronics'),
                                                                                         (32, 'Gaming Console FF', 'Máy chơi game mới nhất', 500.00, 15, 600.00, 'Electronics'),
                                                                                         (33, 'Bluetooth Soundbar GG', 'Loa soundbar giúp tăng trải nghiệm âm thanh', 350.00, 25, 400.00, 'Electronics'),
                                                                                         (34, 'Standing Fan HH', 'Quạt đứng tiết kiệm điện', 75.00, 50, 90.00, 'Home Appliances'),
                                                                                         (35, 'Multi-Cooker II', 'Nồi nấu đa năng, tiện dụng', 200.00, 30, 250.00, 'Home Appliances'),
                                                                                         (36, 'Smart Door Lock JJ', 'Khóa cửa thông minh với bảo mật vân tay', 180.00, 35, 220.00, 'Home Security'),
                                                                                         (37, 'Electric Scooter KK', 'Xe điện mini di chuyển tiện lợi', 800.00, 12, 900.00, 'Transportation'),
                                                                                         (38, 'High-Speed Blender LL', 'Máy xay sinh tố công suất lớn', 150.00, 40, 180.00, 'Home Appliances'),
                                                                                         (39, 'Ergonomic Office Desk MM', 'Bàn làm việc thiết kế chuẩn ergonomic', 450.00, 18, 500.00, 'Furniture'),
                                                                                         (40, 'Wireless Gaming Controller NN', 'Tay cầm chơi game không dây', 100.00, 45, 120.00, 'Gaming Accessories'),
                                                                                         (41, 'Smart Glasses OO', 'Kính thông minh hỗ trợ thực tế ảo', 300.00, 25, 350.00, 'Wearable'),
                                                                                         (42, '4K Action Camera PP', 'Camera hành trình chống rung 4K', 400.00, 15, 450.00, 'Electronics'),
                                                                                         (43, 'Robotic Vacuum QQ', 'Máy hút bụi thông minh tự động', 600.00, 20, 650.00, 'Home Appliances'),
                                                                                         (44, 'Gaming Headset RR', 'Tai nghe chơi game âm thanh sống động', 180.00, 40, 220.00, 'Accessories'),
                                                                                         (45, 'Smart Fridge SS', 'Tủ lạnh thông minh tiết kiệm điện', 1200.00, 8, 1300.00, 'Home Appliances'),
                                                                                         (46, 'Electric Bike TT', 'Xe đạp điện công suất cao', 900.00, 10, 1000.00, 'Transportation'),
                                                                                         (47, 'Solar Charger UU', 'Sạc năng lượng mặt trời tiện lợi', 150.00, 35, 180.00, 'Accessories'),
                                                                                         (48, 'Voice Assistant VV', 'Thiết bị trợ lý ảo gia đình', 250.00, 25, 300.00, 'Electronics'),
                                                                                         (49, 'Smart Scale WW', 'Cân thông minh theo dõi sức khỏe', 100.00, 50, 120.00, 'Wearable'),
                                                                                         (50, 'Drone XX', 'Máy bay không người lái có camera 4K', 800.00, 15, 900.00, 'Electronics');








