package textio;

import java.util.List;

public class TextIODemo
{
	public static void main(String[] args)
	{
		TextIO io = new SystemTextIOImpl();

		List<String> options = List.of("Agurk", "Tomat", "Gulerod");

		int choice = io.choose("Vælg din grøntsag:", options, "Indtast dit valg: ");

		io.put("Du har valgt:" + options.get(choice) + System.lineSeparator());
	}
}
