
public class C00_ReferencPriExample {

	public static void main(String[] args) {
		// 참조형 객체 비교
		// String 문자열 비교
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println("str1과 str2의 비교결과 : "+(str1 == str2));
		//문자열이 아닌 객체는 해쉬코드가 다르다
		
		//new를 사용한 객체 비교
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println("str2과 str4의 비교결과 : "+(str3 == str4));
		
		//문자열 비고는 .equal()사용
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
		
		
	}

}
