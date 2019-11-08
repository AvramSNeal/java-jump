#1
SELECT count(DISTINCT job_id) FROM employees;

#2
SELECT sum(salary) AS 'Total Salary' FROM employees;

#3
SELECT min(salary) AS 'Min Salary' FROM employees;

#4
SELECT max(salary) AS 'Max Salary' FROM employees WHERE job_id in (SELECT job_id FROM jobs WHERE job_title='Programmer');


#5
SELECT avg (salary) AS 'Avg Salary', count(*) AS 'Nr Employees' FROM employees WHERE department_id = 90;

#6
SELECT 
	max(salary) AS 'Max Salary',
    min(salary) AS 'Min Salary',
    sum(salary) AS 'Sum Salary',
    round(avg(salary), 2) AS 'Avg Salary'
FROM employees;

#7
SELECT job_id, count(*) FROM employees
GROUP BY job_id;

#8
SELECT max(salary) - min(salary) AS 'Diff Min Max' FROM employees;

#9
SELECT manager_id, min(salary) FROM employees GROUP BY manager_id;

#10
SELECT department_id, sum(salary) FROM employees GROUP BY department_id;

#11
SELECT job_id, avg(salary) FROM employees WHERE job_id NOT IN ('IT_PROG') GROUP BY Job_id Having avg(salary)>10000;

#12
SELECT 
	job_id,
    sum(salary) AS 'SUM Salary',
    max(salary) AS 'Max Salary',
    min(salary) As 'Min Salary',
    round(avg(salary),2) AS 'Avg Salary'
FROM employees
WHERE department_id = 90
GROUP BY job_id;

#13
SELECT 
	job_id,
    max(salary) AS 'Max Salary'
    FROM employees
    GROUP BY job_id
    HAVING max(salary) >=4000;
    

    


	





	 

