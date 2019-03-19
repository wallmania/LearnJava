package wallmania;

public class LearnLogicOperation {
	public static void main(String[] args) {

		// 기본 논리 연산자
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2 : " + (b1 && b2));
		System.out.println("b1 || b2 : " + (b1 || b2));
		System.out.println("!b1 : " + !b1);
		System.out.println("!b2 : " + !b2);
		System.out.println("");
		
		// 비교 후 결과 (A or B)
		int x = 10; int y = 20; 
		int result = 0;
		result = (x > y) ? 100 : 200; System.out.println("result = " + result);
		result = (x < y) ? 100 : 200; System.out.println("result = " + result);
		result = (x == y) ? 100 : 200; System.out.println("result = " + result);
		System.out.println("");
		
		// 비트 연산자 
		x = 2; y = 3;
		System.out.println("x & y : " + (x & y)); // 두 비트가 모두 1이면 1 아니면 0
		System.out.println("x | y : " + (x | y)); // 두 비트 중 하나라도 1이면 1 아니면 0
		System.out.println("x ^ y : " + (x ^ y)); // 두 비트가 같으면 0 아니면 1 (XOR)	
	}
}
