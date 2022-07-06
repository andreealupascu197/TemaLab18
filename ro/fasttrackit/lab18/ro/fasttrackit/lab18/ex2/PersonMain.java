package ro.fasttrackit.lab18.ro.fasttrackit.lab18.ex2;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("ana", "pop", 65, "cluj")
                                ,new Person("mihai","Popescu", 26, "iasi")
                                ,new Person("aurel","radu", 17, "brasov"));

        System.out.println(persons);
        PersonService personService = new PersonService(persons);
        System.out.println(personService.getPersonNames(persons));
        System.out.println(personService.getPersonsFromCluj(persons));
        System.out.println(personService.getMajorPersons(persons));
        System.out.println(personService.getPersonFromIasiOrCluj(persons));
        System.out.println(personService.getFirstNameCapitalized(persons));
        System.out.println(personService.getPersonsBetween18and60(persons));
        System.out.println(personService.getPersonsWithA(persons));
        System.out.println(personService.getUniqueFirstName(persons));
        System.out.println(personService.sortByFirstName(persons));
        System.out.println(personService.sortByLastName(persons));
        System.out.println(personService.sortByMultipleFilters(persons));
        System.out.println(personService.groupByAge(persons));
        System.out.println(personService.getFirstNameAndInitial(persons));


    }
}
