package odoo.controllers

import odoo.repositories.ProductRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController {

    @Autowired
    lateinit var productRepository: ProductRepository

    @GetMapping
    fun findAll()
            = productRepository.findAll()

    @GetMapping("/price/{price}")
    fun findByListPriceGreaterThan(@PathVariable price: Double)
            = productRepository.findByListPriceGreaterThan(price)

}
