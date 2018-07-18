package de.roamingthings.workbench.customrepository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonKotlinRepository: JpaRepository<Person, Long>, PersonKotlinRepositoryCustom