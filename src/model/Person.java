package model;

import exceptions.PenultimateNumberException;
import exceptions.TIException;

public class Person {
	
	private String numberId;
	private int idType;
	
	public Person(String numberId, int idT) {
		this.numberId = numberId;
		this.idType = idT;
	}

	public String getNumberId() {
		return numberId;
	}
/*
	public void setNumberId(String ni) throws PenultimateNumberException{
		numberId = ni;
	}
	
	public void setIdT(int newIdT) throws TIException{
		if(newIdT==1) {
			throw new TIException();
		}
		idType = newIdT;
	}
*/

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public void setNumberId(String numberId) {
		this.numberId = numberId;
	}

	
	
}
