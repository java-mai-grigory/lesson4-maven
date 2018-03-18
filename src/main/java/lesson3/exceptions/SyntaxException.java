package lesson3.exceptions;

public  class SyntaxException extends RuntimeException
{
	private int id;
	public SyntaxException()
	{
		super();
	}

	public String getMessage()
	{
		return "Синтаксическая ошибка";
	}

	public String toString()
	{
		return "Синтаксческая ошибка";
	}
}

