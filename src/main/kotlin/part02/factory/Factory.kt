package part02.factory

abstract class Factory {
      fun create(owner: String): Product {
          val  p = createProduct(owner)
          registerProduct(p)
          return p
    }
    abstract fun createProduct(name: String) : Product
    abstract fun registerProduct(product: Product)
}