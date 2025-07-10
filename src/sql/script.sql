SELECT Users.ID_USER , Users.fullname,SUM(product.price * cart_items.quantity) as total_carts
FROM users
JOIN carts ON carts.ID_USER = users.ID_USER
JOIN cart_items ON carts.ID_CART = cart_items.ID_CART
JOIN product ON cart_items.ID_PRODUCT = product.ID_PRODUCT
GROUP BY Users.ID_USER, Users.fullname;

select MIN(TOTAL_AMOUNT)  from orders;



SELECT users.ID_USER, users.FULLNAME, SUM(orders.TOTAL_AMOUNT) AS TOTAL_AMOUNT
FROM users
JOIN orders ON orders.USER_ID = users.ID_USER
GROUP BY users.ID_USER, users.FULLNAME
HAVING SUM(orders.TOTAL_AMOUNT) > 500000;#lọc ra những total_amount ở bảng order có giá trị trên 500000

select min(total_amount) from orders;

SELECT  * FROM PRODUCT WHERE stock = 30;

SELECT users.ID_USER ,users.FULLNAME,SUM(cart_items.QUANTITY) AS items_quantity
FROM users
JOIN carts ON carts.ID_USER = users.ID_USER
JOIN cart_items on cart_items.ID_CART = carts.ID_CART
group by users.ID_USER, users.FULLNAME;

SELECT product.ID_PRODUCT,product.stock,SUM((product.ORIGINAL_PRICE - product.PRICE) * product.stock) as profit
FROM product
GROUP BY product.ID_PRODUCT,product.stock;



