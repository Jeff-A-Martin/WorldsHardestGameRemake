import java.awt.Color;
import java.awt.Graphics;

public class Key {
	private int x, y;
	private final int DIMENSION = 20;
	private final Color COLOR = Color.YELLOW;
	private boolean obtained = false;
	
	public Key(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void paint(Graphics g){
		if (!obtained){
			g.setColor(COLOR);
			g.fillRect(x, y, DIMENSION, DIMENSION);
		}
	}
	
	public void collides(Ball b){
		if (!obtained){
			int balld = b.getDiameter();
			int ballx = b.getX();
			int bally = b.getY();
			
			if (ballx + balld >= x && ballx <= x + DIMENSION &&
			    bally + balld >= y && bally <= y + DIMENSION)
				obtained = true;
		}		
	}
	public boolean obtained(){
		return obtained;
	}
	
	public void initialize(){
		obtained = false;
	}
}
