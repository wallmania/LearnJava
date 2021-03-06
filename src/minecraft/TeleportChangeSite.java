package minecraft;

import java.io.*;

public class TeleportChangeSite {
	
	public static void main(String[] args) { 
		
		// 내가 원하는 Python Code를 prg 라는 String type 변수에 담는다. 
		String prg = "import sys\n"
				+ "sys.path.insert(0, \"/Users/junlee/Python/Minecraft/py3minepimaster\")\n"
				+ "from mcpi.minecraft import Minecraft\n" 
				+ "from copy import copy\n" 
				+ "import time\n\n"
				+ "mc = Minecraft.create()\n"
				+ "def movePos(x,y,z):\n"
                + "    pos = mc.player.getTilePos()\n"
                + "    pos_before = copy(pos)\n"
                + "    pos.x += x; pos.y += y; pos.z += z\n"
                + "    mc.player.setTilePos(pos)\n"
                + "    print(\"Position changed from %s to %s\" % (str([pos_before.x, pos_before.y, pos_before.z]), str([pos.x, pos.y, pos.z])))\n\n"
                + "movePos(10,10,100)";
		
		// File IO
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			
			// 내가 쓴 Code를 TeleportChangeSite.py로 저장하기.
			BufferedWriter out = new BufferedWriter(new FileWriter("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportChangeSite.py"));
			out.write(prg); out.close(); 
			/*
			 오작동 --> Runtime.getRuntime().exec("python /Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportChangeSite.py");
			 */
			// 내가 쓴 Code를 TeleportChangeSite.txt로 저장하기.
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportChangeSite.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TeleportChangeSite.txt");
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
