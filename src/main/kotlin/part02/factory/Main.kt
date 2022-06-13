package part02.factory

fun main() {
    val factory = IdCardFactory()
    val card1 = factory.create("홍길동")
    val card2 = factory.create("이순신")
    val card3 = factory.create("강감창")

    card1.use()
    card2.use()
    card3.use()
}