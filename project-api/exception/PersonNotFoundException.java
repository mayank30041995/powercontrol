package com.ram.exception;

public class PersonNotFoundException extends RuntimeException
{

	private static final long serialVersionUID = 1L;

	public PersonNotFoundException(Long id)
	{
		super("Book id not found : " + id);
	}

}
