package lesson3.exceptions;

public class InvalidShape extends RuntimeException{
	
	public InvalidShape()
	{
		super();
	}

	public String getMessage()
	{
		return "Invalid shape";
	}

	public String toString()
	{
		return "Invalid shape";
	}
}
