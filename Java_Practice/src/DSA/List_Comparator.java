package DSA;

import java.util.*;

class Person
{
	private String name;
	private int age;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

//persons.sort(Comparator.comparing(Person::getAge).thenComparing(Comparator.comparing(Person::getName)));

class Main
{
	public static void main(String[] args)
	{
		List<Person> persons = new ArrayList<>(Arrays.asList(
											new Person("John", 15),
											new Person("Sam", 25),
											new Person("Will", 20),
											new Person("Dan", 20),
											new Person("Joe", 10)
										));

		persons.sort(Comparator.comparing(Person::getAge)
								.thenComparing(Comparator.comparing(Person::getName)));
		
		///persons.sort(Comparator.comparing(Person::getAge).thenComparing(Comparator.comparing(Person::getName)));

		System.out.println(persons);
	}
}
