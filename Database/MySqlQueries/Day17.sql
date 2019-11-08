#1
#UPDATE employees SET email = 'available'
UPDATE employees SET email=concat(SUBSTRING(first_name, 1,1),last_name)
WHERE employee_id = 205;

SELECT * FROM employees WHERE employee_id = 205 ;


#2
UPDATE employees SET email='not available',commission_pct=0.1
WHERE employee_id=205;
SELECT * FROM employees WHERE employee_id = 205 ;

#3
UPDATE employees
SET commission_pct = 0.10
WHERE department_id = 110;
SELECT* FROM employees WHERE department_id=110;

#4
UPDATE employees
SET commission_pct=0.10
WHERE department_id=80 AND comission_pct<.20;
SELECT * FROM employees WHERE department_id=80;


#5
#Update the commission_pct for all employees in Accounting dept to 0.10
UPDATE employees
SET commission_pct=0.1
WHERE department_id=(
SELECT department_id FROM departments WHERE department_name= 'Accounting');

#6
UPDATE employees 
SET SALARY = 8000
WHERE employee_id = 105 AND salary < 5000;
select* from employees WHERE employee_id =105;

#7
UPDATE employees 
SET JOB_ID = 'SH_CLERK'
WHERE
	employee_id = 118 AND
    department_id = 30 AND
    NOT JOB_ID LIKE 'SH%';
select* from employees WHERE employee_id = 118;

#8
select* from employees WHERE department_id in (40,90,100,105,110);
UPDATE employees
SET salary =
	CASE department_id
		WHEN 40 THEN salary = salary * 1.25
		WHEN 90 THEN salary = salary * 1.25
		WHEN 110 THEN salary = salary * 1.10
		ELSE salary
	END 
WHERE department_id in (40,90,100,105,110);
select* from employees WHERE department_id in (40,90,100,105,110);


#9
select * from employees WHERE employees.job_id = 'PU_CLERK';
UPDATE employees e, jobs j 

SET j.min_salary = j.min_salary + 2000, 
	j.max_salary = j.max_salary + 2000,
    e.salary = e.salary*1.2,
    e.commission_pct = 
    IF (e.commission_pct = 0, 0.1, e.commission_pct*1.1)
    
WHERE e.job_id = 'PU_CLERK' AND
	  j.job_id = 'PU_CLERK';
      
select * from employees WHERE employees.job_id = 'PU_CLERK';
select * from jobs WHERE jobs.job_id = 'PU_CLERK';


      

	

    
    



