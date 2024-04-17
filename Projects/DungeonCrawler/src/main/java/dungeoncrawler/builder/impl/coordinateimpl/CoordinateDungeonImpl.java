package dungeoncrawler.builder.impl.coordinateimpl;

import dungeoncrawler.builder.Entity;
import dungeoncrawler.builder.Location;
import dungeoncrawler.builder.Portal;
import dungeoncrawler.builder.adv.CoordinateDungeon;
import dungeoncrawler.builder.adv.CoordinateLocation;

import java.util.Collections;
import java.util.List;

public class CoordinateDungeonImpl implements CoordinateDungeon
{
	private final List<CoordinateLocation> locations;

	public CoordinateDungeonImpl(List<CoordinateLocation> locations)
	{
		this.locations = locations;
	}

	@Override
	public List<? extends CoordinateLocation> getLocations()
	{
		return Collections.unmodifiableList(locations);
	}

	@Override
	public String toString()
	{
		StringBuilder res = new StringBuilder();
		for(Location location : locations)
		{
			res.append(location.getName()).append(System.lineSeparator());
			res.append("    Portals:").append(System.lineSeparator());
			for(Portal portal : location.getPortals())
			{
				res.append("    ")
					.append(portal.getName())
					.append(" -> ")
					.append(portal.getDestination().getName())
					.append(System.lineSeparator());
			}
			res.append("    Entities:").append(System.lineSeparator());
			for(Entity entity : location.getEntities())
			{
				res.append("    ")
					.append(entity.getName())
					.append(System.lineSeparator());
			}
		}
		return res.toString();
	}
}
