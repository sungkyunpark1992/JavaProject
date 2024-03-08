package quiz;

public class Quiz_240308_PM {

	public static void main(String[] args) {
		// 1. 100부터 1까지 순서대로 출력
//		for(int i = 1; i<101; i++) {
//			System.out.printf("%d ",i);
//			if(i%10==0)
//				System.out.println();
//		}
		for(int i = 100; i>0; i--) {
			System.out.printf("%d ",i);
			if(i%10==0)
			System.out.println();
		}
		System.out.println();
		
		
		// 2. 1~200 사이의 수 중에서 2또는 3의 배수가 아닌 수들의 총 합을 구하시오
		//내 풀이
		int sum = 0;
		int multiple2 = 0;
		int multiple3 = 0;
		int multiple6 = 0;
		int result = 0;
		for(int i = 1; i<=200; i++) {
//			System.out.printf("%d ",i);
			sum += i;
			if(i%2==0) {
				multiple2 += i;
			}else if(i%3==0) {
				multiple3 += i;
			}else if(i%6==0) {
				multiple6 += i;
			}
		}
		result = sum - multiple2 - multiple3 + multiple6;
		System.out.println(result);
		//강사님 풀이
		int sum00 = 0;
		for(int i = 1; i<=200; i++) {
			if(!(i%2==0 || i%3==0)) {
				sum00 += i;
			}
		}
		System.out.println(sum00);
		
		// 3. 1 +(1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5) +...+ (1+2+3+...+10)
		//의 결과를 구하시오
		int sum01 = 0;
		int result01 = 0;
		for(int i = 1; i<=10; i++) {
			sum01 += i;
			result01 += sum01;
			
		}
		System.out.println(result01);
		//강사님 풀이
		int num=0;
		int num2=0;
		for(int i=0; i <=10; i++) {
			if(i!=1)System.out.print("+(");
			for(int j=1; j<= i; j++) {
				num += j;
				System.out.print("+");
			}
			System.out.println("\n반복문을 두개 사용하여 풀어본 결과 :"+num);
			
		}
	}

}
