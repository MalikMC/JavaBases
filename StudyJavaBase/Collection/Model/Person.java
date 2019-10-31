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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Age;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (Age != other.Age)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

}
