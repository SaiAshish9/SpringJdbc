--create table person(
--id integer not null,
--name varchar(255) not null,
--location varchar(255),
--birth_date timestamp,
--primary key(id)
--);

-- table will be created automatically

INSERT INTO person		
(
id,
name,
location,
birth_date
) 
VALUES(1001,'SAI','DELHI',sysdate());
;

INSERT INTO person 
(
id,
name,
location,
birth_date
) 
VALUES(1002,'SAI9','DELHI',sysdate());
;

INSERT INTO person 
(
id,
name,
location,
birth_date
) 
VALUES(1003,'SAI99','DELHI',sysdate());
;
