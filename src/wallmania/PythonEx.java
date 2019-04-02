package wallmania;


import java.io.*;


public class PythonEx {
	public static void main(String[] args) { 
		
		
		try {
			String prg = "import sys\n"
					+ "sys.path.insert(0, \"/Users/junlee/Python/Minecraft/py3minepimaster\")\n"
					+ "from mcpi.minecraft import Minecraft\n" 
					+ "from copy import copy\n" 
					+ "import time\n\n"
					+ "mc = Minecraft.create()"
					+ "pos = mc.player.getTilePos()" 
					+ "mc.postToChat(\"escape to the ground 3 sec later\"); time.sleep(3)"
					+ "mc.postToChat(\"escape to the ground 2 sec later\"); time.sleep(1)"
					+ "mc.postToChat(\"escape to the ground 1 sec later\"); time.sleep(1)"
					+ "mc.postToChat(\"escape !!!\")"
					+ "pos.y = mc.getHeight(pos.x, pos.z) + 100"
					+ "mc.player.setTilePos(pos)";

			
			BufferedWriter out = new BufferedWriter(new FileWriter("/Users/junlee/Java/workspace/LearnJava/src/minecraft/test1.py"));
			out.write(prg); out.close();
			//Runtime.getRuntime().exec("python test1.py");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
 
}
