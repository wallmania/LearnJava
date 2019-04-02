## for i in sys.path: print(i)import sys
sys.path.insert(0, "/Users/junlee/Python/Minecraft/py3minepimaster")

from mcpi.minecraft import Minecraft
from copy import copy
import time

mc = Minecraft.create()
pos = mc.player.getTilePos()
mc.postToChat("escape to the ground 3 sec later"); time.sleep(1)
mc.postToChat("escape to the ground 2 sec later"); time.sleep(1)
mc.postToChat("escape to the ground 1 sec later"); time.sleep(1)
pos_y_before = pos.y
pos.y = mc.getHeight(pos.x, pos.z) + 100; mc.player.setTilePos(pos)
pos_y_after = pos.y
mc.postToChat("Escaped from %s to %s" % (str(pos_y_before), str(pos_y_after)))