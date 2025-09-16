# 👜 가방 구매 시스템

## 📌 프로젝트 소개
간단한 가방 가게 시뮬레이션 콘솔 프로그램입니다.
사용자가 원하는 가방 종류, 재질, 색상, 사이즈를 선택하고,
최종적으로 결제 및 구매 내역을 출력할 수 있습니다.

---

## 🛠 기술 스택
- **Language**: Java
- **IDE**: IntelliJ IDEA
- **Version Control**: Git & GitHub

---

## ⚙️ 주요 기능
- 가방 선택 (switch + Map을 활용하여 가방 종류 선택)
- 재질 선택 (switch + Map을 활용하여 가방 재질 선택)
- 색상 선택 (enum + switch을 활용하여 가장 색상 선택)
- 사이즈 지정 (추상 클래스 BagSize + CustomSize(내부 클래스)로 구현)
- 주문 및 구매 내역 출력 (OrderHistory에서 최종 구매 내역 출력)

---

## 📂 프로젝트 구조
```
BagStoreSimulation/
 ├── Main.java                        // 실행 진입점
 │
 ├── Bag/                             // 가방 관련 패키지
 │    ├── Bag.java                    // 가방 기본 클래스 (select, pack, sell)
 │    ├── BagSize.java                // 추상클래스 + CustomSize 내부 클래스
 │
 ├── Attributes/                      // 가방 속성 관리 패키지
 │    ├── BagType.java                // Map + switch로 타입 관리
 │    ├── BagMaterial.java            // Map + switch로 재질 관리
 │    ├── BagColor.java               // Enum + switch로 색상 관리
 │
 ├── Order/                           // 주문 관련 패키지
 │    ├── OrderHistory.java           // 구매내역 출력
```
---

## 🚀 실행 방법
```bash
# 저장소 클론하기
git clone https://github.com/사용자명/저장소명.git
cd 저장소명

# 컴파일 & 실행
javac -d out src/**/*.java
java -cp out BagStoreSimulation.Main


📖 사용 예시

=====가방 구매 시스템=====

가방을 고르세요.
1. 토트백  
2. 크로스백  
3. 백팩  
4. 숄더백  
5. 클러치
>> 3
상품을 선택했습니다. 20000원 입니다.

재질을 고르세요.
1. 천  
2. 인조가죽  
3. 천연가죽  
4. 나일론
>> 2
재질은 인조가죽 입니다.

색상을 고르세요.
1. 브라운  
2. 화이트  
3. 블랙  
4. 옐로우  
5. 블루
>> 5
가방은 블루 색상입니다.

사이즈를 입력하세요.
가로 : 30
세로 : 40
너비 : 15
가방 사이즈는 30*40*15 입니다.

가방을 포장합니다.
가방을 구매했습니다. 감사합니다.

==== 구매내역 ====
종류 : 백팩
재질 : 인조가죽
색상 : 블루
사이즈 : 30*40*15
결제 금액 : 20000원
=== 감사합니다 ===


