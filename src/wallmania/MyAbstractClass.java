package wallmania;

public class MyAbstractClass {
	public static void main(String[] args) { // 메인 클래스내의 메인 메소드
		Rectangle r = new Rectangle(); // 서브클래스 객체생성
		Circle c = new Circle(); // 서브클래스 객체생성
		r.draw(); // 서브클래스의 상속받은 메소드 호출
		c.draw(); // 서브클래스의 상속받은 메소드 호출
	}
}
abstract class Shape { // 추상클래스 (슈퍼클래스)
	int x, y;
	public void move(int x, int y){
		this.x=x;
		this.y=y;
	}
	public abstract void draw(); // 추상메소드
}

class Rectangle extends Shape { // 서브클래스
	int width,height;
	public void draw() { // 메소드 재정의
		System.out.println("사각형 그리기 메소드");
	}
}

class Circle extends Shape { // 서브클래스
	int radius;
	public void draw() { // 메소드 재정의
		System.out.println("원그리기메소드");
	}
}