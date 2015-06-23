package element;

import java.util.Random;

public class Gem {
	private Color color;
	private boolean isAmp;
	
	public Gem(Color color, boolean isAmp){
		this.color = color;
		this.isAmp = isAmp;
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public boolean isAmp() {
		return isAmp;
	}
	public void setAmp(boolean isAmp) {
		this.isAmp = isAmp;
	}
	
	public void info(){
		System.out.println(
				"Color = " + color + "\n" 
			+	"isAmp = " + isAmp);
	}
	
	public static int randInt(int max, int min){
		Random rand = new Random();
		int randNum = rand.nextInt((max - min) + 1) + min;
		return randNum;
	}
	
	public void init(){
//		this.color = randInt(5,0);
	}
	
}