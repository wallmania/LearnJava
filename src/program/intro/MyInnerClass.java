package program.intro;

public class MyInnerClass {
	
	// 내부 클래스란 클래스 안에 선언된 클래스
	// 어느 위치에 선언하느냐에 따라서 4가지 형태가 있을 수 있다.
	
	class InnerExam1 {
		String value = "클래스 안에 인스턴스 변수, 즉 필드를 선언하는 위치에 선언되는 경우. 보통 중첩클래스 혹은 인스턴스 클래스라고 한다.";
		public String plus() { return ">> [InnerClass Type1] \n>> " + value + "\n"; }
	}
	
	static class InnerExam2 {
		String value = "내부 클래스가 STATIC으로 정의된 경우, 정적 중첩 클래스 또는 STATIC 클래스라고 한다.";
		public String plus() { return ">> [InnerClass Type2] \n>> " + value + "\n"; }
	}
	
	public void exec() {
		class InnerExam3{
			String value = "메소드 안에 클래스를 선언한 경우, 지역 중첩 클래스 또는 지역 클래스라고 한다.";
			public String plus() { return ">> [InnerClass Type3] \n>> " + value + "\n"; }
		}
		InnerExam3 innerExam3 = new InnerExam3();
		System.out.println(innerExam3.plus()); 
	}
	
	public static void main(String[] args) {
		
		MyInnerClass myInnerClass1 = new MyInnerClass();
		MyInnerClass.InnerExam1 innerExam1 = myInnerClass1.new InnerExam1();
		System.out.println(innerExam1.plus());
		
		MyInnerClass.InnerExam2 innerExam2 = new MyInnerClass.InnerExam2();
		System.out.println(innerExam2.plus());
		
		// MyInnerClass myInnerClass1 = new MyInnerClass();
		myInnerClass1.exec();
		
		// 생성자 다음에 중괄호 열고 닫고가 나오면, 해당 생성자 이름에 해당하는 클래스를 상속받는 이름없는 객체를 만든다는 것을 뜻한다.
		// 괄호 안에는 메소드를 구현하거나 메소드를 추가할 수 있다. 
		InnerExam4 innerExam4 = new InnerExam4() {
			public void exec() {
				String value = "익명 클래스 (익명 중첩 클래스, 내부 클래스 4번째 Type)";
				System.out.println(">> [Anonymous Class, InnerClass Type4] \n>> " + value + "\n");
			}
		};
		innerExam4.exec();
	}
}
