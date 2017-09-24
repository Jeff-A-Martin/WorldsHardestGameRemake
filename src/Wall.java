import java.awt.Color;
import java.awt.Graphics;

public class Wall implements IObstacle{
	
	protected int x, y, width, height;
	private Color color = Color.BLACK;
	
	public Wall (int x, int y, int width, int height){
		this.x = x; 
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect((int)x, (int)y, width, height);	
	}

	@Override
	public void update() {

	}

	@Override
	public void collides(Ball b, int initx, int inity) {
		int balld = b.getDiameter();
		int ballX = b.getX();
		int ballY = b.getY();
		int ballNewX = b.getNextX();
		int ballNewY = b.getNextY();
		
		int tempX = ballX;
		int tempY = ballY;
		
		if (ballX <= x-balld && ballNewX >= x-balld && 
				ballNewY >= y-balld && ballNewY <= y+height) //left wall
			tempX = x-balld-2;
		
		if (ballX >= x+width && ballNewX <= x+width &&
				ballNewY >= y-balld && ballNewY <= y+height) //right wall
			tempX = x+width+2;
		
		if (ballY <= y-balld && ballNewY >= y-balld &&
				ballNewX >= x-balld && ballNewX <= x+width) //top wall
			tempY = y-balld-2;
		
		if (ballY >= y+height && ballNewY <= y+height &&
				ballNewX >= x-balld && ballNewX <= x+width)
			tempY = y+height+2;
		
		b.SetPos(tempX, tempY);
	}	
	
	public void collides(Tracker t){
		int trackerd = t.getDiameter();
		int trackerX = t.getX();
		int trackerY = t.getY();
		int trackerNewX = t.getNextX();
		int trackerNewY = t.getNextY();
		
		int tempX = trackerX;
		int tempY = trackerY;
		
		if (trackerX <= x-trackerd && trackerNewX >= x-trackerd && 
				trackerNewY >= y-trackerd && trackerNewY <= y+height) //left wall
			tempX = x-trackerd-2;
		
		if (trackerX >= x+width && trackerNewX <= x+width &&
				trackerNewY >= y-trackerd && trackerNewY <= y+height) //right wall
			tempX = x+width+2;
		
		if (trackerY <= y-trackerd && trackerNewY >= y-trackerd &&
				trackerNewX >= x-trackerd && trackerNewX <= x+width) //top wall
			tempY = y-trackerd-2;
		
		if (trackerY >= y+height && trackerNewY <= y+height &&
				trackerNewX >= x-trackerd && trackerNewX <= x+width)
			tempY = y+height+2;
		
		t.setPos(tempX, tempY);
	}

}
