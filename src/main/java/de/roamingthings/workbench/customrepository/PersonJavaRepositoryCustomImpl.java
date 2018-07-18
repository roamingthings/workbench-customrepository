package de.roamingthings.workbench.customrepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PersonJavaRepositoryCustomImpl implements PersonJavaRepositoryCustom {

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<Person> findByFirstNameLike(String firstName) {
        Query query = entityManager.createNativeQuery("SELECT p.* FROM person as p " +
                "WHERE p.first_name LIKE ?", Person.class);
        query.setParameter(1, firstName + "%");
        return query.getResultList();
    }
}
