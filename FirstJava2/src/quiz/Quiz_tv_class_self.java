package quiz;

public class Quiz_tv_class_self {

	public static void main(String[] args) {
		// Tv테스트
		TV tv1 = new TV();
		
	}
}
class TV{
	//tv클래스 멤버 변수
	int channel;
	int prevChannel;
	int volume = 20;
	boolean isPowerOn;
	
	//TV클래스의 상수(fianl)
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 200;
	final int MIN_CHANNEL = 1;
	
	public TV() {
		channel = 7;
		volume = 20;
	}
	
	// TV기능
	// 전원 : isPowerOn 값이 true면, false, false면 true
	void powerOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumUp() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져 있습니다.");
			return;
		}else if(volume == MAX_VOLUME) {
			System.out.println("현재 볼륨이 최대입니다.");
			return;
		}
		volume ++;
		System.out.println("현재 볼륨은 " + volume + "입니다.");
	}
	
	void volumDown() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져 있습니다.");
			return;
		}else if(volume == MAX_VOLUME) {
			System.out.println("현재 볼륨이 0입니다.");
			return;
		}
		volume --;
		System.out.println("현재 볼륨은 " + volume + "입니다.");
	}
	
	void channelUp() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져 있습니다.");
			return;
		}
		//이전 채널
		prevChannel = channel;
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}else {
			channel ++;
		}
		System.out.println(channel + "CH");
	}
	
	void channelDown() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		//이전 채널
		prevChannel = channel;
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}else {
			channel --;
		}
		System.out.println(channel + "CH");
	}
	
	
	
	
	
	
}