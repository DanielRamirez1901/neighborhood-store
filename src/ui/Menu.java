package ui;

import java.util.Scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_ADDPeer;

import model.Person;
import model.Store;

public class Menu {
	
	private final int ADD_PERSON = 1;
	private final int EXIT = 3;
	private final int SHOW = 4;

	private Scanner sc = new Scanner(System.in);
	private Store store;
	private Person person;

	public Menu() {
		store = new Store();
	}
	
	public void showMenu() {
		System.out.println("\nPorfavor elija una opcion a seguir");
		System.out.println("[1] = Si desea agregar una persona.");
		System.out.println("[3] = Si desea salir del programa");
		System.out.println("[4]");
	}
	
	public int readOption(){
		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}//End readOption.

	public void addPersonToStore() {
		System.out.println("Ingrese el numero de identidad");
		String numberId = sc.nextLine();
		System.out.println("Ingrese el tipo de documento segun la siguiente lista");
		System.out.println("[1]TI"
				+ "\n[2]CC"
				+ "\n[3]PP"
				+ "\n[4]CE");
		int idType = sc.nextInt();sc.nextLine();
		person = new Person(numberId,idType);
		store.addPerson(person);
	}

	public void showInfoPersona() {
		System.out.print("\n"+store.showPersonInfo()+"\n");
	}
	public static void main(String[] args) {
		
	}
	
	public void doOperation(int option){
		switch(option){
			case ADD_PERSON:
				addPersonToStore();
				break;
			case SHOW:
			showInfoPersona();
			break;
			case EXIT:
				break;
		}
	}
	public void startProgram(){
		int opt = 0;
		do{
			showMenu();
			opt = readOption();
			doOperation(opt);
		}while(opt != 4);//End do while
	}//End startProgram
}
/*	
	try{
			System.out.println("Persona añadida correctamente");
	}catch(TIException tie) {
		System.out.println("La persona no puede ingresar porque es menor de edad");
		System.err.println(tie.getMessage());
	}
*/
/*
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
*/	

