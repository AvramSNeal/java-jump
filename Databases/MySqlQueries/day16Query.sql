# create database day16;
# drop table countries;
/*
CREATE TABLE IF NOT EXISTS countries(
COUNTRY_ID varchar(2),
COUNTRY_NAME varchar(40),
REGION_ID decimal(10,0)
);

*/
# DESC countries;

/*
CREATE TABLE IF NOT EXISTS 	dup_countries
LIKE countries;
*/
# DESC dup_countries;
/*
CREATE TABLE IF NOT EXISTS jobs (
	job_id		varchar(10)		NOT NULL,
    job_title	varchar(35) 	NOT NULL,
    min_salary	decimal(6,0),
    max_salary	decimal(6,0),
    CHECK(max_salary <= 25000)
);
*/
# INSERT INTO jobs(job_id, job_title, min_salary, max_salary) VALUES('QQ', 'ADMIN', 1000, 30000);
# DESC jobs;
/*
CREATE TABLE IF NOT EXISTS countries (
	country_id		varchar(2),
    country_name	varchar(40)
    CHECK(country_name IN('Italy','India','China')),
    region_id decimal(10,0)
);
*/
/*
CREATE TABLE IF NOT EXISTS job_history (
	EMPLOYEE_ID decimal(6,0) NOT NULL,
    START_DATE date NOT NULL,
    END_DATE date NOT NULL,
    CHECK (END_DATE LIKE '--/--/----'),
    JOB_ID varchar(10) NOT NULL,
    DEPARTMENT_ID decimal(4,0) NOT NULL
);
*/
# DESC job_history;
# drop table countries;
/*
CREATE TABLE IF NOT EXISTS countries (
	COUNTRY_ID varchar(2) NOT NULL,
    COUNTRY_NAME varchar(40) NOT NULL,
    REGION_ID decimal(10,0) NOT NULL,
    UNIQUE(COUNTRY_ID)
);
*/
/*
CREATE TABLE IF NOT EXISTS jobs (
	JOB_ID varchar(10) NOT NULL UNIQUE,
    JOB_TITLE varchar(35) NOT NULL DEFAULT ' ',
    MIN_SALARY decimal(6,0) DEFAULT 8000,
    MAX_SALARY decimal(6,0) DEFAULT NULL
);

insert into jobs(job_id) values('QQ');
select * from jobs;
*/
/*
CREATE TABLE IF NOT EXISTS countries (
	COUNTRY_ID varchar(2) NOT NULL UNIQUE,
    COUNTRY_NAME varchar(40) NOT NULL,
    REGION_ID decimal(10,0) NOT NULL
);
*/
/*
CREATE TABLE IF NOT EXISTS countries (
	COUNTRY_ID integer NOT NULL UNIQUE AUTO_INCREMENT,
    COUNTRY_NAME varchar(40) NOT NULL,
    REGION_ID decimal(10,0) NOT NULL
);
*/
/*
CREATE TABLE IF NOT EXISTS job_history (
	EMPLOYEE_ID decimal(6,0) NOT NULL UNIQUE,
    START_DATE date NOT NULL,
    END_DATE date NOT NULL,
    JOB_ID varchar(10) NOT NULL,
    DEPARTMENT_ID decimal(4,0) NOT NULL,
    FOREIGN KEY(job_id) REFERENCES jobs(job_id)
);
*/
# desc job_history;
/*
CREATE TABLE IF NOT EXISTS countries (
	COUNTRY_ID varchar(2),
    COUNTRY_NAME varchar(40) NOT NULL,
    REGION_ID decimal(10,0) DEFAULT 0
);
/*
/*
INSERT INTO  countries VALUES('C1','India',1001);
select * from countries;
*/
/*
INSERT INTO  countries (country_id,country_name) VALUES('C1','India');
select * from countries;
/*
/*
CREATE TABLE IF NOT EXISTS country_new
AS SELECT * FROM countries;

SELECT * from country_new;

SHOW COLUMNS FROM country_new;
*/
/*
INSERT INTO countries VALUES('C1','India',1001),('C2','USA',1007),('C3','UK',1003);
select * from countries;
*/
/*
INSERT INTO country_new SELECT * FROM countries;
*/
/*
CREATE TABLE IF NOT EXISTS jobs (
	JOB_ID integer NOT NULL UNIQUE,
    JOB_TITLE varchar(35) NOT NULL,
    MIN_SALARY decimal(6,0)
);
*/
# INSERT INTO jobs VALUES(1001,'OFFICER',0000);

/*
CREATE TABLE IF NOT EXISTS countries (
	COUNTRY_ID integer NOT NULL,
    COUNTRY_NAME varchar(40) NOT NULL,
    REGION_ID integer NOT NULL,
    PRIMARY KEY(COUNTRY_ID,COUNTRY_NAME)
);
*/
/*
CREATE TABLE IF NOT EXISTS countries (
	COUNTRY_ID integer NOT NULL AUTO_INCREMENT PRIMARY KEY,
    COUNTRY_NAME varchar(40) NOT NULL,
    REGION_ID integer NOT NULL
);

INSERT INTO countries(COUNTRY_NAME,REGION_ID) VALUE('India',185);
SELECT * FROM countries;
*/

/*
CREATE TABLE IF NOT EXISTS jobs (
	JOBS_ID integer NOT NULL UNIQUE PRIMARY KEY,
    JOB_TITLE varchar(35) NOT NULL DEFAULT ' ',
    MIN_SALARY decimal(6,0) DEFAULT 8000,
    MAX_SALARY decimal(6,0) DEFAULT 20000
);

INSERT INTO jobs(JOB_ID,JOB_TITLE) VALUES(1001,'OFFICER');
INSERT INTO jobs(JOB_ID,JOB_TITLE) VALUES(1002,'CLERK');
*/
 
/**/

/**/



