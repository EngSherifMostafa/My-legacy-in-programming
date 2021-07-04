SELECT DEPARTMENT_NAME
FROM DEPARTMENTS
WHERE DEPARTMENT_ID IN
( SELECT DISTINCT DEPARTMENT_ID
  FROM EMPLOYEES)

SELECT DEPARTMENT_NAME
FROM DEPARTMENTS
WHERE DEPARTMENT_ID NOT IN
( SELECT DISTINCT DEPARTMENT_ID
  FROM EMPLOYEES);



SELECT LOWER(FIRST_NAME), UPPER(FIRST_NAME), INITCAP(FIRST_NAME), FIRST_NAME,    
       SALARY
FROM EMPLOYEES
WHERE SALARY BETWEEN 200 AND 5000
ORDER BY FIRST_NAME;

SELECT INITCAP(FIRST_NAME) || ' ' || INITCAP(LAST_NAME)  EMPLOYEE_NAME ,   
       SALARY
FROM EMPLOYEES
WHERE SALARY BETWEEN 200 AND 5000
ORDER BY FIRST_NAME;


SELECT INITCAP(FIRST_NAME) || ' ' || INITCAP(LAST_NAME) AS "EMPLOYEE NAME" ,   
       SALARY, LENGTH(FIRST_NAME), SUBSTR(FIRST_NAME, 3,2),
       INSTR(lower(FIRST_NAME),'m')
FROM EMPLOYEES
WHERE SALARY BETWEEN 200 AND 5000
ORDER BY FIRST_NAME;


SELECT SALARY,LPAD(SALARY,15,'$')
FROM EMPLOYEES
WHERE SALARY BETWEEN 200 AND 5000
ORDER BY FIRST_NAME;

SELECT SALARY,RPAD(SALARY,15,'$')
FROM EMPLOYEES
WHERE SALARY BETWEEN 200 AND 5000
ORDER BY FIRST_NAME;



SELECT ROUND(234.5657,1), ROUND(234.5657,0), ROUND(234.5657,-1), ROUND(234.5657,-2)
FROM DUAL;

SELECT TRUNC(234.5657,1), ROUND(234.5657,2)
FROM DUAL;


SELECT FLOOR(234.565), CEIL(234.5657)
FROM DUAL;


SELECT COUNT(*), SUM(SALARY), MIN(SALARY), MAX(SALARY), ROUND(AVG(SALARY),1),
       ROUND(STDDEV(SALARY),1), ROUND(VARIANCE(SALARY),1)
FROM EMPLOYEES;

SELECT DEPARTMENT_NAME, COUNT(*), SUM(SALARY), MIN(SALARY), MAX(SALARY),    
       ROUND(AVG(SALARY),1),ROUND(STDDEV(SALARY),1), ROUND(VARIANCE(SALARY),1)
FROM EMPLOYEES INNER JOIN DEPARTMENTS USING (DEPARTMENT_ID)
GROUP BY DEPARTMENT_NAME
ORDER BY COUNT(*) DESC;

SELECT DEPARTMENT_NAME, COUNT(*), SUM(SALARY), MIN(SALARY), MAX(SALARY),    
       ROUND(AVG(SALARY),1),ROUND(STDDEV(SALARY),1), ROUND(VARIANCE(SALARY),1)
FROM   EMPLOYEES INNER JOIN DEPARTMENTS USING (DEPARTMENT_ID)
WHERE  SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES)
GROUP  BY DEPARTMENT_NAME
HAVING COUNT(*)>5
ORDER BY COUNT(*) DESC;



SELECT DEPARTMENT_NAME, COUNT(*), SUM(SALARY), MIN(SALARY), MAX(SALARY),    
       ROUND(AVG(SALARY),1),ROUND(STDDEV(SALARY),1), ROUND(VARIANCE(SALARY),1)
FROM   EMPLOYEES E1 INNER JOIN DEPARTMENTS D ON (E1.DEPARTMENT_ID=D.DEPARTMENT_ID)
WHERE  SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES E2
                 WHERE E1.DEPARTMENT_ID = E2.DEPARTMENT_ID)
GROUP  BY DEPARTMENT_NAME
HAVING COUNT(*)>5
ORDER BY COUNT(*) DESC;



SELECT FIRST_NAME, DEPARTMENT_NAME, SALARY
FROM EMPLOYEES INNER JOIN DEPARTMENTS USING (DEPARTMENT_ID);


SELECT FIRST_NAME, DEPARTMENT_NAME, SALARY
FROM EMPLOYEES RIGHT OUTER JOIN DEPARTMENTS USING (DEPARTMENT_ID);


SELECT FIRST_NAME, DEPARTMENT_NAME, SALARY
FROM EMPLOYEES FULL OUTER JOIN DEPARTMENTS USING (DEPARTMENT_ID);




SELECT  LEMP.FIRST_NAME, LEMP.SALARY, LEMP.JOB_ID,
        HEMP.FIRST_NAME, HEMP.SALARY, HEMP.JOB_ID
FROM    EMPLOYEES LEMP , EMPLOYEES HEMP
WHERE   LEMP.SALARY*6 <= HEMP.SALARY

SELECT  LEMP.FIRST_NAME, LEMP.SALARY, LEMP.JOB_ID,
        HEMP.FIRST_NAME, HEMP.SALARY, HEMP.JOB_ID
FROM    EMPLOYEES LEMP , EMPLOYEES HEMP
WHERE   LEMP.SALARY*6 <= HEMP.SALARY


DESC EMPLOYEES;

SELECT EMP.FIRST_NAME, EMP.SALARY, MGR.FIRST_NAME, MGR.SALARY
FROM EMPLOYEES EMP INNER JOIN EMPLOYEES MGR
ON (EMP.MANAGER_ID = MGR.EMPLOYEE_ID);