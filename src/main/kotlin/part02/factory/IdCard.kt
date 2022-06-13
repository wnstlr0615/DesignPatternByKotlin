package part02.factory

class IdCard(
    val owner: String
) : Product{
    init{
        println("$owner 의 카드를 만듭니다.")
    }
    override fun use() {
        println("$owner 의 카드를 사용합니다.")
    }
}