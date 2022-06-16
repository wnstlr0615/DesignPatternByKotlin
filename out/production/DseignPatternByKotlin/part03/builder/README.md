# Chapter07 Builder - 복잡한 인스턴스 조립하기

## Builder 패턴

---

복잡한 인스턴스들을 조립할 때 사용하는 패턴

## 구현

Builder : 문서를 구성하기 위한 메서드를 결정하는 추상클래스

Director: 문서를 구성하는 클래스

TextBuilder : Builder를 구현하고 있으며 일반 텍스트 문서를 만드는 클래스

HTMLBuilder: Builder를 구현하고 있으면 HTML 파일 문서를 만드는 클래스

Main : 동작 테스트용 클래스

## Builder 패턴을 사용하는 이유

클래스를 설계할 경우에는 **‘교환가능성’** 에 대해서 항상 생각할 필요가 있다. 
Builder에는 문서를 구출할 때 필요한 메소드가 선언 되어 있으며 Director은 Builder를 사용하여 문서를 구성하고 있습니다. 
그렇기 때문에 Director 클래스는 어떤 한 Builder를 구현 클래스가 들어 오는지 모른다. 그렇기 때문에 Director 클래스에 상관 없이 
Builder을 구현하기만 한다면  교체가 용이하다