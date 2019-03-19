package wallmania;

public class LearnClass2 {
	
	public String color; public int price;
	
	public LearnClass2() { System.out.print("\n"); System.out.println("LearnClass2 Type의 객체 생성됨 (Type 1) -"); }
	public LearnClass2(String c, int p) { System.out.println("LearnClass2 Type의 객체 생성됨 (Type 2) -"); color = c; price = p; }
	
	public void setInfo(String c, int p) { System.out.println("-- {내가 만든 객체 이름}.setInfo() executed --"); color = c; price = p; }
	public void info() { System.out.println("-- {내가 만든 객체 이름}.info() 하면 동작하는 method --\n" + ">> color(" + color + ") " + "price(" + price + ")"); }
	
	// overloading (중복. method) : method 이름이 같아도 매개변수 다르면 ok & method 이름 같은데 매개변수도 같으면 동작 X
	public void getInfo() {  System.out.println("- overloading(Type 1) : getInfo() -"); }
	public void getInfo(int x, int y) { System.out.printf("- overloading(Type 2) : getInfo() w/ param (x : %d, y : %d) -\n", x, y); }
	public void getInfo(String s1, String s2) { System.out.printf("- overloading(Type 3) : getInfo() w/ param (s1 : %s, s2 : %s) -\n", s1, s2); }
	
	// public 으로 선언한 변수나 method : 외부에서 접근 가능.  
	// private으로 선언한 변수나 method : 외부에서 접근 불가능.
	private void getInfo_Private() { System.out.print("\n" + "This is private method"); }
}
