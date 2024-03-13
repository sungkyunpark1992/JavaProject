package quiz;

public class Quize_moniter {
	public static void main(String[] args) {
		// 

	}
}
class Moniter{
	
	static final int Max = 100;
	
	//멤버변수 - 속성
	public int resolution;
	public int size;
	public int brightness;
	boolean status;
	
	//생성자 constructors
	public Moniter()	{
		this.resolution = Max;
		this.size = Max;
		this.brightness = Max;
		this.status = false;
	}
	public void pressPowerButton() {
		status = !status;
	}
}