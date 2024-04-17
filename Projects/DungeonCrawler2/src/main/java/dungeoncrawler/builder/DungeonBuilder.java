package dungeoncrawler.builder;

import dungeoncrawler.Location;

public interface DungeonBuilder
{
	Location createLocation(String name, int x, int y);
}
