package Model;

public class Person {

	private String Name;
	private int Age;

	public Person() {
	}

	public Person(String Name, int Age) {

		this.Name = Name;
		this.Age = Age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + "]";
	}

	@Override
	public boolean equals(Object obj) {

		Person p = (Person) obj;
		if (this.Name.equals(p.getName()) && this.Age == p.getAge()) {
			return true;
		} else {

			return false;
		}
	}

}
