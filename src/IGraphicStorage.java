import java.awt.Graphics;

public interface IGraphicStorage {
	public void addGoal(Goal g);
	public void addKey (Key k);
	public void addBall(Ball b);
	public void addWall(Wall w);
	public void addPlatform(Platform p);
	public void addTracker(Tracker t);
	
	public void paintGraphics(Graphics g);
	public void updateGraphics();
	//updates graphics based on collisions
	public void Collisions(int x, int y);
	public boolean trackerWillCollide(Tracker t);
	public void initialize();
	
	//returns the first ball
	public Ball getBall();
	
	//returns the first Goal
	public Goal getGoal();
	
	//determines if all the keys have been obtained
	public boolean allKeysObtained();
	
}
