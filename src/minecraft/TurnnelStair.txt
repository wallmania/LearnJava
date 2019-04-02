package minecraft;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class TurnnelStair {
	
	public static void main(String[] args) { 
		
		// 내가 원하는 Python Code를 prg 라는 String type 변수에 담는다. 
		String prg = "## for i in sys.path: print(i)\n"
				+ "import sys\n"
				+ "sys.path.insert(0, \"/Users/junlee/Python/Minecraft/py3minepimaster\")\n\n"
				+ "from mcpi.minecraft import Minecraft\n"
				+ "import time\n\n"
				
				+ "mc = Minecraft.create()\n"
				+ "pos = mc.player.getTilePos()\n\n"
				
				+ "#사용자 위치로 부터 +11, 0, 0 위치에서 건설 시작\n"
				+ "pos.x += 11\n"
				+ "time.sleep(1)\n"
				+ "height = 5; AIR = 0; TORCH = 50; WOOD_STAIR = 53\n"
				+ "x= pos.x; y= pos.y; z= pos.z\n"
				+ "mc.setBlocks(pos.x+1, pos.y, pos.z, pos.x-10, pos.y-300, pos.z-11, AIR)\n"
				+ "time.sleep(1)\n"
				+ "limit = pos.y-300\n"
				
				+ "while(pos.y > limit):\n"
				+ "    #0 동\n"
				+ "    for j in list(range(10)):\n"
				+ "        mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,0)\n"
				+ "        pos.x -= 1; pos.y -= 1\n\n"
				+ "    mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,4)\n"
				+ "    mc.setBlock(pos.x,pos.y+1,pos.z, TORCH)\n"
				+ "    pos.z -= 1; time.sleep(1.5)\n"
				
				+ "    #2 남\n"
				+ "    for j in list(range(10)):\n"
				+ "        mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,2)\n"
				+ "        pos.z -= 1; pos.y -= 1\n\n"
				+ "    mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,4); mc.setBlock(pos.x,pos.y+1,pos.z, TORCH)\n"
				+ "    pos.x += 1; time.sleep(1.5)\n\n"
				
				+ "    #1 서\n"
				+ "    for j in list(range(10)):\n"
				+ "        mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,1)\n"
				+ "        pos.x += 1; pos.y -= 1\n\n"
				
				+ "    mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,4); mc.setBlock(pos.x,pos.y+1,pos.z, TORCH)\n"
				+ "    pos.z += 1; time.sleep(1.5)\n\n"
				
				+ "    #3 북\n"
				+ "    for j in list(range(10)):\n"
				+ "        mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,3)\n"
				+ "        pos.z += 1; pos.y -= 1\n\n"

				+ "    mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,4); mc.setBlock(pos.x,pos.y+1,pos.z, TORCH)\n"
				+ "    pos.x -= 1; time.sleep(1.5)\n";

		// File IO
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			
			// 내가 쓴 Code를 TeleportChangeSite.py로 저장하기.
			BufferedWriter out = new BufferedWriter(new FileWriter("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TurnnelStair.py"));
			out.write(prg); out.close(); 
			/*
			 오작동 --> Runtime.getRuntime().exec("python /Users/junlee/Java/workspace/LearnJava/src/minecraft/TurnnelStair.py");
			 */
			// 내가 쓴 Code를 TeleportChangeSite.txt로 저장하기.
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TurnnelStair.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/minecraft/TurnnelStair.txt");
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
