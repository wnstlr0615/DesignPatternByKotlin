## Bridge 패턴      

---
클래스의 새로운 기능을 추가할 경우 기존 클래스를 상속 받아 확장 하는 방법이 있지만 상속을 통한 기능의 확장은 클래스간의 매우 견고한 연결 고리가 생겨
 수정을 할 경우 다른 소스 코드 또한 수정을 하게 되는 경우가 발생한다.

Bridge 패턴은 클래스의 기능과 구현을 분리하여 위임을 하는 방식을 사용하여
기능과 구현의 새로운 기능 추가를 용이하게 해주며 느슨한 결합을 만들어 준다.


###  클래스 역할
- Display - 기능이 정의된 클래스
  - CountDisplay - 기능을 확장한 클래스
- DisplayImpl - 구현 클래스 계층(인터페이스)
  - StringDisplayImpl - 구현 클래스(DisplayImpl 구현)

Display 클래스의 기능을 정의하고 DisplayImple 인터페이스를 구현 현하여 
기능을 구현 한다.

Display 클래스를 상속하여 새로운 기능을 추가 할 수 있으며
DisplayImpl 을 구현하여 상세 구현을 추가할 수 있다.


## Bridge 패턴을 사용하는 이유
브릿지 패턴은 **"기능의 클래스 계층"** 과 **"구현의 클래스 계층"** 을 분리하는 것이 주요 목표인데
두 계층을 분리 하면 새로운 기능을 추가하고 싶을 경우 확장에 용이하며 서로 다른 계층간의 수정을 할 필요가 없어진다.