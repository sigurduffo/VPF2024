public class Test
{
	public static void main(String[] args)
	{
		int columns = 140;
		int rows = 25;
		char[][] screen = new char[columns][rows];
		for (int y = 0; y < rows; y++)
		{
			for (int x = 0; x < columns; x++)
			{
				screen[x][y] = '*';
			}
		}
		int x = 0;
		int y = 0;
		while(true)
		{

			printScreen(screen, columns, rows);
			screen[x][y] = '*';
			++x;
			if (x >= columns)
			{
				x = 0;
				++y;
				if (y >= rows)
				{
					y = 0;
				}
			}
			screen[x][y] = 'X';

			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}

	public static void printScreen(char[][] screen, int columns, int rows)
	{
		for(int i = 0; i < 50; i++)
		{
			System.out.println();
		}
		StringBuilder sb = new StringBuilder();
		for (int y = 0; y < rows; y++)
		{
			for (int x = 0; x < columns; x++)
			{
				sb.append(screen[x][y]);
			}
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}
}
