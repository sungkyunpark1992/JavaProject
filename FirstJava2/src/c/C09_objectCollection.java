package c;
import obj.inheritance.Person;
import obj.inheritance.goodcase.Student;

public class C09_objectCollection {

	public static void main(String[] args) {
		// Object 객체 배열 선언
		Object[] objArr = new Object[5];
		//object는 최상위 클래스라 아무거나 다 넣을 수 있다. 그래서 코드의 안정성이 떨어지는데 이를 해결하기 위해 제너릭이 나옴
		
		objArr[0] = new Person("홍길동",30);
		objArr[1] = new Student("홍학생", 17, "20240315", "Java");
		objArr[2] = new Integer(100);
		objArr[3] = new String("홍길동");
		objArr[4] = new java.util.Date();
		
		for(int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i]);
		}
		
	}

}
