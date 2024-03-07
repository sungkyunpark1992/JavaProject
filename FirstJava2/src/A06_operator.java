
public class A06_operator {

	public static void main(String[] args) {
		// 연산자에 대해 알아보자

		int a = 7, b = 3;
		
		//산술연산자
		System.out.println("***산술 연산자***");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // 나누기는 같은 타입인 경우 해당 타입으로 출력됨.
		System.out.println(a / 3.0); //실수타입과 정수가 연산하게 되면, 실수타입으로 츨력
		System.out.println(a % b); //나머지 연산(mod) 
		System.out.println(a ^ b); //제곱승처리가 아님..비트연산자
		System.out.println((int)Math.pow(a, b)); //제곱
		System.out.println();
		//비교연산자 (비교연산자의 결과는 boolean 타입)
		System.out.println("***비교연산자***");
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b); //깉은경우 true
		System.out.println(a != b); //다를 경우 true
		
		//논리연산자
		// && : and연산 ; 둘 모두 true일 때 true, 두 가지 조건 모두 만족해야 true <- 논리 곱
		// || : or연산 ; 둘 중 하나라도 true이여도 true, 한 가지 조건이라도 참이면 true < - 논리 합
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("결과 :" + (a>b && a/b == 2));
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//대입연산자
		System.out.println("대입 연산자");
		a= 10;
		System.out.println(a);
		
		//복합대입연산자
		a += 2; //a=a+2
		System.out.println(a);
		a -=5; // a=a-2;
		System.out.println(a);
		a *= 10; // a=a*10;
		System.out.println(a);
		a /= 7; // a=a/7;
		System.out.println(a);
		a %= 3; // a=a%3;
		System.out.println(a);
		
		
		//삼항연산자
		//비교 ? 참 : 거짓;
		a=7;
		b=4;
		
		String answer = a > b ? "a가 큽니다." : "b가 큽니다."; //string은 s를 대문자로 해야 한다.
		System.out.println((answer));
		
		int value = a > b ? 10 : 5;
		System.out.println(value);
		System.out.println();
		
		//단항연산자
		a=10;
		System.out.println("***단항 연산***");
		a++; // a의 값을 1 증가 시킨다.(후치-값을 처리한 후 증가) a=a+1
		System.out.println(a);
		++a; //a의 값을 1 증가 시킨다(전치-값을 처리하기 전에 증가) 
		System.out.println(a);
		--a;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		a = 7;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		
		// ! : boolean 타입에서만 사용
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(a > b);
		System.out.println(!(a < b));
		
		// ~ : 비트에 대한 반전
		System.out.println(10);
		// 0|000 0000 0000 0000 0000 0000 0000 1010 => 10
		// 1|111 1111 1111 1111 1111 1111 1111 0101 => -11
		// S| => signed bit (0이면 양수, 1이면 음수)
		System.out.println(~10);
		//컴퓨터는 -연산이 없다. 수학적으로 보수관계를 이용해서 - 연산을 대신한다.
		// 11 ~ 1111 1111 (-1)
		//             +1
		
		
		//비트연산자
		//이진법으로 계산하는 연산
		// &, |, >>, <<, ^ ...
		a = 7; // 0000 0111
		b = 3; // 0000 0011
		
		System.out.println("****비트연산****");
		System.out.println(a & b);
		//		0000 0111
		//  &	0000 0011
		//==================
		//		0000 0011
		
		System.out.println(a | b);
		//		0000 0111
		//  |	0000 0011
		//==================
		//		0000 0111		
		
		System.out.println(a ^ b);
		//		0000 0111
		//  ^	0000 0011
		//==================
		//		0000 0100		

		System.out.println(a << b);
		//		0000 0111
		// <<			3
		//==================
		//		0011 1000
		
		System.out.println(a >> b);
		//		0000 0111
		// >>			3
		//==================
		//		0000 0000 (111)
		
		
		

	}

}
