package wallmania;

public class LearnInterface_ToyBot1 implements LearnInterface_Toy {
	
	public LearnInterface_ToyBot1() { System.out.println("-- LearnInterface_ToyBot1 type의 객체가 생성되었습니다. --" + "\n"); }

	@Override
	public void action1() { System.out.println(">> LearnInterface_ToyBot1의 action1() method 발동!"); }
	@Override
	public void action2() { System.out.println(">> LearnInterface_ToyBot1의 action2() method 발동!"); }
	@Override
	public void action3() { System.out.println(">> LearnInterface_ToyBot1의 action3() method 발동!"); }
	@Override
	public void action4() { System.out.println(">> LearnInterface_ToyBot1의 action4() method 발동!"); }
}
