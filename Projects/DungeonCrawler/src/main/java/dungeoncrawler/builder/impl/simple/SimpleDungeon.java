package dungeoncrawler.builder.impl.simple;

import dungeoncrawler.builder.Dungeon;
import dungeoncrawler.builder.Location;
import dungeoncrawler.builder.Portal;

import java.util.Collections;
import java.util.List;

public class SimpleDungeon implements Dungeon
{
	private final List<Location> locations;

	public SimpleDungeon(List<Location> locations)
	{
		this.locations = locations;
	}

	@Override
	public List<Location> getLocations()
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
			for(Portal portal : location.getPortals())
			{
				res.append("    ")
					.append(portal.getName())
					.append(" -> ")
					.append(portal.getDestination().getName())
					.append(System.lineSeparator());
			}
		}
		return res.toString();
	}
}
