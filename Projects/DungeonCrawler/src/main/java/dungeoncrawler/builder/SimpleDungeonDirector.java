package dungeoncrawler.builder;


public class SimpleDungeonDirector implements DungeonDirector
{
	@Override
	public Dungeon constructDungeon(DungeonBuilder builder)
	{
		Location l1 = builder.createLocation("L1", "Location 1");
		Location l2 = builder.createLocation("L2", "Location 2");
		Location l3 = builder.createLocation("L3", "Location 3");
		builder.createPortal("P1", l1, l2);
		builder.createPortal("P2", l2, l3);
		builder.createPortal("P3", l3, l1);
		return builder.build();
	}
}
