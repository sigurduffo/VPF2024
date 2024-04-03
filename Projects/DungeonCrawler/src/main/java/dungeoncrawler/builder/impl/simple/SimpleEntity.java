package dungeoncrawler.builder.impl.simple;

import dungeoncrawler.builder.Entity;
import dungeoncrawler.builder.Location;

public class SimpleEntity implements Entity
{
	private final String name;
	private Location currentLocation;

	public SimpleEntity(String name)
	{
		this.name = name;
		this.currentLocation = null;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void moveToLocation(Location location)
	{
		if(currentLocation == location)
		{
			return;
		}
		if(currentLocation != null)
		{
			SimpleLocation simpleCurrentLocation = (SimpleLocation) currentLocation;
			simpleCurrentLocation.removeEntity(this);
		}
		if(location == null)
		{
			currentLocation = null;
			return;
		}
		SimpleLocation simpleNewLocation = (SimpleLocation) location;
		simpleNewLocation.addEntity(this);
		currentLocation = location;
	}

	@Override
	public Location getLocation()
	{
		return currentLocation;
	}
}
