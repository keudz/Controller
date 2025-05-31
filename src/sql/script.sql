#table product
select * from product where category like 'Electronics';
select * from product where category like 'Accessories';
select * from product where category like 'Furniture';
select * from product where stock >= 0;
SELECT * FROM product ORDER BY original_price DESC LIMIT 10;
#table user
select * from urses where fullname like 'H%';#  bắt đầu bằng chữ a k có e lấy tạm chữ H nhé:))
select * from urses where status like'ACTIVE';