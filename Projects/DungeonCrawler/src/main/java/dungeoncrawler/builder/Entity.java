package dungeoncrawler.builder;

public interface Entity
{
	String getName();
	void moveToLocation(Location location);
	Location getLocation();
}
