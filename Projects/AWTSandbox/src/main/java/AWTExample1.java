// importing Java AWT class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// extending Frame class to our class AWTExample1
public class AWTExample1 extends Frame
{
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		drawCenteredCircle(g2d, 150, 150, 100);
	}
	// initializing using constructor
	AWTExample1()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
		// creating a button
		Button b = new Button("Click Me!!");

		// setting button position on screen
		b.setBounds(30,100,80,30);

		// adding button into frame
		add(b);

		b.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Button clicked");
			}
		});

		b.addMouseListener(new MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt)
			{
				b.setBackground(Color.GREEN);
			}

			public void mouseExited(java.awt.event.MouseEvent evt)
			{
				b.setBackground(UIManager.getColor("control"));
			}
		});

		// frame size 300 width and 300 height
		setSize(300,300);

		// setting the title of Frame
		setTitle("This is our basic AWT example");

		// no layout manager
		setLayout(null);

		// now frame will be visible, by default it is not visible
		setVisible(true);
	}

	public void drawCenteredCircle(Graphics2D g, int x, int y, int r) {
		x = x-(r/2);
		y = y-(r/2);
		g.fillOval(x,y,r*2,r*2);
	}

	// main method
	public static void main(String args[])
	{

		// creating instance of Frame class
		AWTExample1 f = new AWTExample1();

	}

}
