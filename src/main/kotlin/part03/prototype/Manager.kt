package part03.prototype

class Manager(
    private val showcase: MutableMap<String, Product> = mutableMapOf()
) {
    fun register(name: String, proto: Product){
        showcase[name] = proto
    }
    fun create(protoname: String): Product{
        val p = showcase[protoname] as Product
        return p.createClone()!!
    }
}