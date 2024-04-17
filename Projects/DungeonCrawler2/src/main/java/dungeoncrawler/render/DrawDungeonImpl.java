package dungeoncrawler.render;

import dungeoncrawler.DrawDungeon;
import dungeoncrawler.DrawLocation;

public class DrawDungeonImpl implements DrawDungeon
{
	private final int width;
	private final int height;
	private final int locationWidth;
	private final int locationHeight;
	private final DrawLocation[][] locations;

	public DrawDungeonImpl(int width, int height, int locationWidth, int locationHeight)
	{
		this.width = width;
		this.height = height;
		this.locationWidth = locationWidth;
		this.locationHeight = locationHeight;
		this.locations = new DrawLocation[width][height];
	}


	@Override
	public int getWidth()
	{
		return width;
	}

	@Override
	public int getHeight()
	{
		return height;
	}

	@Override
	public int getLocationWidth()
	{
		return locationWidth;
	}

	@Override
	public int getLocationHeight()
	{
		return locationHeight;
	}

	@Override
	public int getNorthDoorOffset()
	{
		return locationWidth/2-1;
	}

	@Override
	public int getEastDoorOffset()
	{
		return locationHeight/2-1;
	}

	@Override
	public int getSouthDoorOffset()
	{
		return locationWidth/2-1;
	}

	@Override
	public int getWestDoorOffset()
	{
		return locationHeight/2 + locationHeight%2;
	}

	@Override
	public DrawLocation getDrawLocation(int x, int y)
	{
		return locations[x][y];
	}

	public void addLocation(int x, int y, boolean north, boolean east, boolean south, boolean west)
	{
		locations[x][y] = new DrawLocationImpl(x, y, north, east, south, west);
	}
}
