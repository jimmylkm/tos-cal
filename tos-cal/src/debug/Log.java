package debug;

import java.util.HashMap;

import element.Board;
import element.Gem;

public class Log {
	private static Log logger = null;
	public static enum DebugLevel{
		STEP(1), RESULT(2);
		private int value;
		
		private DebugLevel(int value){
			this.value = value;
		}
	}
	
	private Log(){}
	
	public static Log getInstance(){
		if(logger == null)
			return (logger = new Log());
		else 
			return logger;
	}
	
	public void debug(DebugLevel level, String message){
		System.out.printf("%s: %s", level, message);
	}
	
	public void debug(DebugLevel level, Board board){
		System.out.println(level);
		
	}
}
