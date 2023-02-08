# 🎮 자동차 경주 게임 

```
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
```
---
## 🎯 기능 목록
[핵심 로직 기능]
- [ ] 0~9 사이 랜덤 값 생성 기능
- [ ] 자동차 전진 여부 결정 기능
- [ ] 자동차 전진 기능
- [ ] 우승자 선정 기능

[입력 기능]
- [ ] 자동차 이름 입력 기능
    - [ ] 이름이 빈 값인 경우 예외 처리
    - [ ] ','로 구분한 각 이름이 5글자 초과인 경우 예외 처리
    - [ ] ','로 구분한 각 이름이 빈 값인 경우 예외 처리
    - [ ] 이름이 중복되는 경우 예외 처리

- [ ] 시도할 횟수 입력 기능
    - [ ] 횟수가 빈 값인 경우 예외 처리
    - [ ] 횟수가 정수가 아니면 예외 처리
    - [ ] 횟수가 0 이하면 예외 처리

[출력 기능]
- [x] 자동차 이름 입력 문구 출력 기능
- [ ] 시도할 횟수 입력 문구 출력 기능
- [ ] 실행 결과 문구 출력 기능
- [ ] 자동차들의 현재 위치 출력 기능
- [ ] 최종 우승자 출력 기능
