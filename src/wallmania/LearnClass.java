package wallmania;

public class LearnClass {
	
	// 클래스 이름의 첫글자는 대문자로 한다. 
	
	// 멤버 변수 (속성)
	public String color;
	public String gear;
	public int price; 
	
	// 생성자. (클래스 이름과 동일한 이름을 가진 method)
	// 반환하는 내용이 없다. (원하는 color, gear, price 새로 설정해서 새로운 LearnClass 생성 가
	public LearnClass() {
		System.out.println("I am learning Java Class");
		System.out.print("\n");
	}
	
	// method (기능)
	public void run() { System.out.println("--run--"); System.out.print("\n"); }
	
	// method (기능)
	public void stop() { System.out.println("--stop--"); System.out.print("\n"); }
	
	// method (기능)
	public void info() {
		System.out.println("-- info --");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}

}
