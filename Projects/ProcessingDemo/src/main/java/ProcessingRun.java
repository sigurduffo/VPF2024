import processing.core.PApplet;
import processingframework.ProcessingProgram;
import processingframework.programs.Program2;

public class ProcessingRun extends PApplet
{
	private static ProcessingProgram prg = new Program2();
	private static long lastTime;

	public void settings()
	{
		prg.setup(this);
		lastTime = System.currentTimeMillis();
	}

	public void draw()
	{

		long curTime = System.currentTimeMillis();
		long time = curTime - lastTime;
		double seconds = time * 0.001;
		prg.update(this, seconds);
		prg.draw(this);
	}

	public static void main(String[] args)
	{
		PApplet.main("ProcessingRun");
	}
}

