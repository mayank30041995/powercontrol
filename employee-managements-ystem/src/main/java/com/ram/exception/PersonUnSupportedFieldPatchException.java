package com.ram.exception;

import java.util.Set;

public class PersonUnSupportedFieldPatchException extends RuntimeException
{

	private static final long serialVersionUID = 1L;

	public PersonUnSupportedFieldPatchException(Set<String> keys)
	{
		super("Field " + keys.toString() + " update is not allow.");
	}

}
