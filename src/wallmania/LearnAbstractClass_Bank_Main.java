package wallmania;

public class LearnAbstractClass_Bank_Main {
	
	public static void main(String[] args) {
		LearnAbstractClass_Bank bankA = new LearnAbstractClass_BankA("Park", "123-456-7890", 10000);
		LearnAbstractClass_Bank bankB = new LearnAbstractClass_BankB("Lee", "098-765-4321", 20000);
		
		bankA.deposit(); 
		bankA.withdraw(); 
		bankA.installmentSavings(); 
		bankA.cancellation();
		bankA.getInfo();
		
		bankB.deposit(); 
		bankB.withdraw(); 
		bankB.installmentSavings(); 
		bankB.cancellation();
		bankB.getInfo();
	}
}
