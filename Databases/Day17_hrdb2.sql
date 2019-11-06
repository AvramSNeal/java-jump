#1
ALTER TABLE countries RENAME country_new;
ALTER TABLE country_new RENAME countries;
DESC countries;


#2
ALTER TABLE locations
ADD region_id INT;

#3
ALTER TABLE locations
ADD ID INT FIRST;

#4
ALTER TABLE locations  DROP region_id;
ALTER TABLE locations
ADD region_id INT AFTER state_province;

#5
ALTER TABLE locations
MODIFY country_id INT;

#6
ALTER TABLE locations
DROP city;

#7
ALTER TABLE locations
DROP state_province,
ADD state varchar(25);

#ALTER TABLE locations RENAME COLUMN state TO state_province;

#8
ALTER TABLE locations
DROP PRIMARY KEY;

ALTER TABLE locations 
ADD PRIMARY KEY(location_id);

#9
ALTER TABLE locations
ADD PRIMARY KEY (location_id, country_id);

#10
ALTER TABLE locations DROP PRIMARY KEY;

#11
ALTER TABLE job_history ADD FOREIGN KEY(job_id) REFERENCES jobs(job_id);

#12
ALTER TABLE job_history ADD CONSTRAINT fk_job_id FOREIGN KEY(job_id)
REFERENCES jobs(job_id) ON UPDATE RESTRICT ON DELETE CASCADE;

#13
ALTER TABLE job_history DROP FOREIGN KEY fk_job_id;

#14
ALTER TABLE job_history
ADD INDEX indx_job_id(job_id);

#15
ALTER TABLE job_history
DROP INDEX indx_job_id;

ALTER TABLE jobs ADD INDEX indx_job_title(job_title);
SELECT *FROM jobs where job_title like 'A%';

SELECT 
  first_name  AS "First Name",
  last_name AS "Last Name"
  From employees;
  
  #2
  SELECT DISTINCT department_id
  FROM employees;
  
  #3
  SELECT *
	FROM employees
    ORDER BY first_name DESC;
    
    #4
    SELECT first_name, last_name, salary, salary* .15 AS PF FROM employees;
    
    #5
    SELECT first_name, last_name, salary FROM employees ORDER BY salary ASC;
    
    #6
    SELECT sum(salary) AS TotalSalary from employees;
    
    #7
    SELECT min(salary) AS 'Min Salary', max(salary) AS 'Max Salary' FROM employees;
    
    #8
    SELECT min(salary) Min, max(salary)Max FROM employees;
    
    #8
    SELECT avg(salary) Avg, count(*) Count FROM employees;
    
    #9
    SELECT count(*) AS 'Nr Employees' FROM employees;
    
    #10
    SELECT count(DISTINCT job_id) AS 'Distinct Jobs' FROM employees;
    
    #11
    SELECT DISTINCT ucase(first_name) FROM employees ORDER BY first_name;
    
    #12
    SELECT SUBSTRING(first_name,1,3)
    FROM employees;
    
    #13
    SELECT 171*214+625 Result;
    
    #14
    SELECT CONCAT(first_name,' ', last_name) FROM employees;
    
    #15
    SELECT trim(first_name) as FirstName FROM employees;
    
    #16
    SELECT length(concat(first_name, ' ', last_name)) as NameLength FROM employees;
    SELECT length(first_name), length(last_name) FROM employees;
    
    #17
    SELECT* FROM employees WHERE first_name REGEXP '[0-9]';
	SELECT* FROM employees WHERE first_name REGEXP 'sh';
    SELECT* FROM employees WHERE first_name REGEXP 'th$'; #end with ' sh'
    SELECT* FROM employees WHERE first_name REGEXP 'en$|th$';
    
    #18
    SELECT employee_id, first_name FROM employees LIMIT 10;
    
    #19
    SELECT first_name, last_name, round(salary/12,2) as 'Monthly Salary' FROM employees;
    
    
    
    
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  



































