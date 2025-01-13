# FISA_4LEE
우리FISA 4기 클라우드 엔지니어링 4LEE팀

---
[수정] -> 피드백 및 자유 작성
[작성] -> 직접 작성하는 부분

### 팀원 🙆🏻‍♂️🙆🏻‍♀️
---
|<img src="https://avatars.githubusercontent.com/u/179544856?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/114290855?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/121565744?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/55776421?v=4" width="150" height="150"/>|
|:-:|:-:|:-:|:-:|
|이은준<br/>[@2EunJun](https://github.com/adf123124)|[@andytjdqls](https://github.com/andytjdqls)|@eundeom<br/>[@eundeom](https://github.com/eundeom)|SeulGi_LEE<br/>[@seulg2027](https://github.com/seulg2027)|

### ✏ Git 규칙
<div><pre><ul>
        Feat ➕ : 새로운 기능을 추가할 경우
        Fix 🛠️ : 버그를 고친 경우
        Design 🎨 : CSS 등 사용자 UI 디자인 변경
        Change 💎 : 커다란 API 변경의 경우
        Style 👕 : 코드 포맷 변경, 세미 콜론 누락, 코드 수정이 없는 경우
        Hotfix 🚨 : 급하게 치명적인 버그를 고쳐야 하는 경우
        Refactor 🚧 : 프로덕션 코드 리팩토링
        Comment ✉️ : 필요한 주석 추가 및 변경
        Docs 📝 : 문서를 수정한 경우
        Test 🔍 : 테스트 추가, 테스트 리팩토링 (프로덕션 코드 변경 X)
        Chore 🚀 : 빌드 테스트 업데이트, 패키지 매니저를 설정하는 경우
        Rename 📁 : 파일 혹은 폴더 명을 옮기는 작업만인 경우
        Remove ❌ : 파일을 삭제하는 작업만 수행한 경우
        Release 👏 : 프로젝트 배포할 경우
    </ul></pre></div>
<br>

## 👝 프로젝트 : 42가 좋아지길 바래
| MVC 패턴의 구조와 생성에 대한 연습과 협업을 위한 미니 프로젝트
<br><br>
### ⚙ 전체적인 틀
---
<b>∘ 목적</b>
- 최근 10년 동안 어떤 업종이 가장 많은 소비를 차지했는지 분석하는 궁금증에서 출발하여, Spring MVC 패턴을 구성하며 실무적인 개발 프로세스를 연습하고 협업 경험을 쌓는 데 중점을 두었습니다.

<b>∘ Oracle DB 를 사용한 이유 :</b><br>
Oracle DB는 방대한 카드 소비 데이터와 같은 구조적이고 복잡한 데이터를 안정적으로 저장하고 조회할 수 있는 기능을 제공합니다.
높은 안정성과 신뢰도로 금융 및 카드 소비와 같은 데이터 관리에 적합하여 선택했습니다.

<b>∘ 주요 기능</b>
- 데이터 전처리 및 데이터 자동 삽입 기능
- 소비 데이터 테이블 조회
<br>

### 🎈 트러블 슈팅 [작성]
---
  #### ❗ 문제 : ![image](https://github.com/user-attachments/assets/bfcc1070-b6c6-48ed-8f1e-b2be9e57be47)
  Oracle DB에서 프로세스 제한으로 인해 데이터 삽입 및 조회 실패
  #### 📢 해결 : 
  ALTER SYSTEM SET PROCESSES=200 SCOPE=spfile; 명령어로 프로세스 제한 증가
  #### 🎓 결과 및 교훈: 
  데이터베이스 설정과 리소스 관리의 중요성을 깨달음

  ### axios 통신문제
  #### ❗ 문제 : 
  #### 📢 해결 :
  #### 🎓 결과 및 교훈: 
  
<br><br>
### ⚙ 프로젝트 MVC 패턴 구조도
---
![구조도](https://github.com/user-attachments/assets/bc08c783-1855-4d8c-800c-476dab62d890)

<br><br>
### 📃 API 명세서
---
<pre>
[조회]
http://127.0.0.1:1521/api/getall
[industry별 조회]
http://127.0.0.1:1521/api/getall?industry=<>
[삭제]
http://127.0.0.1:1521/api/delete
[생성]
http://127.0.0.1:1521/api/create
</pre>

### 🔧 기능 설명 [수정]
---
- 실행방법:
          1.
          2. 
  
- CRUD
  - Create
  - Read
  - Update
  - Delete

### 🔗 사용스택
---
| Front-end | Back-end |
| :-------: | :------: |
| React     | Java     |
| <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/aff0f203-760b-4e70-a76b-de189a0c2a91" width="40" height="40"/></div> | <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/51c9e7a6-8758-43c3-9c03-0329ed30f0c6" width="40" height="40"/></div> |

|    IDE    |           |
| :-------: | :-------: |
| DBeaver   | STS       |
| <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/7654a028-2074-428f-82ba-27132eba2d53" width="40" height="40"/></div> | <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/8a003289-bc6f-487a-918b-1ad7826d9153" width="40" height="40"/></div> |

|   협업툴  |           |           |
| :-------: | :-------: | :-------: |
| Git       | Slack     | Figma     |
| <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/71e1234d-9684-4c1e-8edb-de061dd036f0" width="40" height="40"/></div> | <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/e70bf1c8-8dbc-46c1-a6a9-18d6d843cbdf" width="40" height="40"/></div> | <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/1440eb75-bd80-4801-b45b-3e2a7a25b28f" width="40" height="40"/></div> |
<br>

### 🛢 DDL
---
<div>
        <h3>1. 테이블 삭제</h3>
        <pre>
-- 기존에 생성된 card_consume 테이블을 삭제
BEGIN -- 테이블과 관련된 모든 제약 조건(외래 키 등)을 함께 삭제
    EXECUTE IMMEDIATE 'DROP TABLE card_consume CASCADE CONSTRAINTS';
EXCEPTION --테이블이 존재하지 않는 경우에도 오류를 발생시키지 않고 정상적으로 처리
    WHEN OTHERS THEN
        NULL; -- 테이블이 없으면 예외를 무시
END;</pre>
    </div>

<div>
        <h3>2. 시퀀스 삭제</h3>
        <pre>
-- 기존에 생성된 card_consume_seq 시퀀스를 삭제
BEGIN
    EXECUTE IMMEDIATE 'DROP SEQUENCE card_consume_seq';
EXCEPTION
    WHEN OTHERS THEN
        NULL; -- 시퀀스가 없으면 예외를 무시
END;</pre>
</div>

<div>
        <h3>3. 트리거 삭제</h3>
        <pre>
-- 기존에 생성된 card_consume_trigger를 삭제
BEGIN
    EXECUTE IMMEDIATE 'DROP TRIGGER card_consume_trigger';
EXCEPTION
    WHEN OTHERS THEN
        NULL; -- 트리거가 없으면 예외를 무시
END;</pre>

</div>

<div>
        <h3>4. 테이블 생성</h3>
        <pre>
CREATE TABLE card_consume (
    id NUMBER PRIMARY KEY,               -- 자동 증가 ID [고유 값]
    industry VARCHAR2(100) NOT NULL,     -- 업종
    transaction_date DATE NOT NULL,      -- 기준 날짜
    total_amount NUMBER NOT NULL,        -- 카드 이용 금액
    time_line NUMBER NOT NULL,           -- 시간대 구분
    usage_cnt NUMBER NOT NULL,           -- 카드 이용 횟수
    register_date DATE NOT NULL          -- 등록 날짜
);</pre>
</div>

<div>
        <h3>5. 시퀀스 생성</h3>
        <pre>
CREATE SEQUENCE card_consume_seq
START WITH 1
INCREMENT BY 1;
-- id 칼럼에 사용할 고유한 값을 자동 생성하는 코드
-- 1부터 시작해서 호출될 때마다 1씩 증가</pre>
</div>

<div>
        <h3>6. 트리거 생성</h3>
        <pre>
CREATE OR REPLACE TRIGGER card_consume_trigger
BEFORE INSERT ON card_consume
FOR EACH ROW
BEGIN
    -- ID가 NULL일 경우 시퀀스를 통해 자동으로 값을 생성
    -- IF :NEW.id IS NULL: 삽입 요청된 데이터의 id 값이 비어 있는지 확인.
    -- SELECT card_consume_seq.NEXTVAL INTO :NEW.id: 시퀀스에서 다음 값을 가져와 id에 삽입.
    IF :NEW.id IS NULL THEN
        SELECT card_consume_seq.NEXTVAL
        INTO :NEW.id
        FROM dual;
    END IF;
END;
-- 테이블에 데이터 삽입 시 id 값이 비어 있을 경우 시퀀스를 통해 
-- 자동으로 ID 값을 생성합니다.</pre>
</div>
<br><br>

### ⛓ 데이터 전처리 과정 [수정]
---
<div>
전체 데이터가 String 타입으로 선언되어 있어, 데이터를 한 라인의 단어 단위로 분리한 후, 이를 데이터베이스(DB)에 입력하는 과정을 구현하였습니다.
<pre>
1. 파일 읽기 및 인코딩 처리
CSV 파일을 BufferedReader를 사용하여 한 줄씩 읽어옵니다.
파일 인코딩은 "EUC-KR"로 설정하여 한글 데이터 처리를 지원합니다.
2. 데이터 파싱 및 변환
데이터를 CSV의 각 필드로 분리하기 위해 정규식을 사용하여 split 메서드를 활용하였습니다.
분리된 데이터를 필요에 따라 String, int, double 등의 적합한 데이터 타입으로 변환합니다.
3. 날짜 변환
String 형태로 제공된 날짜 데이터를 DateTimeFormatter와 LocalDate를 사용해 yyyyMMdd 형식으로 파싱하고, DB에 적합한 Date 타입으로 변환합니다.
4.DTO 객체 생성 및 데이터 매핑
파싱한 데이터를 ConsumeDTO 객체의 각 필드에 설정합니다.
생성된 DTO는 DAO(Data Access Object)를 통해 DB에 삽입됩니다.
5.DB 레코드 생성
데이터는 ConsumeDAO.createRecord() 메서드를 호출하여 DB에 저장됩니다.
</pre>
</div>

### ☕ 프로젝트 회고 [작성]
<pre>이은준</pre>
<pre>이슬기</pre>
<pre>이성빈</pre>
<pre>이은정</pre>
<br><br>

### ⏱ 코드 최적화 [수정]
<div><pre></pre></div>

<br><br>
### 💡 1/3  미션
<details>
<summary>슬기</summary>
<div markdown="1">
    
    이은준

    - 처음 봤을 때 : 푸근하고 착해보인다!
    - 밥먹고 나서 : 3일 전에 일본행 티켓 끊고 모든 여행 계획을 세운 찐 J

    이성빈

    - 처음 봤을 때 : 스마트한 동네 교회 오빠
    - 밥먹고 나서 : 장난기 많은 99년생 애늙은이

    이은정

    - 처음 봤을 때 : 차가운 도시의 여자.. 영앤리치
    - 밥먹고 나서 : 귀여운 소식좌
</div>
</details>
<details>
<summary>성빈</summary>
<div markdown="1">
    
    이은준

    - 처음 봤을 때 : 곰 상의 푸근한 이미지
    - 밥먹고 나서 : 착하고 밥 잘 사주는 형

    이슬기

    - 처음 봤을 때 : 확신의 J로 꼼꼼함이 묻어나는 것 같은 첫인상
    - 밥먹고 나서 : 갑자기 빌드패턴을 쓰면서 문제를 내겠다고 해서 무서움 + 장난치기 쉬운(?) 느낌 반응이 좋음

    이은정

    - 처음 봤을 때 : 차갑고 앳된 도시 이미지
    - 밥먹고 나서 : 사투리 쓰는 소식좌
</div>
</details>
<details>
<summary>은정</summary>
<div markdown="1">
    
    - 처음 봤을 때
    이은준님: 푸 같으시다 조용하시다
    이슬기님: 통통 튀는 활발하신 느낌이시다
    이성빈님: 똘똘해보이시다 개발 잘할 것 같아보이시다

    - 밥 먹고 난 후
    이은준님: 생각보다 계획적이심 생각보다 외향적이심
    이슬기님: 밝으시고 말을 잘걸어주심 
    이성빈님: 친절하심 열정적이심
</div>
</details>
<details>
<summary>은준</summary>
<div markdown="1">
    
    - 처음 봤을 때
    이슬기님: 밝은 친구
    이성빈님: 똑똑하고 유머러스한 친구
    이은정님: 작고 조용할거같은 친구

    - 밥 먹고 난 후
    이슬기님: 동글동글한 성격의 친구
    이성빈님: 상대방에게 잘 맞춰주는 친구 
    이은정님: 예상보다는  덜 조용한 친구
</div>
</details>
