package variable;

public class ExplicitConversion {

	public static void main(String[] args) {
		// 바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우 
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;  // 형변환 후 연산, 형 변환 시 소수점 밑은 버림
		int iNum4 = (int)(dNum1 + fNum2); // 기존의 형대로 연산 후 정수형으로 변환
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	

	}

}
