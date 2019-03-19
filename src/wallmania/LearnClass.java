package wallmania;

public class LearnClass {
	
	// 클래스 이름의 첫글자는 대문자로 한다. 
	
	// 멤버 변수 (속성)
	public String color; public String gear; public int price; 
	
	// 생성자. (클래스 이름과 동일한 이름을 가진 method)
	// 반환하는 내용이 없다. (원하는 color, gear, price 새로 설정해서 새로운 LearnClass 생성 가능.
	public LearnClass() { System.out.print("\nI am learning Java Class\n"); }
	
	// method (기능)
	public void run() { System.out.println("-- {내가 만든 객체 이름}.run() 하면 동작하는 method --"); }
	public void stop() { System.out.println("-- {내가 만든 객체 이름}.stop() 하면 동작하는 method --"); }
	public void info() {
		System.out.println("-- {내가 만든 객체 이름}.info() 하면 동작하는 method --");
		System.out.println(">> color(" + color + ") gear(" + gear + ") price(" + price + ")" + "\n");
	}
}
