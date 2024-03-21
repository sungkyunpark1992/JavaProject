import java.io.File;
import java.io.IOException;

public class F01_fileEx {

	static String env_path = "C:\\Program Files\\Amazon Corretto\\jdk17.0.10_7\\bin;C:\\Program Files\\Amazon Corretto\\jdk17.0.10_7bin;C:\\Program Files￦Java￦jdk-17.0.7.7-hotspot\\bin;%;ystemRoot%\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Windows\\System32\\OpenSSH\\;C:\\Program Files\\Bandizip\\;C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin;C:\\Program Files\\dotnet\\;C:\\Program Files\\Docker\\Docker\\resources\\bin;C:\\Program Files\\Git\\cmd;C:\\Users\\qkrtj\\AppData\\Local\\Programs\\Python\\Python38\\Scripts\\;C:\\Users\\qkrtj\\AppData\\Local\\Programs\\Python\\Python38\\;C:\\Users\\qkrtj\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Users\\qkrtj\\AppData\\Local\\Programs\\Microsoft VS Code\\bin;C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2023.1.2\\bin;C:\\Program Files\\JetBrains\\IntelliJ IDEA 2023.1.3\\bin";
	
	public static void main(String[] args) {
		
		//File 객체는 파일과 디렉터리 작업을 위해서 사용하는 객체
		File f = new File("C:/FileTest/a.txt");//절대경로
		File dir = new File("./");	// 상대경로  ./의 의미 : 현재 작업위치, . : 현재 디렉터리,  .. : 상위 디렉터리 
		
		// 1. exists() : 파일 혹은 디렉터리 존재 유무 확인
		System.out.println("exists? : " + f.exists());
		System.out.println("exists? : " + dir.exists());
		
		// 2. isDirectory() : 디렉토리 여부 확인 (파일이면 false)
		System.out.println("isDirectory? : " + f.isDirectory());
		System.out.println("isDirectory? : " + dir.isDirectory());
		
		// 3. isAbsolute() : 해당 경로가 절대 경로인지 아닌지 확인
		System.out.println("isAbsolute? : " +f.isAbsolute());
		System.out.println("isAbsolute? : " +dir.isAbsolute());
		
		// 4. canEscute, canRead, canWrite : 권한 확인
		System.out.println("isAbsolute? : " +f.canExecute());
		System.out.println("isAbsolute? : " +f.canRead());
		System.out.println("isAbsolute? : " +f.canWrite());
		
		// 5. getAbsolutePath : 절대 경로 반환(상대경로의 절대경로를 찾아준다)
		System.out.println("./의 실제 위치(절대 경로) : " +dir.getAbsolutePath());//깃 저장소의 절대 경로
		
		// 6. 부모 폴더를 문자열로 반환
		System.out.println(f.getParent());	// 문자열
		
		// 7. 부모 폴더를 File 객체로 반환
		File f_parent = f.getParentFile();	// File 객체
		System.out.println(f_parent);
		
		// 8. static 값들..
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		
		// 환경 변수
		String[] path = env_path.split(File.pathSeparator);
		
		for(String p : path) {
			System.out.println(p);
		}
		
		// 파일에 대한 생성/수정/삭제 메서드
		File test = new File("C:\\FileTest\\temp\\abc");
		// mkdir : 해당 경로에 폴더 생성. 단, 경로상 빠진 부분이 없어야 함
		// mkdirs : 존재하지 않는 부모 폴더까지 모두 포함하여 폴더를 생성
		
		if(!test.exists()) {	//파일 폴더가 존재하지 않는 경우
			test.mkdirs();
		}
		
		// createNewFile() : 파일이 없으면 새로 생성
		test = new File("C:\\FileTest\\temp\\a.txt");
		try {
			test.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 생성 중 에러가 발생하였습니다.");
		}
		// delete : 파일 혹은 폴더를 삭제한다. 단, 폴더는 비어있지 않으면 삭제할 수 없다.
		test = new File("C:/FileTest/temp/abc");
		test.delete();
//		test = new File("C:/FileTest/temp/a.txt");
//		test.delete();
//		test = new File("C:/FileTest/temp");
//		test.delete();
		
		// renameTo : 파일이나 폴더의 이름 및 경로를 변경한다.
		test = new File("C:/FileTest/temp");
		File dst = new File("C:/FileTest/temp222");
		test.renameTo(dst);
		
		
		
	}

}
