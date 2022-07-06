package ro.fasttrackit.lab18.ro.fasttrackit.lab18.ex2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonService {
    final List<Person> person;

    public PersonService(List<Person> person) {
        this.person = Collections.unmodifiableList(person);
    }

    public List<String> getPersonNames(List<Person> persons) {
        List<String> result = persons.stream()
                .map(p -> p.getFirstName() + " " + p.getLastName()).toList();
        return result;
    }

    public List<Person> getPersonsFromCluj(List<Person> persons) {
        List<Person> result = persons.stream()
                .filter(p -> p.getCity().equals("cluj"))
                .toList();
        return result;

    }

    public List<Person> getMajorPersons(List<Person> person) {
        List<Person> result = person.stream()
                .filter(p -> p.getAge() >= 18)
                .toList();
        return result;
    }

    public List<Person> getPersonFromIasiOrCluj(List<Person> person) {
        List<Person> result = person.stream()
                .filter(p -> p.getCity() == "cluj" || p.getCity() == "iasi")
                .toList();
        return result;
    }

    public List<String> getFirstNameCapitalized(List<Person> person) {
        List<String> result = person.stream()
                .map(p -> p.getFirstName().toUpperCase())
                .toList();
        return result;
    }

    public List<Person> getPersonsBetween18and60(List<Person> person) {
        List<Person> result = person.stream()
                .filter(p -> p.getAge() >= 18 && p.getAge() <= 60)
                .toList();
        return result;
    }

    public List<Person> getPersonsWithA(List<Person> person) {
        List<Person> result = person.stream()
                .filter(p -> p.getFirstName().toLowerCase().startsWith("a"))
                .toList();
        return result;
    }

    public List<String> getUniqueFirstName(List<Person> person) {
        List<String> result = person.stream()
                .map(Person::getFirstName)
                .distinct()
                .toList();
        return result;
    }

    public List<Person> sortByFirstName(List<Person> person) {
        List<Person> result = person.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .toList();
        return result;
    }

    public List<Person> sortByLastName(List<Person> person) {
        List<Person> result = person.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .toList();
        return result;

    }

    public List<Person> sortByMultipleFilters(List<Person> person) {
        List<Person> result = person.stream()
                .sorted(Comparator.comparing(Person::getLastName).thenComparing(Person::getLastName).thenComparing(Person::getAge))
                .toList();
        return result;
    }

    public Map<Integer, List<Person>> groupByAge(List<Person> person) {
        Map<Integer, List<Person>> result = person.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        return result;
    }
    public List<String> getFirstNameAndInitial(List<Person> persons) {
        List<String> result = persons.stream()
                .map(p -> p.getFirstName() + " " + p.getLastName().charAt(0)).toList();
        return result;
    }
}
