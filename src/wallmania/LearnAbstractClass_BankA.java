package wallmania;

public class LearnAbstractClass_BankA extends LearnAbstractClass_Bank {
	
	public LearnAbstractClass_BankA(String name, String accout, int totalAmount) { super(name, accout, totalAmount); }

	@Override
	public void installmentSavings() {
		System.out.println(">> {내가 생성한 객체}.installmentSavings() 발동! ");
		System.out.println(">> 해당 method(적금)는 abstract으로 선언된 method라서 LearnAbstractClass_Bank에서는 정의된 내용이 X");
		System.out.println(">> 해당 method(적금)는 LearnAbstractClass_BankA에서 정의한 method가 사용됩니다.");
		System.out.print("\n");
	}
	@Override
	public void cancellation() {
		System.out.println(">> {내가 생성한 객체}.cancellation() 발동! ");
		System.out.println(">> 해당 method(해약)는 abstract으로 선언된 method라서 LearnAbstractClass_Bank에서는 정의된 내용이 X");
		System.out.println(">> 해당 method(해약)는 LearnAbstractClass_BankA에서 정의한 method가 사용됩니다.");
		System.out.print("\n");
	}
}
