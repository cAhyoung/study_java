package flow;

public class BreakEx2 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for (num = 0; ; num++) {
			sum += num;
			if(sum >= 100)  // 계산 후 조건 확인
				break;
		}
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);

	}

}
