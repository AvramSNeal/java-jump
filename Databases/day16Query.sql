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

CREATE TABLE IF NOT EXISTS countries (
	country_id		varchar(2),
    country_name	varchar(40)
    CHECK(country_name IN('Italy','India','China')),
    region_id decimal(10,0)
);