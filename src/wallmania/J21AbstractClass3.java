package wallmania;

public class J21AbstractClass3 {
	
	public static void main(String[] args) { // 메인 클래스내의 메인 메소드
		// 서브클래스 객체생성 & 서브클래스의 상속받은 메소드 호출
		Rectangle r = new Rectangle(100, 200); 
		r.draw(); r.move(); r.getInfo();
		// 서브클래스 객체생성 & 서브클래스의 상속받은 메소드 호출
		Circle c = new Circle(200, 100); 
		c.draw(); c.move(); c.getInfo(); 
	}
	
}

// 추상클래스 (슈퍼클래스)
abstract class Shape { 
	int x, y;
	Shape(int x, int y) { 
		this.x = x; 
		this.y = y; 
		System.out.printf(">> Shape type의 class 생성 w/ param x(%d), y(%d)\n\n", x, y);
	}
	public abstract void move(); // 추상메소드
	public abstract void draw(); // 추상메소드
	public void getInfo() { System.out.printf("\n>> Shape's method getInfo() is executed --> x(%s), y(%s)\n\n", x, y); }
}

//서브클래스
class Rectangle extends Shape { 
	
	public Rectangle(int width, int height) { super(width, height); }
	
	@Override // 메소드 재정의
	public void draw() { System.out.println(">> Rectangle's method draw() is executed w/ param width and height"); }
	@Override // 메소드 재정의
	public void move() { System.out.println(">> Rectangle's method move() is executed w/ param width and height"); }
}

//서브클래스
class Circle extends Shape { 
	
	public Circle(int radius, int theta) { super(radius, theta); }
	
	@Override // 메소드 재정의
	public void draw() { System.out.println(">> Circle's method draw() is executed w/ param radius and theta"); }
	@Override // 메소드 재정의
	public void move() { System.out.println(">> Circle's method move() is executed w/ param radius and theta"); }
	
}