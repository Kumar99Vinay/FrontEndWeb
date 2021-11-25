SHOW DATABASES;

CREATE DATABASE IF NOT EXISTS MYDB2;

SHOW CREATE DATABASE MYDB2;

USE MYDB2;

CREATE TABLE IF NOT EXISTS tasks(
   task_id INT AUTO_INCREMENT PRIMARY KEY,
   title VARCHAR(255) NOT NULL,
   start_date DATE,
   due_date DATE,
   status TINYINT NOT NULL,
   priority TINYINT NOT NULL,
   description TEXT,
   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
   
);

CREATE TABLE IF NOT EXISTS test(
   test_id INT AUTO_INCREMENT PRIMARY KEY,
   test_name VARCHAR(255) NOT NULL,
   test_score int,
   test_status TINYINT,
   test_description TEXT,
   test_date DATE,
   description TEXT,
   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
   
);

show tables;
RENAME TABLE TEST TO NEW_TEST;
RENAME TABLE NEW_TEST TO TEST;

-- aDD A COLUMN

ALTER TABLE TEST ADD test_grade varchar(2);
ALTER TABLE TEST ADD test_grade1 varchar(2) FIRST;
ALTER TABLE TEST ADD test_grade2 varchar(2) AFTER test_name;

ALTER TABLE TEST
  ADD test_grade3 VARCHAR(2),
  ADD test_grade4 VARCHAR(2);
  
  ALTER TABLE TEST ADD test_grade5 VARCHAR(2) NOT NULL;

DESCRIBE TEST;  

ALTER TABLE TEST
    MODIFY test_grade2 VARCHAR(10) NOT NULL;


ALTER TABLE TEST
   MODIFY test_grade1 VARCHAR(10) NOT NULL,
   MODIFY test_grade3 VARCHAR(10) NOT NULL,
   MODIFY test_grade4 VARCHAR(10) NOT NULL;
   
ALTER TABLE TEST
   CHANGE COLUMN test_grade1 test_test INT(2) NOT NULL;

ALTER TABLE TEST
   DROP COLUMN test_test;
   
ALTER TABLE TEST
   DROP COLUMN test_grade2, 
   DROP COLUMN test_grade3,
   DROP COLUMN test_grade5; 
   
 
TRUNCATE TABLE TEST;  

------------------------------

CREATE TABLE USERS(
user_id int auto_increment primary key,
user_name varchar(50) not null,
user_pass varchar(15) not null,
user_email varchar(20) not null unique,
user_phone varchar(15) not null unique,
user_credit dec(5,2) default 0.1,
user_withdraw dec(5,2) not null check(user_withdraw >0)
);
describe users;

INSERT INTO USERS(user_name,user_pass,user_email,user_phone,user_withdraw)
   VALUES('Sachin','Sachin123','sam@gmail.com','+91-8178040024',0.1);
   
INSERT INTO users (user_name,user_pass,user_email,user_phone,user_withdraw) 
	VALUES('Jonas','Jonas@123','Jon@gmail.com','+91-9552505659',0.1);
    
INSERT INTO users (user_name,user_pass,user_email,user_phone,user_withdraw) 
	VALUES('Hannah','Hannah@123','Hann@gmail.com','+91-9552505658',0.1);
    
ALTER TABLE USERS auto_increment = 101;

INSERT INTO users (user_name,user_pass,user_email,user_phone,user_credit,user_withdraw) 
	VALUES('Sherk','sherk@123','sherk@gmail.com','+91-9552505657',10,0.1);
    
INSERT INTO users (user_name,user_pass,user_email,user_phone,user_withdraw) 
	VALUES('Bartosh','Bartosh@123','Bar@gmail.com','+91-9552505656',0.1);
    
select* from users;

CREATE TABLE USERS_ADDRESS(
	id int auto_increment primary key,
    city varchar(50) not null,
    country varchar(50) not null,
    user_id int,
    foreign key (user_id) references users(user_id)
);

DESCRIBE USERS_ADDRESS;

INSERT INTO USERS_ADDRESS(user_id,city,country) VALUES(1,'PUNE','INDIA');
INSERT INTO USERS_ADDRESS(user_id,city,country) VALUES(2,'MUMBAI','INDIA');
   
SELECT * FROM USERS_ADDRESS;
   
SELECT * FROM USERS;

 CREATE TABLE devices(
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50)
);

INSERT INTO devices(name) VALUES('Repeater 1'),('Repeater 2');
INSERT INTO devices(id,name) VALUES(3,'Printer1') ;
INSERT INTO devices(name) VALUES('Printer')
ON DUPLICATE KEY UPDATE name  = 'Printer';

INSERT INTO devices(id,name) VALUES(4,'Printer')
ON DUPLICATE KEY UPDATE name  = 'New Printer';

SELECT * FROM devices;
SELECT * FROM users;
select * from users_address;

delete from users_address where user_id=1;




