import java.awt.Graphics;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class ScoreManager {
	private Score score1 = new Score(), score2 = new Score(), score3 = new Score(), score4 = new Score(), score5 = new Score();
 
	private Formatter writer;
	private Scanner reader;
	private Scanner scanner = new Scanner(System.in);
	
	private void openWriter(){
		try{
			writer = new Formatter("Score.txt");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void openReader(){
		try{
			reader = new Scanner(new File("Score.txt"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	private void writeScore(){
		writer.format("%s %d %s %d %s %d %s %d %s %d", score1.getPerson(), score1.getScore(), score2.getPerson(), score2.getScore(), score3.getPerson(), score3.getScore(),
								score4.getPerson(), score4.getScore(), score5.getPerson(), score5.getScore());
	}
	
	private void readScore(){
		
		score1.setPerson(reader.next());
		score1.setScore(reader.nextInt());
		score2.setPerson(reader.next());
		score2.setScore(reader.nextInt());
		score3.setPerson(reader.next());
		score3.setScore(reader.nextInt());		
		score4.setPerson(reader.next());
		score4.setScore(reader.nextInt());
		score5.setPerson(reader.next());
		score5.setScore(reader.nextInt());
		/*
		int count = 1;
		while(reader.hasNext()){
			if(count == 1){
				score1.setPerson(reader.next());
				int tempScore = Integer.parseInt(reader.next());
				score1.setScore(tempScore);
			}
			if(count == 2){
				score2.setPerson(reader.next());
				int tempScore = Integer.parseInt(reader.next());
				score2.setScore(tempScore);
			}
			if(count == 3){
				score3.setPerson(reader.next());
				int tempScore = Integer.parseInt(reader.next());
				score3.setScore(tempScore);
			}
			if(count == 4){
				score4.setPerson(reader.next());
				int tempScore = Integer.parseInt(reader.next());
				score4.setScore(tempScore);
			}
			if(count == 5){
				score5.setPerson(reader.next());
				int tempScore = Integer.parseInt(reader.next());
				score5.setScore(tempScore);
			}
			
			count ++;
		}
		*/
	}
	
	private void closeWriter(){
		writer.close();
	} 
	
	private void closeReader(){
		reader.close();
	}
	
	public boolean addScore(int score){
		openReader();
		readScore();
		closeReader();
		
		if (score >= score5.getScore()){
			boolean trigger = true;
			String person = "";
			while (trigger){
				System.out.println("Enter your Name without using spaces: ");
				person = scanner.nextLine();
				if (!person.contains(" "))
					trigger = false;
			}
			
			if(score >= score1.getScore()){
				score5.setScore(score4.getScore());
				score5.setPerson(score4.getPerson());
				score4.setScore(score3.getScore());
				score4.setPerson(score3.getPerson());
				score3.setScore(score2.getScore());
				score3.setPerson(score2.getPerson());
				score2.setScore(score1.getScore());
				score2.setPerson(score1.getPerson());
				score1.setPerson(person);
				score1.setScore(score);
			}else if (score >= score2.getScore()){
				score5.setScore(score4.getScore());
				score5.setPerson(score4.getPerson());
				score4.setScore(score3.getScore());
				score4.setPerson(score3.getPerson());
				score3.setScore(score2.getScore());
				score3.setPerson(score3.getPerson());
				score2.setPerson(person);
				score2.setScore(score);
			}else if (score >= score3.getScore()){
				score5.setScore(score4.getScore());
				score5.setPerson(score4.getPerson());
				score4.setScore(score3.getScore());
				score4.setPerson(score3.getPerson());
				score3.setPerson(person);
				score3.setScore(score);
			}else if (score >= score4.getScore()){
				score5.setScore(score4.getScore());
				score5.setPerson(score4.getPerson());
				score4.setPerson(person);
				score4.setScore(score);
			}else{
				score5.setPerson(person);
				score5.setScore(score);
			}
			openWriter();
			writeScore();
			closeWriter();
			return true;
		}
		return false;
	}

	public void paint(Graphics g){
		g.drawString("HighScores:", 350, 380);
		g.drawString("1:" + score1.getPerson()+" "+ score1.getScore(), 350, 400);
		g.drawString("2:" + score2.getPerson()+" "+ score2.getScore(), 350, 420);
		g.drawString("3:" + score3.getPerson()+" "+ score3.getScore(), 350, 440);
		g.drawString("4:" + score4.getPerson()+" "+ score4.getScore(), 350, 460);
		g.drawString("5:" + score5.getPerson()+" "+ score5.getScore(), 350, 480);
	}
}
