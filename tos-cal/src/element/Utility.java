package element;

import java.util.Random;

public class Utility {
//	Number of gem color
	private static final int GEMCOLORNUM = 5;
	private static final Random RAND = new Random();
	private static final Color[] VALUES = Color.values();
	
	private static int randInt(int max, int min){
		int randNum = RAND.nextInt((max - min) + 1) + min;
		return randNum;
	}
	public static Color randColor(){
		return VALUES[randInt(GEMCOLORNUM,0)];
	}
	
}
