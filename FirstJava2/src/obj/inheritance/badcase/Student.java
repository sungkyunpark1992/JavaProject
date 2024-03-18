package obj.inheritance.badcase;

public class Student {
	String name;
	int age;
	String studentId;
	String subject;

	public String getDetails() {
		return "[이름 : " +name+ "\t나이: "+ age + "\t학번: " + studentId 
				+ "\t과목: " + subject +"]";
	}
}
