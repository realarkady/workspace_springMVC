CREATE TABLE test.CART
(
    CART_ID 	INT PRIMARY KEY AUTO_INCREMENT
);


CREATE TABLE test.CARTITEM
(
    ITEM_ID		INT PRIMARY KEY AUTO_INCREMENT,
	CART_ID 	INT,
    ARTICLE_NO	VARCHAR(45),
    QUANTITY	NUMERIC,
    PRICE		NUMERIC
);

SELECT * FROM test.cart;
SELECT * FROM test.cartitem;

drop table test.cart;
drop table test.cartitem;