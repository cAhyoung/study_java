package variable;

public class CharacterEx3 {

	public static void main(String[] args) {
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		// char b2 = -66; -> 에러남!!
		
		System.out.println((char)a);
		System.out.println((char)b); 
		// 음수를 char로 변형해 출력하면 알수없는 문자이기에 ?로 출력 -> 유니코드에 음수 존재 X
		System.out.println(a2);

	}

}
