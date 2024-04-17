package dungeoncrawler.builder.impl.coordinateimpl;

import dungeoncrawler.builder.Dungeon;
import dungeoncrawler.builder.Location;
import dungeoncrawler.builder.Portal;
import dungeoncrawler.builder.adv.CoordinateDungeonBuilder;
import dungeoncrawler.builder.adv.CoordinateLocation;
import dungeoncrawler.builder.impl.simple.SimpleDungeon;
import dungeoncrawler.builder.impl.simple.SimpleLocation;
import dungeoncrawler.builder.impl.simple.SimplePortal;

import java.util.ArrayList;
import java.util.List;

public class CoordinateDungeonBuilderImpl implements CoordinateDungeonBuilder
{
	private final List<CoordinateLocation> allLocations;

	public CoordinateDungeonBuilderImpl()
	{
		this.allLocations = new ArrayList<>();
	}

	@Override
	public CoordinateLocation createLocation(String name, String description)
	{
		CoordinateLocation res = new CoordinateLocationImpl(name, description);
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
		return new CoordinateDungeonImpl(allLocations);
	}
}
