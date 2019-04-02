import sys
sys.path.insert(0, "/Users/junlee/Python/Minecraft/py3minepimaster")
from mcpi.minecraft import Minecraft
from copy import copy
import time

mc = Minecraft.create()
pos = mc.player.getTilePos()
mc.postToChat("escape to the ground 3 sec later"); time.sleep(3)
mc.postToChat("escape to the ground 2 sec later"); time.sleep(1)
mc.postToChat("escape to the ground 1 sec later"); time.sleep(1)
mc.postToChat("escape !!!")
pos.y = mc.getHeight(pos.x, pos.z) + 100
mc.player.setTilePos(pos)