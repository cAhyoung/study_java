package variable;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10;  // int i = 10; 으로 컴파일
		var j = 10.0;  // double j = 10.0; 으로 컴파일
		var str = "hello";  // String str = "hello";로 컴파일
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		System.out.println(str);  // str으로 설정되었기에 다른 문자형을 할당하는 것은 불가

	}

}
