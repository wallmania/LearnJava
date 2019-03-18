package wallmania;

public class LearnClass2 {
	
	public String color;
	public int price;
	
	public LearnClass2() {
		System.out.println("LearnClass2 - Type 1 -");
	}
	
	public LearnClass2(String c, int p) {
		System.out.println("LearnClass2 - Type 2 -");
		color = c;
		price = p;
	}
	
	public void info() {
		System.out.println("-- Info --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
		
	}

}
