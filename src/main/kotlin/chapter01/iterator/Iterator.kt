package chapter01.iterator

//하나씩 나열하면서 검색하는 인터페이스
interface Iterator{
    fun hasNext(): Boolean
    fun next(): Book?
}