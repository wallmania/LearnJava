package wallmania;

public class LearnParentClass {
	
	int openYear = 1995;	
	
	public LearnParentClass() { 
		System.out.println("LearnParentClass 객체 생성." + "\n"); 
	}
	public void parentFunc() { 
		System.out.println("-- {내가 생성한 객체}.parentFunc() 하면 실행되는 method --"); 
		System.out.println(">> method가 성공적으로 실행되었습니다." + "\n"); 
	}
	public void overRideFunc() {
		System.out.println("-- {내가 생성한 객체}.overRideFunc() 하면 실행되는 method --"); 
		System.out.println(">> method가 성공적으로 실행되었습니다." + "\n"); 
	}
	private void privateParentFunc() { 
		System.out.println("-- {내가 생성한 객체}.privateParentFunc() 하면 실행되는 method --"); 
		System.out.println(">> method가 성공적으로 실행되었습니다." + "\n"); 
	}
}
