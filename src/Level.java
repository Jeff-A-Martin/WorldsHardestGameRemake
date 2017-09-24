import java.awt.Graphics;

public class Level {
	public boolean hasWon = false;
	public int spawnX, spawnY;
	public IGraphicStorage storage = new GraphicStorageLL();
	
	public Level (int spawnX, int spawnY){
		this.spawnX = spawnX;
		this.spawnY = spawnY;
	}
	
	public void update(){	
		storage.updateGraphics();
		storage.Collisions(spawnX, spawnY);
		if(storage.getGoal().isIn(storage.getBall())&&
				storage.allKeysObtained())
			hasWon = true;
	}
	
	public void paint(Graphics g){
		storage.paintGraphics(g);
	}
	
	public void addGoal(Goal g){
		storage.addGoal(g);
	}
	
	public void addKey(Key k){
		storage.addKey(k);
	}
	
	public void addBall(Ball b) {
		storage.addBall(b);	
	}

	public void addWall(Wall w) {
		storage.addWall(w);
	}

	public void addPlatform(Platform p) {
		storage.addPlatform(p);	
	}

	public void addTracker(Tracker t) {
		storage.addTracker(t);
	}
	
	public void initialize(){
		storage.initialize();
	}
}
