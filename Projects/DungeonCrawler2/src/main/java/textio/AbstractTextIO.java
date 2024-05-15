package textio;

import java.util.List;

public abstract class AbstractTextIO implements TextIO
{
	public int getInt()
	{
		while(true)
		{
			String input = get();
			try
			{
				return Integer.parseInt(input);
			}
			catch(NumberFormatException e)
			{
				put("Please enter an integer: ");
			}
		}
	}

	public int getInt(int min, int max)
	{
		if(min > max)
		{
			throw new IllegalArgumentException("The parameter min must be less than or equal to the parameter max");
		}
		while(true)
		{
			int i = getInt();
			if(i >= min && i <= max)
			{
				return i;
			}
			put("Please enter an integer between " + min + " and " + max + ": ");
		}
	}

	public int choose(String title, List<String> options, String question)
	{
		put(title);
		put(System.lineSeparator());
		int number = 1;
		for(String item : options)
		{
			put("  [" + (number++) + "] " + item);
			put(System.lineSeparator());
		}
		put(System.lineSeparator());
		put(question);
		int choice = getInt(1, options.size());
		return choice - 1;
	}

	public int choose(String title, String[] options, String question)
	{
		put(title);
		put(System.lineSeparator());
		int number = 1;
		for(String item : options)
		{
			put("  [" + (number++) + "] " + item);
			put(System.lineSeparator());
		}
		put(System.lineSeparator());
		put(question);
		int choice = getInt(1, options.length);
		return choice - 1;
	}

}
