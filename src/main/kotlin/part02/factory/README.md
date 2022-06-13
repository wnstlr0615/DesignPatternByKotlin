## Factory 패턴

---
Factory 패턴은 Template 패턴을 응용한 패턴으로 Factroy 추상 클래스에 설계를 하며 Product 인터페이스를 상속받아 구현한다.
본프로젝트에서 Factory 를 통해 계속 똑같은 무언가를 생성 하고 있다.

## 주요 클래스

### Factory : 무언가를 생성 할 수 있도록 설계되어 진 추상 클래스
### Product : Factory를 통해 생성할 객체 타입

## 구현
### IdCardFactory : Factory 를 상속 받는 클래스로 골격을 당당하고 있다.
### IdCard : Product를 구현 하고 있으며 Factory 를 통해 생성 하게될 객체 타입이다.

## Factory 패턴을 사용하는 이유
Template 패턴을 응용하여 인스턴스를 생성 하는 패턴을 Factory 패턴이라고 하는데 Factory 패턴을 사용하면 
Factory에서 인스턴스를 생성하는 방법을 결졍하기 때문에 하위 클래스에서는 객체에 이름만 지정하면 된다.
만약 다른 Product 객체를 만들 경우 Factory 클래스를 수정 하지 않고 생성 Product를 생성 할 수 있다.(의존하지 않고 있다.)