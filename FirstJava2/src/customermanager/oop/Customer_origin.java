package customermanager.oop;

import java.util.Objects;

public class Customer_origin {	//240319 업그레이드 이전버전
	
	//멤버변수(속성)
	private String name;
	private String gender;
	private String email;
	private int birthYear;
	
	public Customer_origin() {  }   //기본 생성자

	public Customer_origin(String name, String gender, String email, int birthYear) {  //필드 생성자
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}

	// Getter, Setter
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + 
				", birthYear=" + birthYear + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthYear, email, gender, name);
	}

	// equals()를 Override하여 비교할 수 있게 만들어 보세요!
	@Override
	public boolean equals(Object obj) {
		//동일객체 확인
		if (this == obj) {
			return true;
		}
		//null값 확인
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Customer_origin other = (Customer_origin) obj;
		if(name==null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) return false;
		if(!gender.equals(other.gender)) return false;
		if(!email.equals(other.email)) return false;
		if(!(birthYear == other.birthYear)) return false;

		return true;
	}

	
	
	
	

}