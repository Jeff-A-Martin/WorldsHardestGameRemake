import java.awt.Graphics;
import java.util.LinkedList;

public class TimedWall extends Wall {
	LinkedList<Integer> pattern;
	private boolean on = true;
	private boolean invert = false;
	private int count = 0; //indicates the count towards a specific element
	private int pos = 0; //indicates the element in the pattern
	public TimedWall(int x, int y, int width, int height, LinkedList<Integer> pattern) {
		super(x, y, width, height);
		this.pattern = pattern;
	}
	
	@Override
	public void collides(Ball b, int initx, int inity) {
		if (on)
			super.collides(b, initx, inity);
		killIfIn(b, initx, inity);
	}
	
	@Override
	public void paint(Graphics g) {
		if (on)
			super.paint(g);
	}
	
	@Override
	public void update() {
		if (invert){ // by delaying the inverting of 'on' the flash at the end of the pattern is removed.
			on = !on;
			invert = false;
		}
		
		if (pos < pattern.size()){
			int num = pattern.get(pos);
			if (count < num)
				count++;
			if (count >= num){
				invert = true;
				count = 0;
				pos ++;
			}
		}else{
			pos = 0; //loop through the pattern
			on = true;
		}
	}
	
	private void killIfIn(Ball b, int initx, int inity){
		int balld = b.getDiameter();
		int ballx = b.getX();
		int bally = b.getY();
		
		if (on &&
			ballx + balld >= x && ballx <= x + width &&
		    bally + balld >= y && bally <= y + height){
			
			b.initialize(initx, inity);
			b.deaths += 1;
		}
	}
	
}
