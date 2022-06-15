package part03.singleton
// 코틀린에서 싱글톤 만드는 방법
object Singleton{
    var a: Int = 0
}

fun main(){
    val singleton = Singleton
    println(singleton.a)
}