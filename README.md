# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 요구사항 기능
1. 자동차를 생성할 수 있다.
> 이름을 부여할 수 있다. 전진하는 자동차 출력시 이름을 출력한다.
> 이름은 5자 이하만 가능하다. 0이상 5이하
> 자동차는 전진하거나 멈출 수 있다.
- 자동차의 이름과 위치를 검증할 수 있는 객체를 만든다.
---
2. 사용자가 자동차이름을 입력하면 쉼표로 구분한다.
3. 사용자는 몇 번의 이동을 할 것인지 입력할 수 있다.
> 자동차 입력값, 이동 횟수 검증
> 자동차 생성
- 게임을 생성하는 객체 생성
---
4. 랜덤으로 0~9까지의 숫자를 뽑아 4이상 전진, 3이하 멈춤
> 사용자 입력값만큼 랜덤값이 추출된다.
- 자동차 움직임을 제어하는 객체 생성
---
5. 게임이 끝나면 우승자를 출력하고, 우승자가 여럿일수 있다.
> 우승자 여러명은 쉼표로 구분한다.
- 이름 목록을 가진 게임 결과 객체를 생성

## 제한 사항 
- indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다. 1까지만 허용한다.
- else 예약어를 쓰지 않는다.
  •힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
  •else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다. 
- 함수(또는 메소드)의 길이가 10라인을 넘어가지 않도록 구현한다.
  함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.