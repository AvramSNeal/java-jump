#1
SELECT location_id, street_address, city, state_province, country_name FROM locations
NATURAL JOIN countries;

#2
SELECT first_name, last_name, department_id, department_name
FROM employees
JOIN departments USING (department_id);

#3
SELECT e.first_name, e.last_name, e.job_id, e.department_id, d.department_name, l.city
FROM employess e
JOIN departments d
	ON (e.department_id = d.department_id)
JOIN locations l ON
	(d.location_id = l.location_id)
WHERE l.city = 'London';


#4
SELECT e.mployee_id 'Emp_Id', e.last_name 'Employee',
	m.employee_id 'Mgr_Id', m.last_name 'Manager'
FROM employees e
JOIN employees m
	ON (e.manager_id = m.employee_id);
SELECT * FROM employees WHERE employee_id in (0, 100, 101, 102);

#5
SELECT 	e.first_name, e.last_name, e.hire_date
FROM employees e
JOIN employees j
	ON (j.last_name = 'Jones')
WHERE j.hire_date < e.hire_date;

#6
SELECT department_name AS 'Department Name',
COUNT(*) AS 'No of Employees'
FROM departments
INNER JOIN employees
ON employees.department_id = departments.department_id
GROUP BY departments.department_id
ORDER BY department_name;

#7
SELECT employee_id, job_title, end_date-start_date Days FROM job_history
NATURAL JOIN jobs
WHERE department_id = 90;

SELECT jh.employee_id, j.job_title, jh.end_date-jh.start_date Days FROM job_history
INNER JOIN jobs j
	ON jh.job_id = j.job_id
WHERE jh.department_id = 90;

SELECT end_date, start_date, datediff(end_date, start_date) FROM job_history;

#8
SELECT d.department_id, d.department_name, d.manager_id, e.first_name
FROM departments d
LEFT JOIN employees e
ON (d.manager_id = e.employee_id);

#9
SELECT d.department_name, e.first_name, l.city
FROM departments d
JOIN employees e
	ON (d.manager_id = e.employee_id)
JOIN locations l USING (location_id);

#10
SELECT job_title, AVG(salary)
FROM employees
NATURAL JOIN jobs
GROUP BY job_title;

#11
SELECT job_title, first_name, salary-min_salary 'Salary - Min_Salary'
FROM employees
NATURAL JOIN jobs;

#12
SELECT jh.* FROM job_history jh
JOIN employees e
	ON (jh.employee_id = e.employee_id)
WHERE salary > 10000;

#13
SELECT first_name, last_name, hire_date, salary,
	(DATEDIFF(now(), hire_date))/365 Experience
FROM departments d JOIN employees e
	ON (d.manager_id = e.employee_id)
WHERE (DATEDIFF(now(), hire_date))/365>15 and
	e.manager_id in (SELECT DISTINCT manager_id FROM employees);


