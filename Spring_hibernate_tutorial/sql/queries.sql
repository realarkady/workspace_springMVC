create table test.EMPLOYEE ( 
   id INT NOT NULL auto_increment, 
   first_name VARCHAR(20) default NULL, 
   last_name  VARCHAR(20) default NULL, 
   salary     INT  default NULL, 
   PRIMARY KEY (id) 
); 

create table test.CERTIFICATE ( 
   id INT NOT NULL auto_increment, 
   certificate_name VARCHAR(30) default NULL, 
   employee_id INT default NULL, 
   PRIMARY KEY (id) 
); 

insert into test.employee(first_name, last_name, salary) 
values ('Alic','Bacalu',3000);

select * from test.employee;
select * from test.certificate;

delete from test.employee where id > 0;
delete from test.certificate where id > 0;