package model;

import java.util.ArrayList;
import exceptions.TIException;

public class Store {
	
	private ArrayList <Person> persons;
	
	public Store() {
		persons = new ArrayList<Person>();
	}
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
	public String showPersonInfo() {
		String nPersons = new String();
		for(int i = 0; i<persons.size();i++) {
			if(persons.get(i) != null && persons.get(i).getIdType()!=1) {
				nPersons += persons.get(i).showInfo();
			}
		}
		return nPersons;
	}
}
