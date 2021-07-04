'Q1'
create table department
(
Dname varchar2(20) not null,
Dnumber number(4),
Mgr_ssn number(10),
Mgr_start_date date,
constraint pk_dep primary key (Dnumber)
)

create table employee
(
Fname varchar2(10),
Lname varchar2(10),
ssn number(10),
Bdate date,
sex char(7),
salary number(7,2),
Dno number(4),
constraint pk_emp primary key(ssn),
constraint fk_emp foreign key(Dno)
references department(Dnumber) 
)

'one employee manage one department'
alter table department
add constraint fk_dep foreign key(Mgr_ssn)
references employee(ssn)

create table project
(
Pname varchar2(20) not null,
Pnumber number(3),
Plocation varchar2(20),
constraint pk_proj primary key(Pnumber)
)

create table works_on
(
essn number(10),
pno number(3),
hours number(2),
constraint pk_wor primary key(essn,pno),
constraint fk_wor_emp foreign key(essn)
references employee(ssn),
constraint fk_wor_proj foreign key(pno)
references project(Pnumber)
)

'Q2'
alter table employee add city char(20) not null

'Q3'
alter table employee
add constraint chk_salary check(salary between 3000 and 10000)

'Q4'
'insert into department'
insert into department(dnumber , dname)
values (1,'sales')
insert into department(dnumber , dname)
values (2,'inventory')
insert into department(dnumber , dname)
values (3,'marketing')
insert into department (dnumber,dname)
values (4,'hr')

'update values in department'
update department set mgr_ssn = 1000 where dnumber = 1
update department set mgr_ssn = 3000 where dnumber = 2
update department set mgr_ssn = 2000 where dnumber = 3
update department set mgr_ssn = 4000 where dnumber = 4

'insert into employee'
insert into employee(ssn,fname,lname,salary,dno,city)
values (1000,'mohamed','ibrahim',4000,1,'Riyadh')

insert into employee(ssn,fname,lname,salary,dno,city)
values (2000,'ahmed','ibrahim',5000,2,'Riyadh')

insert into employee(ssn,fname,lname,salary,dno,city)
values (3000,'ibrahim','ali',7000,3,'kharj')

insert into employee(ssn,fname,lname,salary,dno,city)
values (4000,'Sayed','hassan',6000,4,'kharj')

'update values in employee'
update employee set fname = 'hassan' where ssn = 4000

'insert into project'
insert into project values ('pro1',1,'egypt')
insert into project values ('pro2',2,'usa')
insert into project values ('pro3',3,'uk')

'insert into works_on'
insert into works_on values (1000,1,5)
insert into works_on values (1000,2,15)
insert into works_on values (2000,3,4)
insert into works_on values (2000,1,8)
insert into works_on values (3000,2,2)
insert into works_on values (3000,3,10)

'Q5'
select ssn , fname || ' ' || lname as "full name" , salary
from employee

'Q6'
select ssn , fname || ' ' || lname as "Full name", salary
from employee where dno = 2

'Q7'
select dname , fname || ' ' || lname as "full name", salary
from department , employee
where employee.dno = department.dnumber
order by salary desc

'other solution'
select dname , fname || ' ' || lname as "full name", salary
from department inner join employee
on employee.dno = department.dnumber
order by salary desc

'Q8'
select pname , fname || ' ' || lname as "full name"
from employee inner join works_on on ssn = essn
inner join project on pno = pnumber

'other solution'
select pname , fname || ' ' || lname as "full name"
from employee , works_on , project
where ssn = essn and pno = pnumber

'Q9'
select dname , max(salary)
from department inner join employee
on ssn = mgr_ssn group by dname

'Q10'
select fname , sum(hours)
from employee inner join works_on on ssn = essn
group by fname

'Q11'
select fname , sum(hours)
from employee inner join works_on on ssn=essn
group by fname
having sum(hours) > 12

'Q12'
select * from employee where fname = lname

'Q13'
select * from employee where lower(fname) like 'a%'

'Q14'
select * from employee where lname like '___'

'--------------------------------------------------------------'
'Q15'
'single row query'
'return employee who take max salary'
select fname || ' ' || lname as "full name" , salary
from employee where salary = 
(select max(salary) from employee)

'Q16'
'multiple row query'
'return only employee who manage'
select * from employee where ssn in
(select mgr_ssn from department)

'return only employee who manage'
select fname || ' ' || lname as "full name" , dname
from employee , (select * from department) sub
where ssn = sub.mgr_ssn