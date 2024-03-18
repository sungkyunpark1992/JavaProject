package quiz;

interface Remocon {
	public void on();
	public void off();
}

class Machine{
	protected String name;

	//기본 생성자 생략
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void machinWork(Remocon remocon, Machine machine) {
		remocon.on();
		remocon.off();
	}
}

class TV1 extends Machine{
	public TV1(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	
	public void show() {
		System.out.println("방송 중 입니다.");
	}
}

public class Quiz1_240318_PM {

	public static void main(String[] args) {
		Machine tv = new TV1("TV");
		Machine computer = new Machine();
		computer.setName("컴퓨터");
		
		//TV구동
		Machine.machinWork(new Remocon() {
			@Override
			public void on() {
				// TODO Auto-generated method stub
				System.out.println(tv.getName()+"를 켭니다.");
			}
			@Override
			public void off() {
				// TODO Auto-generated method stub
				System.out.println(tv.getName()+"를 끕니다.");
			}
		}, tv);
		
		// computer 구동
		Machine.machinWork(new Remocon() {
			@Override
			public void on() {
				// TODO Auto-generated method stub
				System.out.println(computer.getName()+"를 켭니다.");
			}
			@Override
			public void off() {
				// TODO Auto-generated method stub
				System.out.println(computer.getName()+"를 끕니다.");				
			}
		}, computer);
	}
}
