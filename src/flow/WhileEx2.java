package flow;

public class WhileEx2 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 50) {
			sum += num;
			num++;
		}
		System.out.println("result of sum 1~50 is " + sum);

	}

}
