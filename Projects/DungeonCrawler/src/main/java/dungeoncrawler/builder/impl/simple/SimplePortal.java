package dungeoncrawler.builder.impl.simple;

import dungeoncrawler.builder.Location;
import dungeoncrawler.builder.Portal;

public class SimplePortal implements Portal
{
	private final String name;
	private final Location destination;

	public SimplePortal(String name, Location destination)
	{
		this.name = name;
		this.destination = destination;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public Location getDestination()
	{
		return destination;
	}
}
