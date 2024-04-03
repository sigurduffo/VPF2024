package dungeoncrawler.builder;

import java.util.List;

public interface Location
{
	String getName();
	String getDescription();
	List<Portal> getPortals();
}
