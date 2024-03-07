package quiz;

public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=================");
		System.out.println("       /)/)      ");
		System.out.println("      (  ..)     ");
		System.out.println("      (  >♡      ");
		System.out.println("Have a Good Time.");
		System.err.println("=================");// .err로 하면 빨강색으로 나온다; 표준입출력
		System.out.println();
		
		System.out.println("            ###회비 정보###                     ");
		System.out.println("=============================================");
		System.out.println("이름       나이     전화번호           회비");
		System.out.println("홍길동      \"15\"   010-123-1234     ₩20,000");
		System.out.println("임꺽정      \"20\"   010-234-2345     ₩30,000");
		System.out.println("김말이      \"28\"   010-345-3456     ₩50,000");
		System.out.println("---------------------------------------------");
		System.out.println("총합계                              ₩100,000");
		System.out.println("=============================================");
		
		System.out.println("당신은 놀이공원을 가기 위해 11개의 지하철 역을 지나왔다.");
		System.out.println("출발 역에서 도착역까지 37분이 걸렸다면");
		System.out.println("한 역을 지나는데 걸리는 시간은 얼마인가?");
		System.out.println("(소수점 2자리까지 출력)");
		float a = 11.0f;
		float b = 37.0f;
		float c = b/a;
		double result = (int)((b/a)*100)/100.0;
		System.out.println(c);
		System.out.println(result);		
		
		
	}

}
