USE sqldb;
-- 사용자별로구매이력을출력함
-- 모든컬럼을출력함
-- 구매이력이없는정보는출력하지않음
SELECT *
FROM buytbl
INNER JOIN usertbl
ON buytbl.userID = usertbl.userID;

-- 앞의 결과에서 userID가 'JYP'인 데이터만 출력하세요
SELECT *
FROM buytbl
INNER JOIN usertbl
ON buytbl.userID = usertbl.userID
WHERE buytbl.userID = 'JYP';

-- sqldb 데이터베이스에서 다음 조건을 처리하세요.
-- 각사용자별로구매이력을출력하세요.
-- 연결컬럼은userID로함
-- 결과를userID를기준으로오름차순으로정렬함
-- 구매이력이없는사용자도출력하세요.
-- userID,name,prodName,addr,연락처를다음과같이출력함
SELECT
    U.userID,
    U.name,
    B.prodName,
    U.addr,
    CONCAT(U.mobile1, U.mobile2) AS '연락처'
FROM usertbl U
    LEFT OUTER JOIN buytbl b on U.userID = b.userID
ORDER BY U.userID ASC;


-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람은 제외하고 출력하세요.
SELECT *
FROM usertbl
WHERE mobile1 IS NOT NULL AND mobile1 != '';

-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람만 출력하세요.
SELECT *
FROM usertbl
WHERE mobile1 IS NULL AND mobile2 IS NULL;

-- 앞에서 정의한 3개의 테이블을이용해서 다음을 처리하세요.
-- 학생테이블,동아리테이블,학생동아리테이블을이용해서학생을기준으로학생이름/지역/가입한동아리/동아리방을출력하세요.
SELECT
    S.stdName,
    S.addr,
    SC.clubName,
    C.roomNo
FROM stdtbl S
    INNER JOIN stdclubtbl SC
    ON S.stdName = SC.stdName
    INNER JOIN clubtbl C
    ON SC.clubName = C.clubName
ORDER BY S.stdName;

-- 동아리를기준으로가입한학생의목록을출력하세요.
-- 출력정보:clubName,roomNo,stdName,addr
SELECT
    C.clubName,
    C.roomNo,
    S.stdName,
    S.addr
FROM stdtbl S
INNER JOIN stdclubtbl SC
ON SC.stdName = S.stdName
INNER JOIN clubtbl C
ON SC.clubName = C.clubName
ORDER BY C.clubName;


-- 앞에서 추가한 테이블에서 '우대리'의상관연락처정보를 확인하세요.
-- 출력할정보 부하직원,직속상관,직속상관연락처
SELECT A.emp AS '부하직원', B.emp AS '직속상관', B.empTel AS '직속상관연락처'
FROM empTbl A
INNER JOIN empTbl B
ON A.manager = B.emp
WHERE A.emp = '우대리';

USE employees;

-- 현재 재직중인 직원의 정보를 출력하세요
-- 출력항목:emp_no,first_name,last_name,title
SELECT
    e.emp_no,
    e.first_name,
    e.last_name,
    t.title
FROM employees e
JOIN titles t ON e.emp_no = t.emp_no
WHERE t.to_date = '9999-01-01';

-- 현재 재직중인 직원정보를 출력하세요
-- 출력항목: 직원의기본정보모두,title,salary
SELECT
    e.*,
    t.title,
    s.salary
FROM employees e
JOIN titles t ON e.emp_no = t.emp_no
JOIN salaries s ON e.emp_no = s.emp_no
WHERE t.to_date = '9999-01-01'
AND s.to_date = '9999-01-01';

-- 현재 재직중인 직원의 정보를 출력하세요.
-- 출력항목: emp_no,first_name,last_name,department
-- 정렬:emp_no오름차순
SELECT
    e.emp_no,
    e.first_name,
    e.last_name,
    d.dept_name AS department
FROM employees e
JOIN dept_emp de ON e.emp_no = de.emp_no
JOIN departments d ON de.dept_no = d.dept_no
WHERE de.to_date = '9999-01-01'
ORDER BY e.emp_no ASC;

-- 부서별 재직중인 직원의 수를출력하세요.
-- 출력항목:부서번호,부서명,인원수
-- 정렬:부서번호오름차순
SELECT
    d.dept_no,
    d.dept_name,
    COUNT(de.emp_no) AS 인원수
FROM departments d
         JOIN dept_emp de ON d.dept_no = de.dept_no
WHERE de.to_date = '9999-01-01'
GROUP BY d.dept_no, d.dept_name
ORDER BY d.dept_no ASC;

-- 직원 번호가 10209인직원의 부서 이동히스토리를 출력하세요.
-- 출력항목:emp_no,first_name,last_name,dept_name,from_date,to_date
SELECT
    e.emp_no,
    e.first_name,
    e.last_name,
    d.dept_name,
    de.from_date,
    de.to_date
FROM employees e
JOIN dept_emp de ON e.emp_no = de.emp_no
JOIN departments d ON de.dept_no = d.dept_no
WHERE e.emp_no = 10209
ORDER BY de.from_date ASC;
