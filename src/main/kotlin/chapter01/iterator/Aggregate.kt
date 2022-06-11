package chapter01.iterator

//집합체를 나타내는 인터페이스
interface Aggregate {
    fun iterator(): Iterator
}