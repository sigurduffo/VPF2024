package dungeoncrawler.builder.impl;

import dungeoncrawler.builder.Dungeon;
import dungeoncrawler.builder.DungeonBuilder;
import dungeoncrawler.builder.DungeonDirector;
import dungeoncrawler.builder.SimpleDungeonDirector;
import dungeoncrawler.builder.impl.simple.SimpleDungeonBuilder;
import dungeoncrawler.builder.impl.simple.SimpleEntity;

public class Demo1
{
	public static void main(String[] args)
	{
		DungeonBuilder builder = new SimpleDungeonBuilder();
		DungeonDirector director = new SimpleDungeonDirector();
		Dungeon dungeon = director.constructDungeon(builder);
		SimpleEntity player = new SimpleEntity("Player");
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
