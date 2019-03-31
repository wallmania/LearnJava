package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J21AbstractClass {
	
	public static void main(String[] args) {
		Bank bankA = new BankA("Park", "123-456-7890", 10000);
		Bank bankB =  new BankB("Park", "123-456-7890", 10000);
		
		bankA.deposit(); bankA.withdraw(); bankA.installmentSavings(); bankA.cancellation(); bankA.getInfo();
		bankB.deposit(); bankB.withdraw(); bankB.installmentSavings(); bankB.cancellation(); bankB.getInfo();
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J21AbstractClass.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J21AbstractClass.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } 
		}
	}
}

abstract class Bank {
	String name; 
	String account; 
	int totalAmount;
	
	public Bank() { System.out.println(">> Bank type의 class 생성\n"); }
	public Bank(String name, String account, int totalAmount) { System.out.printf(">> Bank type의 class 생성 w/ param name(%s), account(%s), totalAmount(%d)\n\n", name, account, totalAmount); }
	
	public void deposit() { System.out.println(">> 해당 method(예금)는 Bank에서 정의한 method 사용."); }
	public void withdraw() { System.out.println(">> 해당 method(인출)는 Bank에서 정의한 method 사용."); }
	public abstract void installmentSavings();
	public abstract void cancellation();
	
	public void getInfo() { System.out.printf("\n>> getInfo() method --> name(%s), accout(%s), totalAmount(%d)\n\n", name, account, totalAmount); }
	
}

class BankA extends Bank {
	
	public BankA(String name, String accout, int totalAmount) { super(name, accout, totalAmount); }

	@Override
	public void installmentSavings() { System.out.println(">> 해당 method(적금)는 abstract으로 선언된 method --> Bank에서 정의된 내용 X & BankA에서 정의한 method 사용"); }
	@Override
	public void cancellation() { System.out.println(">> 해당 method(해약)는 abstract으로 선언된 method --> Bank에서 정의된 내용 X & BankA에서 정의한 method 사용"); }
}

class BankB extends Bank {
	
	public BankB(String name, String accout, int totalAmount) { super(name, accout, totalAmount); }

	@Override
	public void installmentSavings() { System.out.println(">> 해당 method(적금)는 abstract으로 선언된 method --> Bank에서 정의된 내용 X & BankB에서 정의한 method 사용"); }
	@Override
	public void cancellation() { System.out.println(">> 해당 method(해약)는 abstract으로 선언된 method --> Bank에서 정의된 내용 X & BankB에서 정의한 method 사용"); }
}
