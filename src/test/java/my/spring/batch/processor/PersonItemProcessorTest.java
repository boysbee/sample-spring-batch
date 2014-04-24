package my.spring.batch.processor;

import my.spring.batch.entities.Person;
import my.spring.batch.processsor.PersonItemProcessor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonItemProcessorTest {
	private PersonItemProcessor processor;

	@Before
	public void setUp() {
		processor = new PersonItemProcessor();
	}

	@Test
	public void testProcessor() {
		final Person person = new Person("test", "doe");
		final Person performedPerson = processor.process(person);

		Assert.assertEquals("TEST", performedPerson.getFirstName());
		Assert.assertEquals("DOE", performedPerson.getLastName());
	}
}
