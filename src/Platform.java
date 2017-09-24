import java.awt.Color;
import java.awt.Graphics;

public class Platform implements IObstacle{
	
	private double x, y, dx, dy;
	private int width, height;
	private int xMin, xMax, yMin, yMax;
	private Color color = Color.BLUE;
	private Level level;
	
	public Platform (double x, double y, double dx, double dy, int width, int height, int xMin, int xMax, int yMin, int yMax, Level level){
		this.x = x; 
		this.y = y;
		this.dx = dx;
		this.dy = dy;
		this.width = width;
		this.height = height;
		this.xMin = xMin;
		this.xMax = xMax;
		this.yMin = yMin;
		this.yMax = yMax;
		this.level = level;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect((int)x, (int)y, width, height);	
	}

	@Override
	public void update() {
		if (x + dx < xMin || x + dx > xMax-this.width)
			dx = -dx;
		if (y + dy < yMin || y + dy > yMax-this.height)
			dy = -dy;
		
		x+=dx;
		y+=dy;
	}

	@Override
	public void collides(Ball b, int initx, int inity) {
		int balld = b.getDiameter();
		int ballx = b.getX();
		int bally = b.getY();
		
		if (ballx + balld >= x && ballx <= x + width &&
		    bally + balld >= y && bally <= y + height){
			b.initialize(initx, inity);
			level.initialize();
			b.deaths += 1;
		}
			
		
	}
	
}
