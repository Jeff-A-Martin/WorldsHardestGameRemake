import java.awt.Graphics;
import java.util.LinkedList;

public class GraphicStorageLL implements IGraphicStorage{
	private LinkedList<Goal> goals = new LinkedList<Goal>();
	private LinkedList<Key> keys = new LinkedList<Key>();
	private LinkedList<Ball> balls = new LinkedList<Ball>();
	private LinkedList<Wall> walls = new LinkedList<Wall>();
	private LinkedList<Platform> platforms = new LinkedList<Platform>();
	private LinkedList<Tracker> trackers = new LinkedList<Tracker>();
	
	@Override
	public void addGoal(Goal g) {
		goals.addLast(g);		
	}
	
	@Override
	public void addKey(Key k){
		keys.addLast(k);
	}
	
	@Override
	public void addBall(Ball b) {
		balls.addLast(b);	
	}

	@Override
	public void addWall(Wall w) {
		walls.addLast(w);
	}

	@Override
	public void addPlatform(Platform p) {
		platforms.addLast(p);	
	}

	@Override
	public void addTracker(Tracker t) {
		trackers.addLast(t);
	}

	@Override
	public void paintGraphics(Graphics g) {
		for (Goal goal : goals)
			goal.paint(g);
		for (Key k : keys)
			k.paint(g);
		for(Ball b : balls)
			b.paint(g);
		for(Wall w : walls)
			w.paint(g);
		for(Platform p : platforms)
			p.paint(g);
		for(Tracker t : trackers)
			t.paint(g);
		
	}

	@Override
	public void updateGraphics() {
		for(Ball b : balls)
			b.update();
		for(Wall w : walls)
			w.update();
		for(Platform p : platforms)
			p.update();
		for(Tracker t : trackers)
			t.update();
	}
	
	@Override
	public void Collisions(int initx, int inity){
		for (Ball b: balls){
			deadlyCollisions(b, initx, inity);
			Collisions(b, initx, inity);
		}
		for (Tracker t: trackers)
			Collisions(t);
	}

	private void deadlyCollisions(Ball b, int initx, int inity) {
		for (Platform p : platforms)
			p.collides(b, initx, inity);
		for (Tracker t : trackers)
			t.collides(b, initx, inity);
		
	}

	private void Collisions(Ball b, int initx, int inity) {
		for (Wall w : walls)
			w.collides(b, initx, inity);
		for (Key k : keys)
			k.collides(b);
		
	}

	private void Collisions(Tracker t) {
		for (Wall w : walls)
			w.collides(t);		
	}
	
	public boolean trackerWillCollide(Tracker t){
		int t1XMin = t.getNextX();
		int t1XMax = t1XMin + t.getDiameter();
		int t1YMin = t.getNextY();
		int t1YMax = t1YMin + t.getDiameter();
		
		for(Tracker tracker : trackers){
			if (tracker != t){
				
				int t2XMin = tracker.getX();
				int t2XMax = t2XMin + tracker.getDiameter();
				int t2YMin = tracker.getY();
				int t2YMax = t2YMin + tracker.getDiameter();
				
				if (t1XMax >= t2XMin && t1XMax <= t2XMax && t1YMax >= t2YMin && t1YMax <= t2YMax)
					return true;
				if (t1XMin <= t2XMax && t1XMin >= t2XMin && t1YMax >= t2YMin && t1YMax <= t2YMax)
					return true;
				if (t1XMin <= t2XMax && t1XMin >= t2XMin && t1YMin <= t2YMax && t1YMin >= t2YMin)
					return true;
				if (t1XMax >= t2XMin && t1XMax <= t2XMax && t1YMin <= t2YMax && t1YMin >= t2YMin)
					return true;				
			}
		}
		return false;
	}
	
	public void initialize(){
		for(Tracker t: trackers)
			t.initialize();
		for(Key k: keys)
			k.initialize();
	}
	
	public Ball getBall(){
		return balls.getFirst();
	}

	public Goal getGoal(){
		return goals.getFirst();
	}

	@Override
	public boolean allKeysObtained() {
		boolean temp = true;
		for (Key k : keys){
			temp = temp && k.obtained();
		}
		return temp;
	}
}
