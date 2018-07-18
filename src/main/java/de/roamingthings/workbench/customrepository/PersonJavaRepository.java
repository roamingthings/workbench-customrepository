package de.roamingthings.workbench.customrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonJavaRepository extends JpaRepository<Person, Long>, PersonJavaRepositoryCustom {
}
