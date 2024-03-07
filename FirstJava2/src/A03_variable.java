

public class A03_variable {

	public static void main(String[] args) {
		// 변수(variable)
		// 데이터를 담아서 보관할 수 있는 공간을 의미함.
		// JAVA에서 변수는 반드시 선언한 뒤에 사용해야 합니다.
		// 변수, 메서드, 클래스의 이름을 식별자 라고 한다.
		// - 대문자와 소문자를 구분하고, 길이 제한이 없다. ex) Run, rUn, ruN 다 다르
		// - 문자와 숫자, 밑줄(_) 달러기호($)를 포함할 수 있다.
		//  문자는 영문자만 가리키는 것은 아니나 영문자 사용을 추천. 
		// _, $는 로컬 시스템에서 규칙이 있는 경우가 있기 때문에 부득이한 경우 아니면 사용 안함.
		// - 문자, 밑줄(_) 달러기호($) 로 시작할 수 있다. 숫자로 시작할 수 없음.
		// - 식별자에는 공백을 포함할 수 없다. ex)is child(x) -> isChild, is_child
		// - 키워드는 식별자로 사용하면 안됨.
		// - 키워드는 시스템 또는 자바에서 기본적으로 사용하고 있는 명령어나 변수들을 의미함...
		/*
		 * 키워드(keywords) : 주로 명령문들...
		 * abstract, continue, for, new, ...
		 */
		
		// 이름 규칙
		// - 클래스 이름/인터페이스 이름
		//  > 명사나 형용사를 서술적으로 연결해서 사용. 
		//  > 첫글자는 대문자로 표기한다.
		//  > 연결된 단어의 첫글자는 대문자로 표기한다.
		//  > 나머지는 소문자로 표기
		//  > $는 내부클래스에서 특별한 의미를 갖고 있기 때문에 사용을 권장하지 않음.
		// ex) CustomerManager
		
		// - 변수이름
		//  > 명사적 의미를 만들어 준다.
		//  > 첫글자는 소문자로, 연결되는 단어의 첫글자는 대문자로 표기
		//  > 나머지는 소문자로
		//  > 일반적으로 변수 이름에는 "_"를 사용하지 않는다.
		//  ex) customerName
		
		// - 메서드 이름
		//  > 동사적 의미를 갖게 작성한다.
		//  > 첫글자는 소문자, 연결되는 단어의 첫글자는 대문자로 표기
		//  > 나머지는 소문자로
		//  > 메서드 이름 뒤에는 한 쌍의 괄호"()"가 따라 붙는다.
		//  > 일반적으로 메서드 이름에는 "_" 를 사용하지 않는다.
		//  ex) insertCustomerData()
		
		int a = 10; //변수의 선언 : 데이터타입 변수명 = 초기화 값;
		String str = "Hello, World!!";
		
		System.out.println(a);
		System.out.println(str);
		
		
//		int a = 20; //같은 이름의 변수는 밑에서 다시 선언할 수 없다.
		a = 20; // 재사용은 가능함.
		// **int는 정수타입을 나타내는 키워드
		
		// 변수를 사용하는 이유
		// 1. 값을 일괄적으로 변경할 수 있게 하기 위해 ; 같은 값을 여러번 사용해야 하는 경우 편리함
		int k = 11;
		
		System.out.println("철수의 나이는 "+k+" 입니다.");
		System.out.println("철수의 몸무개도 마침 "+k+"kg 입니다.");
		System.out.println("철수의 친구가 마침 또 "+k+"명 입니다.");
		System.out.println("철수의 나이는 "+k+"입니다.");
		
		// 2. 값에 의미를 부여할 수 있다.(이 때문에 작명 규치이 중요함)
		int height = 180;
		int subject = 5;
		int old = 26;
		int wdight = 70;
		
		System.out.println("키 : "+ height);
		System.out.println("과목 : "+ subject);
		System.out.println("나이 : "+ old);
		System.out.println("몸무게 : "+ wdight);
		
		
		
		
		
		
	}

}
