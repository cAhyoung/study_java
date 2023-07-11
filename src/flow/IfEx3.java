package flow;

public class IfEx3 {

	public static void main(String[] args) {
		int age = 9;
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("Before going to school");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("Elementary school student");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("middle or high school student");
		}
		else {
			charge = 3000;
			System.out.println("general");
		}
		
		System.out.println("entry fee is " + charge);

	}

}
