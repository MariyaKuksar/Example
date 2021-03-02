package by.epam.example.comporator;

import java.util.Comparator;

import by.epam.example.entity.Person;

public class PersonIdComporator implements Comparator<Person> {
	@Override
	public int compare(Person person1, Person person2) {
		return person1.getId() - person2.getId();
	}
}
