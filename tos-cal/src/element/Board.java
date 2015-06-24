package element;

import java.util.HashMap;
import java.util.Random;

public class Board {
	private HashMap<Integer, Gem> gemMap = new HashMap<Integer, Gem>();
	private int[][] board = new int[6][5];
//	private static Board gameboard;
	
	public static enum Direction{
		UP, DOWN, LEFT, RIGHT;
	}
		
	public void init(){
		int keyCounter = 0;
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 6; j++){
				Gem gem = new Gem();
				gemMap.put(keyCounter, gem);
				board[j][i] = keyCounter;
				keyCounter++;
			}
		}
	}
	
	public void moveGem(int rowNumX, int colNumX, Direction direct){
		switch (direct){
		case UP:
			
		}
	}
	
	public void printBoard(){
		System.out.println("Printing Key Array:");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 6; j++){
				System.out.printf(board[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("Printing Key Value Pair:");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 6; j++){
				System.out.format("Key: %d\n", board[j][i]);
				gemMap.get(board[j][i]).info();
			}
		}
	}
}
