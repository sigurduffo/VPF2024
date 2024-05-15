package dungeoncrawler;

import dungeoncrawler.render.DrawDungeonImpl;
import dungeoncrawler.render.DungeonRender;

public class Demo1
{
	public static void main(String[] args)
	{
		DrawDungeonImpl dungeon = new DrawDungeonImpl(2, 2, 20, 10);
		//dungeon.addLocation(0, 0, false, true, true, false);
		//dungeon.addLocation(1, 0, false, false, true, true);
		//dungeon.addLocation(0, 1, true, true, false, false);
		//dungeon.addLocation(1, 1, true, false, false, true);
		//dungeon.addLocation(0, 0, false, true, true, false);
		dungeon.addLocation(1, 0, false, false, true, true);
		dungeon.addLocation(0, 1, true, true, false, false);
		dungeon.addLocation(1, 1, true, false, false, true);
		DungeonRender render = new DungeonRender(dungeon);
		render.drawCanvas();
		System.out.println(render);
	}
}
