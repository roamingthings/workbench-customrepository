package de.roamingthings.workbench.customrepository

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CustomRepositoryWorkbenchApplication {
    @Bean
    fun init(repository: PersonKotlinRepository) = CommandLineRunner {
        repository.save(Person(firstName = "Jack", lastName = "Bauer"))
        repository.save(Person(firstName = "Chloe", lastName = "O'Brian"))
        repository.save(Person(firstName = "Kim", lastName = "Bauer"))
        repository.save(Person(firstName = "David", lastName = "Palmer"))
        repository.save(Person(firstName = "Michelle", lastName = "Dessler"))
    }
}

fun main(args: Array<String>) {
    runApplication<CustomRepositoryWorkbenchApplication>(*args)
}
