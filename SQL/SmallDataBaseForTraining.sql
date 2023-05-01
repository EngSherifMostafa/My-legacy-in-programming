create table customer
(
cus_id number(2) not null,
cus_name varchar2(10) not null
);
alter table customer modify cus_id number(3);
alter table customer add constraint cus_pk primary key (cus_id);

create table orders
(
cust_id number(2) not null,
product_id number(1) not null,
ord_date date not null
);
alter table orders modify cust_id number(3);
alter table orders add constraint ord_fk foreign key(cust_id) references customer(cus_id);
alter table orders add constraint ord_pk primary key(product_id); 

create table product
(
pro_id number(1) not null,
pro_name varchar2(10) not null,
sup_id number(3) not null,
constraint pro_fk foreign key(pro_id) references orders(product_id)
);
alter table product modify pro_name varchar2(20);

insert into customer values(1,'Mohamed');
update customer set cus_id = 100 where cus_name = 'Mohamed';
insert into customer values(200,'Ahmed');
insert into customer values(300,'Hassan');
insert into customer values(400,'Mostafa');
select * from customer;


insert into orders values(100,1,TO_DATE('1/01/2012', 'DD/MM/YYYY'));

insert into orders values(200,2,TO_DATE('2/05/2011', 'DD/MM/YYYY'));

insert into orders values(100,3,TO_DATE('10/04/2011', 'DD/MM/YYYY'));

insert into orders values(300,4,TO_DATE('23/02/2012', 'DD/MM/YYYY'));

select * from orders;


insert into product values(1,'IPAD2',400);
insert into product values(2,'IPHONE 4s',400);
insert into product values(3,'MS Office 2012',300);
insert into product values(4,'Color Printer',100);
select * from product;


/*join two tables*/
select cus_name , ord_date from customer inner join orders on cus_id=cust_id;

/*connect three tables without join*/
select cus_name , ord_date , pro_name
from customer , orders , product
where cus_id=cust_id and orders.product_id=product.pro_id;

/*connect three tables using join*/
select cus_id ,cus_name , ord_date , pro_name
from customer inner join orders on cus_id=cust_id
inner join product on orders.product_id=product.pro_id;