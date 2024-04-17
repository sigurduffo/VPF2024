package dungeoncrawler.builder.adv;

import dungeoncrawler.builder.Location;

public interface CoordinateLocation extends Location
{
	void setCoordinates(int x, int y);
	int getX();
	int getY();
}
