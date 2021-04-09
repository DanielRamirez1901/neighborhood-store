package ui;

import java.util.ArrayList;
import java.util.Scanner;
import exceptions.TIException;
import model.Person;

public class Menu {
	
	private final int ADD_PERSON = 1;
	private final int NUMBER_OF_PEOPLE = 2;
	private final int EXIT = 3;
	
	private Scanner sc = new Scanner(System.in);
	private Person person;
	
	public Menu() {
	}
	
	public static void main(String[] args) {
/*	
	try{
			System.out.println("Persona añadida correctamente");
	}catch(TIException tie) {
		System.out.println("La persona no puede ingresar porque es menor de edad");
		System.err.println(tie.getMessage());
	}
*/
	}
	
	public void addPerson() {
		System.out.println("Ingrese el numero de identidad");
		String numberID = sc.nextLine();
		System.out.println("De la siguiente lista ingrese el tipo de documento"
				+ "[1]TI"
				+ "[2]CC"
				+ "[3]PP"
				+ "[4]CE");
		int idType = sc.nextInt();sc.nextLine();
		person = new Person(numberID,idType);
	}
	
}
