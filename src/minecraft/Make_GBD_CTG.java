package minecraft;

import java.io.*;

public class Make_GBD_CTG {
	
	public static void main(String[] args) { 
		
		// 내가 원하는 Python Code를 prg 라는 String type 변수에 담는다. 
		String prg = "## for i in sys.path: print(i)\n" 
				+ "import sys\n"
				+ "sys.path.insert(0, \"/Users/junlee/Python/Minecraft/py3minepimaster\")\n\n"
				+ "from mcpi.minecraft import Minecraft\n"  
				+ "import time\n\n"
				+ "mc = Minecraft.create(); mc.postToChat(\"start gold hand\")\n"
				+ "gold = 41; i = 0\n\n"

				+ "while(True):\n"
				+ "    blockInf = mc.events.pollBlockHits()\n\n"
				
				+ "    if len(blockInf) > 0 :\n"
				+ "        block = blockInf[0]\n"
				+ "        bID = mc.getBlock(block.pos)\n"

				+ "        mc.postToChat(\"x : %d, y : %d, z : %d\" % (block.pos.x, block.pos.y, block.pos.z))\n"
				+ "        mc.postToChat(\"Block ID : %d\" % (bID))\n"
				+ "        mc.postToChat(\"face : %d\" % (block.face))\n"
				+ "        blockInf = []\n\n"

				+ "        mc.setBlock(block.pos.x, block.pos.y, block.pos.z, gold)\n"
				+ "        i += 1\n"
				+ "        mc.postToChat(\"%d gold\" %(i))\n\n"

				+ "        if (i==10):\n"
				+ "            break\n\n"

				+ "mc.postToChat(\"finish gold hand\")";

		// File IO
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			
			// 내가 쓴 Code를 TeleportChangeSite.py로 저장하기.
			BufferedWriter out = new BufferedWriter(new FileWriter("/Users/junlee/Java/workspace/LearnJava/src/minecraft/Make_GBD_CTG.py"));
			out.write(prg); out.close(); 
			/*
			 오작동 --> Runtime.getRuntime().exec("python /Users/junlee/Java/workspace/LearnJava/src/minecraft/Make_GBD_CTG.py");
			 */
			// 내가 쓴 Code를 TeleportChangeSite.txt로 저장하기.
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/Make_GBD_CTG.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/Make_GBD_CTG.txt");
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
