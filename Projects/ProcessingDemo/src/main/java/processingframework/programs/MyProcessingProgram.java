package processingframework.programs;

import processing.core.PApplet;
import processingframework.ProcessingProgram;

public class MyProcessingProgram implements ProcessingProgram
{
	private float posX;
	private float posY;
	private boolean exit;
	private double time;

	public MyProcessingProgram()
	{
		posX = 0;
		posY = 0;
		exit = false;
	}

	@Override
	public void setup(PApplet applet)
	{
		applet.size(200, 200);
	}

	@Override
	public void update(PApplet applet, double seconds)
	{
		this.time = seconds;
		posX = applet.mouseX;
		posY = applet.mouseY;
		if(time > 10)
		{
			exit = true;
		}
	}

	@Override
	public void draw(PApplet applet)
	{
		applet.background(0);
		applet.ellipse(posX, posY, 20, 20);

		applet.text("Time: " + time, 10, 10);
		if(exit)
		{
			applet.exit();
		}
	}
}
