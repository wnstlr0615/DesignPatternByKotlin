# Abstract Factory 패턴

---
Abstract Factory 패턴은  추상적인 공장에서 추상적인 제품을 만드는 패턴으로
Abstract Factory 패턴을 이용하면 추삭적인 제품을 찍어내는 공자을 쉽게 만들 수 있다. Abstract\

기존 Factory 패턴의 경우 상위 클래스인 Factory 클래스에서 구조적인 설계를 구현하고 하위 클래스에서 구체적인 코드를 구현하는 패턴이며
Abstract Factory 패턴의 경우 이러한 Factory 또한 추상클래스를 이용하여 여러 개의 Product를 만들어 내는 여러 개의 공장을 만들어 낼 수 있다. Abstract Factory


## 구조
Factory :  추상 클래스로 공장의 구조를 추상화 한 형태로 해당 클래스를 구현하여 여러 개의 Factory를 만들 수 있다.   
Item : 공장에서 생산되는 제품의 추상 클래스 형태로 해당 추상 클래스가 수정되면 기존 Factory클래스와 구현 코드 전부를 수정해야한다.  
Page : Item 클래스를 상속 받는 추상 클래스로 페이지 기능을 담당한다.  
Link : Item 클래스를 상속 받는 추상 클래스로 링크 기능을 담당한다.  
Tray : Item 클래스를 상속 받는 추상 클래스로 섹션 기능을 담당한다.


### ListFactory
html 을 생성하며 ul 과 li 태그를 통해 데이터를 나타내는 html 생성기  


ListFactory : html 생성 관련 구처젝인 설계 구조가 구현 되고 있다.
ListLink : Link 추상 클래스를 구현 한 클래스로 링크 기능을 가지고 있다.
ListPage : Page 추상 클래스를 구현 한 클래스로 페이지 구조를 생성한다.
ListTray : Tray 추상 클래스를 구현 한 클래스로 ul 태그로 하나의 섹션을 구성한다.

### Abstract Factory 패턴을 사용하는 이유
구체적인 공장을 새롭게 추가 할 때 어떠한 클래스를 만들 것인지, 어떤 메소드를 만들 것인지가 확실 하며 
구현해야 할 클래스와 메소드가 정해져 있기 때문에 아무리 많은 구체적인 공장을 새롭게 만들어도 추상 적인 공장이나 Main 클래스는 수정할 필요가 없다.
