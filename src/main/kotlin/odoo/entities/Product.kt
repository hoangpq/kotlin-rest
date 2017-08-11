package odoo.entities

import javax.persistence.*

@Entity
@Table(name = "product_template")
class Product(
        @Column(name = "list_price")
        val listPrice: Double,
        val name: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1) {

    override fun toString(): String {
        return "Product(id=$id, name=$name, price=$listPrice)"
    }

}
