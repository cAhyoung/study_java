package flow;

public class WhileEx1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {  // 무한루프에 빠지지 않도록 주의해야 함
			sum += num;
			num++;
		}
		
		System.out.println("reseult of sum 1~10 is " + sum);

	}

}
