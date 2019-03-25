package program.intro;

public class BasicType {
	public static void main(String[] args) {
		boolean isFun = true;
		char charValue = 'a';
		int intValue = 20;
		long longValue = 2147483648L;
		
		System.out.println("[1] 여러 Type의 변수 선언.");
		System.out.println(">> long type longValue를 출력할때 format을 %d로 지정해서 숫자만 출력됨.");
		System.out.printf(">> isFun(%b), charValue(%c), intValue(%d), longValue(%d)", isFun, charValue, intValue, longValue);
		System.out.println("");
		System.out.println(">> long type longValue를 출력할때 println으로 출력하면 위와 같은 결과 나옴.");
		System.out.println(">> longValue : " + longValue);
		System.out.println("");
	}
}
