package obj.inheritance.badcase;

public class Employee {
	String name;
	int age;
	String companyId;
	String subject;
	
	public String getDetails() {
		return "[이름 : " +name+ "\t나이: "+ age + "\t사번: " + companyId
				+ "\t과목: " + subject +"]";
	}
}
