package program.intro;

public interface Calculator {
	
	public String plus(int i, int j);
	public String minus(int i, int j);
	public String multiple(int i, int j);
	
	// default method 
	// Interface(Calculator)를 구현하는 Class가 해당 method를 구현하지 않아도 된다. 
	default String divide1(int i, int j) {
		return ">> default method is executed : " + (i%j);
	}
	
	// static method 
	// 인터페이스에 static 메소드를 선언함으로써, 인터페이스를 이용하여 간단한 기능을 가지는 유틸리티성 인터페이스를 만들 수 있게 되었다.
	// Interface(Calculator)를 구현하는 Class가 해당 method를 구현하지 않아도 된다.
	public static String divide2(int i, int j) {
		return ">> static method is executed : " + (i%j);
	}
}
