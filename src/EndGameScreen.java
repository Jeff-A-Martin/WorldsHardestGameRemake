import java.awt.Color;
import java.awt.Graphics;

public class EndGameScreen {
	private int deaths, width, height, numLevels, numSeconds;
	private String time;
	private int score;
	public EndGameScreen(int deaths, String time, int numSeconds, int width, int height, int numLevels){
		this.deaths = deaths;
		this.time = time;
		this.width = width;
		this.height = height;
		this.numLevels = numLevels;
		this.numSeconds = numSeconds;
		score();
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.drawString("Your Total Number Of Deaths Was: " + deaths, width/2 -100, height/2 - 300);
		g.drawString("Your Elapsed Time was: " + time, width/2 - 100, height/2 -280);
		g.drawString("Your Score Is: " + score, width/2 - 100, height/2 - 260);
	}
	private void score(){
		score = factorial(numLevels);
		double deathPenalty = 1.0 - ((double)deaths / (deaths + numLevels*2));
		double timePenalty = 1.0 - ((double) numSeconds / (numSeconds + numLevels*5));
		score = (int) ( score * deathPenalty * timePenalty);
		score ++;
	}
	
	private int factorial(int i){
		if (i == 1){
			return 1;
		}
		else return i*factorial(i-1);
	}
	
	public int getScore(){
		return score;
	}
}
