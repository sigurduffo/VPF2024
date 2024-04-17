package dungeoncrawler.builder.adv;

import dungeoncrawler.builder.Dungeon;

import java.util.List;

public interface CoordinateDungeon extends Dungeon
{
	List<? extends CoordinateLocation> getLocations();
}
