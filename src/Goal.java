import java.awt.Color;
import java.awt.Graphics;

public class Goal {
	private int x, y, width, height;
	private final Color color = Color.GREEN;
	
	public Goal(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public boolean isIn(Ball b){
		int balld = b.getDiameter();
		int ballx = b.getX();
		int bally = b.getY();
		
		return (ballx + balld >= x && ballx <= x + width &&
			    bally + balld >= y && bally <= y + height);
			
	}

	public void paint(Graphics g){
		g.setColor(color);
		g.fillRect((int)x, (int)y, width, height);
	}
}
