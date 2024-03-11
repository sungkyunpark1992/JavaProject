package quiz;

public class Quiz_star2_240311 {

	public static void main(String[] args) {
		// 피라미드 찍기
		/*
		 *  #1      *			#2   *********
		 *  	   ***				  *******
		 *  	  *****                *****
		 *  	 *******				***
		 *      *********				 *
		 */
		// #1
//		int dan =5;
//		int total = 9;
//		int left=0;
//		int rigt=0;
//		int space=0;
//		
//		for(int i=0;i<dan;i++) {
//			space = total-(i*2);
//			
//			if(left<5) {
//				for(int j = 0; j<5;j++) {
//					System.out.print("0");
//				}
//			}else if(rigt>0){
//				System.out.print("0");				
//			}
//			else {
//				for(total=0;total<10;total++) {
//					System.out.print("*");
//				}
//				}
//			System.out.println();
//		}
		
		//강사님 풀이
		int dan = 5;
		for(int i=0; i<dan;i++) {
			//space출력
			for(int j=0; j<dan -i -1; j++) {
				System.out.print("0");
			}
			//별찍기
			for(int j=0; j<i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();		
		
		//#2
		for(int i=0; i<dan;i++) {
			//space출력
			for(int j=0; j<i; j++) {
				System.out.print("0");
			}
			//별찍기
			for(int j=0; j<2*dan -(2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		}
}


