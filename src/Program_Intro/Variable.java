package Program_Intro;

public class Variable {
	public static void main(String[] args) {
		int number = 3; 
		System.out.println("[1] 변수 선언.");
		System.out.println(">> number : " + number);
		System.out.println("");
		
		final double PI = 3.141592;
		int radius = 5; 
		double result = radius * 2 * PI;
		System.out.println("[2] 상수 선언.");
		System.out.printf(">> PI(%f), radiius(%d), result(%f)", PI, radius, result);
		System.out.println("");
	}

}
