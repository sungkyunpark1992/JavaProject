import java.util.Scanner;

public class B06_whileExample1 {
	public static void main(String[] args) {
		//while문..
		//for문보다 좀더 자유도가 높은 반복문
		// 왜? for문과 달리 while은 조건이 참인지 여부만 확인하기 때문
		//for문은 초기값;조건;증감값까지 따진다.
		
		/*
		 *(형식)
		 *while(condition){
		 *  조건이 참일 때에 실행할 명령문들...
		 * }
		 * 
		 */
		
		int i = 0;//시작값
		while(i<10) {  //조건
//			i++;//증감값의 위치에 따라 결과가 달라질 수 있다.
			System.out.println(i);
			i++;
		}
		
		// while의 무한 루프
		while(true) {
			System.out.println(i += 10000);
			if(i % 2000 ==0) 
				continue;
				if(i<0) //반복 종료 시점..
					break;
			
		}
		
		// do while 구문 : 거의 안씀
		// 반복할 때에 무조건 한번 이상 실행해야 하는 경우..
		
		i = 0;
		Scanner scan = new Scanner(System.in);
		
//		while((i=scan.nextInt())!=0){
//			System.out.println("i가 0이 아닙니다.");			
//		}
		
		do {
			System.out.println("> ");
			i = scan.nextInt();
			System.out.println("i=0이어도 일단 한번은 실행한다.");
		}while(i!=0);
			
		scan.close();	
	}
}
