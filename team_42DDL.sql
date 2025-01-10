-- 테이블 삭제
BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE card_consume';
EXCEPTION
    WHEN OTHERS THEN
        NULL; -- 테이블이 없으면 예외를 무시
END;
/

-- 테이블 생성
CREATE TABLE card_consume (
    id NUMBER PRIMARY KEY,               -- 자동 증가 ID
    industry VARCHAR2(100) NOT NULL,     -- 산업 정보
    transaction_date DATE NOT NULL,      -- 거래 날짜
    total_amount NUMBER NOT NULL,        -- 총 소비 금액
    time_line NUMBER NOT NULL,           -- 시간 구분 (예: 오전, 오후 등)
    usage_cnt NUMBER NOT NULL,           -- 사용 횟수
    register_date DATE DEFAULT SYSDATE   -- 등록 날짜 (기본값: 현재 날짜)
);

-- 시퀀스 생성
CREATE SEQUENCE card_consume_seq
START WITH 1
INCREMENT BY 1
CACHE 20;

-- 트리거 생성
CREATE OR REPLACE TRIGGER card_consume_trigger
BEFORE INSERT ON card_consume
FOR EACH ROW
BEGIN
    -- ID가 NULL일 경우 시퀀스를 통해 자동으로 값을 생성
    IF :NEW.id IS NULL THEN
        SELECT card_consume_seq.NEXTVAL
        INTO :NEW.id
        FROM dual;
    END IF;
END;
/
