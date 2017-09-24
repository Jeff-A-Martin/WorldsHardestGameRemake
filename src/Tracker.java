import java.awt.Color;
import java.awt.Graphics;

public class Tracker implements IObstacle{
		private int x, initx, y, inity, speed, diameter = 10;
		private Color color = Color.MAGENTA;
		private Level level;
	public Tracker(int x, int y, int speed, Level level){
		this.x = x;
		this.initx = x;
		this.y = y;
		this.inity = y;
		this.speed = speed;
		this.level = level;
	}
	@Override
	public void collides(Ball b, int initx, int inity) {
		int balld = b.getDiameter();
		int ballx = b.getX();
		int bally = b.getY();
		
		if (ballx + balld >= x && ballx <= x + diameter &&
		    bally + balld >= y && bally <= y + diameter){
			b.initialize(initx, inity);
			b.deaths += 1;
			level.initialize();
		}
			

	}
	
	public void initialize(){
		x = this.initx;
		y = this.inity;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval((int)x, (int)y, diameter, diameter);
		
	}

	@Override
	public void update() {
		Ball b = level.storage.getBall();
		int ballx = b.getX();
		int bally = b.getY();
		int tempx = x;
		int tempy = y;

		if (x < ballx)
			tempx+=speed;
		if (x > ballx)
			tempx-=speed;
		if (y < bally)
			tempy+=speed;
		if (y > bally)
			tempy-=speed;
		
		if (! level.storage.trackerWillCollide(this)){
			x = tempx;
			y = tempy;
		}
	}
	
	public void setPos(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getDiameter(){
		return diameter;
	}
	
	public int getNextX(){
		Ball b = level.storage.getBall();
		int ballx = b.getX();
		
		if (x < ballx)
			return x + speed;
		else
			return x - speed;
		
	}
	
	public int getNextY(){
		Ball b = level.storage.getBall();
		int bally = b.getY();
		
		if (y < bally)
			return y + speed;
		else
			return y - speed;
		
	}

}
