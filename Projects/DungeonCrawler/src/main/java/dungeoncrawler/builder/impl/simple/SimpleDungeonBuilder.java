package dungeoncrawler.builder.impl.simple;

import dungeoncrawler.builder.Dungeon;
import dungeoncrawler.builder.DungeonBuilder;
import dungeoncrawler.builder.Location;
import dungeoncrawler.builder.Portal;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements DungeonBuilder
{
	private final List<Location> allLocations;

	public SimpleDungeonBuilder()
	{
		this.allLocations = new ArrayList<>();
	}

	@Override
	public Location createLocation(String name, String description)
	{
		Location res = new SimpleLocation(name, description);
		allLocations.add(res);
		return res;
	}

	@Override
	public void createPortal(String name, Location from, Location to)
	{
		if(!(from instanceof SimpleLocation))
		{
			throw new IllegalArgumentException("Only use locations from the same DungeonBuilder.");
		}
		SimpleLocation fromLocation = (SimpleLocation) from;
		Portal portal = new SimplePortal(name, to);
		fromLocation.addPortal(portal);
	}

	@Override
	public Dungeon build()
	{
		return new SimpleDungeon(allLocations);
	}
}
