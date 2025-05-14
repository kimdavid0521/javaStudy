USE sqldb;
-- 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.
SELECT userid AS 사용자_아이디,
       SUM(amount) AS 총_구매_개수
FROM buytbl
GROUP BY userid;

SELECT userid AS 사용자_아이디,
       SUM(price * amount) AS 총_구매액
FROM buytbl
GROUP BY userid;

-- 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요2.
SELECT AVG(amount) AS 평균_구매_개수
FROM buytbl;

SELECT userid AS userID,
       AVG(amount) AS 평균_구매_개수
FROM buytbl
GROUP BY userid;

-- 다음 결과가 나오도록 usertbl에 대한 SQL 문을 작성하세요.
-- 가장키가큰사람과가장키가작은사람을출력함
SELECT name, height
FROM usertbl
WHERE height = (SELECT MAX(height) FROM usertbl)
   OR height = (SELECT MIN(height) FROM usertbl);


SELECT COUNT(*) AS '휴대폰이 있는 사용자'
FROM usertbl
WHERE mobile1 IS NOT NULL AND mobile1 != '';

-- 사용자별 총 구매액
SELECT userID, SUM(price * amount) AS 총구매액
FROM buytbl
GROUP BY userID;

-- 총 구매액이 1000이상인 사용자만 출력
SELECT userID, SUM(price * amount) AS 총구매액
FROM buytbl
GROUP BY userID
HAVING SUM(price * amount) >= 1000;

-- world 데이터베이스에서다음 질문을 처리하세요.
USE world;

-- city 테이블에서국가코드가'KOR'인도시들의인구수총합을구하시오.
SELECT SUM(Population) AS 총인구수
FROM city
WHERE CountryCode = 'KOR';

-- city 테이블에서국가코드가'KOR'인도시들의인구수중최소값을구하시오.단결과를나타내는테이블의필드는"최소값"으로표시하시오.
SELECT MIN(Population) AS 최소값
FROM city
WHERE CountryCode = 'KOR';

-- city 테이블에서국가코드가'KOR'인도시들의평균을구하시오.
SELECT AVG(Population) AS 평균인구수
FROM city
WHERE CountryCode = 'KOR';

-- city 테이블에서국가코드가'KOR'인도시들의인구수중최대값을구하시오.단결과를나타내는테이블의필드는"최대값"으로표시하시오.
SELECT MAX(Population) AS 최대값
FROM city
WHERE CountryCode = 'KOR';

-- country 테이블각 레코드의Name칼럼의글자수를표시하시오.
SELECT Name, LENGTH(Name) AS 글자수
FROM country;

-- country테이블의나라명(Name칼럼)을앞 세글자만대문자로표시하시오.
SELECT UPPER(LEFT(Name, 3)) AS 앞세글자_대문자
FROM country;

-- country테이블의기대수명(LifeExpectancy)을소수점첫째자리에서반올림해서표시하시오.
SELECT Name, ROUND(LifeExpectancy, 1) AS 기대수명_반올림
FROM country;

USE employees;

SELECT dm.dept_no, dm.emp_no, e.first_name, e.last_name, dm.from_date, dm.to_date
FROM dept_manager dm
         JOIN employees e ON dm.emp_no = e.emp_no
WHERE dm.to_date = '9999-01-01';

SELECT *
FROM employees
ORDER BY hire_date DESC
LIMIT 20 OFFSET 140;

SELECT COUNT(*) AS total_employees
FROM employees
WHERE to_date = '9999-01-01';


SELECT AVG(salary) AS average_salary
FROM employees
WHERE to_date = '9999-01-01';


SELECT employee_id, first_name, last_name, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees WHERE to_date = '9999-01-01')
  AND to_date = '9999-01-01';


SELECT department_id, COUNT(*) AS total_employees
FROM employees
WHERE to_date = '9999-01-01'
GROUP BY department_id
ORDER BY department_id ASC;
