package dungeoncrawler;

public interface DrawLocation
{
	int getPosX();
	int getPosY();
	boolean doorNorth();
	boolean doorEast();
	boolean doorSouth();
	boolean doorWest();
	char getInternal(int x, int y);
}
