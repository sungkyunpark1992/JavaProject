
public class A04_varTypes {

	public static void main(String[] args) {
		/*
		 * 정수형 : 양의정수, 음의정수, 0
		 *  - byte(1byte)
		 *  - char(2byte)  *주의 - 한글자의 크기
		 *  - short(2byte)
		 *  - int(4byte)   *정수형 기본타입*
		 *  - long(8byte)
		 *  
		 * 	- 1byte (byte, char(c언어))
		 *  signed : -128 ~ 127, unsigned : 0 ~255
		 *  - 2byte (short, char(java))
		 *   signed : -2^15 ~ +2^15-1, unsigned : 0 ~ 65,535
		 * - 4byte (int)
		 *   signed : -2^31 ~ +2^31-1, unsigned : 0 ~ 4,294,967,295
		 * - 8byte (long) - 큰 정수를 표기할 때
		 *   signed : -2^63 ~ +2^63-1
		 * 
		 */
		
		byte _byte = -128;
		short _short = 10;
		char _char = 65535;
		int _int = 2_100_000_000; // ,를 사용할 수 없으니 _로 자릿수 표기
		long _long = 22_0000_0000L; // Long은 정수 뒤에 L(l)을 붙여 사용!
		
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_char);
		System.out.println(_int);
		System.out.println(_long);
		
		/*
		 * 실수형 (거의 그래픽 계에서 많이 사용됨
		 *  - 복잡하고 정확한 수학 계산이 필요한 분야에서 주로 사용됨
		 *  - 부동 소주점 방식을 사용함.
		 *  
		 *  - float (4byte)
		 *  - double (8byte) **기본타입
		 *  
		 */
		
		float _float = 1.234f;
		// float형 리터럴은 뒤에 f를 붙여야 한다.
		double _double = 1.234f;
		
		/*
		 *   참/거짓형
		 *   boolean (true/false)
		 */
		boolean _true = true;
		boolean _false = false;
		boolean goon_pil = true;
		
		/*
		 *  참조형 (클래스 타입)
		 *   String (문자열)
		 *   그외 모든 타입... 대문자로 시작하는 모든 타입...
		 */
		
		// 데이터 타입이 소문자로 시작하는 타입 : 기본 타입
		// 데이터 타입이 대문자로 시작하는 타입 : 참조 타입
		String comment = "앞으로 약 35분에 점심입니다.";
		System.out.println(comment + goon_pil);
		
	}

}
