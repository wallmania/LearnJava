package minecraft;

import java.io.*;

public class TeleportEscape {
	
	public static void main(String[] args) { 
		
		// 내가 원하는 Python Code를 prg 라는 String type 변수에 담는다.
		String prg = "import sys\n"
				+ "sys.path.insert(0, \"/Users/junlee/Python/Minecraft/py3minepimaster\")\n"
				+ "from mcpi.minecraft import Minecraft\n" 
				+ "from copy import copy\n" 
				+ "import time\n\n"
				+ "mc = Minecraft.create()\n"
				+ "pos = mc.player.getTilePos()\n" 
				+ "mc.postToChat(\"escape to the ground 3 sec later\"); time.sleep(3)\n"
				+ "mc.postToChat(\"escape to the ground 2 sec later\"); time.sleep(1)\n"
				+ "mc.postToChat(\"escape to the ground 1 sec later\"); time.sleep(1)\n"
				+ "mc.postToChat(\"escape !!!\")\n"
				+ "pos.y = mc.getHeight(pos.x, pos.z) + 100\n"
				+ "mc.player.setTilePos(pos)";
		
		// File IO
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			
			// 내가 쓴 Code를 TeleportEscape.py로 저장하기.
			BufferedWriter out = new BufferedWriter(new FileWriter("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportEscape.py"));
			out.write(prg); out.close();
			/*
			 오작동 --> Runtime.getRuntime().exec("python /Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportChangeSite.py");
			 */
			// 내가 쓴 Code를 TeleportChangeSite.txt로 저장하기.
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportEscape.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportEscape.txt");
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
