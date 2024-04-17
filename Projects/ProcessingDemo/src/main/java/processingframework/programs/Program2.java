package processingframework.programs;

import processing.core.PApplet;
import processingframework.ProcessingProgram;

import java.util.ArrayList;
import java.util.List;


public class Program2 implements ProcessingProgram
{
	private List<Planet> planets;

	public Program2()
	{
		planets = new ArrayList<>();
		planets.add(new Planet(12, 200, 10, 0, 0, 255)); //Earth
		planets.add(new Planet(8, 150, 4, 255, 0, 0)); //Mars
		planets.add(new Planet(20, 300, 20, 255, 255, 255)); //Jupiter
		planets.add(new Planet(18, 400, 30, 255, 255, 0)); //Saturn
		planets.add(new Planet(10, 100, 5, 0, 255, 0)); //Venus
		planets.add(new Planet(15, 250, 15, 255, 0, 255)); //Uranus
		planets.add(new Planet(14, 350, 25, 0, 255, 255)); //Neptune
		planets.add(new Planet(6, 50, 2, 255, 0, 255)); //Mercury
		planets.add(new Planet(22, 450, 35, 0, 255, 255)); //Pluto

	}
	@Override
	public void setup(PApplet applet)
	{
		applet.fullScreen();
	}

	@Override
	public void update(PApplet applet, double seconds)
	{
		for(Planet planet : planets)
		{
			planet.update(seconds);
		}
	}

	@Override
	public void draw(PApplet applet)
	{
		applet.background(0);
		//Draw sun
		applet.fill(255, 255, 0);
		applet.ellipse(applet.width/2, applet.height/2, 50, 50);

		//Draw planets
		for(Planet planet : planets)
		{
			planet.draw(applet, applet.width/2, applet.height/2);
		}
	}
}
