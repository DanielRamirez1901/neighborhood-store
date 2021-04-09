package model;

import java.util.ArrayList;

public class Store {
	
	private ArrayList <Person> persons;
	
	public Store() {
		persons = new ArrayList<Person>();
	}
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
}
