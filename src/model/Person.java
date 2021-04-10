package model;

import exceptions.TIException;

public class Person {
	
	private String numberId;
	private int idType;
	
	public Person(String numberId, int idT) {
		this.numberId = numberId;
		this.idType = idT;
	}
	
	public void comprobateTypeID() throws TIException{
		if(getIdType()==1) {
			throw new TIException();
		}
	}

	public String getNumberId() {
		return numberId;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public void setNumberId(String numberId) {
		this.numberId = numberId;
	}
	
	public String showInfo() {

		String infoPerson;

		infoPerson = "\n----------------------------------------------";
		infoPerson+= "\n********  Person Information ********";
		infoPerson+= "\n**  Number ID: "+getNumberId();
		if(getIdType()==1) {
			infoPerson+= "\n**  Type ID: TI";
		}else if(getIdType()==2) {
			infoPerson+= "\n**  Type ID: CC";
		}else if(getIdType()==3) {
			infoPerson+= "\n**  Type ID: PP";
		}else if(getIdType()==4) {
			infoPerson+= "\n**  Type ID: CE";
		}

		return infoPerson;
	}
}
