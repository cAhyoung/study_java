package flow;

public class SwitchCase2 {

	public static void main(String[] args) {
		String medal = "Gold";
		
		switch (medal) {
		case "Gold": 
			System.out.println("Gold");
			break;
		case "Silver":
			System.out.println("Silver");
			break;
		case "Bronze":
			System.out.println("Bronze");
			break;
		default: 
			System.out.println("No medal");
			break;
		}

	}

}
