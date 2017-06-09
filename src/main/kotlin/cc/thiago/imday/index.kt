package cc.thiago.imday

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by tnogueira on 09/06/17.
 */
@RestController
class IndexController {

    @GetMapping("/")
    fun index(): String {
        return "Hello Spring-Boot using Kotlin"
    }

    @GetMapping("/im-day")
    fun imday(): List<String>{
        return listOf("Veiga", "Glauber", "Caio", "Gustavo", "Eduardo", "Thiago", "Maicon", "Cezar")
    }
}