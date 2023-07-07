package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;  // gameScore에서 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1);  // 151 -> gameScore값도 151로 변함
		
		int lastScore2 = --gameScore;  // gameScore에서 1만큼 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2);  // 150 -> gameScore가 151인 상태에서 1을 뺀 것임

	}

}
