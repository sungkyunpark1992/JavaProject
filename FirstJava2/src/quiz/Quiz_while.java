package quiz;

public class Quiz_while {

	public static void main(String[] args) {
		// while문을 이용하여
		//구구단을 다음과 같이 세로로 출력해 주세요
		
		//예제2) 구구단 출력하기
//		for(int y = 0; y<10; y++) {
//			for(int x = 2; x <10; x++) {
//				if(y==0) System.out.print(x+"단 \t");
//				else System.out.print(x+"x" +y+"="+(x*y)+ "\t");
//			}
//			System.out.println();
//		}
		int i = 1;
		int j = 1;
		
		while(j<10) {
			j++;
			
			while(i<9) {
				i++;
				
				if(j==2) System.out.print(i+"단 \t");	
				else System.out.print(i+"x" +j+"="+(i*j)+ "\t");
				
				
			if(i>9) {
				break;
			}
			
			}
			
			if(j>9) {
				break;
			}

			System.out.println();
		}
		
		
		int gop = 0;
		
		while(gop<=9) {
			int dan = 2; // **반복시 원래의 2로 돌아와야 한다.
			
			while(dan<=9){
				if(gop==0) {
					System.out.print(dan + "단 \t");
				}else {
					System.out.printf("%dx%d=%d\t",dan,gop, dan*gop);
				}
				
				dan++;
			}
			System.out.println();
			gop++;
			
		}

	}

}
