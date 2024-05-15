package dungeoncrawler.render;

import dungeoncrawler.DrawLocation;

public class DrawLocationImpl implements DrawLocation
{
	private int x;
	private int y;
	private boolean north;
	private boolean east;
	private boolean south;
	private boolean west;

	public DrawLocationImpl(int x, int y, boolean north, boolean east, boolean south, boolean west)
	{
		this.x = x;
		this.y = y;
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
	}

	@Override
	public int getPosX()
	{
		return x;
	}

	@Override
	public int getPosY()
	{
		return y;
	}

	@Override
	public boolean doorNorth()
	{
		return north;
	}

	@Override
	public boolean doorEast()
	{
		return east;
	}

	@Override
	public boolean doorSouth()
	{
		return south;
	}

	@Override
	public boolean doorWest()
	{
		return west;
	}

	@Override
	public char getInternal(int x, int y)
	{
		return ' ';
	}
}
