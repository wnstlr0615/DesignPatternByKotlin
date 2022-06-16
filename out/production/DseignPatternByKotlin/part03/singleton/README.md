## Singleton 패턴

---
무조건 한개의 객체만을 생성해야 할 때 사용하는 패턴


생성자를 private 으로 생성하고 get을 통해 호출하도록 구현한다.

```java
public class SingletonJava {
    private static final SingletonJava SINGLETON_JAVA = new SingletonJava();
    private SingletonJava() {
    }
    public static SingletonJava getInstance() {
        return SINGLETON_JAVA;
    }
}
```

처음 으로 실행 될 때 처음 생성되며 그 이후 부터는 이미 만들어진 클래스를 호출한다.

## 인스턴스 생성을 한개로 제한하는 이유

복수개의 인스턴스가 존재하면 서로 영향을 미칠 가능 성이 존재하며 뜻하지 않는 버그가 발생될 가능 성이 있기 때문에

인스턴스가 1개 밖에 없다라는 보증 만들면 그 전제 조건 아래에서 안전하게 프로그래밍을 할 수 있다.

