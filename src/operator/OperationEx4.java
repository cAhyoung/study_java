package operator;

public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		// 조건식 연산자 -> 조건식 ? 결과1 : 결과2 -> 조건식이 참이면 결과1, 조건식이 거짓이면 결과2
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);

	}

}
