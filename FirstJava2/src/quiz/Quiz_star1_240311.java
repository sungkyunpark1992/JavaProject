package quiz;

public class Quiz_star1_240311 {

	public static void main(String[] args) {
		// for문을 이용하여 다음과 같이 별찍기를 진행.. 4가지
		/*
	     1)*     2)***** 3)    * 4)*****   
	       **       ****      **    ****
	       ***       ***     ***     ***
	       ****       **    ****      **
	       *****  	   *   *****       *
	    */
//		System.out.println("1번");
//		for(int y=0;y<=5;y++) {
//			for(int x=0;x<=5;x++) {
//				if(x<=y) {
//				System.out.print("*");
//				}else if(x>y){
//				System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
//		
//		System.out.println("2번");
//		for(int y=0;y<=5;y++) {
//			for(int x=0;x<=5;x++) {
//				if(x>=y) {
//				System.out.print("*");
//				}else if(x<y){
//				System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
//		/*
//	     1)*     2)***** 3)    * 4)*****   
//	       **       ****      **    ****
//	       ***       ***     ***     ***
//	       ****       **    ****      **
//	       *****  	   *   *****       *
//	    */
//		System.out.println("3번");
//		for(int y=0;y<=5;y++) {
//			for(int x=0;x<=5;x++) {
//				if(x>y) {
//				System.out.print("0");
//				}else if(x<y){
//				System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		
//		System.out.println("4번");
//		for(int y=0;y<=5;y++) {
//			for(int x=0;x<=5;x++) {
//				if(x>=y) {
//				System.out.print("*");
//				}else if(x<y){
//				System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
		
		//강사님 풀이
		/*
		 1)에서 찍힌 *의 영역은 상위 for문의 영역이다.
		 
	     1)*     2)***** 3)    * 4)*****   
	       **       ****      **    ****
	       ***       ***     ***     ***
	       ****       **    ****      **
	       *****  	   *   *****       *
	    */
		// #1
		int dan = 5;
		System.out.println("1번");
		for(int i = 0; i<dan; i++) {
			for(int j = 0; j< i+1; j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈..
		}
		System.out.println();//줄바꿈..
		// #2
		System.out.println("2번");
		for(int i = 0; i<dan; i++) {
			for(int j = 0; j< dan-i; j++) {
//			for(int j = dan; j>0; j--) {//이런방식도 해볼 것
				System.out.print("*");
			}
			System.out.println();//줄바꿈..
		}
		System.out.println();//줄바꿈..
		
		// #3
		System.out.println("3번");
		for(int i = 0; i<dan; i++) {
			//space찍기..
			
			for(int j=0; j<dan-i-1; j++) {
			//*찍기
				System.out.print(" ");
			}
			for(int j = 0; j< i+1; j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈..
		}
		
		System.out.println();//줄바꿈..
		
		// #4번
		System.out.println("4번");
		
		for(int i = 0; i < dan ;i++) {
			//여백찍기
			for(int j=0; j < i ; j++)
				System.out.print(" ");
			
			//별찍기
			for(int j=0; j<dan-i;j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈..
		}

	}

}
