package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfo() {  // 메소드
		System.out.println(studentName + ", " + address);
		}
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {  // 프로그램 시작을 위해 호출하는 함수, 클래스의 메소드는 아님!! 
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
	}
}
