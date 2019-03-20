package wallmania;

public class LearnChildClass2 extends LearnParentClass {
	
	int openYear = 2005;
	
	public LearnChildClass2() { 
		System.out.println("LearnChildClass2 객체 생성." + "\n"); 
	}
	
	@Override
	public void overRideFunc() {
		System.out.println("-- {내가 생성한 객체}.overRideFunc() 하면 실행되는 method --"); 
		System.out.println("-- Override 가능하다. --"); 
		System.out.println("-- LearnChildClass2가 상속받은 method 이름 = LearnParentClass의 method 이름 --> 기능 수정 가능 --"); 
		System.out.println(">> method가 성공적으로 실행되었습니다."); 
		System.out.println(">> LearnChildClass2's Open Year is " + this.openYear + " by using this.openYear"); 
		System.out.println(">> LearnParentClass's Open Year is " + super.openYear + " by using super.openYear" + "\n"); 
	}
}


