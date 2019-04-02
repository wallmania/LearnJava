import sys
sys.path.insert(0, "/Users/junlee/Python/Minecraft/py3minepimaster")
from mcpi.minecraft import Minecraft
from copy import copy
import time

mc = Minecraft.create()
def movePos(x,y,z):
    pos = mc.player.getTilePos()
    pos_before = copy(pos)
    pos.x += x; pos.y += y; pos.z += z
    mc.player.setTilePos(pos)
    print("Position changed from %s to %s" % (str([pos_before.x, pos_before.y, pos_before.z]), str([pos.x, pos.y, pos.z])))

movePos(10,10,100)