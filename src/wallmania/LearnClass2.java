package wallmania;

public class LearnClass2 {
	
	public String color;
	public int price;
	
	public LearnClass2() { System.out.print("\n"); System.out.println("LearnClass2 - Type 1 -"); }
	
	public LearnClass2(String c, int p) {
		System.out.print("\n");
		System.out.println("LearnClass2 - Type 2 -");
		color = c; price = p;
	}
	
	public void setInfo(String c, int p) {
		System.out.print("\n");
		System.out.println("-- setInfo executed --");
		color = c; price = p;
	}
	
	public void info() {
		System.out.print("\n");
		System.out.println("-- Info --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
	
	// overloading (중복. method)
	// method 이름이 같아도 매개변수 다르면 ok 
	// method 이름 같은데 매개변수도 같으면 동작 X
	public void getInfo() { 
		System.out.print("\n");
		System.out.println("getInfo - Type 1 -"); 
	}
	public void getInfo(int x, int y) { 
		System.out.print("\n");
		System.out.printf("getInfo - Type 2 - w/ parameter --> x : %d, y : %d\n", x, y);
	}
	public void getInfo(String s1, String s2) { 
		System.out.print("\n");
		System.out.printf("getInfo - Type 3 - w/ parameter --> s1 : %s, s2 : %s\n", s1, s2);
	}
	
	// private으로 선언한 method는 외부에서 접근할 수 X
	private void getInfo_Private() {
		System.out.print("\n");
		System.out.print("This is private method");
	}

}
