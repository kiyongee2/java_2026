# 🏦 은행 서버 예제 (Java 교육용)

Java가 실무에서 가장 많이 쓰이는 분야인 **은행/금융 서버**를 아주 단순하게 구현한 교육용 예제입니다.
같은 은행 로직을 **① 순수 Java 콘솔** 버전과 **② Spring Boot 서버** 버전으로 각각 만들어,
"기초 문법이 실무에서 어떻게 확장되는가"를 비교하며 배울 수 있습니다.

## 📌 구현된 기능 (공통)

- 계좌 개설
- 입금
- 출금 (잔액 부족 시 거부)
- 잔액 조회
- 계좌 이체
- 전체 계좌 목록 조회

---

## 1️⃣ 콘솔 버전 (`1-console`)

프레임워크 없이 순수 Java만 사용합니다. **클래스 · 객체 · 메서드 · 캡슐화 · 예외 처리**의 기본기를 익히기 좋습니다.

### 구성
| 파일 | 역할 |
|------|------|
| `Account.java` | 계좌 한 개 (데이터 + 입금/출금 규칙) |
| `Bank.java`    | 여러 계좌를 관리하는 은행 (업무 로직) |
| `BankApp.java` | 프로그램 시작점, 콘솔 메뉴 |

### 실행 방법
터미널에서:
```bash
cd 1-console
javac -d out src/bank/*.java
java -cp out bank.BankApp
```
또는 IntelliJ에서 `BankApp.java` 를 열고 `main` 옆의 ▶ 실행 버튼을 누르면 됩니다.

실행하면 홍길동(110-0001), 김철수(110-0002) 계좌가 미리 만들어져 있고,
번호를 입력해 메뉴를 사용하면 됩니다.

---

## 2️⃣ Spring Boot 버전 (`2-spring`)

실무에서 실제로 쓰는 방식입니다. 콘솔의 메뉴 대신 **REST API(웹 주소)** 로 요청을 받습니다.

### 구성 (역할별로 폴더가 나뉩니다 — 실무의 표준 구조)
| 파일 | 역할 | 콘솔 버전과 대응 |
|------|------|------------------|
| `BankApplication.java` | 서버 시작점 | `BankApp` 의 main |
| `model/Account.java`   | 계좌 데이터 | `Account` (거의 동일!) |
| `service/BankService.java` | 업무 로직 | `Bank` |
| `controller/BankController.java` | 요청을 받는 창구 | 콘솔 메뉴(switch문) |
| `controller/GlobalExceptionHandler.java` | 에러 응답 처리 | try-catch |
| `dto/*.java` | 요청 데이터 담는 그릇 | (콘솔엔 없음) |

### 실행 방법
> ⚠️ 첫 실행 시 인터넷에서 Spring 라이브러리를 자동으로 내려받습니다.

IntelliJ에서 `2-spring` 폴더를 프로젝트로 열고 `BankApplication.java` 를 실행하거나, 터미널에서:
```bash
cd 2-spring
mvn spring-boot:run
```
서버가 뜨면 `http://localhost:8080` 에서 요청을 받습니다.
`http/requests.http` 파일을 IntelliJ에서 열면 각 요청을 버튼 클릭으로 바로 테스트할 수 있습니다.

### 요청 예시 (curl)
```bash
# 전체 계좌 조회
curl http://localhost:8080/accounts

# 입금
curl -X POST http://localhost:8080/accounts/110-0001/deposit \
     -H "Content-Type: application/json" -d "{\"amount\":50000}"

# 이체
curl -X POST http://localhost:8080/accounts/transfer \
     -H "Content-Type: application/json" \
     -d "{\"from\":\"110-0001\",\"to\":\"110-0002\",\"amount\":30000}"
```

---

## 🔑 핵심 학습 포인트: 콘솔 → 서버

| 구분 | 콘솔 버전 | Spring Boot 서버 |
|------|-----------|------------------|
| 요청 받는 방법 | 키보드 입력(Scanner) | HTTP 요청(URL) |
| 기능 구분 | 메뉴 번호 (switch) | URL 주소 (`/accounts/...`) |
| 결과 표시 | 화면에 println | JSON 응답 |
| 에러 처리 | try-catch로 출력 | HTTP 상태코드 + JSON |
| 데이터 저장 | 메모리(Map) | 메모리(Map) *실무는 DB* |
| 사용자 | 나 혼자 | 여러 앱/웹 동시 접속 |

**가장 중요한 점:** 계좌·입금·출금 같은 **핵심 로직(Account, Service)은 두 버전이 거의 똑같습니다.**
달라지는 것은 "요청을 어떻게 받고 응답하느냐"일 뿐입니다.
즉, 콘솔에서 배운 문법이 실무 서버의 뼈대가 그대로 됩니다.

## 🚀 여기서 더 나아가려면 (심화 과제 아이디어)
- 데이터를 메모리(Map)가 아니라 **데이터베이스(H2, MySQL)** 에 저장하기 (JPA)
- 이체를 **트랜잭션(@Transactional)** 으로 묶어 안전하게 만들기
- 거래 내역(입출금 기록) 기능 추가하기
- 계좌 비밀번호 / 사용자 인증 붙이기
