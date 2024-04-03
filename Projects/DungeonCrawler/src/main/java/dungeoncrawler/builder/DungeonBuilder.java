package dungeoncrawler.builder;

public interface DungeonBuilder
{
	Location createLocation(String name, String description);
	void createPortal(String name, Location from, Location to);
	Dungeon build();
}
