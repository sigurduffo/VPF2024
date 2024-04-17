package dungeoncrawler.builder.adv;

import dungeoncrawler.builder.DungeonBuilder;

public interface CoordinateDungeonBuilder extends DungeonBuilder
{
	CoordinateLocation createLocation(String name, String description);
}
