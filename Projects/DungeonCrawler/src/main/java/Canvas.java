public class Canvas
{
	private final char ul = '\u250F';
	private final char ur = '\u2513';
	private final char ll = '\u2517';
	private final char lr = '\u251B';
	private final char h = '\u2501';
	private final char v = '\u2503';
	private final char[][] canvas;

	public Canvas(int columns, int rows)
	{
		canvas = new char[columns][rows];
		for (int y = 0; y < rows; y++)
		{
			for (int x = 0; x < columns; x++)
			{
				canvas[x][y] = ' ';
			}
		}
	}

	public void clear()
	{
		for (int y = 0; y < canvas[0].length; y++)
		{
			for (int x = 0; x < canvas.length; x++)
			{
				canvas[x][y] = ' ';
			}
		}
	}

	public void printScreen()
	{
		StringBuilder sb = new StringBuilder();
		for (int y = 0; y < canvas[0].length; y++)
		{
			for (int x = 0; x < canvas.length; x++)
			{
				sb.append(canvas[x][y]);
			}
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

	public void drawBox(int x, int y, int width, int height)
	{
		canvas[x][y] = ul;
		canvas[x + width - 1][y] = ur;
		canvas[x][y + height - 1] = ll;
		canvas[x + width - 1][y + height - 1] = lr;
		for (int i = 1; i < width - 1; i++)
		{
			canvas[x + i][y] = h;
			canvas[x + i][y + height - 1] = h;
		}
		for (int i = 1; i < height - 1; i++)
		{
			canvas[x][y + i] = v;
			canvas[x + width - 1][y + i] = v;
		}
	}

	public static void main(String[] args)
	{
		Canvas canvas = new Canvas(140, 25);
		canvas.drawBox(1, 1, 2, 2);
		canvas.drawBox(30, 1, 20, 10);
		canvas.drawBox(60, 1, 20, 10);
		canvas.drawBox(90, 1, 20, 10);
		canvas.drawBox(1, 12, 20, 10);
		canvas.drawBox(30, 12, 20, 10);
		canvas.drawBox(60, 12, 20, 10);
		canvas.drawBox(90, 12, 20, 10);
		canvas.printScreen();
	}
}
