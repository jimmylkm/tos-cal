package element;

import java.util.HashMap;
import java.util.Random;

public class Board {
	private HashMap<Integer, Gem> gemMap;
	private int[][] board = new int[6][5];
	private static Board gameboard;
	
	private Board(){}
	
	public static Board getInstance(){
		if(gameboard == null)
			return (gameboard = new Board());
		else
			return gameboard;
	}
	
	public void init(){
		
	}
	
	public int randInt(int max, int min){
		Random rand = new Random();
		int randNum = rand.nextInt((max - min) + 1) + min;
		return randNum;
	}
}
