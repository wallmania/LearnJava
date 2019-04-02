## for i in sys.path: print(i)
import sys
sys.path.insert(0, "/Users/junlee/Python/Minecraft/py3minepimaster")

from mcpi.minecraft import Minecraft
import time

mc = Minecraft.create()
mc.postToChat("active fire board effect for 30s")
fire = 51

startTime = time.time() # 시작 시간
while(True):
    tilePos = mc.player.getTilePos()
    imc.setBlock(tilePos.x-2, tilePos.y-1, tilePos.z, fire)
    endTime = time.time() # 현재시간
    if (endTime > startTime + 30): # 30초가 지나면 끝내겠다
        break

        mc.postToChat("inactive fire board effect")

