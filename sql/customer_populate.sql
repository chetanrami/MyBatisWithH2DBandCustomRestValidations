insert into customer(custno,custname, age) values (1, 'john', 34);
insert into customer(custno,custname, age) values (2, 'george', 44);

insert into fund(fundno, fundname, price) values (1, 'lowriskfund', 32);
insert into fund(fundno, fundname, price) values(2, 'mediumriskfund', 27);
insert into fund(fundno, fundname, price) values(3, 'highriskfund', 8);

insert into customerholding(custholdingno, customerno, fundquantity, fundno) values(1, 1, 7, 2);
insert into customerholding(custholdingno, customerno, fundquantity, fundno) values(2, 2, 9, 1);