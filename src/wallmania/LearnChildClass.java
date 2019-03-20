package wallmania;

public class LearnChildClass extends LearnParentClass {
	public LearnChildClass() { 
		System.out.println("LearnChildClass 객체 생성." + "\n"); 
	}
	public void childFunc() { 
		System.out.println("-- {내가 생성한 객체}.childFunc() 하면 실행되는 method --"); 
		System.out.println(">> method가 성공적으로 실행되었습니다." + "\n"); 
	}
}


