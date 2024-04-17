package dungeoncrawler.builder.impl;

import dungeoncrawler.builder.Dungeon;
import dungeoncrawler.builder.DungeonBuilder;
import dungeoncrawler.builder.DungeonDirector;
import dungeoncrawler.builder.SimpleDungeonDirector;
import dungeoncrawler.builder.adv.CoordinateDungeon;
import dungeoncrawler.builder.adv.CoordinateDungeonBuilder;
import dungeoncrawler.builder.adv.CoordinateLocation;
import dungeoncrawler.builder.impl.coordinateimpl.CoordinateDungeonBuilderImpl;
import dungeoncrawler.builder.impl.simple.SimpleDungeonBuilder;
import dungeoncrawler.builder.impl.simple.SimpleEntity;

import java.util.List;

public class Demo2
{
	public static void main(String[] args)
	{
		CoordinateDungeonBuilder builder = new CoordinateDungeonBuilderImpl();
		DungeonDirector director = new SimpleDungeonDirector();
		CoordinateDungeon dungeon = (CoordinateDungeon) director.constructDungeon(builder);
		SimpleEntity player = new SimpleEntity("Player");
		List<? extends CoordinateLocation> locations = dungeon.getLocations();
		locations.get(0).setCoordinates(1, 1);
		player.moveToLocation(dungeon.getLocations().get(0));
		System.out.println(dungeon);
		System.out.println();
		player.moveToLocation(dungeon.getLocations().get(1));
		System.out.println(dungeon);
		System.out.println();
		player.moveToLocation(null);
		System.out.println(dungeon);
		System.out.println();
	}
}
