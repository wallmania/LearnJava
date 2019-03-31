package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J19InterfaceToyMain {
	public static void main(String[] args) {
		InterfaceToy toyBot1 = new InterfaceToyBot1();
		InterfaceToy toyBot2 = new InterfaceToyBot2();
		InterfaceToy toyBotArray[] = {toyBot1, toyBot2};
		
		for (int i=0; i<toyBotArray.length; i++) {
			toyBotArray[i].action1();
			toyBotArray[i].action2();
			toyBotArray[i].action3();
			toyBotArray[i].action4();
			
			System.out.println("");
		}
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J19InterfaceToyMain.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J19InterfaceToyMain.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}

}

interface InterfaceToy {
	public void action1();
	public void action2();
	public void action3();
	public void action4();
}

class InterfaceToyBot1 implements InterfaceToy {
	
	public InterfaceToyBot1() { System.out.println("-- ToyBot1 type 객체 생성. --" + "\n"); }

	@Override
	public void action1() { System.out.println(">> ToyBot1의 action1() method 발동!"); }
	@Override
	public void action2() { System.out.println(">> ToyBot1의 action2() method 발동!"); }
	@Override
	public void action3() { System.out.println(">> ToyBot1의 action3() method 발동!"); }
	@Override
	public void action4() { System.out.println(">> ToyBot1의 action4() method 발동!"); }
}

class InterfaceToyBot2 implements InterfaceToy {
	
	public InterfaceToyBot2() { System.out.println("-- ToyBot2 type 객체 생성. --" + "\n"); }

	@Override
	public void action1() { System.out.println(">> ToyBot2의 action1() method 발동!"); }
	@Override
	public void action2() { System.out.println(">> ToyBot2의 action2() method 발동!"); }
	@Override
	public void action3() { System.out.println(">> ToyBot2의 action3() method 발동!"); }
	@Override
	public void action4() { System.out.println(">> ToyBot2의 action4() method 발동!"); }
}