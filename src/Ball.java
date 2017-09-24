import java.awt.Color;
import java.awt.Graphics;

public class Ball{
	private int initDiameter;
	private int x, y, diameter;
	private int dx = 0, dy = 0;
	private Color initColor;
	private Color color;
	public int deaths = 0;
	
	public Ball(int diameter, Color color){
		this.diameter = diameter;
		this.initDiameter = diameter;
		this.color = color;
		this.initColor = color;
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval((int)x, (int)y, diameter, diameter);	
	}

	public void update() {
		x+=dx;
		y+=dy;
	}
	
	public void incrementDX(int amount) {
		dx+=amount;	
	}

	public void incrementDY(int amount) {
		dy+=amount;
	}
	
	public void initialize(int x, int y){
		this.x = x;
		this.y = y;
		diameter = initDiameter;
		color = initColor;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getDiameter(){
		return diameter;
	}
	public int getNextX(){
		return x+dx;
	}
	public int getNextY(){
		return y+dy;
	}
	public void SetPos(int x, int y){
		this.x = x;
		this.y = y;
	}
}
