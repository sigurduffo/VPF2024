package dungeoncrawler.builder;

import java.util.List;

public interface Dungeon
{
	List<? extends Location> getLocations();
}
