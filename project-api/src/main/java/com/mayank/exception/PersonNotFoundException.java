package com.mayank.exception;

public class PersonNotFoundException extends RuntimeException
{

	private static final long serialVersionUID = 1L;

	public PersonNotFoundException(int personId)
	{
		super("Person id not found : " + personId);
	}

}
