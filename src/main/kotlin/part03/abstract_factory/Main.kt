package part03.abstract_factory

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: java Main class.name.ofConcreteFactory")
        println("Example 1: java main part03.abstract_factory.listfactory.ListFactory")
        // println("Example 2: java main tablefactory.TableFactory")
        exitProcess(0)
    }
    val factory = Factory.getFactory(args[0])

    val joins = factory.createLink("중앙일보", "http://www.joins.com/")
    val chosun = factory.createLink("조선일보", "http://www.chosun.com/")

    val us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/")
    val kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.kr/")
    val excite = factory.createLink("Excite", "http://www.excite.com/")
    val google = factory.createLink("Google", "http://www.google.com/")

    val trayNew = factory.createTray("신문")
    trayNew.add(joins)
    trayNew.add(chosun)

    val trayYahoo = factory.createTray("Yahoo!")
    trayYahoo.add(us_yahoo)
    trayYahoo.add(kr_yahoo)

    val traySearch = factory.createTray("검색엔진")
    traySearch.add(trayYahoo)
    traySearch.add(excite)
    traySearch.add(google)

    val page = factory.createPage("LinkPage", "영진닷컴")
    page.add(trayNew)
    page.add(trayYahoo)
    page.add(traySearch)
    page.output()
}
