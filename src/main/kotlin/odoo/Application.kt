package odoo

import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class Application {
    private val log = LoggerFactory.getLogger(Application::class.java)
    // fun init(repository: odoo.repositories.ProductRepository) = CommandLineRunner {}
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
