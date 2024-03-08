package quiz;

public class Quiz02 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		String phone = "010-1234-1234";
		float tall = 178.5f;
		int w = 75;
		char blood = 'O';
		
		System.out.println("========= 출력 결과 =========");
		System.out.printf("이름 : %s \n", name);
		System.out.printf("나이 : %d \n", age);
		System.out.printf("Tel : %s \n", phone);
		System.out.printf("키 : %.1f \n", tall);
		System.out.printf("몸무게 : %d \n", w);
		System.out.printf("혈액형 : %c \n", blood);
		
	}

}
