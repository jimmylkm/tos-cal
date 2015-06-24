package element;

public enum Color {
	WATER(0), FIRE(1), WOOD(2), LIGHT(3), DARK(4), HEART(5);
	private int value;

	
	private Color(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	
}
