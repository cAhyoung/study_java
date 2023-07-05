package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
		// 형 변환 시 바이트크기가 작은 형에서 큰 형으로는 변환 가능
		// 묵시적 변환
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		
		System.out.println(dNum);
	}

}
