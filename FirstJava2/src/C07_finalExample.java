/*
 * 	Uage Moodifier final
 * 	의미
 *   - 일반적으로 final은 그 값이 변하지 않음을 의미함
 *   - 변수에 final이 붙으면 그 값은 변경할 수 없다. 때문에 static하고 같이 사용시 상수로 사용
 *   - 메서드에 final이 붙으면 그 매서드는 재정의 할 수 없다. 재정의 될 필요가 없는 메서드일 때
 *    개발자가 재정의를 허용하지 않기 위해서 사용한다.
 *   - 클래스 final이 붙으면 그 클래스는 자식 클래스를 가질 수 없다.
 * 	 
 */
class MyDate {
	int year = 2024;
	int month = 3;
	int day = 15;
	
	public String toString() {
		return "["+year+"-"+month+"-"+day+"]";
	}
	public void doIt(final int a) {
//		a++;//The final local variable a cannot be assigned.

	}
	
}

final class Parent{
	
	public final void method() {
		System.out.println("Parent - method()");
	}
}

//class Child extends Parent{//상속 불가.. The type Child cannot subclass the final class Parent
//	//부모가 final로 정의한 메서드는 Override 안된다.
////	public void method() {	//Cannot override the final method from Parent	
//}

class FinalInit{
	final int a;
	//final int a = 10; // 1) 선언과 동시에 초기화
//	{// 2) 인스턴스 초기화자를 사용!
//		a=10;
//	}
	// 3) 생성자를 이용
//	public FinalInit() {
//		a=10;
//	}
	FinalInit(int a) {
		this.a = a;	//이것은 final 필드의 초기화가 아님; 문법적 에러는 없음; 초기화자를 이옹한 방식이 아니다.
	}//이런 방식을해도 상관은 없다.
}

public class C07_finalExample {

	static final MyDate date = new MyDate();	//상수
	public int data = 100;
	
	
	public static void main(String[] args) {
		
//		date = new MyDate(); //date 변수로 새로운 객체 생성x
		//The final field C07_finalExample.date cannot be assigned
		
		System.out.println(date.toString());
		date.year = 2025;
		System.out.println(date.toString());
		
		//Local 변수 사용
		new C07_finalExample().doIt("홍길동");
		
		System.out.println(new FinalInit(100).a);
		
	}
	
	public void doIt(final String name) {
		final int age = 38;//내부 클래스에 전달되어야 할 지역변수는 final 꼭 붙여 사용!
		class InnerLocal{	//내부 클래스 중 하나
			public void innerDoIt() {
				System.out.println("외부 클래스의 멤버변수 data : "+data);
				System.out.println("외부 클래스의 파리미터 qus수 name : "+name);
				System.out.println("외부 클래스의 지역변수 age : "+age);
			}
		}
		new InnerLocal().innerDoIt();
	}
	
	
}
