package minecraft;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class MakeFireBoard {
	
	public static void main(String[] args) { 
		
		// 내가 원하는 Python Code를 prg 라는 String type 변수에 담는다. 
		String prg = "## for i in sys.path: print(i)\n" 
				+ "import sys\n"
				+ "sys.path.insert(0, \"/Users/junlee/Python/Minecraft/py3minepimaster\")\n\n"
				+ "from mcpi.minecraft import Minecraft\n"  
				+ "import time\n\n"
				+ "mc = Minecraft.create()\n"
				+ "mc.postToChat(\"active fire board effect for 30s\")\n"
				+ "fire = 51\n\n"

				+ "startTime = time.time() # 시작 시간\n"
				+ "while(True):\n"
				+ "    tilePos = mc.player.getTilePos()\n"
				+ "    imc.setBlock(tilePos.x-2, tilePos.y-1, tilePos.z, fire)\n"
				+ "    endTime = time.time() # 현재시간\n"
				+ "    if (endTime > startTime + 30): # 30초가 지나면 끝내겠다\n"
				+ "        break\n\n"
				+ "        mc.postToChat(\"inactive fire board effect\")\n\n";

		// File IO
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			
			// 내가 쓴 Code를 TeleportChangeSite.py로 저장하기.
			BufferedWriter out = new BufferedWriter(new FileWriter("/Users/junlee/Java/workspace/LearnJava/src/minecraft/MakeFireBoard.py"));
			out.write(prg); out.close(); 
			/*
			 오작동 --> Runtime.getRuntime().exec("python /Users/junlee/Java/workspace/LearnJava/src/minecraft/MakeFireBoard.py");
			 */
			// 내가 쓴 Code를 TeleportChangeSite.txt로 저장하기.
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/MakeFireBoard.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/MakeFireBoard.txt");
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
