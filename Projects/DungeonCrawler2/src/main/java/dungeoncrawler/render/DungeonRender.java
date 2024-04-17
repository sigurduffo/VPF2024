package dungeoncrawler.render;

import dungeoncrawler.DrawDungeon;
import dungeoncrawler.DrawLocation;

public class DungeonRender
{
	private final char ul = '\u250F';
	private final char ur = '\u2513';
	private final char ll = '\u2517';
	private final char lr = '\u251B';
	private final char h = '\u2501';
	private final char v = '\u2503';

	private final DrawDungeon dungeon;
	private final int canvasWidth;
	private final int canvasHeight;
	private final char[][] canvas;

	public DungeonRender(DrawDungeon dungeon)
	{
		this.dungeon = dungeon;
		this.canvasWidth = dungeon.getWidth()*(dungeon.getLocationWidth()+2) + (dungeon.getWidth()-1) * 2;
		this.canvasHeight = dungeon.getHeight()*(dungeon.getLocationHeight()+2) + (dungeon.getHeight()-1) * 2;
		this.canvas = new char[canvasWidth][canvasHeight];
	}

	public void clearCanvas()
	{
		for (int y = 0; y < canvasHeight; y++)
		{
			for (int x = 0; x < canvasWidth; x++)
			{
				canvas[x][y] = ' ';
			}
		}
	}

	public void drawCanvas()
	{
		clearCanvas();
		for (int y = 0; y < dungeon.getHeight(); y++)
		{
			for (int x = 0; x < dungeon.getWidth(); x++)
			{
				drawLocation(x, y);
			}
		}
	}

	private void drawLocation(int x, int y)
	{
		DrawLocation location = dungeon.getDrawLocation(x, y);
		if(location == null)
		{
			return;
		}
		int startX = x*(dungeon.getLocationWidth()+2) + x*2;
		int startY = y*(dungeon.getLocationHeight()) + y*2;
		canvas[startX][startY] = ul;
		canvas[startX + dungeon.getLocationWidth() + 1][startY] = ur;
		canvas[startX][startY + dungeon.getLocationHeight() + 1] = ll;
		canvas[startX + dungeon.getLocationWidth() + 1][startY + dungeon.getLocationHeight() + 1] = lr;
		for (int i = 1; i < dungeon.getLocationWidth() + 1; i++)
		{
			canvas[startX + i][startY] = h;
			canvas[startX + i][startY + dungeon.getLocationHeight() + 1] = h;
		}
		for (int i = 1; i < dungeon.getLocationHeight() + 1; i++)
		{
			canvas[startX][startY + i] = v;
			canvas[startX + dungeon.getLocationWidth() + 1][startY + i] = v;
		}
		for (int i = 0; i < dungeon.getLocationHeight(); i++)
		{
			for (int j = 0; j < dungeon.getLocationWidth(); j++)
			{
				canvas[startX + 1 + j][startY + 1 + i] = location.getInternal(j, i);
			}
		}
		if(location.doorNorth())
		{
			canvas[startX + 1 + dungeon.getNorthDoorOffset()][startY] = lr;
			canvas[startX + 2 + dungeon.getNorthDoorOffset()][startY] = ' ';
			canvas[startX + 3 + dungeon.getNorthDoorOffset()][startY] = ll;
		}
		if(location.doorEast())
		{
			canvas[startX + dungeon.getLocationWidth() + 2][startY + 1 + dungeon.getEastDoorOffset()] = h;
			canvas[startX + dungeon.getLocationWidth() + 2][startY + 2 + dungeon.getEastDoorOffset()] = h;
			canvas[startX + dungeon.getLocationWidth() + 1][startY + 1 + dungeon.getEastDoorOffset()] = ll;
			canvas[startX + dungeon.getLocationWidth() + 1][startY + 2 + dungeon.getEastDoorOffset()] = ul;
		}
		if(location.doorSouth())
		{
			canvas[startX + 1 + dungeon.getSouthDoorOffset()][startY + 1 + dungeon.getLocationHeight()] = ur;
			canvas[startX + 2 + dungeon.getSouthDoorOffset()][startY + 1 + dungeon.getLocationHeight()] = ' ';
			canvas[startX + 3 + dungeon.getSouthDoorOffset()][startY + 1 + dungeon.getLocationHeight()] = ul;
		}
		if(location.doorWest())
		{
			canvas[startX-1][startY + 1 + dungeon.getEastDoorOffset()] = h;
			canvas[startX-1][startY + 2 + dungeon.getEastDoorOffset()] = h;
			canvas[startX][startY + 1 + dungeon.getEastDoorOffset()] = lr;
			canvas[startX][startY + 2 + dungeon.getEastDoorOffset()] = ur;
		}
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for (int y = 0; y < canvasHeight; y++)
		{
			for (int x = 0; x < canvasWidth; x++)
			{
				sb.append(canvas[x][y]);
			}
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}
