package day1.week3.assignment;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student-Id: "+id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student-Id :"+id+"\nStudent-Name: "+name);

	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student-email:"+email+"\nStudent-PhoneNumber: "+phoneNumber);

	}
	
	public static void main(String[] args) {
		
		Students st = new Students();
		st.getStudentInfo(10012);
		st.getStudentInfo(200212, "sai");
		st.getStudentInfo("abcdfgh@gmail.com", 123456789);
	}

}
