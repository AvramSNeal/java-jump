
#1

SELECT FIRST_NAME, LAST_NAME, SALARY
FROM employees
WHERE salary >= (SELECT salary FROM employees WHERE last_name = 'Bull');

#everyone whose salary is greater than the employee whose last name is Bull


#2
SELECT first_name, last_name
FROM employees
WHERE department_id
IN( SELECT department_id FROM departments WHERE department_name = 'IT');

#3
SELECT first_name, last_name
FROM employees
WHERE manager_id IN (SELECT employee_id FROM employees WHERE department_id IN
						(SELECT department_id FROM departments WHERE location_id IN
							(SELECT location_id FROM locations WHERE country_id = 'US')));



