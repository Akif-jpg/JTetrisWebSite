package com.programming.JavaTetrisWeb.exception;

public class ForumNotFoundException extends RuntimeException{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ForumNotFoundException(String message) {
		super("Forum which have title %s is can not found".formatted(message));
		// TODO Auto-generated constructor stub
	}
	
	public ForumNotFoundException(Integer id) {
		super("Forum which have id %s is can not found".formatted(id.toString()));
		// TODO Auto-generated constructor stub
	}


}
