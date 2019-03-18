package wallmania;

public class LearnNormalSpecifier {
	public static void main(String[] args) {
		System.out.println("오늘의 기운은 10도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n", 10);
		System.out.printf("홍길동 정보 : %d학년-%d반-%d번.\n", 6, 2, 10);
		System.out.println("");
		
		int num1 = 20;
		System.out.printf("오늘 기온은 " + num1 + "도 입니다.\n");
		System.out.printf("오늘 기온은 %d도 입니다.\n", num1);
		System.out.println("");
		
		int num2 = 30;
		System.out.printf("num2(10진수) : %d\n", num2);
		System.out.printf("num2(8진수) : %o\n", num2);
		System.out.printf("num2(16진수) : %x\n", num2);
		System.out.println("");
		
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'a', 'B');
		System.out.printf("\'%s\'를 대문자로 바꾸면 \'%s\'입니다.\n", "java", "JAVA");
		System.out.println("");
		
		float f=1.23f; System.out.printf("f = %f\n", f);
		double d=1.23456d; System.out.printf("d = %f\n", d);
	}

}
