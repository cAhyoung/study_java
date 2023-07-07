package operator;

public class OperatioinEx5 {

	public static void main(String[] args) {
		int num = 0B00000101;
		
		System.out.println(num << 2);  // 왼쪽으로 2비트 이동
		System.out.println(num >> 2);  // 오른쪽으로 2비트 이동
		System.out.println(num >>> 2);  // 오른쪽으로 2비트 이동, 왼쪽에 채워지는 비트는 부호와 상관없이 무조건 0으로
		
		System.out.println(num);
		
		num = num << 2;
		
		System.out.println(num);

	}

}
