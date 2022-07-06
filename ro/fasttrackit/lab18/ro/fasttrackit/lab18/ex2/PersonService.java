package ro.fasttrackit.lab18.ro.fasttrackit.lab18.ex2;

import java.util.*;
import java.util.stream.Collectors;

public class PersonService {
    final List<Person> person;

    public PersonService(List<Person> person) {
        this.person = Collections.unmodifiableList(person);
    }

    public List<String> getPersonNames(List<Person> persons) {
        List<String> result = persons.stream()
                .map(p -> p.firstName() + " " + p.lastName()).toList();
        return result;
    }

    public List<Person> getPersonsFromCluj(List<Person> persons) {
        List<Person> result = persons.stream()
                .filter(p -> p.city().equals("cluj"))
                .toList();
        return result;

    }

    public List<Person> getMajorPersons(List<Person> person) {
        List<Person> result = person.stream()
                .filter(p -> p.age() >= 18)
                .toList();
        return result;
    }

    public List<Person> getPersonFromIasiOrCluj(List<Person> person) {
        return person.stream()
                .filter(p -> p.city() == "cluj" || p.city() == "iasi")
                .toList();

    }

    public List<String> getFirstNameCapitalized(List<Person> person) {
        return person.stream()
                .map(p -> p.firstName().toUpperCase())
                .toList();

    }

    public List<Person> getPersonsBetween18and60(int min, int max, List<Person> person) {
        return person.stream()
                .filter(p -> p.age() > min)
                .filter(p -> p.age() < max)
                .toList();

    }

    public List<Person> getPersonsWithA(List<Person> person) {
        List<Person> result = person.stream()
                .filter(p -> p.firstName().toLowerCase().startsWith("a"))
                .toList();
        return result;
    }

    public Set<String> getUniqueFirstName(List<Person> person) {
        return person.stream()
                .map(Person::firstName)
                //.map(String::toUpperCase)
                .map(i ->i.substring(0,1).toUpperCase() + i.substring(1))
                .collect(Collectors.toSet());
    }

    public List<Person> sortByFirstName(List<Person> person) {
        List<Person> result = person.stream()
                .sorted(Comparator.comparing(Person::firstName))
                .toList();
        return result;
    }

    public List<Person> sortByLastName(List<Person> person) {
        List<Person> result = person.stream()
                .sorted(Comparator.comparing(Person::lastName))
                .toList();
        return result;

    }

    public List<Person> sortByMultipleFilters(List<Person> person) {
        List<Person> result = person.stream()
                .sorted(Comparator.comparing(Person::lastName).thenComparing(Person::lastName).thenComparing(Person::age))
                .toList();
        return result;
    }

    public Map<Integer, List<Person>> groupByAge(List<Person> person) {
        Map<Integer, List<Person>> result = person.stream()
                .collect(Collectors.groupingBy(Person::age));
        return result;
    }

    public List<String> getFirstNameAndInitial(List<Person> persons) {
        List<String> result = persons.stream()
                .map(p -> p.firstName() + " " + p.lastName().charAt(0)).toList();
        return result;
    }
}
