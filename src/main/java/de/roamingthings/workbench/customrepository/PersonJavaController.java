package de.roamingthings.workbench.customrepository;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonJavaController {

    private final PersonJavaRepository personJavaRepository;

    @GetMapping("/java/persons")
    public List<Person> findAllPersons() {
        return personJavaRepository.findAll();
    }

    @GetMapping("/java/persons/filter")
    public List<Person> findAllPersons(String firstName) {
        return personJavaRepository.findByFirstNameLike(firstName);
    }

}
