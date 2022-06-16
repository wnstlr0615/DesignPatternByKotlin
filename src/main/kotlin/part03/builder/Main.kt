package part03.builder

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if(args.size != 1){
        usage()
        exitProcess(0)
    }
    when(args[0]){
       "plain" -> {
           val textBuilder = TextBuilder()
           val director = Director(textBuilder)
           director.constructor()
           println(textBuilder.getResult())
       }
       "html" -> {
           val htmlBuilder = HTMLBuilder()
           val director = Director(htmlBuilder)
           director.constructor()
           println("${htmlBuilder.getResult()}가 작성되었습니다.")
       }
       else -> {
           usage()
           exitProcess(0)
       }
    }
}

fun usage() {
    println("Usage : java Main plain 일반 텍스트로 문서작성")
    println("Usage : java Main html HTML 파일로 문서작성")
}
