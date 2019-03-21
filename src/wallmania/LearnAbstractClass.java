package wallmania;

public abstract class LearnAbstractClass {
	
	int num;
	String str;
	
	public LearnAbstractClass() { 
		System.out.println("-- LearnAbstractClass type의 객체가 생성되었습니다. --");
		System.out.println("");
	}
	public LearnAbstractClass(int i, String s) {
		this.num = i;
		this.str = s;
		System.out.printf("-- LearnAbstractClass type의 객체가 생성되었습니다. w/ param %d, %s --\n", i , s);
		System.out.println("");
	}
	public void fun1() { 
		System.out.println(">> {내가 생성한 객체}.fun1() 발동!");
		System.out.println("");
	}
	public abstract void fun2();

}
