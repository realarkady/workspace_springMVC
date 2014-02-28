CREATE TABLE test.EMPLOYEE
(
    ID          INT PRIMARY KEY AUTO_INCREMENT,
    FIRSTNAME   VARCHAR(30),
    LASTNAME    VARCHAR(30),
    TELEPHONE   VARCHAR(15),
    EMAIL       VARCHAR(30),
    CREATED     TIMESTAMP DEFAULT NOW()
);


insert into test.employee(FIRSTNAME, LASTNAME, TELEPHONE, EMAIL) 
values ('Alic','Bacalu','70-2-82','ab@ab.com');
-- -----------------------------------------------------

select * from test.employee;

delete from test.employee where id > 0;

drop table test.employee;



