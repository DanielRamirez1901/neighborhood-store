package exceptions;

public class PenultimateNumberException extends Exception{
	public PenultimateNumberException() {
		super("The penultimate number of the identity "
				+ "document according to the protocol "
				+ "established by the government does not "
				+ "have exit permits");
	}
}
