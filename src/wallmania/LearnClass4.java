package wallmania;

public class LearnClass4 {
	public int x1; public int y1; public int x2; public int y2;
	
	public LearnClass4(String s, int[] iArr) {
		System.out.println("-- LearnClass4 Type의 객체 생성됨. w/ param(String s, int[] iArr) --");
		System.out.println("s : " + s); System.out.println("iArr : " + iArr);
	}
	
	// this.x1에서 x1은 LearnClass4에서의 x1 != 매개변수 x1
	// this.y1에서 y1은 LearnClass4에서의 y1 != 매개변수 y1
	public LearnClass4(int x1, int y1) {
		System.out.println("-- LearnClass4 Type의 객체 생성됨. w/ param(int x1, int y1) --");
		this.x1 = x1; this.y1 = y1;
	}
	
	public void getInfo() {
		System.out.println(">> x1(" + x1 + ") y1(" + y1 + ") x2(" + x2 + ") y2(" + y2 + ")");
	}
}


