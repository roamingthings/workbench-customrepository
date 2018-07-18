package de.roamingthings.workbench.customrepository

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Person(
        @Id @GeneratedValue val id: Long? = null,
        val firstName: String,
        val lastName: String
)