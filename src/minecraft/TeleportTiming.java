package minecraft;

import java.io.*;

public class TeleportTiming {
	
	public static void main(String[] args) { 
		
		// 내가 원하는 Python Code를 prg 라는 String type 변수에 담는다. 
		String prg = "import sys\n"
				+ "sys.path.insert(0, \"/Users/junlee/Python/Minecraft/py3minepimaster\")\n"
				+ "from mcpi.minecraft import Minecraft\n" 
				+ "from copy import copy\n" 
				+ "import time\n\n"
				+ "mc = Minecraft.create()\n"
				
				+ "def moveTile(x,y,z) :\n"
				+ "    pos = mc.player.getTilePos()\n"
				+ "    pos.x += x; pos.y += y; pos.z += z\n"
				+ "    mc.player.setTilePos(pos)\n"
				+ "    mc.postToChat(\"Moved to %s\" % str([pos.x, pos.y, pos.z]))\n"

				+ "mc.postToChat(\"MCPI : Start 3 Seconds Count Down!\")\n"
				+ "for i in range(3):\n"
				+ "    mc.postToChat(\"MCPI : \" + str(3-i)); time.sleep(1)\n"

				+ "mc.postToChat(\"MCPI : 0!\"); time.sleep(1); mc.postToChat(\"MCPI : Luach!!\")\n"
				+ "for i in range(15):\n"
				+ "    moveTile(-1,3,0); time.sleep(0.1)";
		
		// File IO
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			
			// 내가 쓴 Code를 TeleportChangeSite.py로 저장하기.
			BufferedWriter out = new BufferedWriter(new FileWriter("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportTiming.py"));
			out.write(prg); out.close(); 
			/*
			 오작동 --> Runtime.getRuntime().exec("python /Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportTiming.py");
			 */
			// 내가 쓴 Code를 TeleportChangeSite.txt로 저장하기.
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportTiming.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportTiming.txt");
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
