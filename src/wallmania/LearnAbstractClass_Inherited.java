package wallmania;

public class LearnAbstractClass_Inherited extends LearnAbstractClass {
	
	public LearnAbstractClass_Inherited() { 
		System.out.println("-- LearnAbstractClass_Inherited type의 객체가 생성되었습니다. --");
		System.out.println("");
	}
	public LearnAbstractClass_Inherited(int i, String s) {
		super(i, s);
		System.out.printf("-- LearnAbstractClass type의 객체가 생성되었습니다. w/ param %d, %s --\n", i , s);
		System.out.printf(">> w/ param %d, %s --> 상위 class로 부터 물려받은 변수입니다.\n", i , s);
		System.out.println("");
	}
	@Override
	public void fun2() { 
		System.out.println(">> {내가 생성한 객체}.fun2() 발동!");
		System.out.println(">> 상위 class인 abstract class의 fun2() method를 여기서 재정의 (Override) 해야 한다.");
		System.out.println("");
	}
}
