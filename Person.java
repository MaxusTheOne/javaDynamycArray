public class Person {

  private String firstName;
  private String middleName;
  private String lastName;
  private int age;

  public Person(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  public Person(String firstName, String lastName) {
    this(firstName, null, lastName);
  }

  public Person(String fullName) {
    this.setFullName(fullName);
  }

  public Person() {}

  public String toString() {
    return firstName + " " + middleName + " " + lastName + " " + age;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return this.middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAgeName() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFullName() {
    if (hasMiddleName()) {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.lastName;
    }
  }

  public void setFullName(String fullName) {
    String[] parts = fullName.split(" ");
    this.firstName = parts[0];
    if (parts.length >= 3) {
      this.middleName = parts[1];
    } else {
      this.middleName = null;
    }
    this.lastName = parts[parts.length - 1];
  }

  public boolean hasMiddleName() {
    return this.middleName != null;
  }
}
