package dungeoncrawler.builder.impl;

import dungeoncrawler.builder.Dungeon;
import dungeoncrawler.builder.DungeonBuilder;
import dungeoncrawler.builder.DungeonDirector;
import dungeoncrawler.builder.SimpleDungeonDirector;
import dungeoncrawler.builder.impl.simple.SimpleDungeonBuilder;

public class Demo1
{
	public static void main(String[] args)
	{
		DungeonBuilder builder = new SimpleDungeonBuilder();
		DungeonDirector director = new CastExceptionDungeonDirector();
		Dungeon dungeon = director.constructDungeon(builder);

		System.out.println(dungeon);
	}
}
