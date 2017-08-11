package rest.repositories

import rest.entities.Product
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : CrudRepository<Product, Long> {
    fun findByListPriceGreaterThan(listPrice: Double): Iterable<Product>
}
