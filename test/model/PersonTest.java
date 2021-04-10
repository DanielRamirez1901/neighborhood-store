package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.PenultimateNumberException;
import exceptions.TIException;

public class PersonTest {

	public void setupScenary1() {
		
	}
	
	@Test
	public void testPerson() {
		setupScenary1();
		
		String numberId = "1005943632";
		int idType = 2;
		
		Person p = new Person(numberId,idType);
		
		assertEquals(numberId, p.getNumberId());
		assertEquals(idType, p.getIdType());
		
	}
	
	@Test
	public void testComprobateTypeID() {
		setupScenary1();
		
		String numberId = "1005943632";
		int idType = 1;
		
		Person p = new Person(numberId,idType);
		
		try {
			p.comprobateTypeID();
			fail();
		}catch(TIException tie) {
			assertEquals(idType, p.getIdType());
		}
	}
	
	@Test
	public void testComprobateID() {
		setupScenary1();
		
		String numberId = "1005943642";
		int idType = 1;
		
		Person p = new Person(numberId,idType);
		try {
			p.comprobateID();
			fail();
		}catch(PenultimateNumberException pne) {
			assertEquals(idType, p.getIdType());
		}
	}
	

}
