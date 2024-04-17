package processingframework;

import processing.core.PApplet;

public interface ProcessingProgram
{
	void setup(PApplet applet);
	void update(PApplet applet, double seconds);
	void draw(PApplet appllet);
}
