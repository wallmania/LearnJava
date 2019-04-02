package minecraft;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class TeleportBlock {
	
	public static void main(String[] args) { 
		
		// 내가 원하는 Python Code를 prg 라는 String type 변수에 담는다. 
		String prg = "import sys\n"
				+ "sys.path.insert(0, \"/Users/junlee/Python/Minecraft/py3minepimaster\")\n"
				+ "from mcpi.minecraft import Minecraft\n"  
				+ "import time\n\n"
				+ "mc = Minecraft.create()\n"
				+ "pos = mc.player.getTilePos()\n"
				+ "mc.postToChat(\"My Position is %s\" % str([pos.x, pos.y, pos.z]))\n\n"

				+ "x = pos.x + 1; y = pos.y; z = pos.z\n"
				+ "gold = 41; mc.setBlock(pos.x+1, pos.y-1, pos.z, gold)\n" 
				+ "mc.postToChat(\"Teleport Block is setted at x:%d y:%d z:%d\" % (x,y,z))\n\n"

				+ "while(True):\n"
				+ "    tilePos = mc.player.getTilePos()\n"
				+ "    if tilePos.x == x and tilePos.y ==y and tilePos.z == z:\n"
				+ "        tilePos.y += 27\n"
				+ "        mc.player.setTilePos(tilePos.x, tilePos.y, tilePos.z)";
		
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
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportBlock.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportBlock.txt");
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
