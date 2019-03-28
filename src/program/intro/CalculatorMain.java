package program.intro;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		System.out.println("\n$ Interface 예제 결과.\n");
		
		Calculator cal1 = new CalculatorEx1();
		System.out.println(cal1.plus(3, 4));
		System.out.println(cal1.minus(3, 4));
		System.out.println(cal1.multiple(3, 4));
		System.out.println(cal1.divide1(3, 4));
		System.out.println(Calculator.divide2(3, 4) + "\n");
		
		Calculator cal2 = new CalculatorEx2();
		System.out.println(cal2.plus(3, 4));
		System.out.println(cal2.minus(3, 4));
		System.out.println(cal2.multiple(3, 4));
		System.out.println(cal2.divide1(3, 4));
		System.out.println(Calculator.divide2(3, 4) + "\n");
		
	}

}
