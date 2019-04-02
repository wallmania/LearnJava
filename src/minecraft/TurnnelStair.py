## for i in sys.path: print(i)
import sys
sys.path.insert(0, "/Users/junlee/Python/Minecraft/py3minepimaster")

from mcpi.minecraft import Minecraft
import time

mc = Minecraft.create()
pos = mc.player.getTilePos()

#사용자 위치로 부터 +11, 0, 0 위치에서 건설 시작
pos.x += 11
time.sleep(1)
height = 5; AIR = 0; TORCH = 50; WOOD_STAIR = 53
x= pos.x; y= pos.y; z= pos.z
mc.setBlocks(pos.x+1, pos.y, pos.z, pos.x-10, pos.y-300, pos.z-11, AIR)
time.sleep(1)
limit = pos.y-300
while(pos.y > limit):
    #0 동
    for j in list(range(10)):
        mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,0)
        pos.x -= 1; pos.y -= 1

    mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,4)
    mc.setBlock(pos.x,pos.y+1,pos.z, TORCH)
    pos.z -= 1; time.sleep(1.5)
    #2 남
    for j in list(range(10)):
        mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,2)
        pos.z -= 1; pos.y -= 1

    mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,4); mc.setBlock(pos.x,pos.y+1,pos.z, TORCH)
    pos.x += 1; time.sleep(1.5)

    #1 서
    for j in list(range(10)):
        mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,1)
        pos.x += 1; pos.y -= 1

    mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,4); mc.setBlock(pos.x,pos.y+1,pos.z, TORCH)
    pos.z += 1; time.sleep(1.5)

    #3 북
    for j in list(range(10)):
        mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,3)
        pos.z += 1; pos.y -= 1

    mc.setBlock(pos.x,pos.y,pos.z,WOOD_STAIR,4); mc.setBlock(pos.x,pos.y+1,pos.z, TORCH)
    pos.x -= 1; time.sleep(1.5)
