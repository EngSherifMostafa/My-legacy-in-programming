/*to create new table*/
create table sup
(
	sup_ID number(2) not null,
	sup_name varchar2(10) not null,
	sup_phon varchar(9),
	
	/*make sup_ID as primary key*/
	constraint sup_pk primary key (sup_ID)
);


create table part
(
	part_ID number(2) not null,
	part_name varchar2(10) not null,
	part_type varchar(9),
	fk_sup_id number(2) not null,
	
	/*make sup_ID as primary key*/
	constraint part_fk foreign key (part_ID) references sup(sup_ID)
);

create table cus
(
	cus_id number(2) primary key,
	cus_name varchar2(10) not null,
	cus_phone varchar2(11) not null,
	
	constraint un_cus unique(cus_id)
);

create table worker
(
	wor_id number(2) not null,
	wor_name varchar2(10) not null,
	wor_sal number(5) not null,
	constraint chk_sal check (wor_sal between 1000 and 10000)
);


/*show table construction*/
describe sup;


/*delete table from database*/
drop table sup;


/*alter command*/
/*--------------------------------------------------------------*/
/*1- rename table*/
alter table sup rename to vendors;

/*2- rename column in table*/
alter table vendors rename column sup_phon to sup_phone;

/*3- modify constraint of column*/
alter table vendors modify sup_phone varchar2(11) not null;

/*4- add new column*/
alter table vendors add sup_location varchar2(20) null;

/*5- add more one new column*/
alter table vendors add
(
	sup_bills number(5) not null,
	sup_debits number(5) not null
);

/*6- drop column from table*/
alter table vendors drop column sup_debits;

/*7- add column primary key*/
alter table vendors add constraint sup_pk primary key (sup_name);

/*8- add column foreign key*/
alter table part add constraint part_fk foreign key (part_id) references sup(sup_id);

/*9- add unique constraint*/
alter table cus add constraint un_phone unique(cus_phone);

/*10- add check constraint*/
alter table worker add constraint chk_city check(wor_city in ('cairo','ismailia','portsaid'));

/*11- drop constraint*/
alter table worker drop constraint chk_city;

/*12- disable constraint*/
alter table worker disable constraint chk_city;

/*13- enable constraint*/
alter table worker enable constraint chk_city;

/*insert data*/
/*--------------------------------------------------------------*/
insert into sup values (1,'Sherif','226126498');
insert into sup (sup_name, sup_id) values('mohmaed',2);


/*update data*/
/*--------------------------------------------------------------*/
update vendors set sup_phone = '01111' where sup_id=2;
update vendors set sup_name = 'said' where sup_id=3 and sup_phone = '01000';


/*delete data*/
/*--------------------------------------------------------------*/
delete from vendors where sup_id = 1;


/*select data*/
/*--------------------------------------------------------------*/
select * from vendors;

select sup_id , sup_name from vendors;

select sup_id , sup_name from vendors where sup_id=1;

select * from vendors where sup_name = 'mohamed' and sup_phone = '010000';

select * from vendors where sup_name like 'm%';
select * from vendors where sup_name like '%m%';
select * from vendors where sup_name like '%m';

select * from vendors where sup_name in ('mohamed','khaled','ahmed');
select * from vendors where sup_name not in ('mohamed','khaled','ahmed');

select * from vendors where sup_phone between '01000' and '019999';
select * from vendors where sup_phone not between '01000' and '019999';


/*join tables*/
/*--------------------------------------------------------------*/
/*join two tables*/
select cus_name , ord_date from customer inner join orders on cus_id=cust_id;

/*connect three tables*/
select cus_name , ord_date , pro_name
from customer , orders , product
where cus_id=cust_id and orders.product_id=product.pro_id;
