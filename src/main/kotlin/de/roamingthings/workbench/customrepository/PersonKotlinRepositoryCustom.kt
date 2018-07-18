package de.roamingthings.workbench.customrepository

import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

interface PersonKotlinRepositoryCustom {
    fun findByFirstNameLike(firstName: String): List<Person>
}

@Repository
@Transactional(readOnly = true)
class PersonKotlinRepositoryCustomImpl : PersonKotlinRepositoryCustom {

    @PersistenceContext
    private val entityManager: EntityManager? = null

    override fun findByFirstNameLike(firstName: String): List<Person> {
        val query = entityManager!!.createNativeQuery("SELECT p.* FROM person as p " + "WHERE p.first_name LIKE ?", Person::class.java)
        query.setParameter(1, "$firstName%")
        return query.resultList as List<Person>
    }
}