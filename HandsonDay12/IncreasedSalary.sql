
--  Create a query to increase salary by 10% for all employees in dept 90.

UPDATE employee SET salary= salary + (salary * 10 / 100) WHERE department_id=90;
