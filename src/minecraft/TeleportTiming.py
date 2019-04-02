import sys
sys.path.insert(0, "/Users/junlee/Python/Minecraft/py3minepimaster")
from mcpi.minecraft import Minecraft
import time

mc = Minecraft.create()
pos = mc.player.getTilePos()
mc.postToChat("My Position is %s" % str([pos.x, pos.y, pos.z]))

x = pos.x + 1; y = pos.y; z = pos.z
gold = 41; mc.setBlock(pos.x+1, pos.y-1, pos.z, gold)
mc.postToChat("Teleport Block is setted at x:%d y:%d z:%d" % (x,y,z))

while(True):
    tilePos = mc.player.getTilePos()
    if tilePos.x == x and tilePos.y ==y and tilePos.z == z:
        tilePos.y += 27
        mc.player.setTilePos(tilePos.x, tilePos.y, tilePos.z)