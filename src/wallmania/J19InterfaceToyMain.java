package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J19InterfaceToyMain {
	public static void main(String[] args) {
		LearnInterface_Toy toyBot1 = new LearnInterface_ToyBot1();
		LearnInterface_Toy toyBot2 = new LearnInterface_ToyBot2();
		LearnInterface_Toy toyBotArray[] = {toyBot1, toyBot2};
		
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
