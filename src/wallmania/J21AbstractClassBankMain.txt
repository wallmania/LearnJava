package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J21AbstractClassBankMain {
	
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
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J21AbstractClassBankMain.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J21AbstractClassBankMain.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}
