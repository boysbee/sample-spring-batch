package my.spring.batch.entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	
	@Test
	public void testPerson() {
		Person p = new Person("Test","Doe");
		assertEquals("Test", p.getFirstName());
		assertEquals("Doe", p.getLastName());
	}

}
