package flow;

public class ContinueEx {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0)
				continue;
			total += num;
		}
		System.out.println("result of sum of odd number from 1~100 is " + total);

	}

}
