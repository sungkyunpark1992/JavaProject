package quiz;

import java.util.Scanner;

public class Quiz_240308_AM {

	public static void main(String[] args) {
		// quiz-1 
		// 1 ~ 101 미만의 임의의 정수를 생성하고, 그 숫자가 짝수인지 홀수인지 출력하세요. (3항 연산식을 사용)
//		int num = (int)(Math.random()*101)+1; 
//		String isNum = num%2==0 ? "짝수":"홀수";
//		System.out.println("랜덤 수 : " +num);
//		System.out.println("3항 연산의 결과 : " +(num%2==0 ? "짝수":"홀수"));
////		if(num%2==0) {
////		System.out.println("짝수");
////		}else {
////		System.out.println("홀수");
////		}
		
		
		// quiz-2
		// -5 ~ 5 사이의 임의의 정수를 생성하고, 3항연산식을 사용하여 절댓값을 출력하세요
//		int num2 = 5 - (int)(Math.random()*11);
//		System.out.println("랜덤수는 : " +num2);		
//		int abs = (num2 >= 0 ? num2 : -num2);
//		System.out.println(num2+"의 절대값은 :"+abs);
		
		int or01 = (int)(Math.random()*2);
//		System.out.println("or01 : " +or01);
		int ornum = or01==0 ? -1 : 1;
		int num00 = (int)(Math.random()*6);
		int ranNum = num00 * ornum;
		System.out.println("임의의수 : " +ranNum);		
		System.out.println("절댓값 : " +num00);
		
		// quiz-3
		// 정수를 입력받아 그 수가 짝수인지 홀수인지 출력하는 프로그램을 작성하세요 ; 3항연산식을 사용하세요
		Scanner scan = new Scanner(System.in);
		int num01 = scan.nextInt();
		String result = num01%2==0 ? "짝수" : "홀수";
		System.out.println("사용자가 입력한 정수 : " +num01+ "는"+result);
		
//		if(num01%2==0) {
//			System.out.println("짝수");
//			}else {
//			System.out.println("홀수");
//			}
		
		// quiz-4
		// 키와 나이를 입력받아서 놀이기구에 탑승여부를 결정하는 프로그램을 작성하세요.
		// 조건 : 키-140이상 나이-8살 이상
//		int tall = scan.nextInt();
//		System.out.println("사용자가 입력한 키 : " +tall);
//		int age = scan.nextInt();
//		System.out.println("사용자가 입력한 키 : " +age);		
//		if(tall>140 && age>8) {
//			System.out.println("놀이기구 탑승 가능");
//		}else {
//			System.out.println("놀이기구 탑승 불가능");
//		}
		
		// quiz-5
		// 정수 두개를 입력받아서 큰 수 출력, 같은 경우에는 같다고 출력하는 프로그램을 작성
//		int num02 = scan.nextInt();
//		int num03 = scan.nextInt();
//		if(num02>num03) {
//			System.out.println("num02가 더 큽니다! "+num02);
//		}else if(num02<num03) {
//			System.out.println("num03가 더 큽니다! "+num03);
//		}else {
//			System.out.println("num02와 num03이 같습니다.");
//		}		
		
		// quiz-6
		// 정수를 입력받아서 양의 정수인 경우에는 짝수, 홀수를 구분하고, 0이면 0입니다.를 출력
		// 음수인 경우에는 음의 정수입니다를 출력하는 프로그램을 작성하세요.
		int num04 = scan.nextInt();
		if(num04>0) {
			System.out.println(num04%2==0 ? "짝수":"홀수");
		}
		else if(num04==0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음의 정수입니다.");			
		}
		
		
		
		// quiz-7
		// switch를 사용하여 구매할 수박, 사과, 멜론, 포도, 귤을 구매시 가격을 출력하는 프로그램을 작성하시오.
		
//		System.out.println("구매할 상품을 고르시오.");	
//		String fruit = scan.nextLine();
//		switch(fruit) {
//		case "수박": 
//			System.out.println("수박 가격 3,000원");
//			break;
//		case "사과":
//			System.out.println("사과 가격 2,000원");
//			break;
//		case "멜론":
//			System.out.println("멜론 가격 1,000원");
//			break;
//		case "포도":
//			System.out.println("포도 가격 1,500원");
//			break;
//		case "귤":
//			System.out.println("귤 가격 500원");
//			break;
//		default:
//			System.out.println("판매하지 않는 상품 입니다.");
//			break;
//		};	
		scan.close();
		//메모리에 할당 되어있는 것을 해제하는 것; 동적 할당
	}
}