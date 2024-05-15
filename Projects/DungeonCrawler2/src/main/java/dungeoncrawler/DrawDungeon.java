package dungeoncrawler;

public interface DrawDungeon
{
	int getWidth();
	int getHeight();
	int getLocationWidth();
	int getLocationHeight();
	int getNorthDoorOffset();
	int getEastDoorOffset();
	int getSouthDoorOffset();
	int getWestDoorOffset();
	DrawLocation getDrawLocation(int x, int y);
}
