package d;
import java.io.FileInputStream;
import java.io.IOException;

public class D08_autoResorceManagerEx {

	public static void main(String[] args) {
		// 파일 입출력
		// 자동으로 자원을 릴리즈
		try (FileInputStream in = new FileInputStream("a.txt")){
			System.out.println("read data : " + in.read());
			
		} catch (NullPointerException | IOException ex) {
//			System.out.println(in);	//in 변수 참조x
			System.out.println("예외처리 합니다.");
			System.out.println(ex.toString());
		}

		// 직접 자원에 대해서 제어
		FileInputStream in2 = null;
		try {
			in2 = new FileInputStream("a.txt");
			System.out.println("read data : " + in2.read());
		} catch (NullPointerException ex) {
			System.out.println("예외처리 합니다.");
			System.out.println(ex.toString());
		} catch (Exception ie) {
			System.out.println(in2);
			System.out.println("예외처리 합니다.");
			System.out.println(ie.toString());
		}finally {
			try {in2.close();} catch (IOException ie) {}
		}
	}

}
