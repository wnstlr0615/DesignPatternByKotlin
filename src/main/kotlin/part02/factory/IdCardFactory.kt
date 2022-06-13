package part02.factory

class IdCardFactory(
    private val owners : MutableList<Product> = mutableListOf()
): Factory(){
    override fun createProduct(name: String) = IdCard(name)

    override fun registerProduct(product: Product) {
        owners.add(product)
    }
}