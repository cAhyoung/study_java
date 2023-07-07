package operator;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		// double은 float보다 정밀하게 사용할 수 있어 이를 주로 사용함
		double avgScore = totalScore / 2.0;
		System.out.println(avgScore);
	}

}
