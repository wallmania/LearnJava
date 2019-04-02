package minecraft;

import java.io.*;

public class TurnnelBasic {
	
	public static void main(String[] args) { 
		
		// 내가 원하는 Python Code를 prg 라는 String type 변수에 담는다. 
		String prg = "import sys\n"
				+ "sys.path.insert(0, \"/Users/junlee/Python/Minecraft/py3minepimaster\")\n"
				+ "from mcpi.minecraft import Minecraft\n"  
				+ "import build, time\n\n"
				+ "build.turnnel()";
		
		// File IO
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			
			// 내가 쓴 Code를 TeleportChangeSite.py로 저장하기.
			BufferedWriter out = new BufferedWriter(new FileWriter("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TurnnelBasic.py"));
			out.write(prg); out.close(); 
			/*
			 오작동 --> Runtime.getRuntime().exec("python /Users/junlee/Java/workspace/LearnJava/src/minecraft/TurnnelBasic.py");
			 */
			// 내가 쓴 Code를 TeleportChangeSite.txt로 저장하기.
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TurnnelBasic.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TurnnelBasic.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally { 
			
			try { 
				fos.close(); 
			} catch (Exception e) { 
				e.printStackTrace(); 
			} 
		}
	}
}
