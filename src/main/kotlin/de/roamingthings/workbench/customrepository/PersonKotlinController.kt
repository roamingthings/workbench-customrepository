package de.roamingthings.workbench.customrepository

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonKotlinController(val personKotlinRepository: PersonKotlinRepository) {

    @GetMapping("/kotlin/persons")
    fun findAllPersons(): List<Person> {
        return personKotlinRepository.findAll()
    }

    @GetMapping("/kotlin/persons/filter")
    fun findAllPersons(firstName: String): List<Person> {
        return personKotlinRepository.findByFirstNameLike(firstName)
    }

}
