package wallmania;

public abstract class LearnAbstractClass_Bank {
	
	String name; String account; int totalAmount;
	
	public LearnAbstractClass_Bank() { System.out.println("-- LearnAbstractClass_Bank type의 class가 생성되었습니다. --"); }
	
	public LearnAbstractClass_Bank(String name, String account, int totalAmount) { 
		System.out.println("-- LearnAbstractClass_Bank type의 class가 생성되었습니다. --");
		System.out.printf(">> w/ param name(%s), account(%s), totalAmount(%d)", name, account, totalAmount);
		System.out.print("\n\n");
	}
	
	public void deposit() { 
		System.out.println(">> {내가 생성한 객체}.deposit() 발동! ");
		System.out.println(">> 해당 method(예금)는 LearnAbstractClass_Bank에서 정의한 method가 사용됩니다.");
		System.out.print("\n");
	}
	public void withdraw() { 
		System.out.println(">> {내가 생성한 객체}.withdraw() 발동! ");
		System.out.println(">> 해당 method(적금)는 LearnAbstractClass_Bank에서 정의한 method가 사용됩니다.");
		System.out.print("\n");
	}
	public abstract void installmentSavings();
	public abstract void cancellation();
	
	public void getInfo() {
		System.out.println(">> {내가 생성한 객체}.getInfo() 발동! ");
		System.out.printf("해당 Bank의 Info : name(%s), accout(%s), totalAmount(%d)", name, account, totalAmount);
		System.out.print("\n");
	}

}
