package element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import debug.Log;

public class Board {
	private HashMap<Integer, Gem> gemMap = new HashMap<Integer, Gem>();
	private int[][] board = new int[5][6];
//	private static Board gameboard;
	
	public static enum Direction{
		UP, DOWN, LEFT, RIGHT;
	}
		
	public void init(){
		int keyCounter = 0;
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 6; j++){
				Gem gem = new Gem();
				gem.init();
				gemMap.put(keyCounter, gem);
				board[i][j] = keyCounter;
				keyCounter++;
			}
		}
	}
	
	public void moveGem(int rolNum, int colNum, Direction direct){
		if(rolNum < 0 || rolNum > 4 || colNum > 5 || colNum < 0)
			Log.getInstance().debug(Log.DebugLevel.ERROR, "Out of Range in Move Gem");
		int tempKey = board[rolNum][colNum];
		switch (direct){
		case UP:
			if(rolNum == 0){
				Log.getInstance().debug(Log.DebugLevel.ERROR, "Out of Range in Move Gem");
				break;
			}
			board[rolNum][colNum] = board[rolNum - 1][colNum];
			board[rolNum - 1][colNum] = tempKey;
			break;
		case DOWN:
			if(rolNum == 4){
				Log.getInstance().debug(Log.DebugLevel.ERROR, "Out of Range in Move Gem");
				break;
			}
			board[rolNum][colNum] = board[rolNum + 1][colNum];
			board[rolNum + 1][colNum] = tempKey;
			break;
		case LEFT:
			if(colNum == 0){
				Log.getInstance().debug(Log.DebugLevel.ERROR, "Out of Range in Move Gem");
				break;
			}
			board[rolNum][colNum] = board[rolNum][colNum - 1];
			board[rolNum][colNum - 1] = tempKey;
			break;
		case RIGHT:
			if(colNum == 5){
				Log.getInstance().debug(Log.DebugLevel.ERROR, "Out of Range in Move Gem");
				break;
			}
			board[rolNum][colNum] = board[rolNum][colNum + 1];
			board[rolNum][colNum + 1] = tempKey;
			break;
		default:
			Log.getInstance().debug(Log.DebugLevel.ERROR, "Direction Not Recognized in Move Gem");
		}
	}

	public void dropGem(int rolNum, int colNum, int dist){
		if(rolNum < 0 || rolNum > 4 || colNum > 5 || colNum < 0)
			Log.getInstance().debug(Log.DebugLevel.ERROR, "Out of Range in Drop Gem");
//TODO: Figure out way to drop gem
	}
	
	public void gemProc(int[] key){
		int count = 0;
		for(int i = 0,j = 0; i < 5 && j < 6; j++){
			ArrayList<Integer> keyList = new ArrayList<Integer>();
			if(isSameColorRight(i,j))
				count++;
			else
				count = 0;
		}
		if(count > 2)
			KeyList.add(board[i][j])
			
	
	}
	
	public boolean isSameColorLeft(int rolNum, int colNum){
		if(getGem(rolNum, colNum).getColor() == getGem(rolNum, colNum - 1).getColor())
			return true;
		return false;
	}
	
	public boolean isSameColorRight(int rolNum, int colNum){
		if(getGem(rolNum, colNum).getColor() == getGem(rolNum, colNum + 1).getColor())
			return true;
		return false;
	}
	
	public boolean isSameColorUp(int rolNum, int colNum){
		if(getGem(rolNum, colNum).getColor() == getGem(rolNum - 1, colNum).getColor())
			return true;
		return false;
	}
	
	public boolean isSameColorDown(int rolNum, int colNum){
		if(getGem(rolNum, colNum).getColor() == getGem(rolNum + 1, colNum).getColor())
			return true;
		return false;
	}
	
/*************************************************************/
//	Printing Helper

	
	public void printBoardKey(){
		System.out.println("Printing Key Array:");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 6; j++){
				System.out.printf(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void printBoardColor(){
		System.out.println("Printing Color Array:");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 6; j++){
				System.out.printf(getGem(i,j).getColor() + " ");
			}
			System.out.println();
		}
	}
	
	public void printBoardGem(){
		System.out.println("Printing Key Value Pair:");
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 6; j++){
				System.out.format("Key: %d\n", board[i][j]);
				getGem(i,j).info();
			}
		}
	}
	
	public Gem getGem(int rolNum, int colNum){
		return gemMap.get(board[rolNum][colNum]);
	}
}
