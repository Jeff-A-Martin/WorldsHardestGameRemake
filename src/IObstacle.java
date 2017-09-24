import java.awt.Graphics;

public interface IObstacle {
	public void collides(Ball b, int initx, int inity);
	public void paint(Graphics g);
	public void update();
}
