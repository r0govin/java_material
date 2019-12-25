package ExceptionDemo;

import java.util.Arrays;

public class RaviException extends RuntimeException{

	private static final long serialVersionUID = -6135175419031670554L;
	
	public RaviException(String s){
		super(s);
	}
}
