## Iterator 패턴

---
모든 요소를 순서대로 순회하며 조회하는 패턴

주요 인터페이스 

### Aggregate : 집합체 인터페이스 
주요 메서드  
- fun iterator() :Iterator 

### Iterator : 하나씩 순회하며 검색을 실행하는 인터페이스
주요 메서드
- fun hasNext() :Boolean
- fun next() : Any


## 구조

### BookShelf : Aggregate 를 구현하며 책들의 집합을 표현
### BookShelfIterator : Iterator를 구현하며 BookShelf 에 있는 Book 들을 순회 기능 구현




## Iterator 패턴을 사용하는 이유 ?
for 문으로 순회를 하지 않고 Iterator 패턴을 사용하여 순회하는 이유는 Iterator를 사용함으로써  구현과 분리해서 하나씩 순회할 수 있기 때문이다.

```kotlin
while(iterator.hasNext()) {
    val book = iterator.next()
    println(book)
}
```
BookShelfArray 클래스 에서 배열을 통해서 Book 객체를 관리하다가 List로 변경 할 경우 while()문에 코드를 건드리지 않고 접근할 수 있다.


