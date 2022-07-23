package part04.strategy

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Usage: java Main randomSeed 1 randomSeed2")
        println("Example: java Main 314 15")
        exitProcess(0)
    }
    val seed1 = args[0].toInt()
    val seed2 = args[1].toInt()
    val player1 = Player("두리", WinningStrategy(seed1))
    val player2 = Player("하나", ProbStrategy(seed2))
    for (i in 0 until 10000) {
        val nextHand1 = player1.nextHand()
        val nextHand2 = player2.nextHand()
        if (nextHand1.isStrongerThan(nextHand2)) {
            println("winner: $player1")
            player1.win()
            player2.lose()
        } else if (nextHand2.isStrongerThan(nextHand1)) {
            println("winner: $player2")
            player2.win()
            player1.lose()
        } else {
            println("even...")
            player1.even()
            player2.even()
        }
    }
    println("Total result :")
    println(player1)
    println(player2)
}
