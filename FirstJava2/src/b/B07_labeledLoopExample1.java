package b;

public class B07_labeledLoopExample1 {

	public static void main(String[] args) {
		// Labeled Loop
		//루프 앞에 이름을 지정 후 ":"를 사용..
		//특정 루프문에 대한 제어를 하고 싶을때 이름을 지정해서 사용한다.
		outer: for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if(j == 2) {
//					break outer; //레이블이 outer인 반복문을 종료..
//					continue outer; //break뿐 아니라 continue도 지정 가능하다.
				}//부모프로세스가 죽었는데 자식프로세스가 동작하는경우를 좀비프로세스라고한다.(위의예제는 해당사항없음)
				System.out.println(i+"\t"+j);
			}
		}

	}

}
