# 목차
1. [🙆🏻‍♂️ 팀원](#%EF%B8%8F-팀원)
2. [👝 프로젝트 : 42가 좋아지길 바래](#-프로젝트--42가-좋아지길-바래)
4. [🎈 트러블 슈팅](#-트러블-슈팅-작성)
5. [⚙ 프로젝트 MVC 패턴 구조도](#-프로젝트-mvc-패턴-구조도)
6. [📃 API 명세서](#-api-명세서)
7. [🔧 기능 설명](#-기능-설명-수정)
8. [🔗 사용 스택](#-사용스택)
9. [🛢 Schema](#-schema)
10. [⛓ 데이터 전처리 과정](#-데이터-전처리-과정)
11. [☕ 프로젝트 회고](#-프로젝트-회고-작성중)
12. [⏱ 코드 최적화](#-코드-최적화-작성중)
13. [✏ Git 규칙](#-git-규칙)
14. [💡 1/3 미션](#-13--미션)

# 팀명 : FISA_4LEE
우리FISA 4기 클라우드 엔지니어링 4LEE팀

---

### [🙆🏻‍♂️ 팀원](#목차)
---
|<img src="https://avatars.githubusercontent.com/u/179544856?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/114290855?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/121565744?v=4" width="150" height="150"/>|<img src="https://avatars.githubusercontent.com/u/55776421?v=4" width="150" height="150"/>|
|:-:|:-:|:-:|:-:|
|이은준<br/>[@2EunJun](https://github.com/adf123124)|[@andytjdqls](https://github.com/andytjdqls)|@eundeom<br/>[@eundeom](https://github.com/eundeom)|SeulGi_LEE<br/>[@seulg2027](https://github.com/seulg2027)|

## [👝 프로젝트 : 42가 좋아지길 바래](#목차)
<b>∘ 프로젝트 개요</b>
- MVC 패턴의 구조와 생성에 대한 연습과 협업을 위한 미니 프로젝트

<b>∘ 프로젝트 목적</b>
- 최근 10년 동안 어떤 업종이 가장 많은 소비를 차지했는지 분석하는 궁금증에서 출발하여, Spring MVC 패턴을 구성하며 실무적인 개발 프로세스를 연습하고 협업 경험을 쌓는 데 중점을 두었습니다.

<b>∘ 데이터 </b>
- 전처리의 필요성
    - 정확히 정의된 데이터 타입과 제약 조건을 갖춘 RDBMS에 데이터를 저장해서 **저장 공간을 절약**하기 위해, **기존 데이터를 형변환**해야하기 때문입니다.
    - **중복 데이터의 저장을 피하고, 공백이나 특수 문자를 제거하기 위해** 정교한 전처리 과정을 수행해야 합니다.
- 의미
  - 소비자들이 하루 중 어떤 시간대에 더 많은 카드를 사용하고 소비하는지를 분석하는 데이터로 시간대 별로 카드를 사용하는 패턴과 소비 트렌드를 분석하여, **소비 동향을 파악**하는 데 사용됩니다.
- [출처](https://bigdata.seoul.go.kr/data/selectSampleData.do?r_id=P213&sample_data_seq=318)

<b>∘ RDBMS Oracle DB를 선택한 이유 :</b><br>
Oracle DB는 방대한 카드 소비 데이터와 같은 **구조적**이고 **복잡한 데이터**를 **안정적**으로 **저장하고 조회**할 수 있는 기능을 제공합니다.
높은 안정성과 신뢰도로 **금융 및 카드 소비와 같은 데이터 관리에 적합**하여 선택했습니다.

<b>∘ Spring Boot를 선택한 이유 :</b><br>
데이터를 효과적으로 웹 페이지로 제공하기 위해 안정적인 서버 운영이 필수적이었습니다. 이를 위해 Tomcat 과 같은 **WAS 서버를 사용**해야 했기에, 제한된 시간과 자원을 고려해서 내장 WAS서버를 제공하는 Spring Boot를 채택하여 효율적인 서버 환경을 구축했습니다.

<b>∘ Axios를 선택한 이유</b>
동기 방식은 요청이 완료될 때까지 기다려야 하기 때문에 UI가 멈추거나 사용자가 대기해야 하는 문제가 발생할 수 있기 때문에 Axios를 선택하였습니다. Axios와 같은 **비동기 HTTP 요청**은 사용자가 데이터를 요청하는 동안 다른 작업을 수행할 수 있게 합니다. 여러 요청을 **동시에 처리**할 수 있기 때문에, 네트워크 요청의 **지연 시간을 최소화**하고 애플리케이션의 **성능을 최적화**할 수 있습니다.

<br>

### 🎈 [트러블 슈팅 [작성]](#목차)
---
  #### ❗ 문제  
  Oracle DB에서 프로세스 제한으로 인해 데이터 삽입 및 조회 실패
  <br>
  ![image](https://github.com/user-attachments/assets/bfcc1070-b6c6-48ed-8f1e-b2be9e57be47)
  #### 📢 해결 
  `ALTER SYSTEM SET PROCESSES=200 SCOPE=spfile;` 명령어로 프로세스 제한 증가<br/>
  oracle 서버를 restart 하여 설정을 적용시킴
  #### 🎓 결과 및 교훈
  데이터베이스 설정과 리소스 관리의 중요성을 깨달음

<br><br>
### [⚙ 프로젝트 MVC 패턴 구조도](#목차)
---
![image](https://github.com/user-attachments/assets/847b0f20-16a8-4bbb-8138-9ec3c49d71c2)


<br><br>
### [📃 API 명세서](#목차)
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

### [🔧 기능 설명 [수정]](#목차)
---
|    조회   |       industry별 조회     |
| :-------: | :-------: |
| ![select all](https://github.com/user-attachments/assets/023478f5-73a7-4097-b924-8dfd52d3af08) | ![select industry](https://github.com/user-attachments/assets/84dfb12f-c0b4-480c-9a46-58140fbeac5a) |

|       생성    |      |
| :-------: | :-------: |
| ![insert](https://github.com/user-attachments/assets/295b6989-1c3d-41c0-b198-484916e7e296)
  | ![check insert](https://github.com/user-attachments/assets/ccbde352-628b-4f33-ad48-725ec975ed21) |


|     삭제      | |
| :-------: | :-------: |
| ![delete](https://github.com/user-attachments/assets/e1543c50-bff5-4980-8597-44ca96fd822d) |
![check delete](https://github.com/user-attachments/assets/291a4e36-d86a-4cf6-8aba-6e537f7ad110)|


### [🔗 사용스택](#목차)
---
| Front-end | Back-end |    IDE    |           |   협업툴  |           |           |
| :-------: | :------: | :-------: | :-------: | :-------: | :-------: | :-------: |
| React     | Java     | DBeaver   | STS       | Git       | Slack     | Figma     |
| <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/aff0f203-760b-4e70-a76b-de189a0c2a91" width="40" height="40"/></div> | <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/51c9e7a6-8758-43c3-9c03-0329ed30f0c6" width="40" height="40"/></div> | <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/7654a028-2074-428f-82ba-27132eba2d53" width="40" height="40"/></div> | <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/8a003289-bc6f-487a-918b-1ad7826d9153" width="40" height="40"/></div> | <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/71e1234d-9684-4c1e-8edb-de061dd036f0" width="40" height="40"/></div> | <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/e70bf1c8-8dbc-46c1-a6a9-18d6d843cbdf" width="40" height="40"/></div> | <div style="text-align: center;"><img src="https://github.com/user-attachments/assets/1440eb75-bd80-4801-b45b-3e2a7a25b28f" width="40" height="40"/></div> |

<br>

### [🛢 Schema](#목차)
---
## ERD
<br>

![화면 캡처 2025-01-13 182701](https://github.com/user-attachments/assets/f973fd7c-0bdf-493f-8af7-2b54dab5f179)


<br>

## Table
  <br>

![Table](https://github.com/user-attachments/assets/0a48eedd-3cf8-49f1-9afe-3ccfe2579c56)

<br>

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

### [⛓ 데이터 전처리 과정](#목차)
---
<div>
모든 데이터가 문자열 형태로 되어있어, 각 라인을 단어 단위로 토큰화하여 데이터베이스에 적재하는 로직을 구현했습니다. <br/><br/>

![image](/img/visual_file_data_process.png)

<pre>
1. 파일 읽기 및 인코딩 처리
CSV 파일을 BufferedReader를 사용하여 한 줄씩 읽어옵니다.
파일 인코딩은 "EUC-KR"로 설정하여 한글 데이터 처리를 지원합니다.
        <br>
2. 데이터 파싱 및 변환
데이터를 CSV의 각 필드로 분리하기 위해 정규식을 사용하여 split 메서드를 활용하였습니다.
분리된 데이터를 필요에 따라 String, int, double 등의 적합한 데이터 타입으로 변환합니다.
        <br>
3. 날짜 변환
String 형태로 제공된 날짜 데이터를 DateTimeFormatter와 LocalDate를 사용해 yyyyMMdd 형식으로 파싱하고, 
DB에 적합한 Date 타입으로 변환합니다.
        <br>
4.DTO 객체 생성 및 데이터 매핑
파싱한 데이터를 ConsumeDTO 객체의 각 필드에 설정합니다.
생성된 DTO는 DAO(Data Access Object)를 통해 DB에 삽입됩니다.
        <br>
5.DB 레코드 생성
데이터는 ConsumeDAO.createRecord() 메서드를 호출하여 DB에 저장됩니다.
</pre>
</div>


### [☕ 프로젝트 회고 [작성중]](#목차)
![_- visual selection](https://github.com/user-attachments/assets/94e2831f-7798-41df-92a5-faa3a9d03283)

<details>
<summary><b>이은준</b></summary>

**성과**  
수업 시간에 배운 걸 활용하여 CRUD 기능을 구현해 볼 수 있는 시간이었으며,  
깃허브를 활용한 협업을 경험할 수 있는 시간이었다.

**배운 점**  
프로젝트가 어떤 식으로 진행되는지, 문제가 생겼을 때 해결하는 방법을 배움.

**아쉬운 점**  
첫 프로젝트라 팀에 충분히 기여하지 못해 아쉬움이 남음.

**느낀 점**  
더 성장하여 다음 프로젝트에 기여하고 싶음.  
다들 고생하셨습니다.

</details>

<details>
<summary><b>이슬기</b></summary>

**성과**  
조그만 프로젝트였지만 여러 명의 팀원들과 하나의 프로젝트 기획, 설계, 개발, 완성이라는 목표로 활동할 수 있었음.

**배운 점**  
DB 서버 관련 설정과 협업의 중요성을 배움.

**아쉬운 점**  
업무 중복 문제가 발생하여 진행 상황 공유의 중요성을 깨달음.

**느낀 점**  
문제를 해결하는 과정에서 재미와 성취감을 느낌.

</details>

<details>
<summary><b>이성빈</b></summary>

**성과**  
Spring MVC와 Oracle DB를 활용한 실전 경험을 통해 인프라 구축 및 개발 역량을 강화함.

**배운 점**  
의사소통과 역할 분담의 중요성을 깨달음.  
주기적인 Commit과 공유를 통해 작업 중복 방지의 중요성을 배움.

**아쉬운 점**  
개발 참여가 부족하여 아쉬움이 남음.  
주도적으로 참여하며 성장할 기회를 만들어가고자 함.

**느낀 점**  
의사소통 부족으로 인해 발생한 문제를 통해 협업의 중요성을 실감함.

</details>

<details>
<summary><b>이은정</b></summary>

**성과**  
React로 프론트엔드 구현을 완료하고 Spring과 연결하여 백엔드 통신을 구현함.

**배운 점 및 아쉬운 점**  
Spring 코드 작성에 대한 이해도가 높아졌으며, Git 사용에 익숙하지 않아 어려움을 겪음.

**느낀 점**  
다양한 개발 경험을 쌓을 수 있어 의미 있었음.

</details>


### [⏱ 코드 최적화 [작성중]](#목차)
**최적화**
   1. DAO (create) 의미 명확성 부족 ,확장성 부족
        <br>
    ![지적-a2](https://github.com/user-attachments/assets/9a6e8410-8987-4c0d-b080-c2f846b95b20)
    - 해결 
    <br>
    ![해결-a](https://github.com/user-attachments/assets/5c0d6fd1-56e6-4eb7-970b-5c64a8918abc)
<br>
    2. DAO (read) 코드의 맥락과 변수를 어디에서 초기화하는지 고려
    ![지적-b](https://github.com/user-attachments/assets/d4740e64-3100-425b-a1af-b00646d11e72)
    
    - 해결 
    <br>
### [✏ Git 규칙](#목차)
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

<br><br>
### [💡 1/3  미션](#목차)
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
