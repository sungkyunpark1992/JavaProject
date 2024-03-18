package quiz;

public class Quiz_tv_class_self {

	public static void main(String[] args) {
		// Tv테스트
		Tv tv1 = new Tv();
		tv1.volumUp();
		tv1.powerOnOff();
		tv1.volumUp();
		tv1.volumDown();
		
		tv1.channelUp();
		tv1.channelDown();
		tv1.channelMove(500);
		
		tv1.prevChannel();		
		tv1.getTvInfo();

	}
}

class Tv{
	//Tv 클래스 멤버 변수
	int channel;
	int volume;
	boolean isPowerOn;
	int prevChannel;
	
	//Tv클래스 상수
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 300;
	final int MIN_CHANNEL = 1;
	
	public Tv() {
		channel = 7;
		volume = 20;
	}

	// 기능 전원 on/off 
	void powerOnOff()	{
		System.out.println("powerOnOff");
		isPowerOn = !isPowerOn;
	}
	
	// 볼륨 업
	void volumUp() {
		if(!isPowerOn) {
			System.out.println("volumUp");
			System.out.println("전원이 꺼져 있습니다.");
			return;	//void에서 리턴을 만나면 메서드 종료 return이 없으면 if문 밖의 코드도 실행함
		}else if(volume == MAX_VOLUME) {
			System.out.println("volumUp");
			System.out.println("현재 최대 볼륨입니다.");
			return;
		}
		volume++;
		System.out.println("volumUp");
		System.out.println("현재 볼륨 : " + volume);
	}
	// 볼륨 다운
	void volumDown() {
		if(!isPowerOn) {
			System.out.println("volumDown");
			System.out.println("전원이 꺼져 있습니다.");
			return;
		}else if(volume == 0) {
			System.out.println("volumDown");
			System.out.println("현재 최소 볼륨입니다.");
			return;
		}
		volume--;
		System.out.println("volumDown");
		System.out.println("현재 볼륨 : " + volume);
	}
	
	// 채널 업
	void channelUp() {
		if(!isPowerOn) {
			System.out.println("channelUp");
			System.out.println("전원이 꺼져 있습니다.");
			return;
		}else if(channel == MAX_CHANNEL) {
			System.out.println("channelUp");
			System.out.println("현재 최대 채널 입니다.");
			return;
		}else {
			prevChannel = channel;
			channel ++;
		}
		System.out.println("channelUp");
		System.out.println("현재 채널 : "+channel);
	}
	
	// 채널 다운
	void channelDown() {
		if(!isPowerOn) {
			System.out.println("channelDown");
			System.out.println("전원이 꺼져 있습니다.");
			return;
		}else if(channel == MIN_CHANNEL) {
			System.out.println("channelDown");
			System.out.println("현재 최소 채널 입니다.");
		}else {
			prevChannel = channel;
			channel --;
		}
		System.out.println("channelDown");
		System.out.println("현재 채널 : "+channel);
	}
	
	// 채널 이동
	void channelMove(int ch) {
		if(!isPowerOn) {
			System.out.println("channelMove");
			System.out.println("전원이 꺼져 있습니다.");
			return;
		}else if(ch>=MIN_CHANNEL && ch<=MAX_CHANNEL){
			prevChannel = channel;
			channel = ch;
			System.out.println("channelMove");
			System.out.println("현재 채널 : "+channel);			
			return;
		}else {
			System.out.println("channelMove");
			System.out.println("존재하지 않는 채널입니다.");
			return;
		}
	}
	
	// 이전 채널
	void prevChannel() {
		if(!isPowerOn) {
			System.out.println("prevChannel");
			System.out.println("전원이 꺼져 있습니다.");
			return;
		}else if(prevChannel == 0) {
			System.out.println("prevChannel");
			System.out.println("이전 채널이 없음");
			return;
		}
		System.out.println("prevChannel");
		int temp = channel;
		channel = prevChannel;
		prevChannel = temp;
		System.out.println("현재 채널 : "+channel);		
	}
	
	void getTvInfo() {
		System.out.println("getTvInfo");
		System.out.println("전원 : "+isPowerOn);
		System.out.println("채널 : "+channel);
		System.out.println("볼륨: "+volume);
		System.out.println("저장된 이전 채널 : "+prevChannel);		
	}
	
}