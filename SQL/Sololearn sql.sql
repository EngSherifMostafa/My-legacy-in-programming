Database myDatabase
Table customer,order
Columns ID,firstName,secName,city,age

Show all databases
SHOW DATABASES;

Show all tables in specific database
SHOW TABLES;

Show columns in specific table
SHOW COLUMNS FROM customer;

Select all table
SELECT * FROM customer;

select city column without duplicated 
SELECT DISTINCT city,age FROM customer;

Select (4 records start from record 4) (record 4-7) ID & firstName columns from customer
SELECT ID,FirstName FROM customers LIMIT 3,4;

Select columns city,age from customer table and (by default ascending) using age then city
SELECT customer.city,customer.age FROM customer ORDER BY age,city;

Select columns city,age from customer table and descending using age
SELECT customer.city,customer.age FROM customer ORDER BY age DESC;

Select only records that IDs = 3
SELECT * FROM customer WHERE ID=3;

Select only records that IDs = 3 till 7
SELECT * FROM customer WHERE ID BETWEEN 3 AND 7;

Select only records that city = New York
Escape sequence is another single quote
SELECT * FROM customer WHERE city=‘New York’;

Select only records that IDs 3 or less and id 10 or more
SELECT * FROM customer WHERE ID<=3 AND ID>=10;

conjunctive operators mean that using AND & OR together
SELECT * FROM customer WHERE city=‘New York’ AND age=10 OR age=20;

In is replace multiple or
SELECT * FROM customer WHERE city IN ('New York','Los Angeles','Chicago');

In is replace multiple or (not is reverse)
SELECT * FROM customer WHERE city NOT IN ('New York','Los Angeles','Chicago');

Concatenate firstName with city separate with , in (optional) new column called concatCol
SELECT CONCAT (firstName, ‘,’ ,city) AS concatCol FROM customer;

Select age and add 5 to each age and create new column called newCol
SELECT ID,firstName,lastName,age+5 AS newCol FROM customer;

Upper and lower return alphabet with specific condition
SELECT firstName,UPPER(lastName) AS newCol FROM customer;

Min,max,ave,sqrt,power,sum are functions return value after calculating
in example it will return summation of age column 
SELECT SUM(age) FROM customer;

First select firstName and age columns from customer table where age is more than average of ages using subquery and sort result ascending
SELECT firstName,age FROM customer WHERE age>(SELECT AVG(age) FROM customer) ORDER BY ID ASC;


‘_’ any single character
‘%’ arbitrary number of characters (including zero characters)
in example select firstName column where any name end with ‘s’
SELECT firstName FROM customer WHERE firstName LIKE ‘%s’;

Create temp table contains columns from two tables
SELECT customer.ID,customer.firstName,orders.firstName,orders.amount FROM customer,orders WHERE customer.ID=orders.customer_ID ORDERE BY customer.ID;

Shorten expression using as
SELECT ct.ID, ct.firstName,ord.firstName,ord.amount
FROM customer AS ct, orders AS ord WHERE ct.ID=ord.customer_ID ORDER BY ct.ID;