package exceptions;

@SuppressWarnings("serial")
public class TIException extends Exception{
	public TIException() {
		super("The type of document is TI- Identity card");
	}
}
