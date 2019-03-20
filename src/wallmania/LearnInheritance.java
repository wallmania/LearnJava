package wallmania;

public class LearnInheritance {
	public static void main(String[] args) {
		
		// extends 를 통해 상속받을 수 있음 
		LearnChildClass learnChildClass = new LearnChildClass();
		// 상속받은 LearnParentClass의 method를 LearnChildClass에서도 실행 가 
		learnChildClass.childFunc();
		learnChildClass.parentFunc();
		// privateParentFunc() --> LearnParentClass에서 사용되는 method (다만, private으로 선언)
		// learnChildClass.privateParentFunc() 실행하면 error 발생. 
		System.out.println("[Caution 1]" + "\n" + ">> privateParentFunc() --> LearnParentClass에서 사용되는 method (다만, private으로 선언)" + "\n");
		System.out.println("[Caution 2]" + "\n" + ">> learnChildClass.privateParentFunc() 실행하면 error 발생." + "\n");
	}
}
