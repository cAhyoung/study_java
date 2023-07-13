package classpart;  // 패키지가 다르면 클래스 명이 같아도 다른 클래스임

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();  // 인스턴스 생성하기 
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
