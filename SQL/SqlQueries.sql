--create database SampleOne

--alter database sampleOne modify name = sampleTwo

--execute sp_renameDB 'sampleOne', 'sampleStorePrecedures'

--alter database sampleStorePrecedures set single_user with rollback immediate

--drop database sampleStorePrecedures

--use [SampleOne]
--go

--create table tblGender
--(
--	id int not null primary key,
--	gender nvarchar(50) not null

--)

--create table tblPerson
--(
--	id int not null primary key identity(1,1),
--	[name] nvarchar(50) not null,
--	Email nvarchar(50) not null,
--	genderID int
--)

--alter table tblPerson add constraint tblPerson_genderID_fk
--foreign key (genderID) references tblGender(id)

--alter table tblPerson
--add constraint def_tblPerson_genderID
--default 3 for genderID

--alter table tblPerson
--drop constraint def_tblPerson_genderID

--delete from tblGender where id = 1

--alter table tblPerson drop constraint fk_tblPerson_genderID

--alter table tblGender add constraint pk_tblGender primary key (id)

--alter table tblPerson
--add constraint fk_tblPerson_genderID foreign key (genderID)
--references tblGender(id)
--on delete set default

--alter table tblPerson add age int null

--alter table tblPerson add constraint chk_tblPerson_age
--check (age between 1 and 150)

--alter table tblPerson add id int primary key identity(1,1)

--set identity_insert tblPerson on
--set identity_insert tblPerson off

--dbcc checkident (tblPerson, reseed, 0)

--create trigger tr_tblPerson on tblPerson for insert
--as
--begin
--	insert into tblPerson values ('ahmed', 'a@a.com', 1, 27)
--end

--select SCOPE_IDENTITY()
--select @@IDENTITY
--select IDENT_CURRENT('tblPerson')

--alter table tblPerson add constraint uq_tblPerson_Email unique(email)

--insert into tblPerson values ('samy', 's@s.com', 1, 15)

--update tblPerson set [name] = 'samy', email = 'sa@sa.com', [age] = 85 where id = 6