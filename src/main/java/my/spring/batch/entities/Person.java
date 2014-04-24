package my.spring.batch.entities;


public class Person {
  /**
   * last name
   */
  private String lastName;
  /**
   * first name
   */
  private String firstName;

  /**
   * Default constructor
   */
  public Person() {}

  /**
   * Constructor with first name , last name
   * 
   * @param firstName
   * @param lastName
   */
  public Person(final String firstName, final String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "firstName: " + firstName + ", lastName: " + lastName;
  }
}
