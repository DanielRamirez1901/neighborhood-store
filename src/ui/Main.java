package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Person;

public class Main {
	
	private final int ADD_PERSON = 1;
	private final int NUMBER_OF_PEOPLE = 2;
	private final int EXIT = 3;
	
	private Scanner sc = new Scanner(System.in);
	private ArrayList <Person> person;
	
	public Main() {
		person = new ArrayList<Person>();
	}
	
}
