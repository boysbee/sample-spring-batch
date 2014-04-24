package my.spring.batch.processsor;

import my.spring.batch.entities.Person;

import org.springframework.batch.item.ItemProcessor;


public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    public Person process(final Person person) {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();
        
        final Person tranformedPerson = new Person(firstName, lastName);

        System.out.println("Converting ( " + person + " into "+  tranformedPerson);
        
        return tranformedPerson;
	}
}
