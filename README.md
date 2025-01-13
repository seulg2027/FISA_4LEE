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

## 👝 프로젝트 : 42가 좋아지길 바래... [수정]
| MVC 패턴의 구조와 생성에 대한 연습과 협업을 위한 미니 프로젝트
<br><br>
### ⚙ 전체적인 틀 [수정]
---
<b>∘ 목적</b>
- 최근 10년동안 어떠한 업종이 가장 많은 소비를 했는지 궁금함에서 시작하여, Spring Mvc패턴을 구성하고 연습하며 협업 경험을 쌓는 것에 의의을 둠.

<b>∘ Oracle DB 를 사용한 이유 :</b><br>
방대한 카드 소비 데이터와 같이 구조적이고 복잡한 데이터를 안정적으로 저장하고 조회
높은 안정성과 신뢰도를 제공 -> 금융, 카드 소비와 같은 데이터 관리에 적합

<b>∘ 주요 기능</b>
- 데이터 전처리 후, 데이터 자동 삽입
- 테이블 조회
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
### 📃 API 명세서 [수정]
---
<pre>
  [조회]
http://127.0.0.1:1521/api/getall
[industry별 조회]
http://127.0.0.1:1521/api/getall?industry=<>
[기간별 조회]
http://127.0.0.1:1521/api/getall?date=<>
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

### 🛢 DDL  [수정]
---
<div>
        <h3>1. 테이블 삭제</h3>
        <pre>
목적: 기존에 생성된 card_consume 테이블을 삭제
BEGIN
    EXECUTE IMMEDIATE 'DROP TABLE card_consume CASCADE CONSTRAINTS';
EXCEPTION
    WHEN OTHERS THEN
        NULL; -- 테이블이 없으면 예외를 무시
END;</pre>
    </div>

<div>
        <h3>2. 시퀀스 삭제</h3>
        <pre>
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
INCREMENT BY 1;</pre>
</div>

<div>
        <h3>6. 트리거 생성</h3>
        <pre>
CREATE OR REPLACE TRIGGER card_consume_trigger
BEFORE INSERT ON card_consume
FOR EACH ROW
BEGIN
    IF :NEW.id IS NULL THEN
        SELECT card_consume_seq.NEXTVAL
        INTO :NEW.id
        FROM dual;
    END IF;
END;</pre>
</div>
<br><br>

### ⛓ 데이터 전처리 과정 [수정]
---
<div>
  <pre>
    String 타입으로 데이터 전체가 선언되어 있어서, 이를 한 라인의 한 단어씩 나누어서 DB에 데이터를 입력하였습니다.
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
