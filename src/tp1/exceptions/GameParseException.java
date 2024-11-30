package tp1.exceptions;

public class GameParseException extends GameModelException{
	public GameParseException () {
		super(); 
		}
	public GameParseException (String message){ 
		super(message);
	}
	public GameParseException (String message, Throwable cause){
	    super(message, cause);
	}
	public GameParseException (Throwable cause){ 
		super(cause); 
	}
}

