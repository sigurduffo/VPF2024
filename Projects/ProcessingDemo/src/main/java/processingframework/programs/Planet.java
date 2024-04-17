package processingframework.programs;

import processing.core.PApplet;

public class Planet
{
	private float x;
	private float y;
	private float radius;
	private float sunDist;
	private float rotationTime;
	private int r;
	private int g;
	private int b;

	public Planet(float radius, float sunDist, float rotationTime, int r, int g, int b)
	{
		this.x = sunDist;
		this.y = 0;
		this.radius = radius;
		this.sunDist = sunDist;
		this.rotationTime = rotationTime;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public void update(double seconds)
	{
		float angle = (float) (2 * Math.PI * seconds / rotationTime);
		x = (float) (sunDist * Math.cos(angle));
		y = (float) (sunDist * Math.sin(angle));
	}

	public void draw(PApplet applet, float sunX, float sunY)
	{
		applet.fill(r, g, b);
		applet.ellipse(sunX + x, sunY + y, radius, radius);
	}
}
