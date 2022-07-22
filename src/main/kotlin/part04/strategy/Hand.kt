package part04.strategy

class Hand(
    val handValue: Int
) {
    companion object {
        val HANDVALUE_GUU = 0
        val HANDVALUE_CHO = 1
        val HANDVALUE_PAA = 2
        val hand = arrayOf(Hand(HANDVALUE_GUU), Hand(HANDVALUE_CHO), Hand(HANDVALUE_PAA))
        val name = arrayOf("주먹", "가위", "보")
        fun getHand(handValue: Int) = hand[handValue]
    }
    fun isStrongerThan(h: Hand) = fight(h) == 1
    fun fight(h: Hand): Int {
        return if (this == h) {
            0
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            1
        } else {
            -1
        }
    }
    override fun toString() = name[handValue]
}
