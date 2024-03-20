package dungeoncrawler;

import java.util.List;

public interface Entity
{
	String getName();
	Location getLocation();
	void setLocation(Location location);
	void move(Portal portal);
	List<Action> getPossibleActions();
	EntityCtrl getController();
}
