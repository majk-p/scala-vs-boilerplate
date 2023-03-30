public class Person {
	private final String firstName;
	private final String lastName;
	private int age;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person person = (Person) o;
		return age == person.age && Objects.equals(firstName, person.firstName)
				&& Objects.equals(lastName, person.lastName);
	}

	@Override
	public int hashCode() {
		return java.lang.Objects.hash(firstName, lastName, age);
	}

	@Override
	public String toString() {
		return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + '}';
	}
}