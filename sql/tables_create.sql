-- Drop and recreate tables

CREATE TABLE customer (
	custno  INT PRIMARY KEY,
	custname    VARCHAR(20),
	age INT
);

CREATE TABLE fund (
	fundno  INT PRIMARY KEY,
	fundname    VARCHAR(20),
	price   INT
);

CREATE TABLE customerholding (
	custholdingno  INT  PRIMARY KEY,
	customerno  INT REFERENCES customer (custno),
	fundquantity    INT,
    fundno  INT REFERENCES fund (fundno)
);