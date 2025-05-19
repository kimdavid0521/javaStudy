-- tabledb 데이터 베이스 생성, 만약 이미 존재한다면 삭제
DROP DATABASE tabledb;
CREATE DATABASE tabledb;
USE tabledb;

DROP TABLE IF EXISTS usertbl;

CREATE TABLE usertbl(
    userID CHAR(8) NOT NULL PRIMARY KEY,
    name VARCHAR(10) NOT NULL,
    birthYear INT NOT NULL,
    addr CHAR(2) NOT NULL,
    mobile1 CHAR(3) NULL,
    mobile2 CHAR(8) NULL,
    height SMALLINT NULL,
    mDate DATE NULL
);

-- buytbl 데이터 베이스 생성, 만약 이미 존재한다면 삭제
DROP TABLE IF EXISTS buytbl;

CREATE TABLE buytbl(
    num INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    userID CHAR(8) NOT NULL,
    prodName CHAR(6) NOT NULL,
    groupName CHAR(4) NULL,
    price INT NOT NULL,
    amount SMALLINT NOT NULL,
    FOREIGN KEY(userID) REFERENCES usertbl(userID)
);


-- 회원 테이블에 다음 데이터 입력하기
INSERT INTO usertbl (userID, name, birthYear, addr, mobile1, mobile2, height, mDate)
VALUES ('LSG', '이승기', 1987, '서울', '011', '11111111', 182, '2000-08-08');

INSERT INTO usertbl (userID, name, birthYear, addr, mobile1, mobile2, height, mDate)
VALUES ('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-04-04');

INSERT INTO usertbl (userID, name, birthYear, addr, mobile1, mobile2, height, mDate)
VALUES ('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-07-07');


-- 구매 테이블에 다음 데이터 입력
-- 에러 이유 3번 테이블의 JYP가 없기 때문에
INSERT INTO buytbl (userID, prodName, groupName, price, amount) VALUES ('KBS', '운동화', NULL, 30, 2);

INSERT INTO buytbl (userID, prodName, groupName, price, amount) VALUES ('KBS', '노트북', '전자', 1000, 1);

-- INSERT INTO buytbl VALUES(NULL, 'JYP', '모니터', '전자', 200, 1);

-- 기존 usertbl이 존재하는 경우 삭제함
-- 기본키는 테이블 레벨에서 정의하고 제약조건명을 함께 지정함
DROP TABLE IF EXISTS usertbl;

CREATE TABLE usertbl (
        userID CHAR(8) NOT NULL,
        name VARCHAR(10) NOT NULL,
        birthYear INT NOT NULL,
        CONSTRAINT PRIMARY KEY PK_userTBL_userID(userID)
);

-- 다음 컬럼을가지는 prodTbl 을정의하세요.
-- 기존 prodTbl이 존재하는 경우 삭제함
DROP TABLE IF EXISTS prodtbl;

CREATE TABLE prodTbl (
        prodCode CHAR(3) NOT NULL,
        prodID CHAR(4) NOT NULL,
        prodDate DATETIME NOT NULL,
        prodCur CHAR(10) NULL,
        CONSTRAINT PK_prodtbl_proCode_prodID
                PRIMARY KEY (prodCode, prodID)

);

-- usertbl과 buytbl을 바탕으로 다음 결과가 나오는 뷰를정의하세요
-- 위에서 정의한 뷰에서 userid가 '김범수'인 데이터만출력하세요.
CREATE VIEW v_userbuytbl
AS
SELECT U.userid, U.name, B.prodName, U.addr, CONCAT(U.mobile1, U.mobile2) AS '연락처'
FROM usertbl U
    INNER JOIN buytbl B
        ON U.userid = B.userid;
SELECT * FROM v_userbuytbl WHERE name = '김범수';