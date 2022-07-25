package part04.composite

fun main() {
    try {
        println("Making root entries...")
        val rootDir = Directory("root")
        val binDir = Directory("bin")
        val tmpDir = Directory("tmp")
        val usrDir = Directory("usr")
        rootDir.add(binDir)
        rootDir.add(tmpDir)
        rootDir.add(usrDir)

        binDir.add(File("vi", 10000))
        binDir.add(File("latex", 20000))
        rootDir.printList()

        println()
        println("Making user entries...")
        val Kim = Directory("Kim")
        val Lee = Directory("Lee")
        val Park = Directory("Park")
        usrDir.add(Kim)
        usrDir.add(Lee)
        usrDir.add(Park)
        Kim.add(File("diary.html", 100))
        Kim.add(File("Composite.java", 200))
        Lee.add(File("memo.tex", 300))
        Park.add(File("game.doc", 400))
        Park.add(File("junk.mail", 500))
        rootDir.printList()
    } catch (e: FileTreatmentException) {
        e.printStackTrace()
    }
}
