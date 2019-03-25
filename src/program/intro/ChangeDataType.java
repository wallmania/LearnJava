package program.intro;

public class ChangeDataType {
	public static void main(String[] args) {
		
		System.out.println("[1] 크기가 작은 타입을 크기가 더 큰 타입으로 바꿀 때는 컴파일러에 별도의 명령을 하지 않아도 됩니다.");
		int intValue1 = 200; long longValue1 = intValue1;
		System.out.printf(">> int intValue1 = 200; long longValue1 = intValue1"); System.out.println("");
		System.out.printf(">> int(%d) --> long(%d)", intValue1, longValue1);  System.out.println("");
		
		System.out.println("");
		
		System.out.println("[2] 크기가 더 큰 타입을 작은 타입으로 바꿀 때는 명시적으로 변환해주어야 합니다.");
		int intValue2 = 200; long longValue2 = intValue2;  
        intValue2 = (int) longValue2;
        System.out.printf(">> int intValue2 = 200; long longValue2 = intValue2"); System.out.println("");
        System.out.printf(">> intValue2 = (int) longValue2"); System.out.println("");
        System.out.printf(">> int(%d) --> long(%d)", intValue2, longValue2); System.out.println("");
    }
}
