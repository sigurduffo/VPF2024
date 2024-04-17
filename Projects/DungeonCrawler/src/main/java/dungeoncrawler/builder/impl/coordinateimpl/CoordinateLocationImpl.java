package dungeoncrawler.builder.impl.coordinateimpl;

import dungeoncrawler.builder.adv.CoordinateLocation;
import dungeoncrawler.builder.impl.simple.SimpleLocation;

public class CoordinateLocationImpl extends SimpleLocation implements CoordinateLocation
{
	private int x;
	private int y;

	public CoordinateLocationImpl(String name, String description)
	{
		super(name, description);
	}

	@Override
	public void setCoordinates(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public int getX()
	{
		return x;
	}

	@Override
	public int getY()
	{
		return y;
	}
}
