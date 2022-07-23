package part04.strategy

class Player(
    private val name: String,
    private val strategy: Strategy,
) {
    private var winCnt: Int = 0
    private var loseCnt: Int = 0
    private var gameCnt: Int = 0
    fun nextHand() = strategy.nextHand()
    fun win() {
        strategy.study(true)
        winCnt++
        gameCnt++
    }

    fun lose() {
        strategy.study(false)
        loseCnt++
        gameCnt++
    }
    fun even() = gameCnt++

    override fun toString(): String {
        return "[$name:$gameCnt games, $winCnt win $loseCnt lose]"
    }
}
