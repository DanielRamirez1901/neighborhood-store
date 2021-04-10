package model;

import java.util.ArrayList;

public class Store {
	
	//Relations
	private ArrayList <Person> persons;

//******************************************************************

	public Store() {
		persons = new ArrayList<Person>();
	}//End Store method

//******************************************************************

	public void addPerson(Person person) {
		persons.add(person);
	}//End addPerson method
	
//******************************************************************

	public String showPersonInfo() {
		String nPersons = new String();
		for(int i = 0; i<persons.size();i++) {
			if(persons.get(i) != null && persons.get(i).getIdType()!=1) {
				nPersons += persons.get(i).showInfo();
			}//End if
		}//End for
		return nPersons;
	}//End showPersonInfo
	
//******************************************************************

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}
}//End Store method
