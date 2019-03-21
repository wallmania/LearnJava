package wallmania;

public class InterfaceClass implements InterfaceA, InterfaceB {
	
	public InterfaceClass() { System.out.println("-- InterfaceClass type의 객체가 생성되었습니다. --" + "\n"); }

	@Override
	public void funA() {
		System.out.println(">> InterfaceA에 정의된 funA() --> 해당 method는 공란입니다. ");
		System.out.println(">> InterfaceClass에서 정의된 funA() --> funA()를 Override하여 실행했습니다." + "\n");
	}
	
	@Override
	public void funB() {
		System.out.println(">> InterfaceB에 정의된 funB() --> 해당 method는 공란입니다. ");
		System.out.println(">> InterfaceClass에서 정의된 funB() --> funB()를 Override하여 실행했습니다." + "\n");
	}
}
