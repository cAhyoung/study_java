package flow;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
			case 1: medalColor = 'G';
				break;  // break문이 없다면 해당되는 case여도 switch문을 빠져나오지 못해 default 값을 반환함
			case 2: medalColor = 'S';
				break;
			case 3: medalColor = 'B';
				break;
			default: medalColor = 'A';
			
		}
		System.out.println(ranking + "'s medal color is " + medalColor);

	}

}
