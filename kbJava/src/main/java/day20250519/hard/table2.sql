USE tabledb;

DROP TABLE IF EXISTS usertbl, buytbl;

CREATE TABLE usertbl(
    userID CHAR(8) NOT NULL PRIMARY KEY,
    name VARCHAR(10) NOT NULL,
    birthyear INT NOT NULL
);

CREATE TABLE buytbl(
        num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
        userID VARCHAR(8) NOT NULL,
        prodName CHAR(6) NOT NULL,
    FOREIGN KEY (userID) REFERENCES usertbl(userID)
);

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS buytbl;
DROP TABLE IF EXISTS usertbl;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE usertbl(
        userID CHAR(8) NOT NULL PRIMARY KEY,
        name VARCHAR(10) NOT NULL,
        birthyear INT NOT NULL,
        email CHAR(30) UNIQUE
);

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS usertbl;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE usertbl(
        userID CHAR(8) NOT NULL PRIMARY KEY,
        name VARCHAR(10),
        birthyear INT CHECK ( birthyear BETWEEN 1900 AND 2023),
        mobile CHAR(3) NOT NULL
);

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS usertbl;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE userTBL (
        userID CHAR(8) NOT NULL PRIMARY KEY,
        name VARCHAR(10) NOT NULL,
        birthYear INT NOT NULL DEFAULT -1,
        addr CHAR(2) NOT NULL DEFAULT '서울',
        mobile1 CHAR(3),
        mobile2 CHAR(8),
        height SMALLINT DEFAULT 170,
        mDate DATE
);

-- usertbl에 기본값 삽입
INSERT INTO userTBL (userID, name, birthYear, addr) VALUES
        ('U0000001', '김철수', 1990, '서울'),
        ('U0000002', '이영희', DEFAULT, DEFAULT),
        ('U0000003', '박민수', 1985, DEFAULT),
        ('U0000004', '최지은', DEFAULT, '부산');

-- mobile1 컬럼 삭제
ALTER TABLE usertbl DROP COLUMN mobile1;
-- name 컬럼명을 uName으로 변경
ALTER TABLE usertbl CHANGE COLUMN name uName VARCHAR(10) NOT NULL;
-- 기본키를 제거
ALTER TABLE usertbl DROP PRIMARY KEY;


-- employees의 데이터 베이스 사용
USE employees;

CREATE VIEW EMPLOYEES_INFO AS
SELECT
    e.emp_no,
    e.birth_date,
    e.first_name,
    e.last_name,
    e.gender,
    e.hire_date,
    t.title,
    t.from_date AS t_from,
    t.to_date AS t_to,
    s.salary,
    s.from_date AS s_from,
    s.to_date AS s_to
FROM
    employees e
        JOIN titles t ON e.emp_no = t.emp_no
        JOIN salaries s ON e.emp_no = s.emp_no
WHERE
    t.from_date <= s.to_date AND s.from_date <= t.to_date;


-- 현재 재직자만 출력
SELECT *
FROM EMPLOYEES_INFO
WHERE t_to = '9999-01-01' AND s_to = '9999-01-01';


-- emp_dept_info 뷰 작성
CREATE VIEW EMP_DEPT_INFO AS
SELECT
    de.emp_no,
    de.dept_no,
    d.dept_name,
    de.from_date,
    de.to_date
FROM
    dept_emp de
        JOIN departments d ON de.dept_no = d.dept_no;


-- emp_dept_info로 현재 재직자의 부서 정보를 출력
SELECT emp_no, dept_no, dept_name, from_date, to_date
FROM EMP_DEPT_INFO
WHERE to_date = '9999-01-01';
