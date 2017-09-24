import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

public class Game extends Applet implements Runnable, KeyListener{
	//game stuff
	private static final long serialVersionUID = 1L;
	private final int FPS = 60; // 60 frame updates per second
	public final int WIDTH = 800, HEIGHT = 800;
	private Image image;
	private Graphics doubleG;
	private boolean hasWon = false;
	private EndGameScreen EGS;
	private ScoreManager SM = new ScoreManager();
	//time stuff
	private Long startTime;
	private int hours, minutes, seconds, totalInSeconds;
	private String displayTime;
	//level stuff
	private LinkedList<Level> levels;
	private int levelNum;
	//ball stuff
	private final int ballSpeed = 2;
	private Ball ball = new Ball(20, Color.RED);
	
	private boolean upPressed = false, downPressed = false, leftPressed = false, rightPressed = false;

	
	@Override
	public void init() {
		setSize(WIDTH, HEIGHT);
		addKeyListener(this);
		LevelSetUp LSU = new LevelSetUp();
		levels = LSU.setUp(ball);
		startTime = System.nanoTime();
	}
	
	@Override
	public void start() {
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < levels.size(); i++){
			levelNum = i;
			Level thisLevel = levels.get(i);
			ball.SetPos(thisLevel.spawnX, thisLevel.spawnY);
			while (!thisLevel.hasWon){ //Loops through at 60 FPS
				updateGame();
				updateClock();
				repaint();
				try {
					Thread.sleep(1000/FPS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		hasWon = true; // the game is over; queue to display results
		EGS = new EndGameScreen(ball.deaths, displayTime, totalInSeconds, WIDTH, HEIGHT, levels.size());
		repaint();
	}
	
	@Override
	public void update(Graphics g) {
		//Double Buffering display a copy of an image while
		//Computations occur instead of a blank screen
		if (image == null){
			image = createImage(WIDTH, HEIGHT); //copies the image size
			doubleG = image.getGraphics();		//copies the image image
		}
		
		doubleG.setColor(getBackground());		//copies the image color
		doubleG.fillRect(0,0, WIDTH, HEIGHT);	//create a rectangle the size of the entire image, and places it at position 0,0
		
		doubleG.setColor(getForeground());
		paint(doubleG);	//paints the temporary image
		
		g.drawImage(image, 0, 0, this); //calls the actual update
	}
	
	@Override
	public void paint(Graphics g) {
		if (hasWon){ // displays the results screen 
			EGS.paint(g);
			
			if (SM.addScore(EGS.getScore()))
				g.drawString("NEW HIGHSCORE!", 300, 360);
			
			SM.paint(g);
			return;
		}
			
		levels.get(levelNum).paint(g);
		
		g.setColor(Color.WHITE);
		g.drawString("Level: " + (levelNum + 1) + "/" + levels.size(), 10, 15); // displays the current level
		// Painting the Proper Time
		g.drawString("Elapsed Time: " + displayTime, 300, 15);
		// painting the number of deaths
		g.drawString("Number Of Deaths: " + ball.deaths, 600, 15);
	}
	
	private void updateGame(){
		levels.get(levelNum).update();
	}
	
	private void updateClock(){
		double time = (System.nanoTime() - startTime)*0.000000001;
		totalInSeconds = (int)time;
		hours = (int)time/3600;
		minutes = (int)(time - (3600* hours))/60;
		seconds = (int) (time - (3600* hours) - (60* minutes));
		
		// Painting the Proper Time
		if (hours < 10 && minutes < 10 && seconds < 10)
			displayTime = "0" + hours + ":0" + minutes + ":0" + seconds;
		else if (hours < 10 && minutes < 10)
			displayTime = "0" + hours + ":0" + minutes + ":" + seconds;
		else if (hours < 10 && seconds < 10)
			displayTime = "0" + hours + ":" + minutes + ":0" + seconds;
		else if (minutes < 10 && seconds < 10)
			displayTime = "" + hours + ":0" + minutes + ":0" + seconds;
		else if (hours < 10)
			displayTime = "0" + hours + ":" + minutes + ":" + seconds;
		else if (minutes < 10)
			displayTime = "" + hours + ":0" + minutes + ":" + seconds;
		else if (seconds < 10)
			displayTime = "" + hours + ":" + minutes + ":0" + seconds;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:
			if(!leftPressed){
				ball.incrementDX(-ballSpeed);
				leftPressed = true;
			}
			break;
		case KeyEvent.VK_RIGHT:
			if (!rightPressed){
				ball.incrementDX(ballSpeed);
				rightPressed = true;
			}
			break;
		case KeyEvent.VK_UP:
			if(!upPressed){
				ball.incrementDY(-ballSpeed);
				upPressed = true;
			}
			break;
		case KeyEvent.VK_DOWN:
			if(!downPressed){
				ball.incrementDY(ballSpeed);
				downPressed = true;
			}
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:
			ball.incrementDX(ballSpeed);
			leftPressed = false;
			break;
		case KeyEvent.VK_RIGHT:
			ball.incrementDX(-ballSpeed);
			rightPressed = false;
			break;
		case KeyEvent.VK_UP:
			ball.incrementDY(ballSpeed);
			upPressed = false;
			break;
		case KeyEvent.VK_DOWN:
			ball.incrementDY(-ballSpeed);
			downPressed = false;
			break;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
