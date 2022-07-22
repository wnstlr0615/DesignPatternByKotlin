package part04.strategy

interface Strategy {
    fun nextHand(): Hand
    fun study(win: Boolean)
}
