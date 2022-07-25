## Composite 패턴

---
Composite 패턴은 그릇과 내용물을 동일 시 하는 패턴으로 서로 다른 클래스를 같은 종류로 볼 수 있도록 하는 패턴이다.
그 예로 디렉터리 안에 디렉터리와 파일을 같이 넣을 수 있는 것이 Composite 패턴을 사용하여 구현하였기 때문이다.

### 클래스 역할
- Entry - 클래스를 동일 시 하기 위한 Abstract 클래스
  - File - Entry 클래스에 구현체로 파일이름과 사이즈변수를 가짐
  - Director - Entry클래스에 구현테로 폴더 명과 Entry List를 가짐
- FileTreatmentException - RuntimeException


### Composite 패턴을 사용하는 이유
Composite 패턴은 재귀적인 형태를 갖게하여 상자안에 상자를 반복적으로 가지도록 만들 수 있다.
