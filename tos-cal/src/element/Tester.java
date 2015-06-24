package element;

import debug.Log;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0;i < 10; i++){
//			System.out.println(Gem.randInt(5, 0));
//		}
		
//		Color color = Utility.randColor();
//		System.out.println(color);
//		System.out.println(color.getValue());
		
//		Log.getInstance().debug(Log.DebugLevel.RESULT, "Jimmy");
		
		Board board = new Board();
		board.init();
		board.printBoardColor();
//		Gem gem = board.getGem(0, 0);
//		gem.info();
//		gem = board.getGem(1, 0);
//		gem.info();
//		
//		board.moveGem(0, 0, Board.Direction.DOWN);
//		board.printBoardKey();
//		gem = board.getGem(0, 0);
//		gem.info();
//		gem = board.getGem(1, 0);
//		gem.info();
		
	}
}