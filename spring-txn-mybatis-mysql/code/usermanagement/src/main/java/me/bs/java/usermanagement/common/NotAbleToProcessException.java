package me.bs.java.usermanagement.common;

public class NotAbleToProcessException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotAbleToProcessException() {
        super();
    }
	
	public NotAbleToProcessException(String message) {
        super(message);
    }
	
}
