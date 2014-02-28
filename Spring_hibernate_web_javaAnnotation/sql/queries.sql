CREATE TABLE test.TEAMS
(
    ID 		INT(6) PRIMARY KEY AUTO_INCREMENT,
    NAME   	VARCHAR(30),
    RATING 	INT(6)
);



insert into test.employee(NAME, RATING) 
values ('Alic', 10);
-- -----------------------------------------------------

select * from test.teams;

delete from test.teams where id > 0;

drop table test.teams;



