package de.roamingthings.workbench.customrepository;

import java.util.List;

public interface PersonJavaRepositoryCustom {
    List<Person> findByFirstNameLike(String firstName);
}