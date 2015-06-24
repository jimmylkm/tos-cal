package element;

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
	
	public void init(){
		color = Utility.randColor();
		isAmp = false;
	}
	
}