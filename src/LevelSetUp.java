import java.util.Arrays;
import java.util.LinkedList;

public class LevelSetUp {
	private LinkedList<Level> levels = new LinkedList<Level>();
	
	public LinkedList<Level> setUp(Ball b){
		
		levels.addLast(setUpLevelOne(b));
		levels.addLast(setUpLevelTwo(b));
		levels.addLast(setUpLevelThree(b));
		levels.addLast(setUpLevelFour(b));
		levels.addLast(setUpLevelFive(b));
		levels.addLast(setUpLevelSix(b));
		levels.addLast(setUpLevelSeven(b));
		
		levels.addLast(setUpLevelEight(b));
		
		//levels.addLast(setUpLevelNine(b));
		return levels;
	}
	
	private Level setUpLevelOne(Ball b){
		Goal g = new Goal(640,370,60,60);
		Level level = new Level(140, 390);
		
		level.addBall(b);
		level.addGoal(g);
		
		level.addWall(new Wall(0, 0, 800, 300)); //Top
		level.addWall(new Wall(0,500, 800, 300)); //Bottom
		level.addWall(new Wall(0,0, 100, 800)); //left
		level.addWall(new Wall(0, 0, 200, 370)); //Left top
		level.addWall(new Wall(0, 430, 200, 370)); //left bottom
		level.addWall(new Wall(700,0, 100, 800)); //right
		level.addWall(new Wall(600, 0, 100, 370)); //right top
		level.addWall(new Wall(600, 430, 100, 370)); //right bottom
		
		level.addPlatform(new Platform(210, 390, 0, 3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(230, 390, 0, 3, 10, 10,0, 0, 300, 500, level));
		level.addPlatform(new Platform(250, 390, 0, -3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(270, 390, 0, -3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(290, 390, 0, 3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(310, 390, 0, 3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(330, 390, 0, -3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(350, 390, 0, -3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(370, 390, 0, 3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(390, 390, 0, 3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(400, 390, 0, -3, 10, 10,  0, 0, 300, 500, level));
		level.addPlatform(new Platform(420, 390, 0, -3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(440, 390, 0, 3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(460, 390, 0, 3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(480, 390, 0, -3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(500, 390, 0, -3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(520, 390, 0, 3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(540, 390, 0, 3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(560, 390, 0, -3, 10, 10, 0, 0, 300, 500, level));
		level.addPlatform(new Platform(580, 390, 0, -3, 10, 10, 0, 0, 300, 500, level));
		

		return level;
	}
	
	private Level setUpLevelTwo(Ball b){
		Goal g = new Goal(370,370,60,60);
		Level level = new Level(390, 65);
		
		level.addBall(b);
		level.addGoal(g);
		
		level.addWall(new Wall(0, 0, 800, 50));//top
		level.addWall(new Wall(190, 50, 180, 100));//top left
		level.addWall(new Wall(430, 50, 180, 100)); //top right
		level.addWall(new Wall(0, 750, 800, 50)); //bottom
		level.addWall(new Wall(190, 650, 180, 100)); //bottom left
		level.addWall(new Wall(430, 650, 180, 100)); //bottom right
		level.addWall(new Wall(0, 0, 50, 800)); //left
		level.addWall(new Wall(50, 190, 100, 180)); //left top
		level.addWall(new Wall(50, 430, 100, 180)); //left bottom
		level.addWall(new Wall(750, 0, 50, 800));//right
		level.addWall(new Wall(650, 190, 100, 180)); //right top
		level.addWall(new Wall(650, 430, 100, 180)); //right bottom
		level.addWall(new Wall(50, 50, 100, 100));
		level.addWall(new Wall(650, 50, 100, 100));
		level.addWall(new Wall(50, 650, 100, 100));
		level.addWall(new Wall(650, 650, 100, 100));
		level.addWall(new Wall(190, 190, 420, 180));
		level.addWall(new Wall(190, 190, 180, 420));
		level.addWall(new Wall(430, 190, 180, 420));
		
		level.addPlatform(new Platform(370, 430, 0, 1, 60, 60, 0, 0, 430, 750, level));
		level.addPlatform(new Platform(160, 60, 0, 2, 20, 20, 0, 0, 50, 750, level));
		level.addPlatform(new Platform(620, 60, 0, 2, 20, 20, 0, 0, 50, 750, level));
		level.addPlatform(new Platform(60, 160, 2, 0, 20, 20, 50, 750, 0, 0, level));
		level.addPlatform(new Platform(60, 620, 2, 0, 20, 20, 50, 750, 0, 0, level));
		
		return level;
	}
	
	private Level setUpLevelThree(Ball b){
		Goal g = new Goal(700,375,50,50);
		Level level = new Level(60, 390);
		
		level.addBall(b);
		level.addGoal(g);
		
		level.addWall(new Wall(0,0, 800, 50));
		level.addWall(new Wall(0,750, 800, 50));
		level.addWall(new Wall(750, 0, 50, 800));
		level.addWall(new Wall(0, 0, 50, 800));
		
		level.addWall(new Wall(0, 0, 150, 375));
		level.addWall(new Wall(0, 425, 150, 375));
		level.addWall(new Wall(650, 0, 150, 375));
		level.addWall(new Wall(650, 425, 150, 375));
		
		//Timed walls that move across the screen
		level.addWall(new TimedWall(150, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(80, 24, 380))));
		level.addWall(new TimedWall(170, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(90, 24, 370))));
		level.addWall(new TimedWall(190, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(100, 24, 360))));
		level.addWall(new TimedWall(210, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(110, 24, 350))));
		level.addWall(new TimedWall(230, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(120, 24, 340))));
		level.addWall(new TimedWall(250, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(130, 24, 330))));
		level.addWall(new TimedWall(270, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(140, 24, 320))));
		level.addWall(new TimedWall(290, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(150, 24, 310))));
		level.addWall(new TimedWall(310, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(160, 24, 300))));
		level.addWall(new TimedWall(330, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(170, 24, 290))));
		level.addWall(new TimedWall(350, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(180, 24, 280))));
		level.addWall(new TimedWall(370, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(190, 24, 270))));
		level.addWall(new TimedWall(390, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(200, 24, 260))));
		level.addWall(new TimedWall(410, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(210, 24, 250))));
		level.addWall(new TimedWall(430, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(220, 24, 240))));
		level.addWall(new TimedWall(450, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(230, 24, 230))));
		level.addWall(new TimedWall(470, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(240, 24, 220))));
		level.addWall(new TimedWall(490, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(250, 24, 210))));
		level.addWall(new TimedWall(510, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(260, 24, 200))));
		level.addWall(new TimedWall(530, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(270, 24, 190))));
		level.addWall(new TimedWall(550, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(280, 24, 180))));
		level.addWall(new TimedWall(570, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(290, 24, 170))));
		level.addWall(new TimedWall(590, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(300, 24, 160))));
		level.addWall(new TimedWall(610, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(310, 24, 150))));
		level.addWall(new TimedWall(630, 0, 20, 800, new LinkedList<Integer>(Arrays.asList(320, 24, 140))));
		
		//left half
		level.addWall(new Wall(150, 0, 20, 375));
		level.addWall(new Wall(150, 425, 20, 375));
		level.addWall(new Wall(170, 0, 20, 365));
		level.addWall(new Wall(170, 415, 20, 385));
		level.addWall(new Wall(190, 0, 20, 355));
		level.addWall(new Wall(190, 405, 20, 395));
		level.addWall(new Wall(210, 0, 20, 345));
		level.addWall(new Wall(210, 395, 20, 405));
		level.addWall(new Wall(230, 0, 20, 335));
		level.addWall(new Wall(230, 385, 20, 415));
		level.addWall(new Wall(250, 0, 20, 325));
		level.addWall(new Wall(250, 375, 20, 425));
		level.addWall(new Wall(270, 0, 20, 315));
		level.addWall(new Wall(270, 365, 20, 435));
		level.addWall(new Wall(290, 0, 20, 305));
		level.addWall(new Wall(290, 355, 20, 445));
		level.addWall(new Wall(310, 0, 20, 295));
		level.addWall(new Wall(310, 345, 20, 455));
		level.addWall(new Wall(330, 0, 20, 285));
		level.addWall(new Wall(330, 335, 20, 465));
		level.addWall(new Wall(350, 0, 20, 275));
		level.addWall(new Wall(350, 325, 20, 475));
		level.addWall(new Wall(370, 0, 20, 265));
		level.addWall(new Wall(370, 315, 20, 485));
		level.addWall(new Wall(390, 0, 20, 255));
		level.addWall(new Wall(390, 305, 20, 495));
		
		//right half
		level.addWall(new Wall(630, 0, 20, 375));
		level.addWall(new Wall(630, 425, 20, 375));
		level.addWall(new Wall(610, 0, 20, 365));
		level.addWall(new Wall(610, 415, 20, 385));
		level.addWall(new Wall(590, 0, 20, 355));
		level.addWall(new Wall(590, 405, 20, 395));
		level.addWall(new Wall(570, 0, 20, 345));
		level.addWall(new Wall(570, 395, 20, 405));
		level.addWall(new Wall(550, 0, 20, 335));
		level.addWall(new Wall(550, 385, 20, 415));
		level.addWall(new Wall(530, 0, 20, 325));
		level.addWall(new Wall(530, 375, 20, 425));
		level.addWall(new Wall(510, 0, 20, 315));
		level.addWall(new Wall(510, 365, 20, 435));
		level.addWall(new Wall(490, 0, 20, 305));
		level.addWall(new Wall(490, 355, 20, 445));
		level.addWall(new Wall(470, 0, 20, 295));
		level.addWall(new Wall(470, 345, 20, 455));
		level.addWall(new Wall(450, 0, 20, 285));
		level.addWall(new Wall(450, 335, 20, 465));
		level.addWall(new Wall(430, 0, 20, 275));
		level.addWall(new Wall(430, 325, 20, 475));
		level.addWall(new Wall(410, 0, 20, 265));
		level.addWall(new Wall(410, 315, 20, 485));
		
		
		return level;
	}
	
	private Level setUpLevelFour(Ball b){ //Template Level
		Goal g = new Goal(700,325,50,150);
		Level level = new Level(60, 390);
		
		level.addBall(b);
		level.addGoal(g);
		
		level.addWall(new Wall(0,0, 800, 50));
		level.addWall(new Wall(0,750, 800, 50));
		level.addWall(new Wall(750, 0, 50, 800));
		level.addWall(new Wall(0, 0, 50, 800));
		
		level.addWall(new Wall(0, 0, 150, 375));
		level.addWall(new Wall(0, 425, 150, 375));
		level.addWall(new Wall(650, 0, 150, 325));
		level.addWall(new Wall(650, 475, 150, 325));
		
		level.addWall(new Wall(150, 50, 500, 125));
		level.addWall(new Wall(150, 625, 500, 125));
		
		level.addPlatform(new Platform(150, 275, 0, -1, 500, 100, 0, 0, 175, 475, level));
		level.addPlatform(new Platform(150, 425, 0, -1, 500, 100, 0, 0, 325, 625, level));
		
		
		return level;
	}
	
	private Level setUpLevelFive(Ball b){
		Goal g = new Goal(700,325,50,150);
		Level level = new Level(60, 390);
		
		level.addBall(b);
		level.addGoal(g);
		
		level.addWall(new Wall(0,0, 800, 50));
		level.addWall(new Wall(0,750, 800, 50));
		level.addWall(new Wall(750, 0, 50, 800));
		level.addWall(new Wall(0, 0, 50, 800));
		
		level.addWall(new Wall(0, 0, 150, 375));
		level.addWall(new Wall(0, 425, 150, 375));
		level.addWall(new Wall(650, 0, 150, 325));
		level.addWall(new Wall(650, 475, 150, 325));
		level.addWall(new Wall(275, 75, 250, 300));
		level.addWall(new Wall(275, 425, 250, 300));
		
		level.addTracker(new Tracker(680, 395, 1, level));
		level.addTracker(new Tracker(160, 60, 1, level));
		level.addTracker(new Tracker(160, 730, 1, level));
		level.addTracker(new Tracker(630, 60, 1, level));
		level.addTracker(new Tracker(630, 730, 1, level));
		
		
		return level;
	}

	private Level setUpLevelSix(Ball b){
		Goal g = new Goal(350, 350, 100, 100);
		Level level = new Level(65, 65);
		
		level.addBall(b);
		level.addGoal(g);
		
		level.addWall(new Wall(0, 0, 800, 50)); //Top
		level.addWall(new Wall(0,750, 800, 50)); //Bottom
		level.addWall(new Wall(0,0, 50, 800)); //left
		level.addWall(new Wall(750,0, 50, 800)); //right
		
		level.addWall(new Wall(0, 100, 700, 50));
		level.addWall(new Wall(650, 150, 50, 550));
		level.addWall(new Wall(100, 650, 600, 50));
		level.addWall(new Wall(100, 200, 50, 500));
		level.addWall(new Wall(150, 200, 450, 50));
		level.addWall(new Wall(550, 250, 50, 350));
		level.addWall(new Wall(200, 550, 400, 50)); 
		level.addWall(new Wall(200, 300, 50, 250));
		level.addWall(new Wall(250, 300, 250, 50));
		level.addWall(new Wall(450, 350, 50, 150));
		level.addWall(new Wall(300, 450, 150, 50)); 
		level.addWall(new Wall(300, 400, 50, 50));
		
		level.addPlatform(new Platform(290, 70, 0, -0.5, 10, 10, 0, 0, 50, 100, level));
		level.addPlatform(new Platform(490, 70, 0, -0.5, 10, 10, 0, 0, 50, 100, level));
		level.addPlatform(new Platform(290, 170, 0, -0.7, 10, 10, 0, 0, 150, 200, level));
		level.addPlatform(new Platform(490, 170, 0, -0.7, 10, 10, 0, 0, 150, 200, level));
		level.addPlatform(new Platform(340, 270, 0, -0.9, 10, 10, 0, 0, 250, 300, level));
		
		level.addPlatform(new Platform(720, 290, 0.55, 0, 10, 10, 700, 750, 0, 0, level));
		level.addPlatform(new Platform(720, 490, 0.55, 0, 10, 10, 700, 750, 0, 0, level));
		level.addPlatform(new Platform(620, 290, 0.75, 0, 10, 10, 600, 650, 0, 0, level));
		level.addPlatform(new Platform(620, 490, 0.75, 0, 10, 10, 600, 650, 0, 0, level));
		level.addPlatform(new Platform(520, 390, 0.95, 0, 10, 10, 500, 550, 0, 0, level));
		
		level.addPlatform(new Platform(290, 720, 0, .6, 10, 10, 0, 0, 700, 750, level));
		level.addPlatform(new Platform(490, 720, 0, .6, 10, 10, 0, 0, 700, 750, level));
		level.addPlatform(new Platform(290, 620, 0, .8, 10, 10, 0, 0, 600, 650, level));
		level.addPlatform(new Platform(490, 620, 0, .8, 10, 10, 0, 0, 600, 650, level));
		level.addPlatform(new Platform(390, 520, 0, 1, 10, 10, 0, 0, 500, 550, level));
		
		level.addPlatform(new Platform(70, 540, -0.65, 0, 10, 10, 50, 100, 0, 0, level));
		level.addPlatform(new Platform(70, 340, -0.65, 0, 10, 10, 50, 100, 0, 0, level));
		level.addPlatform(new Platform(170, 340, -0.85, 0, 10, 10, 150, 200, 0, 0, level));
		level.addPlatform(new Platform(170, 540, -0.85, 0, 10, 10, 150, 200, 0, 0, level));
		level.addPlatform(new Platform(270, 440, -1.05, 0, 10, 10, 250, 300, 0, 0, level));

		return level;
	}
	
	private Level setUpLevelSeven(Ball b){
		Goal g = new Goal(730, 390, 20, 20);
		Level level = new Level(55, 390);
		
		level.addBall(b);
		level.addGoal(g);
		
		level.addWall(new Wall(0, 0, 800, 350)); //Top
		level.addWall(new Wall(0,450, 800, 350)); //Bottom
		level.addWall(new Wall(0,0, 50, 800)); //left
		level.addWall(new Wall(750,0, 50, 800)); //right
		
		level.addWall(new Wall(50, 350, 100, 38));
		level.addWall(new Wall(50, 412, 200, 38));
		
		level.addWall(new Wall(174, 350, 200, 38));
		level.addWall(new Wall(274, 412, 200, 38));
		
		level.addWall(new Wall(398, 350, 200, 38));
		level.addWall(new Wall(498, 412, 252, 38));
		
		level.addWall(new Wall(622, 350, 150, 38));
		
		level.addKey (new Key (152, 350));
		level.addKey (new Key (376, 350));
		level.addKey (new Key (600, 350));
		level.addKey (new Key (252, 430));
		level.addKey (new Key (476, 430));
		
		level.addPlatform(new Platform(700, 390, -3, 0, 20, 20, 80, 730, 0, 0, level));
		level.addPlatform(new Platform(500, 390, -3, 0, 20, 20, 80, 730, 0, 0, level));
		level.addPlatform(new Platform(280, 390, -3, 0, 20, 20, 80, 730, 0, 0, level));
		level.addPlatform(new Platform(80, 390, -3, 0, 20, 20, 80, 730, 0, 0, level));
		return level;
	}

	private Level setUpLevelEight(Ball b){
		Goal g = new Goal(695, 375, 55, 50);
		Level level = new Level(55, 390);
		
		level.addBall(b);
		level.addGoal(g);
		
		level.addWall(new Wall(0, 0, 800, 50)); //Top
		level.addWall(new Wall(0,750, 800, 50)); //Bottom
		level.addWall(new Wall(0,0, 50, 800)); //left
		level.addWall(new Wall(750,0, 50, 800)); //right
		
		level.addWall(new Wall(105, 105, 110, 110)); 
		level.addWall(new Wall(265, 105, 110, 160));
		level.addWall(new Wall(425, 50, 110, 215));
		level.addWall(new Wall(585, 105, 110, 110));
		
		level.addWall(new Wall(50, 265, 165, 110)); 
		level.addWall(new Wall(265, 265, 110, 160));
		level.addWall(new Wall(425, 265, 110, 110));
		level.addWall(new Wall(585, 265, 110, 110));
		
		level.addWall(new Wall(105, 425, 110, 160)); 
		level.addWall(new Wall(265, 425, 110, 110));
		level.addWall(new Wall(425, 425, 160, 110));
		level.addWall(new Wall(585, 425, 110, 160));
		
		level.addWall(new Wall(105, 585, 160, 110)); 
		level.addWall(new Wall(265, 585, 110, 110));
		level.addWall(new Wall(425, 585, 110, 165));
		level.addWall(new Wall(585, 585, 110, 110));
		
		level.addKey(new Key (70, 70));
		level.addKey(new Key (710, 710));
		level.addKey(new Key (70, 710));
		level.addKey(new Key (710, 70));
		
		level.addTracker(new Tracker(60, 110, 1, level));
		level.addTracker(new Tracker(60, 690, 1, level));
		level.addTracker(new Tracker(700, 690, 1, level));
		level.addTracker(new Tracker(690, 60, 1, level));

		
		return level;
	}
	
	private Level setUpLevelNine(Ball b){
		Goal g = new Goal(695, 375, 55, 50);
		Level level = new Level(55, 390);
		
		level.addBall(b);
		level.addGoal(g);
		
		level.addWall(new Wall(0, 0, 800, 50)); //Top
		level.addWall(new Wall(0,750, 800, 50)); //Bottom
		level.addWall(new Wall(0,0, 50, 800)); //left
		level.addWall(new Wall(750,0, 50, 800)); //right
		
		level.addWall(new TimedWall(50, 50, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(150, 50, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(250, 50, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(350, 50, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(450, 50, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(550, 50, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(650, 50, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		
		level.addWall(new TimedWall(50, 150, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(150, 150, 100, 100, new LinkedList<Integer>(Arrays.asList(100, 70, 30))));
		level.addWall(new TimedWall(250, 150, 100, 100, new LinkedList<Integer>(Arrays.asList(0, 30, 100, 70))));
		level.addWall(new TimedWall(350, 150, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(450, 150, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(550, 150, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(650, 150, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		
		level.addWall(new TimedWall(50, 250, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(150, 250, 100, 100, new LinkedList<Integer>(Arrays.asList(60, 70, 70))));
		level.addWall(new TimedWall(250, 250, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(350, 250, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(450, 250, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(550, 250, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(650, 250, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		
		
		level.addWall(new TimedWall(150, 350, 100, 100, new LinkedList<Integer>(Arrays.asList(20, 70, 110))));
		level.addWall(new TimedWall(250, 350, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(350, 350, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(450, 350, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(550, 350, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));

		
		level.addWall(new TimedWall(50, 450, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(150, 450, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(250, 450, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(350, 450, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(450, 450, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(550, 450, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(650, 450, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		
		level.addWall(new TimedWall(50, 550, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(150, 550, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(250, 550, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(350, 550, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(450, 550, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(550, 550, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(650, 550, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		
		level.addWall(new TimedWall(50, 650, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(150, 650, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(250, 650, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(350, 650, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(450, 650, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(550, 650, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		level.addWall(new TimedWall(650, 650, 100, 100, new LinkedList<Integer>(Arrays.asList(10, 50))));
		
		
		level.addKey(new Key(190,390));
		level.addKey(new Key(190,290));
		level.addKey(new Key(190,190));
		level.addKey(new Key(190,90));
		level.addKey(new Key(290,90));
		level.addKey(new Key(390,90));
		level.addKey(new Key(390,190));
		level.addKey(new Key(390,290));
		level.addKey(new Key(390,390));
		level.addKey(new Key(390,490));
		level.addKey(new Key(490,490));
		level.addKey(new Key(590,490));
		level.addKey(new Key(690,490));
		
		
		
		return level;
	}
	
	
	
	
}
